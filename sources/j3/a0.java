package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer;
import h3.x1;
import ih.h3;
import ih.j7;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a0 extends h3.e implements d5.o {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final s audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private k3.e decoder;
    private k3.f decoderCounters;
    private l3.e decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final m eventDispatcher;
    private boolean experimentalKeepAudioTrackOnSeek;
    private boolean firstStreamSampleRead;
    private final k3.i flagsOnlyBuffer;
    private k3.i inputBuffer;
    private h3.t0 inputFormat;
    private boolean inputStreamEnded;
    private SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private l3.e sourceDrmSession;

    public a0(Handler handler, n nVar, s sVar) {
        super(1);
        this.eventDispatcher = new m(handler, nVar);
        this.audioSink = sVar;
        ((i0) sVar).r = new xa.c((FfmpegAudioRenderer) this, 20);
        this.flagsOnlyBuffer = new k3.i(0, 0);
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
                int i9 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
                if (i9 > 0) {
                    this.decoderCounters.f += i9;
                    ((i0) this.audioSink).G = true;
                }
                if (simpleDecoderOutputBuffer.isFirstSample()) {
                    ((i0) this.audioSink).G = true;
                    if (this.pendingOutputStreamOffsetCount != 0) {
                        f(this.pendingOutputStreamOffsetsUs[0]);
                        int i10 = this.pendingOutputStreamOffsetCount - 1;
                        this.pendingOutputStreamOffsetCount = i10;
                        long[] jArr = this.pendingOutputStreamOffsetsUs;
                        System.arraycopy(jArr, 1, jArr, 0, i10);
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
                ((i0) this.audioSink).t();
                return false;
            } catch (r e10) {
                throw createRendererException(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.audioTrackNeedsConfigure) {
            h3.s0 a2 = getOutputFormat(this.decoder).a();
            a2.E = this.encoderDelay;
            a2.F = this.encoderPadding;
            ((i0) this.audioSink).b(new h3.t0(a2), null);
            this.audioTrackNeedsConfigure = false;
        }
        s sVar = this.audioSink;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.outputBuffer;
        if (((i0) sVar).l(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.data)) {
            this.decoderCounters.e++;
            this.outputBuffer.release();
            this.outputBuffer = null;
            return true;
        }
        return false;
    }

    public final boolean b() {
        k3.e eVar = this.decoder;
        if (eVar == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            k3.i iVar = (k3.i) eVar.dequeueInputBuffer();
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
        h3.u0 formatHolder = getFormatHolder();
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
        this.inputBuffer.d();
        this.inputBuffer.getClass();
        onQueueInputBuffer(this.inputBuffer);
        this.decoder.queueInputBuffer(this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.c++;
        this.inputBuffer = null;
        return true;
    }

    public final void c() {
        k3.b bVar;
        if (this.decoder != null) {
            return;
        }
        l3.e eVar = this.sourceDrmSession;
        r0.D(this.decoderDrmSession, eVar);
        this.decoderDrmSession = eVar;
        if (eVar != null) {
            bVar = eVar.y();
            if (bVar == null && this.decoderDrmSession.x() == null) {
                return;
            }
        } else {
            bVar = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d5.a.c("createAudioDecoder");
            this.decoder = createDecoder(this.inputFormat, bVar);
            d5.a.q();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            m mVar = this.eventDispatcher;
            String name = this.decoder.getName();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = mVar.a;
            if (handler != null) {
                handler.post(new e5.y(mVar, name, elapsedRealtime2, j10, 3));
            }
            this.decoderCounters.a++;
        } catch (OutOfMemoryError e10) {
            throw createRendererException(e10, this.inputFormat, 4001);
        } catch (k3.g e11) {
            d5.a.p(TAG, "Audio codec error", e11);
            m mVar2 = this.eventDispatcher;
            Handler handler2 = mVar2.a;
            if (handler2 != null) {
                handler2.post(new k(mVar2, e11, 0));
            }
            throw createRendererException(e11, this.inputFormat, 4001);
        }
    }

    public k3.l canReuseDecoder(String str, h3.t0 t0Var, h3.t0 t0Var2) {
        return new k3.l(str, t0Var, t0Var2, 0, 1);
    }

    public abstract k3.e createDecoder(h3.t0 t0Var, k3.b bVar);

    public final void d(h3.u0 u0Var) {
        h3.t0 t0Var = u0Var.b;
        t0Var.getClass();
        l3.e eVar = u0Var.a;
        r0.D(this.sourceDrmSession, eVar);
        this.sourceDrmSession = eVar;
        h3.t0 t0Var2 = this.inputFormat;
        this.inputFormat = t0Var;
        this.encoderDelay = t0Var.R;
        this.encoderPadding = t0Var.S;
        k3.e eVar2 = this.decoder;
        if (eVar2 == null) {
            c();
            m mVar = this.eventDispatcher;
            h3.t0 t0Var3 = this.inputFormat;
            Handler handler = mVar.a;
            if (handler != null) {
                handler.post(new h3(mVar, t0Var3, null, 8));
                return;
            }
            return;
        }
        k3.l lVar = eVar != this.decoderDrmSession ? new k3.l(eVar2.getName(), t0Var2, t0Var, 0, 128) : canReuseDecoder(eVar2.getName(), t0Var2, t0Var);
        if (lVar.d == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                e();
                c();
                this.audioTrackNeedsConfigure = true;
            }
        }
        m mVar2 = this.eventDispatcher;
        h3.t0 t0Var4 = this.inputFormat;
        Handler handler2 = mVar2.a;
        if (handler2 != null) {
            handler2.post(new h3(mVar2, t0Var4, lVar, 8));
        }
    }

    public final void e() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        k3.e eVar = this.decoder;
        if (eVar != null) {
            this.decoderCounters.b++;
            eVar.release();
            m mVar = this.eventDispatcher;
            String name = this.decoder.getName();
            Handler handler = mVar.a;
            if (handler != null) {
                handler.post(new j7(6, mVar, name));
            }
            this.decoder = null;
        }
        r0.D(this.decoderDrmSession, null);
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
        long g10 = ((i0) this.audioSink).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                g10 = Math.max(this.currentPositionUs, g10);
            }
            this.currentPositionUs = g10;
            this.allowPositionDiscontinuity = false;
        }
    }

    public abstract h3.t0 getOutputFormat(k3.e eVar);

    @Override // d5.o
    public x1 getPlaybackParameters() {
        i0 i0Var = (i0) this.audioSink;
        return i0Var.k ? i0Var.y : i0Var.i().a;
    }

    @Override // d5.o
    public long getPositionUs() {
        if (getState() == 2) {
            g();
        }
        return this.currentPositionUs;
    }

    public final int getSinkFormatSupport(h3.t0 t0Var) {
        return ((i0) this.audioSink).h(t0Var);
    }

    @Override // h3.e, h3.d2
    public void handleMessage(int i9, Object obj) {
        if (i9 == 2) {
            s sVar = this.audioSink;
            float floatValue = ((Float) obj).floatValue();
            i0 i0Var = (i0) sVar;
            if (i0Var.J != floatValue) {
                i0Var.J = floatValue;
                if (i0Var.o()) {
                    if (d5.f0.a >= 21) {
                        i0Var.u.setVolume(i0Var.J);
                        return;
                    }
                    AudioTrack audioTrack = i0Var.u;
                    float f10 = i0Var.J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == 3) {
            e eVar = (e) obj;
            i0 i0Var2 = (i0) this.audioSink;
            if (i0Var2.v.equals(eVar)) {
                return;
            }
            i0Var2.v = eVar;
            if (i0Var2.Z) {
                return;
            }
            i0Var2.e();
            return;
        }
        if (i9 == 6) {
            ((i0) this.audioSink).z((w) obj);
            return;
        }
        if (i9 == 12) {
            if (d5.f0.a >= 23) {
                z.a(this.audioSink, obj);
                return;
            }
            return;
        }
        if (i9 == 9) {
            i0 i0Var3 = (i0) this.audioSink;
            i0Var3.x(i0Var3.i().a, ((Boolean) obj).booleanValue());
        } else {
            if (i9 != 10) {
                return;
            }
            s sVar2 = this.audioSink;
            int intValue = ((Integer) obj).intValue();
            i0 i0Var4 = (i0) sVar2;
            if (i0Var4.W != intValue) {
                i0Var4.W = intValue;
                i0Var4.V = intValue != 0;
                i0Var4.e();
            }
        }
    }

    @Override // h3.e
    public boolean isEnded() {
        if (!this.outputStreamEnded) {
            return false;
        }
        i0 i0Var = (i0) this.audioSink;
        if (i0Var.o()) {
            return i0Var.S && !i0Var.m();
        }
        return true;
    }

    @Override // h3.e
    public boolean isReady() {
        if (((i0) this.audioSink).m()) {
            return true;
        }
        if (this.inputFormat != null) {
            return isSourceReady() || this.outputBuffer != null;
        }
        return false;
    }

    @Override // h3.e
    public void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        f(-9223372036854775807L);
        try {
            r0.D(this.sourceDrmSession, null);
            this.sourceDrmSession = null;
            e();
            ((i0) this.audioSink).v();
        } finally {
            this.eventDispatcher.a(this.decoderCounters);
        }
    }

    @Override // h3.e
    public void onEnabled(boolean z10, boolean z11) {
        k3.f fVar = new k3.f();
        this.decoderCounters = fVar;
        m mVar = this.eventDispatcher;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new l(mVar, fVar, 0));
        }
        if (getConfiguration().a) {
            ((i0) this.audioSink).d();
        } else {
            i0 i0Var = (i0) this.audioSink;
            if (i0Var.Z) {
                i0Var.Z = false;
                i0Var.e();
            }
        }
        ((i0) this.audioSink).q = getPlayerId();
    }

    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // h3.e
    public void onPositionReset(long j10, boolean z10) {
        if (this.experimentalKeepAudioTrackOnSeek) {
            i0 i0Var = (i0) this.audioSink;
            v vVar = i0Var.i;
            if (d5.f0.a < 25) {
                i0Var.e();
            } else {
                i0Var.o.c = null;
                i0Var.n.c = null;
                if (i0Var.o()) {
                    i0Var.w();
                    AudioTrack audioTrack = vVar.c;
                    audioTrack.getClass();
                    if (audioTrack.getPlayState() == 3) {
                        i0Var.u.pause();
                    }
                    i0Var.u.flush();
                    vVar.l = 0L;
                    vVar.w = 0;
                    vVar.v = 0;
                    vVar.m = 0L;
                    vVar.C = 0L;
                    vVar.F = 0L;
                    vVar.k = false;
                    vVar.c = null;
                    vVar.f = null;
                    v vVar2 = i0Var.i;
                    AudioTrack audioTrack2 = i0Var.u;
                    e0 e0Var = i0Var.t;
                    vVar2.c(audioTrack2, e0Var.c == 2, e0Var.g, e0Var.d, e0Var.h);
                    i0Var.H = true;
                }
            }
        } else {
            ((i0) this.audioSink).e();
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

    public void onQueueInputBuffer(k3.i iVar) {
        if (!this.allowFirstBufferPositionDiscontinuity || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.currentPositionUs) > 500000) {
            this.currentPositionUs = iVar.d;
        }
        this.allowFirstBufferPositionDiscontinuity = false;
    }

    @Override // h3.e
    public void onStarted() {
        ((i0) this.audioSink).r();
    }

    @Override // h3.e
    public void onStopped() {
        g();
        ((i0) this.audioSink).q();
    }

    @Override // h3.e
    public void onStreamChanged(h3.t0[] t0VarArr, long j10, long j11) {
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            f(j11);
            return;
        }
        int i9 = this.pendingOutputStreamOffsetCount;
        if (i9 == this.pendingOutputStreamOffsetsUs.length) {
            d5.a.K(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i9 + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j11;
    }

    @Override // h3.e
    public void render(long j10, long j11) {
        if (this.outputStreamEnded) {
            try {
                ((i0) this.audioSink).t();
                return;
            } catch (r e10) {
                throw createRendererException(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.inputFormat == null) {
            h3.u0 formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    d5.a.i(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        this.outputStreamEnded = true;
                        ((i0) this.audioSink).t();
                        return;
                    } catch (r e11) {
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
                d5.a.c("drainAndFeed");
                while (a()) {
                }
                while (b()) {
                }
                d5.a.q();
                synchronized (this.decoderCounters) {
                }
            } catch (o e12) {
                throw createRendererException(e12, e12.a, 5001);
            } catch (p e13) {
                throw createRendererException(e13, e13.c, e13.b, 5001);
            } catch (r e14) {
                throw createRendererException(e14, e14.c, e14.b, 5002);
            } catch (k3.g e15) {
                d5.a.p(TAG, "Audio codec error", e15);
                m mVar = this.eventDispatcher;
                Handler handler = mVar.a;
                if (handler != null) {
                    handler.post(new k(mVar, e15, 0));
                }
                throw createRendererException(e15, this.inputFormat, 4003);
            }
        }
    }

    @Override // d5.o
    public void setPlaybackParameters(x1 x1Var) {
        ((i0) this.audioSink).A(x1Var);
    }

    public final boolean sinkSupportsFormat(h3.t0 t0Var) {
        return ((i0) this.audioSink).h(t0Var) != 0;
    }

    @Override // h3.h2
    public final int supportsFormat(h3.t0 t0Var) {
        if (!d5.q.h(t0Var.B)) {
            return e2.c.b(0, 0, 0);
        }
        int supportsFormatInternal = supportsFormatInternal(t0Var);
        if (supportsFormatInternal <= 2) {
            return e2.c.b(supportsFormatInternal, 0, 0);
        }
        return e2.c.b(supportsFormatInternal, 8, d5.f0.a >= 21 ? 32 : 0);
    }

    public abstract int supportsFormatInternal(h3.t0 t0Var);

    @Override // h3.e
    public d5.o getMediaClock() {
        return this;
    }
}
