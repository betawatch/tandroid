package l3;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import c2.z0;
import j3.g2;
import j3.v1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kh.a2;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n0 extends d4.r implements h5.n {
    public final Context R0;
    public final f7.b S0;
    public final v T0;
    public int U0;
    public boolean V0;
    public j3.n0 W0;
    public j3.n0 X0;
    public long Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public j3.g0 c1;

    public n0(Context context, d4.j jVar, Handler handler, j3.c0 c0Var, v vVar) {
        super(1, jVar, 44100.0f);
        this.R0 = context.getApplicationContext();
        this.T0 = vVar;
        this.S0 = new f7.b(handler, c0Var);
        ((k0) vVar).r = new a3.c(this, 22);
    }

    public static s8.i0 r0(d4.s sVar, j3.n0 n0Var, boolean z4, v vVar) {
        Iterable e;
        if (n0Var.C == null) {
            s8.t tVar = s8.v.b;
            return s8.i0.e;
        }
        if (((k0) vVar).i(n0Var) != 0) {
            List e6 = d4.y.e("audio/raw", false, false);
            d4.n nVar = e6.isEmpty() ? null : (d4.n) e6.get(0);
            if (nVar != null) {
                return s8.v.x(nVar);
            }
        }
        Pattern pattern = d4.y.a;
        String str = n0Var.C;
        sVar.getClass();
        List e10 = d4.y.e(str, z4, false);
        String b10 = d4.y.b(n0Var);
        if (b10 == null) {
            s8.t tVar2 = s8.v.b;
            e = s8.i0.e;
        } else {
            e = d4.y.e(b10, z4, false);
        }
        s8.t tVar3 = s8.v.b;
        s8.s sVar2 = new s8.s();
        sVar2.d(e10);
        sVar2.d(e);
        return sVar2.i();
    }

    @Override // d4.r
    public final n3.k A(d4.n nVar, j3.n0 n0Var, j3.n0 n0Var2) {
        n3.k b10 = nVar.b(n0Var, n0Var2);
        int i10 = b10.e;
        if (this.P == null && l0(n0Var2)) {
            i10 |= 32768;
        }
        if (q0(nVar, n0Var2) > this.U0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new n3.k(nVar.a, n0Var, n0Var2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // d4.r
    public final float K(float f10, j3.n0[] n0VarArr) {
        int i10 = -1;
        for (j3.n0 n0Var : n0VarArr) {
            int i11 = n0Var.Q;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // d4.r
    public final ArrayList L(d4.s sVar, j3.n0 n0Var, boolean z4) {
        s8.i0 r02 = r0(sVar, n0Var, z4, this.T0);
        Pattern pattern = d4.y.a;
        ArrayList arrayList = new ArrayList(r02);
        Collections.sort(arrayList, new d4.t(new a1.c(n0Var, 11), 0));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    @Override // d4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d4.i M(d4.n nVar, j3.n0 n0Var, MediaCrypto mediaCrypto, float f10) {
        boolean z4;
        MediaFormat mediaFormat;
        j3.n0[] n0VarArr = this.r;
        n0VarArr.getClass();
        int q02 = q0(nVar, n0Var);
        if (n0VarArr.length != 1) {
            for (j3.n0 n0Var2 : n0VarArr) {
                if (nVar.b(n0Var, n0Var2).d != 0) {
                    q02 = Math.max(q02, q0(nVar, n0Var2));
                }
            }
        }
        this.U0 = q02;
        String str = nVar.a;
        int i10 = h5.d0.a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(h5.d0.c)) {
            String str2 = h5.d0.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z4 = true;
                this.V0 = z4;
                String str3 = nVar.c;
                int i11 = this.U0;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str3);
                int i12 = n0Var.P;
                String str4 = n0Var.C;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = n0Var.Q;
                mediaFormat.setInteger("sample-rate", i13);
                h5.a.I(mediaFormat, n0Var.E);
                h5.a.A(mediaFormat, "max-input-size", i11);
                if (i10 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f10 != -1.0f) {
                        if (i10 == 23) {
                            String str5 = h5.d0.d;
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
                    if (((k0) this.T0).i(h5.d0.w(4, n0Var.P, i13)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                this.X0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str4)) ? null : n0Var;
                return new d4.i(nVar, mediaFormat, n0Var, null, mediaCrypto);
            }
        }
        z4 = false;
        this.V0 = z4;
        String str32 = nVar.c;
        int i112 = this.U0;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str32);
        int i122 = n0Var.P;
        String str42 = n0Var.C;
        mediaFormat.setInteger("channel-count", i122);
        int i132 = n0Var.Q;
        mediaFormat.setInteger("sample-rate", i132);
        h5.a.I(mediaFormat, n0Var.E);
        h5.a.A(mediaFormat, "max-input-size", i112);
        if (i10 >= 23) {
        }
        if (i10 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        this.X0 = ("audio/raw".equals(nVar.b) || "audio/raw".equals(str42)) ? null : n0Var;
        return new d4.i(nVar, mediaFormat, n0Var, null, mediaCrypto);
    }

    @Override // d4.r
    public final void R(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new o(bVar, exc, 0));
        }
    }

    @Override // d4.r
    public final void S(long j10, long j11, String str) {
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new i5.x(bVar, str, j10, j11, 1));
        }
    }

    @Override // d4.r
    public final void T(String str) {
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new gf.c(25, bVar, str));
        }
    }

    @Override // d4.r
    public final n3.k U(f7.b bVar) {
        j3.n0 n0Var = (j3.n0) bVar.c;
        n0Var.getClass();
        this.W0 = n0Var;
        n3.k U = super.U(bVar);
        j3.n0 n0Var2 = this.W0;
        f7.b bVar2 = this.S0;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.b(bVar2, n0Var2, U, 18));
        }
        return U;
    }

    @Override // d4.r
    public final void V(j3.n0 n0Var, MediaFormat mediaFormat) {
        j3.n0 n0Var2 = this.X0;
        int[] iArr = null;
        if (n0Var2 != null) {
            n0Var = n0Var2;
        } else if (this.V != null) {
            String str = n0Var.C;
            int i10 = n0Var.P;
            int v = "audio/raw".equals(str) ? n0Var.R : (h5.d0.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? h5.d0.v(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            j3.m0 m0Var = new j3.m0();
            m0Var.o = "audio/raw";
            m0Var.D = v;
            m0Var.E = n0Var.S;
            m0Var.F = n0Var.T;
            m0Var.B = mediaFormat.getInteger("channel-count");
            m0Var.C = mediaFormat.getInteger("sample-rate");
            n0Var = new j3.n0(m0Var);
            if (this.V0 && n0Var.P == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((k0) this.T0).b(n0Var, iArr);
        } catch (r e) {
            throw a(e, e.a, false, 5001);
        }
    }

    @Override // d4.r
    public final void W() {
        this.T0.getClass();
    }

    @Override // d4.r
    public final void Y() {
        ((k0) this.T0).K = true;
    }

    @Override // d4.r
    public final void Z(n3.i iVar) {
        if (!this.Z0 || iVar.e(TLObject.FLAG_31)) {
            return;
        }
        if (Math.abs(iVar.f - this.Y0) > 500000) {
            this.Y0 = iVar.f;
        }
        this.Z0 = false;
    }

    @Override // j3.e, j3.b2
    public final void b(int i10, Object obj) {
        v vVar = this.T0;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            k0 k0Var = (k0) vVar;
            if (k0Var.N != floatValue) {
                k0Var.N = floatValue;
                if (k0Var.o()) {
                    if (h5.d0.a >= 21) {
                        k0Var.v.setVolume(k0Var.N);
                        return;
                    }
                    AudioTrack audioTrack = k0Var.v;
                    float f10 = k0Var.N;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            d dVar = (d) obj;
            k0 k0Var2 = (k0) vVar;
            if (k0Var2.y.equals(dVar)) {
                return;
            }
            k0Var2.y = dVar;
            if (k0Var2.a0) {
                return;
            }
            k0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((k0) vVar).x((z) obj);
            return;
        }
        switch (i10) {
            case 9:
                k0 k0Var3 = (k0) vVar;
                k0Var3.C = ((Boolean) obj).booleanValue();
                h0 h0Var = new h0(k0Var3.z() ? v1.d : k0Var3.B, -9223372036854775807L, -9223372036854775807L);
                if (!k0Var3.o()) {
                    k0Var3.A = h0Var;
                    break;
                } else {
                    k0Var3.z = h0Var;
                    break;
                }
            case 10:
                int intValue = ((Integer) obj).intValue();
                k0 k0Var4 = (k0) vVar;
                if (k0Var4.X != intValue) {
                    k0Var4.X = intValue;
                    k0Var4.W = intValue != 0;
                    k0Var4.e();
                    break;
                }
                break;
            case 11:
                this.c1 = (j3.g0) obj;
                break;
            case 12:
                if (h5.d0.a >= 23) {
                    m0.a(vVar, obj);
                    break;
                }
                break;
        }
    }

    @Override // h5.n
    public final void c(v1 v1Var) {
        ((k0) this.T0).y(v1Var);
    }

    @Override // d4.r
    public final boolean c0(long j10, long j11, d4.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z4, boolean z10, j3.n0 n0Var) {
        byteBuffer.getClass();
        if (this.X0 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.releaseOutputBuffer(i10, false);
            return true;
        }
        v vVar = this.T0;
        if (z4) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.M0.f += i12;
            ((k0) vVar).K = true;
            return true;
        }
        try {
            if (!((k0) vVar).l(byteBuffer, j12, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.releaseOutputBuffer(i10, false);
            }
            this.M0.e += i12;
            return true;
        } catch (s e) {
            throw a(e, this.W0, e.b, 5001);
        } catch (u e6) {
            throw a(e6, n0Var, e6.b, 5002);
        }
    }

    @Override // h5.n
    public final v1 d() {
        return ((k0) this.T0).B;
    }

    @Override // h5.n
    public final long e() {
        if (this.h == 2) {
            s0();
        }
        return this.Y0;
    }

    @Override // d4.r
    public final void f0() {
        try {
            ((k0) this.T0).t();
        } catch (u e) {
            throw a(e, e.c, e.b, 5002);
        }
    }

    @Override // j3.e
    public final String g() {
        return "MediaCodecAudioRenderer";
    }

    @Override // j3.e
    public final boolean i() {
        if (!this.I0) {
            return false;
        }
        k0 k0Var = (k0) this.T0;
        if (k0Var.o()) {
            return k0Var.T && !k0Var.m();
        }
        return true;
    }

    @Override // d4.r, j3.e
    public final boolean j() {
        return ((k0) this.T0).m() || super.j();
    }

    @Override // d4.r, j3.e
    public final void k() {
        f7.b bVar = this.S0;
        this.b1 = true;
        this.W0 = null;
        try {
            ((k0) this.T0).e();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.k();
                throw th2;
            } finally {
            }
        }
    }

    @Override // j3.e
    public final void l(boolean z4, boolean z10) {
        n3.f fVar = new n3.f();
        this.M0 = fVar;
        f7.b bVar = this.S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new p(bVar, fVar, 0));
        }
        g2 g2Var = this.d;
        g2Var.getClass();
        boolean z11 = g2Var.a;
        v vVar = this.T0;
        if (z11) {
            ((k0) vVar).d();
        } else {
            k0 k0Var = (k0) vVar;
            if (k0Var.a0) {
                k0Var.a0 = false;
                k0Var.e();
            }
        }
        k3.k kVar = this.f;
        kVar.getClass();
        ((k0) vVar).q = kVar;
    }

    @Override // d4.r
    public final boolean l0(j3.n0 n0Var) {
        return ((k0) this.T0).i(n0Var) != 0;
    }

    @Override // d4.r, j3.e
    public final void m(long j10, boolean z4) {
        super.m(j10, z4);
        ((k0) this.T0).e();
        this.Y0 = j10;
        this.Z0 = true;
        this.a1 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if ((r5.isEmpty() ? null : (d4.n) r5.get(0)) != null) goto L30;
     */
    @Override // d4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m0(d4.s sVar, j3.n0 n0Var) {
        boolean z4;
        boolean z10 = true;
        int b10 = e2.c.b(1, 0, 0);
        if (!h5.o.h(n0Var.C)) {
            return e2.c.b(0, 0, 0);
        }
        int i10 = h5.d0.a >= 21 ? 32 : 0;
        int i11 = n0Var.X;
        boolean z11 = i11 != 0;
        boolean z12 = i11 == 0 || i11 == 2;
        int i12 = 8;
        v vVar = this.T0;
        if (z12 && ((k0) vVar).i(n0Var) != 0) {
            if (z11) {
                List e = d4.y.e("audio/raw", false, false);
            }
            return e2.c.b(4, 8, i10);
        }
        if (!"audio/raw".equals(n0Var.C) || ((k0) vVar).i(n0Var) != 0) {
            if (((k0) vVar).i(h5.d0.w(2, n0Var.P, n0Var.Q)) != 0) {
                s8.i0 r02 = r0(sVar, n0Var, false, vVar);
                if (!r02.isEmpty()) {
                    if (!z12) {
                        return e2.c.b(2, 0, 0);
                    }
                    d4.n nVar = (d4.n) r02.get(0);
                    boolean d = nVar.d(n0Var);
                    if (!d) {
                        for (int i13 = 1; i13 < r02.d; i13++) {
                            d4.n nVar2 = (d4.n) r02.get(i13);
                            if (nVar2.d(n0Var)) {
                                nVar = nVar2;
                                z4 = false;
                                break;
                            }
                        }
                    }
                    z10 = d;
                    z4 = true;
                    int i14 = z10 ? 4 : 3;
                    if (z10 && nVar.e(n0Var)) {
                        i12 = 16;
                    }
                    return i14 | i12 | i10 | (nVar.g ? 64 : 0) | (z4 ? 128 : 0);
                }
            }
        }
        return b10;
    }

    @Override // j3.e
    public final void n() {
        i iVar;
        z0 z0Var = ((k0) this.T0).x;
        if (z0Var != null) {
            Context context = (Context) z0Var.b;
            if (z0Var.a) {
                z0Var.h = null;
                if (h5.d0.a >= 23 && (iVar = (i) z0Var.e) != null) {
                    h.b(context, iVar);
                }
                androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) z0Var.f;
                if (hVar != null) {
                    context.unregisterReceiver(hVar);
                }
                j jVar = (j) z0Var.g;
                if (jVar != null) {
                    jVar.a.unregisterContentObserver(jVar);
                }
                z0Var.a = false;
            }
        }
    }

    @Override // j3.e
    public final void o() {
        v vVar = this.T0;
        try {
            try {
                C();
                e0();
            } finally {
                a2.D(this.P, null);
                this.P = null;
            }
        } finally {
            if (this.b1) {
                this.b1 = false;
                ((k0) vVar).v();
            }
        }
    }

    @Override // j3.e
    public final void p() {
        ((k0) this.T0).r();
    }

    @Override // j3.e
    public final void q() {
        s0();
        ((k0) this.T0).q();
    }

    public final int q0(d4.n nVar, j3.n0 n0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.a) || (i10 = h5.d0.a) >= 24 || (i10 == 23 && h5.d0.F(this.R0))) {
            return n0Var.D;
        }
        return -1;
    }

    public final void s0() {
        long h = ((k0) this.T0).h(i());
        if (h != Long.MIN_VALUE) {
            if (!this.a1) {
                h = Math.max(this.Y0, h);
            }
            this.Y0 = h;
            this.a1 = false;
        }
    }

    @Override // j3.e
    public final h5.n f() {
        return this;
    }
}
