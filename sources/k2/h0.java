package k2;

import ai.f8;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import b2.r0;
import b2.v0;
import ci.e7;
import e9.a1;
import gg.w1;
import i2.n1;
import i2.t0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h0 extends r2.s implements t0 {
    public final Context W0;
    public final n4.x X0;
    public final p Y0;
    public final r2.k Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public b2.s d1;
    public b2.s e1;
    public long f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public int j1;
    public boolean k1;
    public long l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, r2.l lVar, Handler handler, i2.c0 c0Var, p pVar) {
        super(1, lVar, 44100.0f);
        r2.k kVar = Build.VERSION.SDK_INT >= 35 ? new r2.k() : null;
        this.W0 = context.getApplicationContext();
        this.Y0 = pVar;
        this.Z0 = kVar;
        this.j1 = -1000;
        this.X0 = new n4.x(handler, c0Var);
        this.l1 = -9223372036854775807L;
        ((d0) pVar).s = new g0(this, 0);
    }

    public final void A0() {
        l();
        long i10 = ((d0) this.Y0).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.g1) {
                i10 = Math.max(this.f1, i10);
            }
            this.f1 = i10;
            this.g1 = false;
        }
    }

    @Override // r2.s
    public final i2.h D(r2.p pVar, b2.s sVar, b2.s sVar2) {
        i2.h b10 = pVar.b(sVar, sVar2);
        int i10 = b10.e;
        if (this.V == null && t0(sVar2)) {
            i10 |= 32768;
        }
        if (z0(pVar, sVar2) > this.a1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.h(pVar.a, sVar, sVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // r2.s
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

    @Override // r2.s
    public final ArrayList N(r2.j jVar, b2.s sVar, boolean z10) {
        a1 f7;
        if (sVar.r == null) {
            f7 = a1.e;
        } else {
            if (((d0) this.Y0).G(sVar)) {
                List d = r2.x.d("audio/raw", false, false);
                r2.p pVar = d.isEmpty() ? null : (r2.p) d.get(0);
                if (pVar != null) {
                    f7 = e9.i0.z(pVar);
                }
            }
            f7 = r2.x.f(jVar, sVar, z10, false);
        }
        HashMap hashMap = r2.x.a;
        ArrayList arrayList = new ArrayList(f7);
        Collections.sort(arrayList, new f8(new m4.w(sVar, 28), 3));
        return arrayList;
    }

    @Override // r2.s
    public final long O(long j3, long j10) {
        boolean z10 = this.l1 != -9223372036854775807L;
        if (this.k1) {
            long h = ((d0) this.Y0).h();
            if (z10 && h != -9223372036854775807L) {
                float min = Math.min(h, this.l1 - j3);
                float f7 = h() != null ? h().a : 1.0f;
                this.h.getClass();
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (e2.d0.P(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.J0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if ("AXON 7 mini".equals(r6) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    @Override // r2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.firebase.messaging.n P(r2.p pVar, b2.s sVar, MediaCrypto mediaCrypto, float f7) {
        boolean z10;
        String str;
        b2.s[] sVarArr = this.s;
        sVarArr.getClass();
        int z02 = z0(pVar, sVar);
        String str2 = pVar.a;
        if (sVarArr.length != 1) {
            for (b2.s sVar2 : sVarArr) {
                if (pVar.b(sVar, sVar2).d != 0) {
                    z02 = Math.max(z02, z0(pVar, sVar2));
                }
            }
        }
        this.a1 = z02;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z10 = true;
                this.b1 = z10;
                this.c1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = pVar.c;
                int i11 = this.a1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i12 = sVar.J;
                str = sVar.r;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = sVar.K;
                mediaFormat.setInteger("sample-rate", i13);
                e2.d.o(mediaFormat, sVar.u);
                e2.d.n(mediaFormat, "max-input-size", i11);
                mediaFormat.setInteger("priority", 0);
                if (f7 != -1.0f) {
                    if (i10 == 23) {
                        String str5 = Build.MODEL;
                        if (!"ZTE B2017G".equals(str5)) {
                        }
                    }
                    mediaFormat.setFloat("operating-rate", f7);
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
                    if (((d0) this.Y0).k(e2.d0.B(4, sVar.J, i13)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i10 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.j1));
                }
                this.e1 = ("audio/raw".equals(pVar.b) || "audio/raw".equals(str)) ? null : sVar;
                return new com.google.firebase.messaging.n(pVar, mediaFormat, sVar, null, mediaCrypto, this.Z0);
            }
        }
        z10 = false;
        this.b1 = z10;
        this.c1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = pVar.c;
        int i112 = this.a1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i122 = sVar.J;
        str = sVar.r;
        mediaFormat2.setInteger("channel-count", i122);
        int i132 = sVar.K;
        mediaFormat2.setInteger("sample-rate", i132);
        e2.d.o(mediaFormat2, sVar.u);
        e2.d.n(mediaFormat2, "max-input-size", i112);
        mediaFormat2.setInteger("priority", 0);
        if (f7 != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        if (i10 >= 35) {
        }
        this.e1 = ("audio/raw".equals(pVar.b) || "audio/raw".equals(str)) ? null : sVar;
        return new com.google.firebase.messaging.n(pVar, mediaFormat2, sVar, null, mediaCrypto, this.Z0);
    }

    @Override // r2.s
    public final void Q(h2.h hVar) {
        b2.s sVar;
        if (Build.VERSION.SDK_INT < 29 || (sVar = hVar.a) == null || !Objects.equals(sVar.r, "audio/opus") || !this.w0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        b2.s sVar2 = hVar.a;
        sVar2.getClass();
        int i10 = sVar2.M;
        if (byteBuffer.remaining() == 8) {
            ((d0) this.Y0).D(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // r2.s
    public final void W(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new f(xVar, exc, 0));
        }
    }

    @Override // r2.s
    public final void X(long j3, long j10, String str) {
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new a3.g0(xVar, str, j3, j10, 2));
        }
    }

    @Override // r2.s
    public final void Y(String str) {
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new w1(25, xVar, str));
        }
    }

    @Override // r2.s
    public final i2.h Z(n4.x xVar) {
        b2.s sVar = (b2.s) xVar.c;
        sVar.getClass();
        this.d1 = sVar;
        i2.h Z = super.Z(xVar);
        n4.x xVar2 = this.X0;
        Handler handler = (Handler) xVar2.b;
        if (handler != null) {
            handler.post(new gg.t(xVar2, sVar, Z, 21));
        }
        return Z;
    }

    @Override // i2.t0
    public final long a() {
        if (this.n == 2) {
            A0();
        }
        return this.f1;
    }

    @Override // r2.s
    public final void a0(b2.s sVar, MediaFormat mediaFormat) {
        b2.s sVar2 = this.e1;
        boolean z10 = true;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (this.b0 != null) {
            mediaFormat.getClass();
            String str = sVar.r;
            int i10 = sVar.J;
            int A = "audio/raw".equals(str) ? sVar.L : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? e2.d0.A(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            b2.r rVar = new b2.r();
            rVar.q = r0.n("audio/raw");
            rVar.K = A;
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
            boolean z11 = this.b1;
            int i11 = sVar.J;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.c1) {
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
            p pVar = this.Y0;
            if (i13 >= 29) {
                if (this.w0) {
                    n1 n1Var = this.d;
                    n1Var.getClass();
                    if (n1Var.a != 0) {
                        n1 n1Var2 = this.d;
                        n1Var2.getClass();
                        int i14 = n1Var2.a;
                        d0 d0Var = (d0) pVar;
                        d0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        e2.d.g(z10);
                        d0Var.j = i14;
                    }
                }
                d0 d0Var2 = (d0) pVar;
                d0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                e2.d.g(z10);
                d0Var2.j = 0;
            }
            ((d0) pVar).d(sVar, iArr);
        } catch (l e7) {
            throw d(e7, e7.a, false, 5001);
        }
    }

    @Override // i2.t0
    public final boolean b() {
        boolean z10 = this.i1;
        this.i1 = false;
        return z10;
    }

    @Override // r2.s
    public final void b0() {
        this.Y0.getClass();
    }

    @Override // i2.f, i2.j1
    public final void c(int i10, Object obj) {
        a4.l lVar;
        r2.k kVar;
        p pVar = this.Y0;
        if (i10 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            d0 d0Var = (d0) pVar;
            if (d0Var.P != floatValue) {
                d0Var.P = floatValue;
                if (d0Var.q()) {
                    d0Var.w.setVolume(d0Var.P);
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
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            d0 d0Var2 = (d0) pVar;
            if (audioDeviceInfo == null) {
                lVar = null;
            } else {
                d0Var2.getClass();
                lVar = new a4.l(audioDeviceInfo, 25);
            }
            d0Var2.b0 = lVar;
            e7 e7Var = d0Var2.y;
            if (e7Var != null) {
                e7Var.c(audioDeviceInfo);
            }
            AudioTrack audioTrack = d0Var2.w;
            if (audioTrack != null) {
                a4.l lVar2 = d0Var2.b0;
                audioTrack.setPreferredDevice(lVar2 != null ? (AudioDeviceInfo) lVar2.b : null);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.j1 = ((Integer) obj).intValue();
            r2.m mVar = this.b0;
            if (mVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.j1));
                mVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            d0 d0Var3 = (d0) pVar;
            d0Var3.E = ((Boolean) obj).booleanValue();
            v vVar = d0Var3.u;
            w wVar = new w((vVar == null || !vVar.j) ? d0Var3.D : v0.d, -9223372036854775807L, -9223372036854775807L);
            if (d0Var3.q()) {
                d0Var3.B = wVar;
                return;
            } else {
                d0Var3.C = wVar;
                return;
            }
        }
        if (i10 != 10) {
            if (i10 == 11) {
                i2.j0 j0Var = (i2.j0) obj;
                j0Var.getClass();
                this.W = j0Var;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        ((d0) pVar).A(intValue);
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.Z0) == null) {
            return;
        }
        kVar.d(intValue);
    }

    @Override // r2.s
    public final void d0() {
        ((d0) this.Y0).M = true;
    }

    @Override // i2.t0
    public final void f(v0 v0Var) {
        ((d0) this.Y0).F(v0Var);
    }

    @Override // r2.s
    public final boolean g0(long j3, long j10, r2.m mVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, b2.s sVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.l1 = -9223372036854775807L;
        if (this.e1 != null && (i11 & 2) != 0) {
            mVar.getClass();
            mVar.c(i10);
            return true;
        }
        p pVar = this.Y0;
        if (z10) {
            if (mVar != null) {
                mVar.c(i10);
            }
            this.N0.f += i12;
            ((d0) pVar).M = true;
            return true;
        }
        try {
            if (!((d0) pVar).n(j11, i12, byteBuffer)) {
                this.l1 = j11;
                return false;
            }
            if (mVar != null) {
                mVar.c(i10);
            }
            this.N0.e += i12;
            return true;
        } catch (m e7) {
            b2.s sVar2 = this.d1;
            if (this.w0) {
                n1 n1Var = this.d;
                n1Var.getClass();
                if (n1Var.a != 0) {
                    i14 = 5004;
                    throw d(e7, sVar2, e7.b, i14);
                }
            }
            i14 = 5001;
            throw d(e7, sVar2, e7.b, i14);
        } catch (o e10) {
            if (this.w0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.a != 0) {
                    i13 = 5003;
                    throw d(e10, sVar, e10.b, i13);
                }
            }
            i13 = 5002;
            throw d(e10, sVar, e10.b, i13);
        }
    }

    @Override // i2.t0
    public final v0 h() {
        return ((d0) this.Y0).D;
    }

    @Override // i2.f
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // r2.s
    public final void j0() {
        try {
            ((d0) this.Y0).w();
            long j3 = this.H0;
            if (j3 != -9223372036854775807L) {
                this.l1 = j3;
            }
        } catch (o e7) {
            throw d(e7, e7.c, e7.b, this.w0 ? 5003 : 5002);
        }
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.J0) {
            return false;
        }
        d0 d0Var = (d0) this.Y0;
        if (d0Var.q()) {
            return d0Var.T && !d0Var.o();
        }
        return true;
    }

    @Override // r2.s, i2.f
    public final boolean m() {
        return ((d0) this.Y0).o() || super.m();
    }

    @Override // r2.s, i2.f
    public final void o() {
        n4.x xVar = this.X0;
        this.h1 = true;
        this.d1 = null;
        this.l1 = -9223372036854775807L;
        try {
            ((d0) this.Y0).g();
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
        this.N0 = gVar;
        n4.x xVar = this.X0;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new g(xVar, gVar, 1));
        }
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.b;
        p pVar = this.Y0;
        if (z12) {
            d0 d0Var = (d0) pVar;
            e2.d.g(d0Var.X);
            if (!d0Var.c0) {
                d0Var.c0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.c0) {
                d0Var2.c0 = false;
                d0Var2.g();
            }
        }
        j2.k kVar = this.f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.r = kVar;
        e2.x xVar2 = this.h;
        xVar2.getClass();
        d0Var3.h.G = xVar2;
    }

    @Override // r2.s, i2.f
    public final void q(long j3, boolean z10) {
        super.q(j3, z10);
        ((d0) this.Y0).g();
        this.f1 = j3;
        this.l1 = -9223372036854775807L;
        this.i1 = false;
        this.g1 = true;
    }

    @Override // i2.f
    public final void r() {
        r2.k kVar;
        e7 e7Var = ((d0) this.Y0).y;
        if (e7Var != null) {
            Context context = (Context) e7Var.b;
            if (e7Var.a) {
                e7Var.h = null;
                c cVar = (c) e7Var.e;
                if (cVar != null) {
                    c2.d.e(context).unregisterAudioDeviceCallback(cVar);
                }
                context.unregisterReceiver((androidx.mediarouter.app.g) e7Var.f);
                d dVar = (d) e7Var.g;
                if (dVar != null) {
                    dVar.a.unregisterContentObserver(dVar);
                }
                e7Var.a = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (kVar = this.Z0) == null) {
            return;
        }
        kVar.b();
    }

    @Override // i2.f
    public final void s() {
        p pVar = this.Y0;
        this.i1 = false;
        this.l1 = -9223372036854775807L;
        try {
            try {
                this.w0 = false;
                k0();
                i0();
            } finally {
                hg.c.A(this.V, null);
                this.V = null;
            }
        } finally {
            if (this.h1) {
                this.h1 = false;
                ((d0) pVar).y();
            }
        }
    }

    @Override // i2.f
    public final void t() {
        ((d0) this.Y0).u();
        this.k1 = true;
    }

    @Override // r2.s
    public final boolean t0(b2.s sVar) {
        n1 n1Var = this.d;
        n1Var.getClass();
        if (n1Var.a != 0) {
            int y02 = y0(sVar);
            if ((y02 & 512) != 0) {
                n1 n1Var2 = this.d;
                n1Var2.getClass();
                if (n1Var2.a == 2 || (y02 & 1024) != 0) {
                    return true;
                }
                if (sVar.M == 0 && sVar.N == 0) {
                    return true;
                }
            }
        }
        return ((d0) this.Y0).G(sVar);
    }

    @Override // i2.f
    public final void u() {
        A0();
        this.k1 = false;
        ((d0) this.Y0).t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (r2.p) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // r2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int u0(r2.j jVar, b2.s sVar) {
        int i10;
        d0 d0Var;
        a1 f7;
        boolean z10;
        boolean z11;
        int b10 = hg.c.b(1, 0, 0, 0);
        String str = sVar.r;
        String str2 = sVar.r;
        if (!r0.i(str)) {
            return hg.c.b(0, 0, 0, 0);
        }
        int i11 = sVar.S;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        p pVar = this.Y0;
        if (z13) {
            if (z12) {
                List d = r2.x.d("audio/raw", false, false);
            }
            i10 = y0(sVar);
            if (((d0) pVar).G(sVar)) {
                return hg.c.b(4, 8, 32, i10);
            }
            if ("audio/raw".equals(str2) || ((d0) pVar).G(sVar)) {
                d0Var = (d0) pVar;
                if (d0Var.G(e2.d0.B(2, sVar.J, sVar.K))) {
                    if (str2 == null) {
                        f7 = a1.e;
                    } else {
                        if (d0Var.G(sVar)) {
                            List d10 = r2.x.d("audio/raw", false, false);
                            r2.p pVar2 = d10.isEmpty() ? null : (r2.p) d10.get(0);
                            if (pVar2 != null) {
                                f7 = e9.i0.z(pVar2);
                            }
                        }
                        f7 = r2.x.f(jVar, sVar, false, false);
                    }
                    if (!f7.isEmpty()) {
                        if (!z13) {
                            return hg.c.b(2, 0, 0, 0);
                        }
                        r2.p pVar3 = (r2.p) f7.get(0);
                        boolean e7 = pVar3.e(sVar);
                        if (!e7) {
                            for (int i13 = 1; i13 < f7.d; i13++) {
                                r2.p pVar4 = (r2.p) f7.get(i13);
                                if (pVar4.e(sVar)) {
                                    z11 = false;
                                    pVar3 = pVar4;
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = e7;
                        z11 = true;
                        int i14 = z10 ? 4 : 3;
                        if (z10 && pVar3.f(sVar)) {
                            i12 = 16;
                        }
                        return (pVar3.g ? 64 : 0) | i14 | i12 | 32 | (z11 ? 128 : 0) | i10;
                    }
                }
            }
            return b10;
        }
        i10 = 0;
        if ("audio/raw".equals(str2)) {
        }
        d0Var = (d0) pVar;
        if (d0Var.G(e2.d0.B(2, sVar.J, sVar.K))) {
        }
        return b10;
    }

    public final int y0(b2.s sVar) {
        e j3 = ((d0) this.Y0).j(sVar);
        if (!j3.a) {
            return 0;
        }
        int i10 = j3.b ? 1536 : 512;
        return j3.c ? i10 | 2048 : i10;
    }

    public final int z0(r2.p pVar, b2.s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(pVar.a) || (i10 = Build.VERSION.SDK_INT) >= 24 || (i10 == 23 && e2.d0.M(this.W0))) {
            return sVar.s;
        }
        return -1;
    }

    @Override // i2.f
    public final t0 i() {
        return this;
    }
}
