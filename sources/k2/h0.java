package k2;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import b2.v0;
import bi.h8;
import bi.q3;
import e9.a1;
import fg.s1;
import i2.l1;
import i2.r0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h0 extends r2.r implements r0 {
    public final Context X0;
    public final of.b Y0;
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
    public h0(Context context, r2.k kVar, Handler handler, i2.b0 b0Var, p pVar) {
        super(1, kVar, 44100.0f);
        r2.j jVar = Build.VERSION.SDK_INT >= 35 ? new r2.j() : null;
        this.X0 = context.getApplicationContext();
        this.Z0 = pVar;
        this.a1 = jVar;
        this.k1 = -1000;
        this.Y0 = new of.b(handler, (j) b0Var);
        this.m1 = -9223372036854775807L;
        ((e0) pVar).t = new xa.c(this, 28);
    }

    public final int A0(r2.o oVar, b2.s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(oVar.a) || (i10 = Build.VERSION.SDK_INT) >= 24 || (i10 == 23 && e2.d0.N(this.X0))) {
            return sVar.s;
        }
        return -1;
    }

    public final void B0() {
        l();
        long i10 = ((e0) this.Z0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.h1) {
                i10 = Math.max(this.g1, i10);
            }
            this.g1 = i10;
            this.h1 = false;
        }
    }

    @Override // r2.r
    public final i2.h D(r2.o oVar, b2.s sVar, b2.s sVar2) {
        i2.h b10 = oVar.b(sVar, sVar2);
        int i10 = b10.e;
        if (this.V == null && u0(sVar2)) {
            i10 |= 32768;
        }
        if (A0(oVar, sVar2) > this.b1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.h(oVar.a, sVar, sVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // r2.r
    public final float N(float f7, b2.s sVar, b2.s[] sVarArr) {
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
    public final ArrayList O(r2.i iVar, b2.s sVar, boolean z10) {
        a1 f7;
        if (sVar.r == null) {
            f7 = a1.e;
        } else {
            if (((e0) this.Z0).G(sVar)) {
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
        Collections.sort(arrayList, new q3(new org.telegram.tgnet.j(sVar, 18), 3));
        return arrayList;
    }

    @Override // r2.r
    public final long P(long j3, long j10) {
        boolean z10 = this.m1 != -9223372036854775807L;
        if (this.l1) {
            long h = ((e0) this.Z0).h();
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
    public final com.google.firebase.messaging.n Q(r2.o oVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        boolean z10;
        String str;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        int A0 = A0(oVar, sVar);
        String str2 = oVar.a;
        if (sVarArr.length != 1) {
            for (b2.s sVar2 : sVarArr) {
                if (oVar.b(sVar, sVar2).d != 0) {
                    A0 = Math.max(A0, A0(oVar, sVar2));
                }
            }
        }
        this.b1 = A0;
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
                    if (((e0) this.Z0).k(e2.d0.C(4, sVar.J, i13)) == 2) {
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
    public final void R(h2.h hVar) {
        b2.s sVar;
        if (Build.VERSION.SDK_INT < 29 || (sVar = hVar.a) == null || !Objects.equals(sVar.r, "audio/opus") || !this.x0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        b2.s sVar2 = hVar.a;
        sVar2.getClass();
        int i10 = sVar2.M;
        if (byteBuffer.remaining() == 8) {
            ((e0) this.Z0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // r2.r
    public final void X(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new f(bVar, exc, 0));
        }
    }

    @Override // r2.r
    public final void Y(long j3, long j10, String str) {
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a3.g0(bVar, str, j3, j10, 1));
        }
    }

    @Override // r2.r
    public final void Z(String str) {
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new s1(26, bVar, str));
        }
    }

    @Override // i2.r0
    public final long a() {
        if (this.n == 2) {
            B0();
        }
        return this.g1;
    }

    @Override // r2.r
    public final i2.h a0(of.b bVar) {
        b2.s sVar = (b2.s) bVar.c;
        sVar.getClass();
        this.e1 = sVar;
        i2.h a02 = super.a0(bVar);
        of.b bVar2 = this.Y0;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new gg.a0(bVar2, sVar, a02, 13));
        }
        return a02;
    }

    @Override // i2.r0
    public final boolean b() {
        boolean z10 = this.j1;
        this.j1 = false;
        return z10;
    }

    @Override // r2.r
    public final void b0(b2.s sVar, MediaFormat mediaFormat) {
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
            rVar.q = b2.r0.n("audio/raw");
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
                    l1 l1Var = this.d;
                    l1Var.getClass();
                    if (l1Var.a != 0) {
                        l1 l1Var2 = this.d;
                        l1Var2.getClass();
                        int i14 = l1Var2.a;
                        e0 e0Var = (e0) pVar;
                        e0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        e0Var.k = i14;
                    }
                }
                e0 e0Var2 = (e0) pVar;
                e0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                e0Var2.k = 0;
            }
            ((e0) pVar).d(sVar, iArr);
        } catch (l e) {
            throw d(e, e.a, false, 5001);
        }
    }

    @Override // i2.f, i2.h1
    public final void c(int i10, Object obj) {
        r2.j jVar;
        p pVar = this.Z0;
        if (i10 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            e0 e0Var = (e0) pVar;
            if (e0Var.Q != floatValue) {
                e0Var.Q = floatValue;
                if (e0Var.q()) {
                    e0Var.x.setVolume(e0Var.Q);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.e eVar = (b2.e) obj;
            eVar.getClass();
            ((e0) pVar).z(eVar);
            return;
        }
        if (i10 == 6) {
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            ((e0) pVar).C(fVar);
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
            e0 e0Var2 = (e0) pVar;
            e0Var2.F = ((Boolean) obj).booleanValue();
            x xVar = new x(e0Var2.H() ? v0.d : e0Var2.E, -9223372036854775807L, -9223372036854775807L);
            if (e0Var2.q()) {
                e0Var2.C = xVar;
                return;
            } else {
                e0Var2.D = xVar;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                i2.h0 h0Var = (i2.h0) obj;
                h0Var.getClass();
                this.W = h0Var;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        ((e0) pVar).A(intValue);
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.a1) == null) {
            return;
        }
        jVar.d(intValue);
    }

    @Override // r2.r
    public final void c0() {
        this.Z0.getClass();
    }

    @Override // r2.r
    public final void e0() {
        ((e0) this.Z0).N = true;
    }

    @Override // i2.r0
    public final void f(v0 v0Var) {
        ((e0) this.Z0).F(v0Var);
    }

    @Override // i2.r0
    public final v0 h() {
        return ((e0) this.Z0).E;
    }

    @Override // r2.r
    public final boolean h0(long j3, long j10, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
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
            ((e0) pVar).N = true;
            return true;
        }
        try {
            if (!((e0) pVar).n(j11, i12, byteBuffer)) {
                this.m1 = j11;
                return false;
            }
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.e += i12;
            return true;
        } catch (m e) {
            b2.s sVar2 = this.e1;
            if (this.x0) {
                l1 l1Var = this.d;
                l1Var.getClass();
                if (l1Var.a != 0) {
                    i14 = 5004;
                    throw d(e, sVar2, e.b, i14);
                }
            }
            i14 = 5001;
            throw d(e, sVar2, e.b, i14);
        } catch (o e7) {
            if (this.x0) {
                l1 l1Var2 = this.d;
                l1Var2.getClass();
                if (l1Var2.a != 0) {
                    i13 = 5003;
                    throw d(e7, sVar, e7.b, i13);
                }
            }
            i13 = 5002;
            throw d(e7, sVar, e7.b, i13);
        }
    }

    @Override // i2.f
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // r2.r
    public final void k0() {
        try {
            ((e0) this.Z0).w();
            long j3 = this.I0;
            if (j3 != -9223372036854775807L) {
                this.m1 = j3;
            }
        } catch (o e) {
            throw d(e, e.c, e.b, this.x0 ? 5003 : 5002);
        }
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        e0 e0Var = (e0) this.Z0;
        if (e0Var.q()) {
            return e0Var.U && !e0Var.o();
        }
        return true;
    }

    @Override // r2.r, i2.f
    public final boolean m() {
        return ((e0) this.Z0).o() || super.m();
    }

    @Override // r2.r, i2.f
    public final void o() {
        of.b bVar = this.Y0;
        this.i1 = true;
        this.e1 = null;
        this.m1 = -9223372036854775807L;
        try {
            ((e0) this.Z0).g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.o();
                throw th2;
            } finally {
            }
        }
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        i2.g gVar = new i2.g();
        this.O0 = gVar;
        of.b bVar = this.Y0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g(bVar, gVar, 1));
        }
        l1 l1Var = this.d;
        l1Var.getClass();
        boolean z12 = l1Var.b;
        p pVar = this.Z0;
        if (z12) {
            e0 e0Var = (e0) pVar;
            e2.d.g(e0Var.Y);
            if (!e0Var.d0) {
                e0Var.d0 = true;
                e0Var.g();
            }
        } else {
            e0 e0Var2 = (e0) pVar;
            if (e0Var2.d0) {
                e0Var2.d0 = false;
                e0Var2.g();
            }
        }
        j2.k kVar = this.f;
        kVar.getClass();
        e0 e0Var3 = (e0) pVar;
        e0Var3.s = kVar;
        e2.x xVar = this.h;
        xVar.getClass();
        e0Var3.h.I = xVar;
    }

    @Override // r2.r, i2.f
    public final void q(long j3, boolean z10) {
        super.q(j3, z10);
        ((e0) this.Z0).g();
        this.g1 = j3;
        this.m1 = -9223372036854775807L;
        this.j1 = false;
        this.h1 = true;
    }

    @Override // i2.f
    public final void r() {
        r2.j jVar;
        c cVar;
        h8 h8Var = ((e0) this.Z0).z;
        if (h8Var != null) {
            Context context = (Context) h8Var.b;
            if (h8Var.a) {
                h8Var.h = null;
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) h8Var.e) != null) {
                    e0.b.K(context, cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) h8Var.f);
                d dVar = (d) h8Var.g;
                if (dVar != null) {
                    dVar.a.unregisterContentObserver(dVar);
                }
                h8Var.a = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.a1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // i2.f
    public final void s() {
        p pVar = this.Z0;
        this.j1 = false;
        this.m1 = -9223372036854775807L;
        try {
            try {
                this.x0 = false;
                l0();
                j0();
            } finally {
                hc.b.D(this.V, null);
                this.V = null;
            }
        } finally {
            if (this.i1) {
                this.i1 = false;
                ((e0) pVar).y();
            }
        }
    }

    @Override // i2.f
    public final void t() {
        ((e0) this.Z0).u();
        this.l1 = true;
    }

    @Override // i2.f
    public final void u() {
        B0();
        this.l1 = false;
        ((e0) this.Z0).t();
    }

    @Override // r2.r
    public final boolean u0(b2.s sVar) {
        l1 l1Var = this.d;
        l1Var.getClass();
        if (l1Var.a != 0) {
            int z02 = z0(sVar);
            if ((z02 & 512) != 0) {
                l1 l1Var2 = this.d;
                l1Var2.getClass();
                if (l1Var2.a == 2 || (z02 & 1024) != 0) {
                    return true;
                }
                if (sVar.M == 0 && sVar.N == 0) {
                    return true;
                }
            }
        }
        return ((e0) this.Z0).G(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (r2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v0(r2.i iVar, b2.s sVar) {
        int i10;
        e0 e0Var;
        a1 f7;
        boolean z10;
        boolean z11;
        int c10 = hc.b.c(1, 0, 0, 0);
        String str = sVar.r;
        String str2 = sVar.r;
        if (!b2.r0.i(str)) {
            return hc.b.c(0, 0, 0, 0);
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
            i10 = z0(sVar);
            if (((e0) pVar).G(sVar)) {
                return hc.b.c(4, 8, 32, i10);
            }
            if ("audio/raw".equals(str2) || ((e0) pVar).G(sVar)) {
                e0Var = (e0) pVar;
                if (e0Var.G(e2.d0.C(2, sVar.J, sVar.K))) {
                    if (str2 == null) {
                        f7 = a1.e;
                    } else {
                        if (e0Var.G(sVar)) {
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
                            return hc.b.c(2, 0, 0, 0);
                        }
                        r2.o oVar2 = (r2.o) f7.get(0);
                        boolean e = oVar2.e(sVar);
                        if (!e) {
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
                        z10 = e;
                        z11 = true;
                        int i14 = z10 ? 4 : 3;
                        if (z10 && oVar2.f(sVar)) {
                            i12 = 16;
                        }
                        return (oVar2.g ? 64 : 0) | i14 | i12 | 32 | (z11 ? 128 : 0) | i10;
                    }
                }
            }
            return c10;
        }
        i10 = 0;
        if ("audio/raw".equals(str2)) {
        }
        e0Var = (e0) pVar;
        if (e0Var.G(e2.d0.C(2, sVar.J, sVar.K))) {
        }
        return c10;
    }

    public final int z0(b2.s sVar) {
        e j3 = ((e0) this.Z0).j(sVar);
        if (!j3.a) {
            return 0;
        }
        int i10 = j3.b ? 1536 : 512;
        return j3.c ? i10 | 2048 : i10;
    }

    @Override // i2.f
    public final r0 i() {
        return this;
    }
}
