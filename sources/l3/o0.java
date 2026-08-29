package l3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import j3.x1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import jh.w2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 extends a4.t implements f5.n {
    public final Context E0;
    public final n F0;
    public final t G0;
    public int H0;
    public boolean I0;
    public j3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public j3.l0 O0;

    public o0(Context context, a4.m mVar, Handler handler, j3.h0 h0Var, t tVar) {
        super(1, mVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = tVar;
        this.F0 = new n(handler, h0Var);
        ((k0) tVar).r = new za.c(this, 23);
    }

    public static q8.z R(a4.u uVar, j3.t0 t0Var, boolean z10, t tVar) {
        String str = t0Var.B;
        if (str == null) {
            q8.x xVar = q8.z.b;
            return q8.l0.e;
        }
        if (((k0) tVar).h(t0Var) != 0) {
            List e10 = a4.b0.e("audio/raw", false, false);
            a4.q qVar = e10.isEmpty() ? null : (a4.q) e10.get(0);
            if (qVar != null) {
                return q8.z.y(qVar);
            }
        }
        uVar.getClass();
        List e11 = a4.b0.e(str, z10, false);
        String b10 = a4.b0.b(t0Var);
        if (b10 == null) {
            return q8.z.u(e11);
        }
        List e12 = a4.b0.e(b10, z10, false);
        q8.x xVar2 = q8.z.b;
        q8.w wVar = new q8.w();
        wVar.b(e11);
        wVar.b(e12);
        return wVar.c();
    }

    @Override // a4.t
    public final void A() {
        ((k0) this.G0).G = true;
    }

    @Override // a4.t
    public final boolean C(long j10, long j11, a4.n nVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, j3.t0 t0Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i11 & 2) != 0) {
            nVar.getClass();
            nVar.releaseOutputBuffer(i10, false);
            return true;
        }
        t tVar = this.G0;
        if (z10) {
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.z0.f += i12;
            ((k0) tVar).G = true;
            return true;
        }
        try {
            if (!((k0) tVar).l(j12, i12, byteBuffer)) {
                return false;
            }
            if (nVar != null) {
                nVar.releaseOutputBuffer(i10, false);
            }
            this.z0.e += i12;
            return true;
        } catch (q e10) {
            throw createRendererException(e10, e10.c, e10.b, 5001);
        } catch (s e11) {
            throw createRendererException(e11, t0Var, e11.b, 5002);
        }
    }

    @Override // a4.t
    public final void F() {
        try {
            ((k0) this.G0).t();
        } catch (s e10) {
            throw createRendererException(e10, e10.c, e10.b, 5002);
        }
    }

    @Override // a4.t
    public final boolean L(j3.t0 t0Var) {
        return ((k0) this.G0).h(t0Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if ((r5.isEmpty() ? null : (a4.q) r5.get(0)) != null) goto L30;
     */
    @Override // a4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(a4.u uVar, j3.t0 t0Var) {
        boolean z10;
        boolean z11 = true;
        int b10 = com.google.android.recaptcha.internal.a.b(1, 0, 0);
        if (!f5.o.h(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        int i10 = f5.d0.a >= 21 ? 32 : 0;
        int i11 = t0Var.W;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        t tVar = this.G0;
        if (z13 && ((k0) tVar).h(t0Var) != 0) {
            if (z12) {
                List e10 = a4.b0.e("audio/raw", false, false);
            }
            return com.google.android.recaptcha.internal.a.b(4, 8, i10);
        }
        if (!"audio/raw".equals(t0Var.B) || ((k0) tVar).h(t0Var) != 0) {
            if (((k0) tVar).h(f5.d0.v(2, t0Var.O, t0Var.P)) != 0) {
                q8.z R = R(uVar, t0Var, false, tVar);
                if (!R.isEmpty()) {
                    if (!z13) {
                        return com.google.android.recaptcha.internal.a.b(2, 0, 0);
                    }
                    a4.q qVar = (a4.q) R.get(0);
                    boolean d = qVar.d(t0Var);
                    if (!d) {
                        for (int i13 = 1; i13 < R.size(); i13++) {
                            a4.q qVar2 = (a4.q) R.get(i13);
                            if (qVar2.d(t0Var)) {
                                qVar = qVar2;
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z11 = d;
                    z10 = true;
                    int i14 = z11 ? 4 : 3;
                    if (z11 && qVar.e(t0Var)) {
                        i12 = 16;
                    }
                    return i14 | i12 | i10 | (qVar.g ? 64 : 0) | (z10 ? 128 : 0);
                }
            }
        }
        return b10;
    }

    public final int Q(a4.q qVar, j3.t0 t0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(qVar.a) || (i10 = f5.d0.a) >= 24 || (i10 == 23 && f5.d0.F(this.E0))) {
            return t0Var.C;
        }
        return -1;
    }

    public final void S() {
        long g10 = ((k0) this.G0).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.M0) {
                g10 = Math.max(this.K0, g10);
            }
            this.K0 = g10;
            this.M0 = false;
        }
    }

    @Override // a4.t
    public final m3.l b(a4.q qVar, j3.t0 t0Var, j3.t0 t0Var2) {
        m3.l b10 = qVar.b(t0Var, t0Var2);
        int i10 = b10.e;
        if (Q(qVar, t0Var2) > this.H0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new m3.l(qVar.a, t0Var, t0Var2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // j3.e, j3.h2
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // f5.n
    public final x1 getPlaybackParameters() {
        k0 k0Var = (k0) this.G0;
        return k0Var.k ? k0Var.y : k0Var.i().a;
    }

    @Override // f5.n
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override // j3.e, j3.d2
    public final void handleMessage(int i10, Object obj) {
        t tVar = this.G0;
        if (i10 == 2) {
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
            k0 k0Var2 = (k0) tVar;
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
            ((k0) tVar).z((x) obj);
            return;
        }
        switch (i10) {
            case 9:
                k0 k0Var3 = (k0) tVar;
                k0Var3.x(k0Var3.i().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                k0 k0Var4 = (k0) tVar;
                if (k0Var4.W != intValue) {
                    k0Var4.W = intValue;
                    k0Var4.V = intValue != 0;
                    k0Var4.e();
                    break;
                }
                break;
            case 11:
                this.O0 = (j3.l0) obj;
                break;
            case 12:
                if (f5.d0.a >= 23) {
                    n0.a(tVar, obj);
                    break;
                }
                break;
        }
    }

    @Override // a4.t, j3.e
    public final boolean isEnded() {
        if (!this.v0) {
            return false;
        }
        k0 k0Var = (k0) this.G0;
        if (k0Var.o()) {
            return k0Var.S && !k0Var.m();
        }
        return true;
    }

    @Override // a4.t, j3.e
    public final boolean isReady() {
        return ((k0) this.G0).m() || super.isReady();
    }

    @Override // a4.t
    public final float l(float f9, j3.t0[] t0VarArr) {
        int i10 = -1;
        for (j3.t0 t0Var : t0VarArr) {
            int i11 = t0Var.P;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f9;
    }

    @Override // a4.t
    public final ArrayList m(a4.u uVar, j3.t0 t0Var, boolean z10) {
        q8.z R = R(uVar, t0Var, z10, this.G0);
        Pattern pattern = a4.b0.a;
        ArrayList arrayList = new ArrayList(R);
        Collections.sort(arrayList, new a4.v(new a1.c(t0Var, 1), 0));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    @Override // a4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a4.l o(a4.q qVar, j3.t0 t0Var, MediaCrypto mediaCrypto, float f9) {
        boolean z10;
        MediaFormat mediaFormat;
        j3.t0[] streamFormats = getStreamFormats();
        int Q = Q(qVar, t0Var);
        if (streamFormats.length != 1) {
            for (j3.t0 t0Var2 : streamFormats) {
                if (qVar.b(t0Var, t0Var2).d != 0) {
                    Q = Math.max(Q, Q(qVar, t0Var2));
                }
            }
        }
        this.H0 = Q;
        String str = qVar.a;
        int i10 = f5.d0.a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(f5.d0.c)) {
            String str2 = f5.d0.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.I0 = z10;
                String str3 = qVar.c;
                int i11 = this.H0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i12 = t0Var.O;
                String str4 = t0Var.B;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = t0Var.P;
                mediaFormat.setInteger("sample-rate", i13);
                f5.a.I(mediaFormat, t0Var.D);
                f5.a.A(mediaFormat, "max-input-size", i11);
                if (i10 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f9 != -1.0f) {
                        if (i10 == 23) {
                            String str5 = f5.d0.d;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f9);
                    }
                }
                if (i10 <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i10 >= 24) {
                    if (((k0) this.G0).h(f5.d0.v(4, t0Var.O, i13)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.J0 = ("audio/raw".equals(qVar.b) || "audio/raw".equals(str4)) ? null : t0Var;
                return new a4.l(qVar, mediaFormat, t0Var, null, mediaCrypto);
            }
        }
        z10 = false;
        this.I0 = z10;
        String str32 = qVar.c;
        int i112 = this.H0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i122 = t0Var.O;
        String str42 = t0Var.B;
        mediaFormat.setInteger("channel-count", i122);
        int i132 = t0Var.P;
        mediaFormat.setInteger("sample-rate", i132);
        f5.a.I(mediaFormat, t0Var.D);
        f5.a.A(mediaFormat, "max-input-size", i112);
        if (i10 >= 23) {
        }
        if (i10 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        this.J0 = ("audio/raw".equals(qVar.b) || "audio/raw".equals(str42)) ? null : t0Var;
        return new a4.l(qVar, mediaFormat, t0Var, null, mediaCrypto);
    }

    @Override // a4.t, j3.e
    public final void onDisabled() {
        n nVar = this.F0;
        this.N0 = true;
        try {
            ((k0) this.G0).e();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.onDisabled();
                throw th2;
            } finally {
            }
        }
    }

    @Override // j3.e
    public final void onEnabled(boolean z10, boolean z11) {
        m3.f fVar = new m3.f();
        this.z0 = fVar;
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new l(nVar, fVar, 0));
        }
        boolean z12 = getConfiguration().a;
        t tVar = this.G0;
        if (z12) {
            ((k0) tVar).d();
        } else {
            k0 k0Var = (k0) tVar;
            if (k0Var.Z) {
                k0Var.Z = false;
                k0Var.e();
            }
        }
        ((k0) tVar).q = getPlayerId();
    }

    @Override // a4.t, j3.e
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((k0) this.G0).e();
        this.K0 = j10;
        this.L0 = true;
        this.M0 = true;
    }

    @Override // a4.t
    public final void onQueueInputBuffer(m3.i iVar) {
        if (!this.L0 || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.K0) > 500000) {
            this.K0 = iVar.d;
        }
        this.L0 = false;
    }

    @Override // a4.t, j3.e
    public final void onReset() {
        t tVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((k0) tVar).v();
            }
        }
    }

    @Override // j3.e
    public final void onStarted() {
        ((k0) this.G0).r();
    }

    @Override // j3.e
    public final void onStopped() {
        S();
        ((k0) this.G0).q();
    }

    @Override // f5.n
    public final void setPlaybackParameters(x1 x1Var) {
        ((k0) this.G0).A(x1Var);
    }

    @Override // a4.t
    public final void t(Exception exc) {
        f5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 0));
        }
    }

    @Override // a4.t
    public final void u(long j10, long j11, String str) {
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new g5.x(nVar, str, j10, j11, 2));
        }
    }

    @Override // a4.t
    public final void v(String str) {
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new w2(20, nVar, str));
        }
    }

    @Override // a4.t
    public final m3.l w(j3.u0 u0Var) {
        m3.l w10 = super.w(u0Var);
        j3.t0 t0Var = u0Var.b;
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new m(nVar, t0Var, w10, 0));
        }
        return w10;
    }

    @Override // a4.t
    public final void x(j3.t0 t0Var, MediaFormat mediaFormat) {
        j3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i10 = t0Var.O;
            int u10 = "audio/raw".equals(str) ? t0Var.Q : (f5.d0.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? f5.d0.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            j3.s0 s0Var = new j3.s0();
            s0Var.o = "audio/raw";
            s0Var.D = u10;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new j3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((k0) this.G0).b(t0Var, iArr);
        } catch (p e10) {
            throw createRendererException(e10, e10.a, 5001);
        }
    }

    @Override // a4.t
    public final void y() {
        this.G0.getClass();
    }

    @Override // j3.e
    public final f5.n getMediaClock() {
        return this;
    }
}
