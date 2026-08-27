package j3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import h3.x1;
import hh.m5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n0 extends y3.q implements d5.o {
    public final Context E0;
    public final n F0;
    public final t G0;
    public int H0;
    public boolean I0;
    public h3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public h3.l0 O0;

    public n0(Context context, y3.j jVar, Handler handler, h3.h0 h0Var, t tVar) {
        super(1, jVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = tVar;
        this.F0 = new n(handler, h0Var);
        ((j0) tVar).r = new k5.i(this, 20);
    }

    public static p8.z R(y3.r rVar, h3.t0 t0Var, boolean z10, t tVar) {
        String str = t0Var.B;
        if (str == null) {
            p8.x xVar = p8.z.b;
            return p8.l0.e;
        }
        if (((j0) tVar).h(t0Var) != 0) {
            List e9 = y3.w.e("audio/raw", false, false);
            y3.n nVar = e9.isEmpty() ? null : (y3.n) e9.get(0);
            if (nVar != null) {
                return p8.z.y(nVar);
            }
        }
        rVar.getClass();
        List e10 = y3.w.e(str, z10, false);
        String b10 = y3.w.b(t0Var);
        if (b10 == null) {
            return p8.z.u(e10);
        }
        List e11 = y3.w.e(b10, z10, false);
        p8.x xVar2 = p8.z.b;
        p8.w wVar = new p8.w();
        wVar.b(e10);
        wVar.b(e11);
        return wVar.c();
    }

    @Override // y3.q
    public final void A() {
        ((j0) this.G0).G = true;
    }

    @Override // y3.q
    public final boolean C(long j10, long j11, y3.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, h3.t0 t0Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i10, false);
            return true;
        }
        t tVar = this.G0;
        if (z10) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.z0.f += i12;
            ((j0) tVar).G = true;
            return true;
        }
        try {
            if (!((j0) tVar).l(j12, i12, byteBuffer)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.z0.e += i12;
            return true;
        } catch (q e9) {
            throw createRendererException(e9, e9.c, e9.b, 5001);
        } catch (s e10) {
            throw createRendererException(e10, t0Var, e10.b, 5002);
        }
    }

    @Override // y3.q
    public final void F() {
        try {
            ((j0) this.G0).t();
        } catch (s e9) {
            throw createRendererException(e9, e9.c, e9.b, 5002);
        }
    }

    @Override // y3.q
    public final boolean L(h3.t0 t0Var) {
        return ((j0) this.G0).h(t0Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if ((r5.isEmpty() ? null : (y3.n) r5.get(0)) != null) goto L30;
     */
    @Override // y3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(y3.r rVar, h3.t0 t0Var) {
        boolean z10;
        boolean z11 = true;
        int b10 = com.google.android.recaptcha.internal.a.b(1, 0, 0);
        if (!d5.q.h(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        int i10 = d5.g0.a >= 21 ? 32 : 0;
        int i11 = t0Var.W;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        t tVar = this.G0;
        if (z13 && ((j0) tVar).h(t0Var) != 0) {
            if (z12) {
                List e9 = y3.w.e("audio/raw", false, false);
            }
            return com.google.android.recaptcha.internal.a.b(4, 8, i10);
        }
        if (!"audio/raw".equals(t0Var.B) || ((j0) tVar).h(t0Var) != 0) {
            if (((j0) tVar).h(d5.g0.v(2, t0Var.O, t0Var.P)) != 0) {
                p8.z R = R(rVar, t0Var, false, tVar);
                if (!R.isEmpty()) {
                    if (!z13) {
                        return com.google.android.recaptcha.internal.a.b(2, 0, 0);
                    }
                    y3.n nVar = (y3.n) R.get(0);
                    boolean d = nVar.d(t0Var);
                    if (!d) {
                        for (int i13 = 1; i13 < R.size(); i13++) {
                            y3.n nVar2 = (y3.n) R.get(i13);
                            if (nVar2.d(t0Var)) {
                                nVar = nVar2;
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z11 = d;
                    z10 = true;
                    int i14 = z11 ? 4 : 3;
                    if (z11 && nVar.e(t0Var)) {
                        i12 = 16;
                    }
                    return i14 | i12 | i10 | (nVar.g ? 64 : 0) | (z10 ? 128 : 0);
                }
            }
        }
        return b10;
    }

    public final int Q(y3.n nVar, h3.t0 t0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.a) || (i10 = d5.g0.a) >= 24 || (i10 == 23 && d5.g0.F(this.E0))) {
            return t0Var.C;
        }
        return -1;
    }

    public final void S() {
        long g10 = ((j0) this.G0).g(isEnded());
        if (g10 != Long.MIN_VALUE) {
            if (!this.M0) {
                g10 = Math.max(this.K0, g10);
            }
            this.K0 = g10;
            this.M0 = false;
        }
    }

    @Override // y3.q
    public final k3.l b(y3.n nVar, h3.t0 t0Var, h3.t0 t0Var2) {
        k3.l b10 = nVar.b(t0Var, t0Var2);
        int i10 = b10.e;
        if (Q(nVar, t0Var2) > this.H0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new k3.l(nVar.a, t0Var, t0Var2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // d5.o
    public final x1 getPlaybackParameters() {
        j0 j0Var = (j0) this.G0;
        return j0Var.k ? j0Var.y : j0Var.i().a;
    }

    @Override // d5.o
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override // h3.e, h3.d2
    public final void handleMessage(int i10, Object obj) {
        t tVar = this.G0;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            j0 j0Var = (j0) tVar;
            if (j0Var.J != floatValue) {
                j0Var.J = floatValue;
                if (j0Var.o()) {
                    if (d5.g0.a >= 21) {
                        j0Var.u.setVolume(j0Var.J);
                        return;
                    }
                    AudioTrack audioTrack = j0Var.u;
                    float f10 = j0Var.J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            e eVar = (e) obj;
            j0 j0Var2 = (j0) tVar;
            if (j0Var2.v.equals(eVar)) {
                return;
            }
            j0Var2.v = eVar;
            if (j0Var2.Z) {
                return;
            }
            j0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((j0) tVar).z((x) obj);
            return;
        }
        switch (i10) {
            case 9:
                j0 j0Var3 = (j0) tVar;
                j0Var3.x(j0Var3.i().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                j0 j0Var4 = (j0) tVar;
                if (j0Var4.W != intValue) {
                    j0Var4.W = intValue;
                    j0Var4.V = intValue != 0;
                    j0Var4.e();
                    break;
                }
                break;
            case 11:
                this.O0 = (h3.l0) obj;
                break;
            case 12:
                if (d5.g0.a >= 23) {
                    m0.a(tVar, obj);
                    break;
                }
                break;
        }
    }

    @Override // y3.q, h3.e
    public final boolean isEnded() {
        if (!this.v0) {
            return false;
        }
        j0 j0Var = (j0) this.G0;
        if (j0Var.o()) {
            return j0Var.S && !j0Var.m();
        }
        return true;
    }

    @Override // y3.q, h3.e
    public final boolean isReady() {
        return ((j0) this.G0).m() || super.isReady();
    }

    @Override // y3.q
    public final float l(float f10, h3.t0[] t0VarArr) {
        int i10 = -1;
        for (h3.t0 t0Var : t0VarArr) {
            int i11 = t0Var.P;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // y3.q
    public final ArrayList m(y3.r rVar, h3.t0 t0Var, boolean z10) {
        p8.z R = R(rVar, t0Var, z10, this.G0);
        Pattern pattern = y3.w.a;
        ArrayList arrayList = new ArrayList(R);
        Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    @Override // y3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y3.i o(y3.n nVar, h3.t0 t0Var, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        MediaFormat mediaFormat;
        h3.t0[] streamFormats = getStreamFormats();
        int Q = Q(nVar, t0Var);
        if (streamFormats.length != 1) {
            for (h3.t0 t0Var2 : streamFormats) {
                if (nVar.b(t0Var, t0Var2).d != 0) {
                    Q = Math.max(Q, Q(nVar, t0Var2));
                }
            }
        }
        this.H0 = Q;
        String str = nVar.a;
        int i10 = d5.g0.a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(d5.g0.c)) {
            String str2 = d5.g0.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.I0 = z10;
                String str3 = nVar.c;
                int i11 = this.H0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i12 = t0Var.O;
                String str4 = t0Var.B;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = t0Var.P;
                mediaFormat.setInteger("sample-rate", i13);
                d5.a.I(mediaFormat, t0Var.D);
                d5.a.A(mediaFormat, "max-input-size", i11);
                if (i10 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f10 != -1.0f) {
                        if (i10 == 23) {
                            String str5 = d5.g0.d;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                }
                if (i10 <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i10 >= 24) {
                    if (((j0) this.G0).h(d5.g0.v(4, t0Var.O, i13)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.J0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str4)) ? null : t0Var;
                return new y3.i(nVar, mediaFormat, t0Var, null, mediaCrypto);
            }
        }
        z10 = false;
        this.I0 = z10;
        String str32 = nVar.c;
        int i112 = this.H0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i122 = t0Var.O;
        String str42 = t0Var.B;
        mediaFormat.setInteger("channel-count", i122);
        int i132 = t0Var.P;
        mediaFormat.setInteger("sample-rate", i132);
        d5.a.I(mediaFormat, t0Var.D);
        d5.a.A(mediaFormat, "max-input-size", i112);
        if (i10 >= 23) {
        }
        if (i10 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        this.J0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str42)) ? null : t0Var;
        return new y3.i(nVar, mediaFormat, t0Var, null, mediaCrypto);
    }

    @Override // y3.q, h3.e
    public final void onDisabled() {
        n nVar = this.F0;
        this.N0 = true;
        try {
            ((j0) this.G0).e();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override // h3.e
    public final void onEnabled(boolean z10, boolean z11) {
        k3.f fVar = new k3.f();
        this.z0 = fVar;
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new l(nVar, fVar, 0));
        }
        boolean z12 = getConfiguration().a;
        t tVar = this.G0;
        if (z12) {
            ((j0) tVar).d();
        } else {
            j0 j0Var = (j0) tVar;
            if (j0Var.Z) {
                j0Var.Z = false;
                j0Var.e();
            }
        }
        ((j0) tVar).q = getPlayerId();
    }

    @Override // y3.q, h3.e
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((j0) this.G0).e();
        this.K0 = j10;
        this.L0 = true;
        this.M0 = true;
    }

    @Override // y3.q
    public final void onQueueInputBuffer(k3.i iVar) {
        if (!this.L0 || iVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(iVar.d - this.K0) > 500000) {
            this.K0 = iVar.d;
        }
        this.L0 = false;
    }

    @Override // y3.q, h3.e
    public final void onReset() {
        t tVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((j0) tVar).v();
            }
        }
    }

    @Override // h3.e
    public final void onStarted() {
        ((j0) this.G0).r();
    }

    @Override // h3.e
    public final void onStopped() {
        S();
        ((j0) this.G0).q();
    }

    @Override // d5.o
    public final void setPlaybackParameters(x1 x1Var) {
        ((j0) this.G0).A(x1Var);
    }

    @Override // y3.q
    public final void t(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 0));
        }
    }

    @Override // y3.q
    public final void u(long j10, long j11, String str) {
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new e5.w(nVar, str, j10, j11, 2));
        }
    }

    @Override // y3.q
    public final void v(String str) {
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new m5(13, nVar, str));
        }
    }

    @Override // y3.q
    public final k3.l w(h3.u0 u0Var) {
        k3.l w10 = super.w(u0Var);
        h3.t0 t0Var = u0Var.b;
        n nVar = this.F0;
        Handler handler = nVar.a;
        if (handler != null) {
            handler.post(new m(nVar, t0Var, w10, 0));
        }
        return w10;
    }

    @Override // y3.q
    public final void x(h3.t0 t0Var, MediaFormat mediaFormat) {
        h3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i10 = t0Var.O;
            int u10 = "audio/raw".equals(str) ? t0Var.Q : (d5.g0.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? d5.g0.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            h3.s0 s0Var = new h3.s0();
            s0Var.o = "audio/raw";
            s0Var.D = u10;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new h3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((j0) this.G0).b(t0Var, iArr);
        } catch (p e9) {
            throw createRendererException(e9, e9.a, 5001);
        }
    }

    @Override // y3.q
    public final void y() {
        this.G0.getClass();
    }

    @Override // h3.e
    public final d5.o getMediaClock() {
        return this;
    }
}
