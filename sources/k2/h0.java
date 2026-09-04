package k2;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import b2.r0;
import b2.v0;
import bi.l7;
import di.g7;
import e9.a1;
import i2.m1;
import i2.s0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ji.b5;
import ji.k5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h0 extends r2.r implements s0 {
    public final Context X0;
    public final n4.y Y0;
    public final p Z0;
    public final r2.j a1;
    public int b1;
    public boolean c1;
    public boolean d1;
    public b2.s e1;
    public b2.s f1;
    public long g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public int k1;
    public boolean l1;
    public long m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, r2.k kVar, Handler handler, i2.c0 c0Var, p pVar) {
        super(1, kVar, 44100.0f);
        r2.j jVar = Build.VERSION.SDK_INT >= 35 ? new r2.j() : null;
        this.X0 = context.getApplicationContext();
        this.Z0 = pVar;
        this.a1 = jVar;
        this.k1 = -1000;
        this.Y0 = new n4.y(handler, c0Var);
        this.m1 = -9223372036854775807L;
        ((d0) pVar).t = new g0(this, 0);
    }

    public final void A0() {
        l();
        long i10 = ((d0) this.Z0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.h1) {
                i10 = Math.max(this.g1, i10);
            }
            this.g1 = i10;
            this.h1 = false;
        }
    }

    @Override // r2.r
    public final i2.i C(r2.o oVar, b2.s sVar, b2.s sVar2) {
        i2.i b10 = oVar.b(sVar, sVar2);
        int i10 = b10.e;
        if (this.V == null && t0(sVar2)) {
            i10 |= 32768;
        }
        if (z0(oVar, sVar2) > this.b1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.i(oVar.a, sVar, sVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // r2.r
    public final float M(float f7, b2.s sVar, b2.s[] sVarArr) {
        int i10 = -1;
        for (b2.s sVar2 : sVarArr) {
            int i11 = sVar2.K;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f7;
    }

    @Override // r2.r
    public final ArrayList N(r2.i iVar, b2.s sVar, boolean z10) {
        a1 f7;
        if (sVar.r == null) {
            f7 = a1.e;
        } else {
            if (((d0) this.Z0).G(sVar)) {
                List d = r2.w.d("audio/raw", false, false);
                r2.o oVar = d.isEmpty() ? null : (r2.o) d.get(0);
                if (oVar != null) {
                    f7 = e9.i0.z(oVar);
                }
            }
            f7 = r2.w.f(iVar, sVar, z10, false);
        }
        HashMap hashMap = r2.w.a;
        ArrayList arrayList = new ArrayList(f7);
        Collections.sort(arrayList, new l7(new k5(sVar, 18), 3));
        return arrayList;
    }

    @Override // r2.r
    public final long O(long j3, long j10) {
        boolean z10 = this.m1 != -9223372036854775807L;
        if (this.l1) {
            long h = ((d0) this.Z0).h();
            if (z10 && h != -9223372036854775807L) {
                float min = Math.min(h, this.m1 - j3);
                float f7 = h() != null ? h().a : 1.0f;
                this.h.getClass();
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (e2.d0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.K0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.firebase.messaging.n P(r2.o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        boolean z10;
        String str;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        int z02 = z0(oVar, sVar);
        String str2 = oVar.a;
        if (sVarArr.length != 1) {
            for (b2.s sVar2 : sVarArr) {
                if (oVar.b(sVar, sVar2).d != 0) {
                    z02 = Math.max(z02, z0(oVar, sVar2));
                }
            }
        }
        this.b1 = z02;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z10 = true;
                this.c1 = z10;
                this.d1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = oVar.c;
                int i11 = this.b1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i12 = sVar.J;
                str = sVar.r;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = sVar.K;
                mediaFormat.setInteger("sample-rate", i13);
                e2.d.o(mediaFormat, sVar.u);
                e2.d.n(mediaFormat, "max-input-size", i11);
                if (i10 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f7 != -1.0f) {
                        if (i10 == 23) {
                            String str5 = Build.MODEL;
                            if (!"ZTE B2017G".equals(str5)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f7);
                    }
                }
                if ("audio/ac4".equals(str)) {
                    Pair b10 = e2.e.b(sVar);
                    if (b10 != null) {
                        e2.d.n(mediaFormat, "profile", ((Integer) b10.first).intValue());
                        e2.d.n(mediaFormat, "level", ((Integer) b10.second).intValue());
                    }
                    if (i10 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                if (i10 >= 24) {
                    if (((d0) this.Z0).k(e2.d0.C(4, sVar.J, i13)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i10 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.k1));
                }
                this.f1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : sVar;
                return new com.google.firebase.messaging.n(oVar, mediaFormat, sVar, null, mediaCrypto, this.a1);
            }
        }
        z10 = false;
        this.c1 = z10;
        this.d1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = oVar.c;
        int i112 = this.b1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i122 = sVar.J;
        str = sVar.r;
        mediaFormat2.setInteger("channel-count", i122);
        int i132 = sVar.K;
        mediaFormat2.setInteger("sample-rate", i132);
        e2.d.o(mediaFormat2, sVar.u);
        e2.d.n(mediaFormat2, "max-input-size", i112);
        if (i10 >= 23) {
        }
        if ("audio/ac4".equals(str)) {
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        if (i10 >= 35) {
        }
        this.f1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : sVar;
        return new com.google.firebase.messaging.n(oVar, mediaFormat2, sVar, null, mediaCrypto, this.a1);
    }

    @Override // r2.r
    public final void Q(h2.g gVar) {
        b2.s sVar;
        if (Build.VERSION.SDK_INT < 29 || (sVar = gVar.c) == null || !Objects.equals(sVar.r, "audio/opus") || !this.x0) {
            return;
        }
        ByteBuffer byteBuffer = gVar.n;
        byteBuffer.getClass();
        b2.s sVar2 = gVar.c;
        sVar2.getClass();
        int i10 = sVar2.M;
        if (byteBuffer.remaining() == 8) {
            ((d0) this.Z0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // r2.r
    public final void W(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new f(yVar, exc, 0));
        }
    }

    @Override // r2.r
    public final void X(long j3, long j10, String str) {
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new a3.f0(yVar, str, j3, j10, 2));
        }
    }

    @Override // r2.r
    public final void Y(String str) {
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new b5(3, yVar, str));
        }
    }

    @Override // r2.r
    public final i2.i Z(n4.y yVar) {
        b2.s sVar = (b2.s) yVar.c;
        sVar.getClass();
        this.e1 = sVar;
        i2.i Z = super.Z(yVar);
        n4.y yVar2 = this.Y0;
        Handler handler = (Handler) yVar2.b;
        if (handler != null) {
            handler.post(new hg.t(yVar2, sVar, Z, 19));
        }
        return Z;
    }

    @Override // i2.s0
    public final long a() {
        if (this.n == 2) {
            A0();
        }
        return this.g1;
    }

    @Override // r2.r
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        b2.s sVar2 = this.f1;
        boolean z10 = true;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (this.b0 != null) {
            mediaFormat.getClass();
            String str = sVar.r;
            int i10 = sVar.J;
            int B = "audio/raw".equals(str) ? sVar.L : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? e2.d0.B(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            b2.r rVar = new b2.r();
            rVar.q = r0.n("audio/raw");
            rVar.K = B;
            rVar.L = sVar.M;
            rVar.M = sVar.N;
            rVar.k = sVar.l;
            rVar.a = sVar.a;
            rVar.b = sVar.b;
            rVar.c = e9.i0.v(sVar.c);
            rVar.d = sVar.d;
            rVar.e = sVar.e;
            rVar.f = sVar.f;
            rVar.I = mediaFormat.getInteger("channel-count");
            rVar.J = mediaFormat.getInteger("sample-rate");
            sVar = new b2.s(rVar);
            boolean z11 = this.c1;
            int i11 = sVar.J;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.d1) {
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i13 = Build.VERSION.SDK_INT;
            p pVar = this.Z0;
            if (i13 >= 29) {
                if (this.x0) {
                    m1 m1Var = this.d;
                    m1Var.getClass();
                    if (m1Var.a != 0) {
                        m1 m1Var2 = this.d;
                        m1Var2.getClass();
                        int i14 = m1Var2.a;
                        d0 d0Var = (d0) pVar;
                        d0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        d0Var.k = i14;
                    }
                }
                d0 d0Var2 = (d0) pVar;
                d0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                d0Var2.k = 0;
            }
            ((d0) pVar).d(sVar, iArr);
        } catch (l e7) {
            throw c(e7, e7.a, false, 5001);
        }
    }

    @Override // i2.s0
    public final boolean b() {
        boolean z10 = this.j1;
        this.j1 = false;
        return z10;
    }

    @Override // r2.r
    public final void b0() {
        this.Z0.getClass();
    }

    @Override // i2.f, i2.i1
    public final void d(int i10, Object obj) {
        r2.j jVar;
        p pVar = this.Z0;
        if (i10 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            d0 d0Var = (d0) pVar;
            if (d0Var.Q != floatValue) {
                d0Var.Q = floatValue;
                if (d0Var.q()) {
                    d0Var.x.setVolume(d0Var.Q);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.e eVar = (b2.e) obj;
            eVar.getClass();
            ((d0) pVar).z(eVar);
            return;
        }
        if (i10 == 6) {
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            ((d0) pVar).C(fVar);
            return;
        }
        if (i10 == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                e0.b.x(pVar, obj);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.k1 = ((Integer) obj).intValue();
            r2.l lVar = this.b0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.k1));
                lVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            d0 d0Var2 = (d0) pVar;
            d0Var2.F = ((Boolean) obj).booleanValue();
            w wVar = new w(d0Var2.H() ? v0.d : d0Var2.E, -9223372036854775807L, -9223372036854775807L);
            if (d0Var2.q()) {
                d0Var2.C = wVar;
                return;
            } else {
                d0Var2.D = wVar;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                i2.i0 i0Var = (i2.i0) obj;
                i0Var.getClass();
                this.W = i0Var;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        ((d0) pVar).A(intValue);
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.a1) == null) {
            return;
        }
        jVar.d(intValue);
    }

    @Override // r2.r
    public final void d0() {
        ((d0) this.Z0).N = true;
    }

    @Override // i2.s0
    public final void f(v0 v0Var) {
        ((d0) this.Z0).F(v0Var);
    }

    @Override // r2.r
    public final boolean g0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.m1 = -9223372036854775807L;
        if (this.f1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        p pVar = this.Z0;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f += i12;
            ((d0) pVar).N = true;
            return true;
        }
        try {
            if (!((d0) pVar).n(byteBuffer, j11, i12)) {
                this.m1 = j11;
                return false;
            }
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.e += i12;
            return true;
        } catch (m e7) {
            b2.s sVar2 = this.e1;
            if (this.x0) {
                m1 m1Var = this.d;
                m1Var.getClass();
                if (m1Var.a != 0) {
                    i14 = 5004;
                    throw c(e7, sVar2, e7.b, i14);
                }
            }
            i14 = 5001;
            throw c(e7, sVar2, e7.b, i14);
        } catch (o e10) {
            if (this.x0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.a != 0) {
                    i13 = 5003;
                    throw c(e10, sVar, e10.b, i13);
                }
            }
            i13 = 5002;
            throw c(e10, sVar, e10.b, i13);
        }
    }

    @Override // i2.s0
    public final v0 h() {
        return ((d0) this.Z0).E;
    }

    @Override // i2.f
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // r2.r
    public final void j0() {
        try {
            ((d0) this.Z0).w();
            long j3 = this.I0;
            if (j3 != -9223372036854775807L) {
                this.m1 = j3;
            }
        } catch (o e7) {
            throw c(e7, e7.c, e7.b, this.x0 ? 5003 : 5002);
        }
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        d0 d0Var = (d0) this.Z0;
        if (d0Var.q()) {
            return d0Var.U && !d0Var.o();
        }
        return true;
    }

    @Override // r2.r, i2.f
    public final boolean m() {
        return ((d0) this.Z0).o() || super.m();
    }

    @Override // r2.r, i2.f
    public final void n() {
        n4.y yVar = this.Y0;
        this.i1 = true;
        this.e1 = null;
        this.m1 = -9223372036854775807L;
        try {
            ((d0) this.Z0).g();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
            }
        }
    }

    @Override // i2.f
    public final void o(boolean z10, boolean z11) {
        i2.h hVar = new i2.h();
        this.O0 = hVar;
        n4.y yVar = this.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new g(yVar, hVar, 1));
        }
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.b;
        p pVar = this.Z0;
        if (z12) {
            d0 d0Var = (d0) pVar;
            e2.d.g(d0Var.Y);
            if (!d0Var.d0) {
                d0Var.d0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.d0) {
                d0Var2.d0 = false;
                d0Var2.g();
            }
        }
        j2.k kVar = this.f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.s = kVar;
        e2.x xVar = this.h;
        xVar.getClass();
        d0Var3.h.I = xVar;
    }

    @Override // r2.r, i2.f
    public final void p(long j3, boolean z10) {
        super.p(j3, z10);
        ((d0) this.Z0).g();
        this.g1 = j3;
        this.m1 = -9223372036854775807L;
        this.j1 = false;
        this.h1 = true;
    }

    @Override // i2.f
    public final void q() {
        r2.j jVar;
        c cVar;
        g7 g7Var = ((d0) this.Z0).z;
        if (g7Var != null) {
            Context context = (Context) g7Var.b;
            if (g7Var.a) {
                g7Var.h = null;
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.e) != null) {
                    e0.b.K(context, cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) g7Var.f);
                d dVar = (d) g7Var.g;
                if (dVar != null) {
                    dVar.a.unregisterContentObserver(dVar);
                }
                g7Var.a = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.a1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // i2.f
    public final void r() {
        p pVar = this.Z0;
        this.j1 = false;
        this.m1 = -9223372036854775807L;
        try {
            try {
                this.x0 = false;
                k0();
                i0();
            } finally {
                i2.g.D(this.V, null);
                this.V = null;
            }
        } finally {
            if (this.i1) {
                this.i1 = false;
                ((d0) pVar).y();
            }
        }
    }

    @Override // i2.f
    public final void s() {
        ((d0) this.Z0).u();
        this.l1 = true;
    }

    @Override // i2.f
    public final void t() {
        A0();
        this.l1 = false;
        ((d0) this.Z0).t();
    }

    @Override // r2.r
    public final boolean t0(b2.s sVar) {
        m1 m1Var = this.d;
        m1Var.getClass();
        if (m1Var.a != 0) {
            int y02 = y0(sVar);
            if ((y02 & 512) != 0) {
                m1 m1Var2 = this.d;
                m1Var2.getClass();
                if (m1Var2.a == 2 || (y02 & 1024) != 0) {
                    return true;
                }
                if (sVar.M == 0 && sVar.N == 0) {
                    return true;
                }
            }
        }
        return ((d0) this.Z0).G(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (r2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int u0(r2.i iVar, b2.s sVar) {
        int i10;
        d0 d0Var;
        a1 f7;
        boolean z10;
        boolean z11;
        int b10 = i2.g.b(1, 0, 0, 0);
        String str = sVar.r;
        String str2 = sVar.r;
        if (!r0.i(str)) {
            return i2.g.b(0, 0, 0, 0);
        }
        int i11 = sVar.S;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        p pVar = this.Z0;
        if (z13) {
            if (z12) {
                List d = r2.w.d("audio/raw", false, false);
            }
            i10 = y0(sVar);
            if (((d0) pVar).G(sVar)) {
                return i2.g.b(4, 8, 32, i10);
            }
            if ("audio/raw".equals(str2) || ((d0) pVar).G(sVar)) {
                d0Var = (d0) pVar;
                if (d0Var.G(e2.d0.C(2, sVar.J, sVar.K))) {
                    if (str2 == null) {
                        f7 = a1.e;
                    } else {
                        if (d0Var.G(sVar)) {
                            List d10 = r2.w.d("audio/raw", false, false);
                            r2.o oVar = d10.isEmpty() ? null : (r2.o) d10.get(0);
                            if (oVar != null) {
                                f7 = e9.i0.z(oVar);
                            }
                        }
                        f7 = r2.w.f(iVar, sVar, false, false);
                    }
                    if (!f7.isEmpty()) {
                        if (!z13) {
                            return i2.g.b(2, 0, 0, 0);
                        }
                        r2.o oVar2 = (r2.o) f7.get(0);
                        boolean e7 = oVar2.e(sVar);
                        if (!e7) {
                            for (int i13 = 1; i13 < f7.d; i13++) {
                                r2.o oVar3 = (r2.o) f7.get(i13);
                                if (oVar3.e(sVar)) {
                                    oVar2 = oVar3;
                                    z10 = true;
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        z10 = e7;
                        z11 = true;
                        int i14 = z10 ? 4 : 3;
                        if (z10 && oVar2.f(sVar)) {
                            i12 = 16;
                        }
                        return (oVar2.g ? 64 : 0) | i14 | i12 | 32 | (z11 ? 128 : 0) | i10;
                    }
                }
            }
            return b10;
        }
        i10 = 0;
        if ("audio/raw".equals(str2)) {
        }
        d0Var = (d0) pVar;
        if (d0Var.G(e2.d0.C(2, sVar.J, sVar.K))) {
        }
        return b10;
    }

    public final int y0(b2.s sVar) {
        e j3 = ((d0) this.Z0).j(sVar);
        if (!j3.a) {
            return 0;
        }
        int i10 = j3.b ? 1536 : 512;
        return j3.c ? i10 | 2048 : i10;
    }

    public final int z0(r2.o oVar, b2.s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(oVar.a) || (i10 = Build.VERSION.SDK_INT) >= 24 || (i10 == 23 && e2.d0.N(this.X0))) {
            return sVar.s;
        }
        return -1;
    }

    @Override // i2.f
    public final s0 i() {
        return this;
    }
}
