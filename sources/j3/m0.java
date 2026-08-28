package j3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import h3.x1;
import ih.h3;
import ih.j7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 extends y3.q implements d5.o {
    public final Context E0;
    public final m F0;
    public final s G0;
    public int H0;
    public boolean I0;
    public h3.t0 J0;
    public long K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public h3.l0 O0;

    public m0(Context context, y3.j jVar, Handler handler, h3.h0 h0Var, s sVar) {
        super(1, jVar, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = sVar;
        this.F0 = new m(handler, h0Var);
        ((i0) sVar).r = new k5.i(this, 20);
    }

    public static o8.z R(y3.r rVar, h3.t0 t0Var, boolean z10, s sVar) {
        String str = t0Var.B;
        if (str == null) {
            o8.x xVar = o8.z.b;
            return o8.l0.e;
        }
        if (((i0) sVar).h(t0Var) != 0) {
            List e10 = y3.w.e("audio/raw", false, false);
            y3.n nVar = e10.isEmpty() ? null : (y3.n) e10.get(0);
            if (nVar != null) {
                return o8.z.y(nVar);
            }
        }
        rVar.getClass();
        List e11 = y3.w.e(str, z10, false);
        String b10 = y3.w.b(t0Var);
        if (b10 == null) {
            return o8.z.u(e11);
        }
        List e12 = y3.w.e(b10, z10, false);
        o8.x xVar2 = o8.z.b;
        o8.w wVar = new o8.w();
        wVar.b(e11);
        wVar.b(e12);
        return wVar.c();
    }

    @Override // y3.q
    public final void A() {
        ((i0) this.G0).G = true;
    }

    @Override // y3.q
    public final boolean C(long j10, long j11, y3.k kVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j12, boolean z10, boolean z11, h3.t0 t0Var) {
        byteBuffer.getClass();
        if (this.J0 != null && (i10 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i9, false);
            return true;
        }
        s sVar = this.G0;
        if (z10) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i9, false);
            }
            this.z0.f += i11;
            ((i0) sVar).G = true;
            return true;
        }
        try {
            if (!((i0) sVar).l(j12, i11, byteBuffer)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i9, false);
            }
            this.z0.e += i11;
            return true;
        } catch (p e10) {
            throw createRendererException(e10, e10.c, e10.b, 5001);
        } catch (r e11) {
            throw createRendererException(e11, t0Var, e11.b, 5002);
        }
    }

    @Override // y3.q
    public final void F() {
        try {
            ((i0) this.G0).t();
        } catch (r e10) {
            throw createRendererException(e10, e10.c, e10.b, 5002);
        }
    }

    @Override // y3.q
    public final boolean L(h3.t0 t0Var) {
        return ((i0) this.G0).h(t0Var) != 0;
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
        int b10 = e2.c.b(1, 0, 0);
        if (!d5.q.h(t0Var.B)) {
            return e2.c.b(0, 0, 0);
        }
        int i9 = d5.f0.a >= 21 ? 32 : 0;
        int i10 = t0Var.W;
        boolean z12 = i10 != 0;
        boolean z13 = i10 == 0 || i10 == 2;
        int i11 = 8;
        s sVar = this.G0;
        if (z13 && ((i0) sVar).h(t0Var) != 0) {
            if (z12) {
                List e10 = y3.w.e("audio/raw", false, false);
            }
            return e2.c.b(4, 8, i9);
        }
        if (!"audio/raw".equals(t0Var.B) || ((i0) sVar).h(t0Var) != 0) {
            if (((i0) sVar).h(d5.f0.v(2, t0Var.O, t0Var.P)) != 0) {
                o8.z R = R(rVar, t0Var, false, sVar);
                if (!R.isEmpty()) {
                    if (!z13) {
                        return e2.c.b(2, 0, 0);
                    }
                    y3.n nVar = (y3.n) R.get(0);
                    boolean d = nVar.d(t0Var);
                    if (!d) {
                        for (int i12 = 1; i12 < R.size(); i12++) {
                            y3.n nVar2 = (y3.n) R.get(i12);
                            if (nVar2.d(t0Var)) {
                                nVar = nVar2;
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z11 = d;
                    z10 = true;
                    int i13 = z11 ? 4 : 3;
                    if (z11 && nVar.e(t0Var)) {
                        i11 = 16;
                    }
                    return i13 | i11 | i9 | (nVar.g ? 64 : 0) | (z10 ? 128 : 0);
                }
            }
        }
        return b10;
    }

    public final int Q(y3.n nVar, h3.t0 t0Var) {
        int i9;
        if (!"OMX.google.raw.decoder".equals(nVar.a) || (i9 = d5.f0.a) >= 24 || (i9 == 23 && d5.f0.F(this.E0))) {
            return t0Var.C;
        }
        return -1;
    }

    public final void S() {
        long g10 = ((i0) this.G0).g(isEnded());
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
        int i9 = b10.e;
        if (Q(nVar, t0Var2) > this.H0) {
            i9 |= 64;
        }
        int i10 = i9;
        return new k3.l(nVar.a, t0Var, t0Var2, i10 != 0 ? 0 : b10.d, i10);
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // d5.o
    public final x1 getPlaybackParameters() {
        i0 i0Var = (i0) this.G0;
        return i0Var.k ? i0Var.y : i0Var.i().a;
    }

    @Override // d5.o
    public final long getPositionUs() {
        if (getState() == 2) {
            S();
        }
        return this.K0;
    }

    @Override // h3.e, h3.d2
    public final void handleMessage(int i9, Object obj) {
        s sVar = this.G0;
        if (i9 == 2) {
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
            i0 i0Var2 = (i0) sVar;
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
            ((i0) sVar).z((w) obj);
            return;
        }
        switch (i9) {
            case 9:
                i0 i0Var3 = (i0) sVar;
                i0Var3.x(i0Var3.i().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                i0 i0Var4 = (i0) sVar;
                if (i0Var4.W != intValue) {
                    i0Var4.W = intValue;
                    i0Var4.V = intValue != 0;
                    i0Var4.e();
                    break;
                }
                break;
            case 11:
                this.O0 = (h3.l0) obj;
                break;
            case 12:
                if (d5.f0.a >= 23) {
                    l0.a(sVar, obj);
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
        i0 i0Var = (i0) this.G0;
        if (i0Var.o()) {
            return i0Var.S && !i0Var.m();
        }
        return true;
    }

    @Override // y3.q, h3.e
    public final boolean isReady() {
        return ((i0) this.G0).m() || super.isReady();
    }

    @Override // y3.q
    public final float l(float f10, h3.t0[] t0VarArr) {
        int i9 = -1;
        for (h3.t0 t0Var : t0VarArr) {
            int i10 = t0Var.P;
            if (i10 != -1) {
                i9 = Math.max(i9, i10);
            }
        }
        if (i9 == -1) {
            return -1.0f;
        }
        return i9 * f10;
    }

    @Override // y3.q
    public final ArrayList m(y3.r rVar, h3.t0 t0Var, boolean z10) {
        o8.z R = R(rVar, t0Var, z10, this.G0);
        Pattern pattern = y3.w.a;
        ArrayList arrayList = new ArrayList(R);
        Collections.sort(arrayList, new bg.l0(new t0.c(t0Var, 6), 5));
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
        int i9 = d5.f0.a;
        if (i9 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(d5.f0.c)) {
            String str2 = d5.f0.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.I0 = z10;
                String str3 = nVar.c;
                int i10 = this.H0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i11 = t0Var.O;
                String str4 = t0Var.B;
                mediaFormat.setInteger("channel-count", i11);
                int i12 = t0Var.P;
                mediaFormat.setInteger("sample-rate", i12);
                d5.a.I(mediaFormat, t0Var.D);
                d5.a.A(mediaFormat, "max-input-size", i10);
                if (i9 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f10 != -1.0f) {
                        if (i9 == 23) {
                            String str5 = d5.f0.d;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f10);
                    }
                }
                if (i9 <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i9 >= 24) {
                    if (((i0) this.G0).h(d5.f0.v(4, t0Var.O, i12)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i9 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.J0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str4)) ? null : t0Var;
                return new y3.i(nVar, mediaFormat, t0Var, null, mediaCrypto);
            }
        }
        z10 = false;
        this.I0 = z10;
        String str32 = nVar.c;
        int i102 = this.H0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i112 = t0Var.O;
        String str42 = t0Var.B;
        mediaFormat.setInteger("channel-count", i112);
        int i122 = t0Var.P;
        mediaFormat.setInteger("sample-rate", i122);
        d5.a.I(mediaFormat, t0Var.D);
        d5.a.A(mediaFormat, "max-input-size", i102);
        if (i9 >= 23) {
        }
        if (i9 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i9 >= 24) {
        }
        if (i9 >= 32) {
        }
        this.J0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str42)) ? null : t0Var;
        return new y3.i(nVar, mediaFormat, t0Var, null, mediaCrypto);
    }

    @Override // y3.q, h3.e
    public final void onDisabled() {
        m mVar = this.F0;
        this.N0 = true;
        try {
            ((i0) this.G0).e();
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
        m mVar = this.F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new l(mVar, fVar, 0));
        }
        boolean z12 = getConfiguration().a;
        s sVar = this.G0;
        if (z12) {
            ((i0) sVar).d();
        } else {
            i0 i0Var = (i0) sVar;
            if (i0Var.Z) {
                i0Var.Z = false;
                i0Var.e();
            }
        }
        ((i0) sVar).q = getPlayerId();
    }

    @Override // y3.q, h3.e
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        ((i0) this.G0).e();
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
        s sVar = this.G0;
        try {
            super.onReset();
        } finally {
            if (this.N0) {
                this.N0 = false;
                ((i0) sVar).v();
            }
        }
    }

    @Override // h3.e
    public final void onStarted() {
        ((i0) this.G0).r();
    }

    @Override // h3.e
    public final void onStopped() {
        S();
        ((i0) this.G0).q();
    }

    @Override // d5.o
    public final void setPlaybackParameters(x1 x1Var) {
        ((i0) this.G0).A(x1Var);
    }

    @Override // y3.q
    public final void t(Exception exc) {
        d5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        m mVar = this.F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new k(mVar, exc, 0));
        }
    }

    @Override // y3.q
    public final void u(long j10, long j11, String str) {
        m mVar = this.F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new e5.y(mVar, str, j10, j11, 3));
        }
    }

    @Override // y3.q
    public final void v(String str) {
        m mVar = this.F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new j7(6, mVar, str));
        }
    }

    @Override // y3.q
    public final k3.l w(h3.u0 u0Var) {
        k3.l w8 = super.w(u0Var);
        h3.t0 t0Var = u0Var.b;
        m mVar = this.F0;
        Handler handler = mVar.a;
        if (handler != null) {
            handler.post(new h3(mVar, t0Var, w8, 8));
        }
        return w8;
    }

    @Override // y3.q
    public final void x(h3.t0 t0Var, MediaFormat mediaFormat) {
        h3.t0 t0Var2 = this.J0;
        int[] iArr = null;
        if (t0Var2 != null) {
            t0Var = t0Var2;
        } else if (this.I != null) {
            String str = t0Var.B;
            int i9 = t0Var.O;
            int u10 = "audio/raw".equals(str) ? t0Var.Q : (d5.f0.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? d5.f0.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            h3.s0 s0Var = new h3.s0();
            s0Var.o = "audio/raw";
            s0Var.D = u10;
            s0Var.E = t0Var.R;
            s0Var.F = t0Var.S;
            s0Var.B = mediaFormat.getInteger("channel-count");
            s0Var.C = mediaFormat.getInteger("sample-rate");
            t0Var = new h3.t0(s0Var);
            if (this.I0 && t0Var.O == 6 && i9 < 6) {
                iArr = new int[i9];
                for (int i10 = 0; i10 < i9; i10++) {
                    iArr[i10] = i10;
                }
            }
        }
        try {
            ((i0) this.G0).b(t0Var, iArr);
        } catch (o e10) {
            throw createRendererException(e10, e10.a, 5001);
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
