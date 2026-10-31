package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import bi.v6;
import e9.x1;
import i2.s1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z0 extends r2.r implements i2.x0 {
    public final Context Z0;
    public final hf.b a1;
    public final b0 b1;
    public final r2.j c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public b2.x g1;
    public b2.x h1;
    public long i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public boolean o1;
    public long p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, r2.k kVar, Handler handler, i2.c0 c0Var, b0 b0Var) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar = Build.VERSION.SDK_INT >= 35 ? new r2.j() : null;
        this.Z0 = context.getApplicationContext();
        this.b1 = b0Var;
        this.c1 = jVar;
        this.n1 = -1000;
        this.a1 = new hf.b(handler, (w) c0Var);
        this.p1 = -9223372036854775807L;
    }

    public final int D0(b2.x xVar) {
        g a2;
        w0 w0Var = (w0) this.b1;
        if (w0Var.X) {
            a2 = g.d;
        } else {
            l b10 = ((n0) w0Var.r).b(w0Var.i(xVar));
            ea.b bVar = new ea.b();
            bVar.a = b10.a;
            bVar.b = b10.b;
            bVar.c = b10.c;
            a2 = bVar.a();
        }
        if (!a2.a) {
            return 0;
        }
        int i10 = a2.b ? 1536 : 512;
        return a2.c ? i10 | 2048 : i10;
    }

    public final int E0(r2.o oVar, b2.x xVar) {
        if ("OMX.google.raw.decoder".equals(oVar.a) && Build.VERSION.SDK_INT == 23 && !e2.l0.P(this.Z0)) {
            return -1;
        }
        return xVar.t;
    }

    public final void F0() {
        l();
        long h = ((w0) this.b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.j1) {
                h = Math.max(this.i1, h);
            }
            this.i1 = h;
            this.j1 = false;
        }
    }

    @Override // r2.r
    public final i2.e H(r2.o oVar, b2.x xVar, b2.x xVar2, boolean z10) {
        i2.e b10 = oVar.b(xVar, xVar2);
        int i10 = b10.e;
        if (this.X == null && y0(xVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, xVar2) > this.d1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.e(oVar.a, xVar, xVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // r2.r
    public final float P(float f7, b2.x xVar, b2.x[] xVarArr) {
        int i10 = -1;
        for (b2.x xVar2 : xVarArr) {
            int i11 = xVar2.L;
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
    public final ArrayList Q(r2.i iVar, b2.x xVar, boolean z10) {
        x1 g10;
        if (xVar.s == null) {
            g10 = x1.e;
        } else {
            if (((w0) this.b1).j(xVar) != 0) {
                List e = r2.w.e("audio/raw", false, false);
                r2.o oVar = e.isEmpty() ? null : (r2.o) e.get(0);
                if (oVar != null) {
                    g10 = e9.n0.y(oVar);
                }
            }
            g10 = r2.w.g(iVar, xVar, z10, false);
        }
        HashMap hashMap = r2.w.a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new v6(new org.telegram.ui.web.k0(9, this.Z0, xVar), 3));
        return arrayList;
    }

    @Override // r2.r
    public final long R(long j10, long j11, boolean z10) {
        w0 w0Var = (w0) this.b1;
        boolean z11 = w0Var.n() && this.p1 != -9223372036854775807L;
        if (this.o1) {
            long g10 = w0Var.g();
            if (this.m1 && z11 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.p1 - j10) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z11 || this.K0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if ("AXON 7 mini".equals(r7) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j2.f T(r2.o oVar, b2.x xVar, MediaCrypto mediaCrypto, float f7) {
        boolean z10;
        String str;
        int i10;
        b2.x[] xVarArr = this.s;
        xVarArr.getClass();
        int E0 = E0(oVar, xVar);
        String str2 = oVar.a;
        int i11 = 0;
        if (xVarArr.length != 1) {
            for (b2.x xVar2 : xVarArr) {
                if (oVar.b(xVar, xVar2).d != 0) {
                    E0 = Math.max(E0, E0(oVar, xVar2));
                }
            }
        }
        this.d1 = E0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z10 = true;
                this.e1 = z10;
                this.f1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = oVar.c;
                int i13 = this.d1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i14 = xVar.K;
                str = xVar.s;
                mediaFormat.setInteger("channel-count", i14);
                int i15 = xVar.L;
                mediaFormat.setInteger("sample-rate", i15);
                e2.a.k(mediaFormat, xVar.v);
                e2.a.j(mediaFormat, "max-input-size", i13);
                mediaFormat.setInteger("priority", 0);
                if (f7 != -1.0f) {
                    if (i12 == 23) {
                        String str5 = Build.MODEL;
                        if (!"ZTE B2017G".equals(str5)) {
                        }
                    }
                    mediaFormat.setFloat("operating-rate", f7);
                }
                if ("audio/ac4".equals(str)) {
                    Pair b10 = e2.g.b(xVar);
                    if (b10 != null) {
                        e2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
                        e2.a.j(mediaFormat, "level", ((Integer) b10.second).intValue());
                    }
                    if (i12 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                b0 b0Var = this.b1;
                if (i12 >= 24) {
                    if (((w0) b0Var).j(e2.l0.E(4, xVar.K, i15)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i12 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i12 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.n1));
                }
                if (Objects.equals(str, "audio/iamf")) {
                    p pVar = ((w0) b0Var).r;
                    b bVar = pVar instanceof n0 ? ((n0) pVar).h : null;
                    int i16 = 12;
                    if (bVar == null) {
                        e2.a.l("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        e9.y0 y0Var = y0.a;
                        e9.n0 n0Var = bVar.d;
                        int size = n0Var.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size) {
                                i10 = 0;
                                break;
                            }
                            Object obj = n0Var.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            i10 = num.intValue();
                            if (y0.a.contains(num)) {
                                break;
                            }
                        }
                        if (i10 != 0) {
                            i16 = i10;
                        } else {
                            e9.n0 n0Var2 = bVar.c;
                            int size2 = n0Var2.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size2) {
                                    break;
                                }
                                Object obj2 = n0Var2.get(i18);
                                i18++;
                                Integer num2 = (Integer) obj2;
                                int intValue = num2.intValue();
                                if (y0.a.contains(num2)) {
                                    i11 = intValue;
                                    break;
                                }
                            }
                            if (i11 != 0) {
                                i16 = i11;
                            }
                        }
                        int bitCount = Integer.bitCount(i16);
                        mediaFormat.setInteger("channel-mask", i16);
                        mediaFormat.setInteger("max-output-channel-count", bitCount);
                    }
                }
                F(mediaFormat);
                this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : xVar;
                return new j2.f(oVar, mediaFormat, xVar, null, mediaCrypto, this.c1);
            }
        }
        z10 = false;
        this.e1 = z10;
        this.f1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = oVar.c;
        int i132 = this.d1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i142 = xVar.K;
        str = xVar.s;
        mediaFormat2.setInteger("channel-count", i142);
        int i152 = xVar.L;
        mediaFormat2.setInteger("sample-rate", i152);
        e2.a.k(mediaFormat2, xVar.v);
        e2.a.j(mediaFormat2, "max-input-size", i132);
        mediaFormat2.setInteger("priority", 0);
        if (f7 != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        b0 b0Var2 = this.b1;
        if (i12 >= 24) {
        }
        if (i12 >= 32) {
        }
        if (i12 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        F(mediaFormat2);
        this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : xVar;
        return new j2.f(oVar, mediaFormat2, xVar, null, mediaCrypto, this.c1);
    }

    @Override // r2.r
    public final void U(h2.h hVar) {
        b2.x xVar;
        ji.a aVar;
        if (Build.VERSION.SDK_INT < 29 || (xVar = hVar.a) == null || !Objects.equals(xVar.s, "audio/opus") || !this.y0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        b2.x xVar2 = hVar.a;
        xVar2.getClass();
        int i10 = xVar2.N;
        if (byteBuffer.remaining() == 8) {
            int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            w0 w0Var = (w0) this.b1;
            j0 j0Var = w0Var.t;
            if (j0Var == null || !j0Var.c() || (aVar = w0Var.p) == null || !((o) aVar.e).k) {
                return;
            }
            w0Var.t.d(i10, i11);
        }
    }

    @Override // i2.x0
    public final long a() {
        if (this.n == 2) {
            F0();
        }
        return this.i1;
    }

    @Override // r2.r
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        hf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new q(bVar, exc, 0));
        }
    }

    @Override // i2.x0
    public final boolean b() {
        boolean z10 = this.l1;
        this.l1 = false;
        return z10;
    }

    @Override // r2.r
    public final void b0(long j10, String str, long j11) {
        hf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 1));
        }
    }

    @Override // i2.x0
    public final void c(b2.z0 z0Var) {
        ((w0) this.b1).C(z0Var);
    }

    @Override // r2.r
    public final void c0(i2.c cVar) {
        hf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(1, bVar, cVar));
        }
    }

    @Override // r2.r, i2.b, i2.o1
    public final void d(int i10, Object obj) {
        r2.j jVar;
        b0 b0Var = this.b1;
        if (i10 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            w0 w0Var = (w0) b0Var;
            if (w0Var.H != floatValue) {
                w0Var.H = floatValue;
                if (w0Var.p()) {
                    w0Var.t.a.setVolume(w0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            w0 w0Var2 = (w0) b0Var;
            if (w0Var2.u.equals(fVar)) {
                return;
            }
            w0Var2.u = fVar;
            if (w0Var2.V) {
                return;
            }
            w0Var2.v();
            return;
        }
        if (i10 == 6) {
            b2.g gVar = (b2.g) obj;
            gVar.getClass();
            ((w0) b0Var).A(gVar);
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            w0 w0Var3 = (w0) b0Var;
            w0Var3.T = audioDeviceInfo;
            j0 j0Var = w0Var3.t;
            if (j0Var != null) {
                j0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.n1 = ((Integer) obj).intValue();
            r2.l lVar = this.d0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.n1));
                lVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            obj.getClass();
            w0 w0Var4 = (w0) b0Var;
            w0Var4.y = ((Boolean) obj).booleanValue();
            u0 u0Var = new u0(w0Var4.D() ? b2.z0.d : w0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (w0Var4.p()) {
                w0Var4.v = u0Var;
                return;
            } else {
                w0Var4.w = u0Var;
                return;
            }
        }
        if (i10 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((w0) b0Var).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (jVar = this.c1) == null) {
                return;
            }
            jVar.d(intValue);
            return;
        }
        if (i10 != 19) {
            if (i10 != 20) {
                super.d(i10, obj);
                return;
            } else {
                obj.getClass();
                ((w0) b0Var).y((p) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        w0 w0Var5 = (w0) b0Var;
        w0Var5.getClass();
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (w0Var5.U == intValue2) {
            return;
        }
        w0Var5.U = intValue2;
        w0Var5.v();
    }

    @Override // r2.r
    public final void d0(String str) {
        hf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new u(0, bVar, str));
        }
    }

    @Override // r2.r
    public final i2.e e0(hf.b bVar) {
        b2.x xVar = (b2.x) bVar.c;
        xVar.getClass();
        this.g1 = xVar;
        i2.e e02 = super.e0(bVar);
        hf.b bVar2 = this.a1;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new a3.l0(bVar2, xVar, e02, 26));
        }
        return e02;
    }

    @Override // r2.r
    public final void f0(b2.x xVar, MediaFormat mediaFormat) {
        b2.x xVar2 = this.h1;
        boolean z10 = true;
        int[] iArr = null;
        if (xVar2 != null) {
            xVar = xVar2;
        } else if (this.d0 != null) {
            mediaFormat.getClass();
            String str = xVar.s;
            int i10 = xVar.K;
            int D = "audio/raw".equals(str) ? xVar.M : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? e2.l0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            b2.w wVar = new b2.w();
            wVar.r = b2.v0.n("audio/raw");
            wVar.L = D;
            wVar.M = xVar.N;
            wVar.N = xVar.O;
            wVar.k = xVar.l;
            wVar.a = xVar.a;
            wVar.b = xVar.b;
            wVar.c = e9.n0.u(xVar.c);
            wVar.d = xVar.d;
            wVar.e = xVar.e;
            wVar.f = xVar.f;
            wVar.J = mediaFormat.getInteger("channel-count");
            wVar.K = mediaFormat.getInteger("sample-rate");
            xVar = new b2.x(wVar);
            boolean z11 = this.e1;
            int i11 = xVar.K;
            if (z11 && i11 == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.f1) {
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
            b0 b0Var = this.b1;
            if (i13 >= 29) {
                if (this.y0) {
                    s1 s1Var = this.d;
                    s1Var.getClass();
                    if (s1Var.a != 0) {
                        s1 s1Var2 = this.d;
                        s1Var2.getClass();
                        int i14 = s1Var2.a;
                        w0 w0Var = (w0) b0Var;
                        w0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        t6.p(z10);
                        w0Var.i = i14;
                    }
                }
                w0 w0Var2 = (w0) b0Var;
                w0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                t6.p(z10);
                w0Var2.i = 0;
            }
            ((w0) b0Var).c(xVar, iArr);
        } catch (x e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override // i2.x0
    public final b2.z0 g() {
        return ((w0) this.b1).x;
    }

    @Override // r2.r
    public final void g0() {
        this.b1.getClass();
    }

    @Override // r2.r
    public final void i0() {
        ((w0) this.b1).E = true;
    }

    @Override // i2.b
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // i2.b
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        w0 w0Var = (w0) this.b1;
        if (w0Var.p()) {
            return w0Var.L && !w0Var.n();
        }
        return true;
    }

    @Override // r2.r
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.x xVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.p1 = -9223372036854775807L;
        if (this.h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        b0 b0Var = this.b1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f += i12;
            ((w0) b0Var).E = true;
            return true;
        }
        try {
            if (!((w0) b0Var).m(j12, i12, byteBuffer)) {
                this.p1 = j12;
                return false;
            }
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.e += i12;
            return true;
        } catch (a0 e) {
            if (this.y0) {
                s1 s1Var = this.d;
                s1Var.getClass();
                if (s1Var.a != 0) {
                    i14 = 5003;
                    throw e(e, xVar, e.b, i14);
                }
            }
            i14 = 5002;
            throw e(e, xVar, e.b, i14);
        } catch (y e7) {
            b2.x xVar2 = this.g1;
            if (this.y0) {
                s1 s1Var2 = this.d;
                s1Var2.getClass();
                if (s1Var2.a != 0) {
                    i13 = 5004;
                    throw e(e7, xVar2, e7.a, i13);
                }
            }
            i13 = 5001;
            throw e(e7, xVar2, e7.a, i13);
        }
    }

    @Override // i2.b
    public final boolean m() {
        return ((w0) this.b1).n();
    }

    @Override // r2.r, i2.b
    public final void n() {
        hf.b bVar = this.a1;
        this.k1 = true;
        this.g1 = null;
        this.p1 = -9223372036854775807L;
        this.m1 = false;
        try {
            ((w0) this.b1).f();
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

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        i2.d dVar = new i2.d();
        this.O0 = dVar;
        hf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r(bVar, dVar, 1));
        }
        s1 s1Var = this.d;
        s1Var.getClass();
        boolean z12 = s1Var.b;
        b0 b0Var = this.b1;
        if (z12) {
            w0 w0Var = (w0) b0Var;
            t6.p(w0Var.P);
            if (!w0Var.V) {
                w0Var.V = true;
                w0Var.v();
            }
        } else {
            w0 w0Var2 = (w0) b0Var;
            if (w0Var2.V) {
                w0Var2.V = false;
                w0Var2.v();
            }
        }
        j2.l lVar = this.f;
        lVar.getClass();
        w0 w0Var3 = (w0) b0Var;
        w0Var3.m = lVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((n0) w0Var3.r).g = g0Var;
        w0Var3.n = new a6.i(this, 29);
    }

    @Override // r2.r
    public final void o0() {
        try {
            ((w0) this.b1).t();
            long j10 = this.P0.f;
            if (j10 != -9223372036854775807L) {
                this.p1 = j10;
            }
        } catch (a0 e) {
            throw e(e, e.c, e.b, this.y0 ? 5003 : 5002);
        }
    }

    @Override // r2.r, i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((w0) this.b1).f();
        this.i1 = j10;
        this.p1 = -9223372036854775807L;
        this.l1 = false;
        this.m1 = false;
        this.j1 = true;
    }

    @Override // i2.b
    public final void q() {
        r2.j jVar;
        ((n0) ((w0) this.b1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.c1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // i2.b
    public final void r() {
        b0 b0Var = this.b1;
        this.l1 = false;
        this.m1 = false;
        this.p1 = -9223372036854775807L;
        try {
            try {
                this.y0 = false;
                p0();
                n0();
            } finally {
                i0.a.x(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.k1) {
                this.k1 = false;
                ((w0) b0Var).w();
            }
        }
    }

    @Override // i2.b
    public final void s() {
        ((w0) this.b1).r();
        this.o1 = true;
    }

    @Override // i2.b
    public final void t() {
        F0();
        this.o1 = false;
        ((w0) this.b1).q();
        this.m1 = false;
    }

    @Override // r2.r
    public final boolean y0(b2.x xVar) {
        s1 s1Var = this.d;
        s1Var.getClass();
        if (s1Var.a != 0) {
            int D0 = D0(xVar);
            if ((D0 & 512) != 0) {
                s1 s1Var2 = this.d;
                s1Var2.getClass();
                if (s1Var2.a == 2 || (D0 & 1024) != 0 || (xVar.N == 0 && xVar.O == 0)) {
                    return true;
                }
            }
        }
        return ((w0) this.b1).j(xVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (r2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(r2.i iVar, b2.x xVar) {
        int i10;
        w0 w0Var;
        x1 g10;
        boolean z10;
        boolean z11;
        int a2 = i0.a.a(1, 0, 0, 0);
        String str = xVar.s;
        String str2 = xVar.s;
        if (!b2.v0.i(str)) {
            return i0.a.a(0, 0, 0, 0);
        }
        int i11 = xVar.T;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        b0 b0Var = this.b1;
        if (z13) {
            if (z12) {
                List e = r2.w.e("audio/raw", false, false);
            }
            i10 = D0(xVar);
            if (((w0) b0Var).j(xVar) != 0) {
                return i0.a.a(4, 8, 32, i10);
            }
            if ("audio/raw".equals(str2) || ((w0) b0Var).j(xVar) != 0) {
                w0Var = (w0) b0Var;
                if (w0Var.j(e2.l0.E(2, xVar.K, xVar.L)) != 0) {
                    if (str2 == null) {
                        g10 = x1.e;
                    } else {
                        if (w0Var.j(xVar) != 0) {
                            List e7 = r2.w.e("audio/raw", false, false);
                            r2.o oVar = e7.isEmpty() ? null : (r2.o) e7.get(0);
                            if (oVar != null) {
                                g10 = e9.n0.y(oVar);
                            }
                        }
                        g10 = r2.w.g(iVar, xVar, false, false);
                    }
                    if (!g10.isEmpty()) {
                        if (!z13) {
                            return i0.a.a(2, 0, 0, 0);
                        }
                        r2.o oVar2 = (r2.o) g10.get(0);
                        Context context = this.Z0;
                        boolean e10 = oVar2.e(context, xVar);
                        if (!e10) {
                            for (int i13 = 1; i13 < g10.d; i13++) {
                                r2.o oVar3 = (r2.o) g10.get(i13);
                                if (oVar3.e(context, xVar)) {
                                    z11 = false;
                                    oVar2 = oVar3;
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = e10;
                        z11 = true;
                        int i14 = z10 ? 4 : 3;
                        if (z10 && oVar2.f(xVar)) {
                            i12 = 16;
                        }
                        return (oVar2.g ? 64 : 0) | i14 | i12 | 32 | (z11 ? 128 : 0) | i10;
                    }
                }
            }
            return a2;
        }
        i10 = 0;
        if ("audio/raw".equals(str2)) {
        }
        w0Var = (w0) b0Var;
        if (w0Var.j(e2.l0.E(2, xVar.K, xVar.L)) != 0) {
        }
        return a2;
    }

    @Override // i2.b
    public final i2.x0 i() {
        return this;
    }
}
