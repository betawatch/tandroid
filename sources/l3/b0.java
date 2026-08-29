package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import j3.x1;
import j7.l1;
import jh.w2;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b0 extends j3.e implements f5.n {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final t audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private m3.e decoder;
    private m3.f decoderCounters;
    private n3.e decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final n eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;
    private boolean firstStreamSampleRead;
    private final m3.i flagsOnlyBuffer;
    private m3.i inputBuffer;
    private j3.t0 inputFormat;
    private boolean inputStreamEnded;
    private SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private n3.e sourceDrmSession;

    public b0(Handler handler, o oVar, t tVar) {
        super(1);
        this.eventDispatcher = new n(handler, oVar);
        this.audioSink = tVar;
        ((k0) tVar).r = new m5.i((FfmpegAudioRenderer) this, 21);
        this.flagsOnlyBuffer = new m3.i(0, 0);
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
        f(-9223372036854775807L);
        this.pendingOutputStreamOffsetsUs = new long[10];
    }

    public final boolean a() {
        if (this.outputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.decoder.dequeueOutputBuffer();
            this.outputBuffer = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer != null) {
                int i10 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
                if (i10 > 0) {
                    this.decoderCounters.f += i10;
                    ((k0) this.audioSink).G = true;
                }
                if (simpleDecoderOutputBuffer.isFirstSample()) {
                    ((k0) this.audioSink).G = true;
                    if (this.pendingOutputStreamOffsetCount != 0) {
                        f(this.pendingOutputStreamOffsetsUs[0]);
                        int i11 = this.pendingOutputStreamOffsetCount - 1;
                        this.pendingOutputStreamOffsetCount = i11;
                        long[] jArr = this.pendingOutputStreamOffsetsUs;
                        System.arraycopy(jArr, 1, jArr, 0, i11);
                    }
                }
            }
            return false;
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                e();
                c();
                this.audioTrackNeedsConfigure = true;
                return false;
            }
            this.outputBuffer.release();
            this.outputBuffer = null;
            try {
                this.outputStreamEnded = true;
                ((k0) this.audioSink).t();
                return false;
            } catch (s e10) {
                throw createRendererException(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.audioTrackNeedsConfigure) {
            j3.s0 a2 = getOutputFormat(this.decoder).a();
            a2.E = this.encoderDelay;
            a2.F = this.encoderPadding;
            ((k0) this.audioSink).b(new j3.t0(a2), null);
            this.audioTrackNeedsConfigure = false;
        }
        t tVar = this.audioSink;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.outputBuffer;
        if (((k0) tVar).l(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.data)) {
            this.decoderCounters.e++;
            this.outputBuffer.release();
            this.outputBuffer = null;
            return true;
        }
        return false;
    }

    public final boolean b() {
        m3.e eVar = this.decoder;
        if (eVar == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            m3.i iVar = (m3.i) eVar.dequeueInputBuffer();
            this.inputBuffer = iVar;
            if (iVar == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        j3.u0 formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.inputBuffer, 0);
        if (readSource == -5) {
            d(formatHolder);
            return true;
        }
        if (readSource != -4) {
            if (readSource == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (!this.firstStreamSampleRead) {
            this.firstStreamSampleRead = true;
            this.inputBuffer.addFlag(TLObject.FLAG_27);
        }
        this.inputBuffer.c();
        this.inputBuffer.getClass();
        onQueueInputBuffer(this.inputBuffer);
        this.decoder.queueInputBuffer(this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.c++;
        this.inputBuffer = null;
        return true;
    }

    public final void c() {
        m3.b bVar;
        if (this.decoder != null) {
            return;
        }
        n3.e eVar = this.sourceDrmSession;
        l1.D(this.decoderDrmSession, eVar);
        this.decoderDrmSession = eVar;
        if (eVar != null) {
            bVar = eVar.E();
            if (bVar == null && this.decoderDrmSession.D() == null) {
                return;
            }
        } else {
            bVar = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f5.a.c("createAudioDecoder");
            this.decoder = createDecoder(this.inputFormat, bVar);
            f5.a.q();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            n nVar = this.eventDispatcher;
            String name = this.decoder.getName();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = nVar.a;
            if (handler != null) {
                handler.post(new g5.x(nVar, name, elapsedRealtime2, j10, 2));
            }
            this.decoderCounters.a++;
        } catch (OutOfMemoryError e10) {
            throw createRendererException(e10, this.inputFormat, 4001);
        } catch (m3.g e11) {
            f5.a.p(TAG, "Audio codec error", e11);
            n nVar2 = this.eventDispatcher;
            Handler handler2 = nVar2.a;
            if (handler2 != null) {
                handler2.post(new k(nVar2, e11, 0));
            }
            throw createRendererException(e11, this.inputFormat, 4001);
        }
    }

    public m3.l canReuseDecoder(String str, j3.t0 t0Var, j3.t0 t0Var2) {
        return new m3.l(str, t0Var, t0Var2, 0, 1);
    }

    public abstract m3.e createDecoder(j3.t0 t0Var, m3.b bVar);

    public final void d(j3.u0 u0Var) {
        j3.t0 t0Var = u0Var.b;
        t0Var.getClass();
        n3.e eVar = u0Var.a;
        l1.D(this.sourceDrmSession, eVar);
        this.sourceDrmSession = eVar;
        j3.t0 t0Var2 = this.inputFormat;
        this.inputFormat = t0Var;
        this.encoderDelay = t0Var.R;
        this.encoderPadding = t0Var.S;
        m3.e eVar2 = this.decoder;
        if (eVar2 == null) {
            c();
            n nVar = this.eventDispatcher;
            j3.t0 t0Var3 = this.inputFormat;
            Handler handler = nVar.a;
            if (handler != null) {
                handler.post(new m(nVar, t0Var3, null, 0));
                return;
            }
            return;
        }
        m3.l lVar = eVar != this.decoderDrmSession ? new m3.l(eVar2.getName(), t0Var2, t0Var, 0, 128) : canReuseDecoder(eVar2.getName(), t0Var2, t0Var);
        if (lVar.d == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                e();
                c();
                this.audioTrackNeedsConfigure = true;
            }
        }
        n nVar2 = this.eventDispatcher;
        j3.t0 t0Var4 = this.inputFormat;
        Handler handler2 = nVar2.a;
        if (handler2 != null) {
            handler2.post(new m(nVar2, t0Var4, lVar, 0));
        }
    }

    public final void e() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        m3.e eVar = this.decoder;
        if (eVar != null) {
            this.decoderCounters.b++;
            eVar.release();
            n nVar = this.eventDispatcher;
            String name = this.decoder.getName();
            Handler handler = nVar.a;
            if (handler != null) {
                handler.post(new w2(20, nVar, name));
            }
            this.decoder = null;
        }
        l1.D(this.decoderDrmSession, null);
        this.decoderDrmSession = null;
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z10) {
        this.experimentalKeepAudioTrackOnSeek = z10;
    }

    public final void f(long j10) {
        this.outputStreamOffsetUs = j10;
        if (j10 != -9223372036854775807L) {
            this.audioSink.getClass();
        }
    }

    public final void g() {
        long g10 = ((k0) this.audioSink).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                g10 = Math.max(this.currentPositionUs, g10);
            }
            this.currentPositionUs = g10;
            this.allowPositionDiscontinuity = false;
        }
    }

    public abstract j3.t0 getOutputFormat(m3.e eVar);

    @Override // f5.n
    public x1 getPlaybackParameters() {
        k0 k0Var = (k0) this.audioSink;
        return k0Var.k ? k0Var.y : k0Var.i().a;
    }

    @Override // f5.n
    public long getPositionUs() {
        if (getState() == 2) {
            g();
        }
        return this.currentPositionUs;
    }

    public final int getSinkFormatSupport(j3.t0 t0Var) {
        return ((k0) this.audioSink).h(t0Var);
    }

    @Override // j3.e, j3.d2
    public void handleMessage(int i10, Object obj) {
        if (i10 == 2) {
            t tVar = this.audioSink;
            float floatValue = ((Float) obj).floatValue();
            k0 k0Var = (k0) tVar;
            if (k0Var.J != floatValue) {
                k0Var.J = floatValue;
                if (k0Var.o()) {
                    if (f5.d0.a >= 21) {
                        k0Var.u.setVolume(k0Var.J);
                        return;
                    }
                    AudioTrack audioTrack = k0Var.u;
                    float f9 = k0Var.J;
                    audioTrack.setStereoVolume(f9, f9);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            e eVar = (e) obj;
            k0 k0Var2 = (k0) this.audioSink;
            if (k0Var2.v.equals(eVar)) {
                return;
            }
            k0Var2.v = eVar;
            if (k0Var2.Z) {
                return;
            }
            k0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((k0) this.audioSink).z((x) obj);
            return;
        }
        if (i10 == 12) {
            if (f5.d0.a >= 23) {
                a0.a(this.audioSink, obj);
                return;
            }
            return;
        }
        if (i10 == 9) {
            k0 k0Var3 = (k0) this.audioSink;
            k0Var3.x(k0Var3.i().a, ((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                return;
            }
            t tVar2 = this.audioSink;
            int intValue = ((Integer) obj).intValue();
            k0 k0Var4 = (k0) tVar2;
            if (k0Var4.W != intValue) {
                k0Var4.W = intValue;
                k0Var4.V = intValue != 0;
                k0Var4.e();
            }
        }
    }

    @Override // j3.e
    public boolean isEnded() {
        if (!this.outputStreamEnded) {
            return false;
        }
        k0 k0Var = (k0) this.audioSink;
        if (k0Var.o()) {
            return k0Var.S && !k0Var.m();
        }
        return true;
    }

    @Override // j3.e
    public boolean isReady() {
        if (((k0) this.audioSink).m()) {
            return true;
        }
        if (this.inputFormat != null) {
            return isSourceReady() || this.outputBuffer != null;
        }
        return false;
    }

    @Override // j3.e
    public void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        f(-9223372036854775807L);
        try {
            l1.D(this.sourceDrmSession, null);
            this.sourceDrmSession = null;
            e();
            ((k0) this.audioSink).v();
        } finally {
            this.eventDispatcher.a(this.decoderCounters);
        }
    }

    @Override // j3.e
    public void onEnabled(boolean z10, boolean z11) {
        m3.f fVar = new m3.f();
        this.decoderCounters = fVar;
        n nVar = this.eventDispatcher;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new l(nVar, fVar, 0));
        }
        if (getConfiguration().a) {
            ((k0) this.audioSink).d();
        } else {
            k0 k0Var = (k0) this.audioSink;
            if (k0Var.Z) {
                k0Var.Z = false;
                k0Var.e();
            }
        }
        ((k0) this.audioSink).q = getPlayerId();
    }

    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // j3.e
    public void onPositionReset(long j10, boolean z10) {
        if (this.experimentalKeepAudioTrackOnSeek) {
            k0 k0Var = (k0) this.audioSink;
            w wVar = k0Var.i;
            if (f5.d0.a < 25) {
                k0Var.e();
            } else {
                k0Var.o.c = null;
                k0Var.n.c = null;
                if (k0Var.o()) {
                    k0Var.w();
                    AudioTrack audioTrack = wVar.c;
                    audioTrack.getClass();
                    if (audioTrack.getPlayState() == 3) {
                        k0Var.u.pause();
                    }
                    k0Var.u.flush();
                    wVar.l = 0L;
                    wVar.w = 0;
                    wVar.v = 0;
                    wVar.m = 0L;
                    wVar.C = 0L;
                    wVar.F = 0L;
                    wVar.k = false;
                    wVar.c = null;
                    wVar.f = null;
                    w wVar2 = k0Var.i;
                    AudioTrack audioTrack2 = k0Var.u;
                    f0 f0Var = k0Var.t;
                    wVar2.c(audioTrack2, f0Var.c == 2, f0Var.g, f0Var.d, f0Var.h);
                    k0Var.H = true;
                }
            }
        } else {
            ((k0) this.audioSink).e();
        }
        this.currentPositionUs = j10;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            if (this.decoderReinitializationState != 0) {
                e();
                c();
                return;
            }
            this.inputBuffer = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.outputBuffer;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.outputBuffer = null;
            }
            this.decoder.flush();
            this.decoderReceivedBuffers = false;
        }
    }

    public void onQueueInputBuffer(m3.i iVar) {
        if (!this.allowFirstBufferPositionDiscontinuity || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.currentPositionUs) > 500000) {
            this.currentPositionUs = iVar.d;
        }
        this.allowFirstBufferPositionDiscontinuity = false;
    }

    @Override // j3.e
    public void onStarted() {
        ((k0) this.audioSink).r();
    }

    @Override // j3.e
    public void onStopped() {
        g();
        ((k0) this.audioSink).q();
    }

    @Override // j3.e
    public void onStreamChanged(j3.t0[] t0VarArr, long j10, long j11) {
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            f(j11);
            return;
        }
        int i10 = this.pendingOutputStreamOffsetCount;
        if (i10 == this.pendingOutputStreamOffsetsUs.length) {
            f5.a.K(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i10 + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j11;
    }

    @Override // j3.e
    public void render(long j10, long j11) {
        if (this.outputStreamEnded) {
            try {
                ((k0) this.audioSink).t();
                return;
            } catch (s e10) {
                throw createRendererException(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.inputFormat == null) {
            j3.u0 formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    f5.a.i(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        this.outputStreamEnded = true;
                        ((k0) this.audioSink).t();
                        return;
                    } catch (s e11) {
                        throw createRendererException(e11, null, 5002);
                    }
                }
                return;
            }
            d(formatHolder);
        }
        c();
        if (this.decoder != null) {
            try {
                f5.a.c("drainAndFeed");
                while (a()) {
                }
                while (b()) {
                }
                f5.a.q();
                synchronized (this.decoderCounters) {
                }
            } catch (p e12) {
                throw createRendererException(e12, e12.a, 5001);
            } catch (q e13) {
                throw createRendererException(e13, e13.c, e13.b, 5001);
            } catch (s e14) {
                throw createRendererException(e14, e14.c, e14.b, 5002);
            } catch (m3.g e15) {
                f5.a.p(TAG, "Audio codec error", e15);
                n nVar = this.eventDispatcher;
                Handler handler = nVar.a;
                if (handler != null) {
                    handler.post(new k(nVar, e15, 0));
                }
                throw createRendererException(e15, this.inputFormat, 4003);
            }
        }
    }

    @Override // f5.n
    public void setPlaybackParameters(x1 x1Var) {
        ((k0) this.audioSink).A(x1Var);
    }

    public final boolean sinkSupportsFormat(j3.t0 t0Var) {
        return ((k0) this.audioSink).h(t0Var) != 0;
    }

    @Override // j3.h2
    public final int supportsFormat(j3.t0 t0Var) {
        if (!f5.o.h(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        int supportsFormatInternal = supportsFormatInternal(t0Var);
        if (supportsFormatInternal <= 2) {
            return com.google.android.recaptcha.internal.a.b(supportsFormatInternal, 0, 0);
        }
        return com.google.android.recaptcha.internal.a.b(supportsFormatInternal, 8, f5.d0.a >= 21 ? 32 : 0);
    }

    public abstract int supportsFormatInternal(j3.t0 t0Var);

    @Override // j3.e
    public f5.n getMediaClock() {
        return this;
    }
}
