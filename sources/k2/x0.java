package k2;

import ai.u5;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import e9.x1;
import i2.o1;
import i2.p1;
import ig.d2;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.Wallet.e8;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class x0 extends r2.r implements i2.v0 {
    public final Context Z0;
    public final qf.b a1;
    public final a0 b1;
    public final r2.j c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public b2.w g1;
    public b2.w h1;
    public long i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public boolean o1;
    public long p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, r2.k kVar, Handler handler, i2.b0 b0Var, a0 a0Var) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        r2.j jVar = Build.VERSION.SDK_INT >= 35 ? new r2.j() : null;
        this.Z0 = context.getApplicationContext();
        this.b1 = a0Var;
        this.c1 = jVar;
        this.n1 = -1000;
        this.a1 = new qf.b(handler, b0Var);
        this.p1 = -9223372036854775807L;
    }

    public final int D0(b2.w wVar) {
        h a2;
        t0 t0Var = (t0) this.b1;
        if (t0Var.X) {
            a2 = h.d;
        } else {
            m b10 = ((k0) t0Var.r).b(t0Var.i(wVar));
            bc.d dVar = new bc.d();
            dVar.a = b10.a;
            dVar.b = b10.b;
            dVar.c = b10.c;
            a2 = dVar.a();
        }
        if (!a2.a) {
            return 0;
        }
        int i10 = a2.b ? 1536 : 512;
        return a2.c ? i10 | 2048 : i10;
    }

    public final int E0(r2.o oVar, b2.w wVar) {
        if ("OMX.google.raw.decoder".equals(oVar.a) && Build.VERSION.SDK_INT == 23 && !e2.m0.P(this.Z0)) {
            return -1;
        }
        return wVar.t;
    }

    public final void F0() {
        l();
        long h = ((t0) this.b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.j1) {
                h = Math.max(this.i1, h);
            }
            this.i1 = h;
            this.j1 = false;
        }
    }

    @Override // r2.r
    public final i2.f H(r2.o oVar, b2.w wVar, b2.w wVar2, boolean z10) {
        i2.f b10 = oVar.b(wVar, wVar2);
        int i10 = b10.e;
        if (this.X == null && y0(wVar2)) {
            i10 |= 32768;
        }
        if (E0(oVar, wVar2) > this.d1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new i2.f(oVar.a, wVar, wVar2, i11 != 0 ? 0 : b10.d, i11);
    }

    @Override // r2.r
    public final float P(float f7, b2.w wVar, b2.w[] wVarArr) {
        int i10 = -1;
        for (b2.w wVar2 : wVarArr) {
            int i11 = wVar2.L;
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
    public final ArrayList Q(r2.i iVar, b2.w wVar, boolean z10) {
        x1 g10;
        if (wVar.s == null) {
            g10 = x1.e;
        } else {
            if (((t0) this.b1).j(wVar) != 0) {
                List e = r2.w.e("audio/raw", false, false);
                r2.o oVar = e.isEmpty() ? null : (r2.o) e.get(0);
                if (oVar != null) {
                    g10 = e9.n0.y(oVar);
                }
            }
            g10 = r2.w.g(iVar, wVar, z10, false);
        }
        HashMap hashMap = r2.w.a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new u5(new e8(5, this.Z0, wVar), 4));
        return arrayList;
    }

    @Override // r2.r
    public final long R(long j10, long j11, boolean z10) {
        t0 t0Var = (t0) this.b1;
        boolean z11 = t0Var.n() && this.p1 != -9223372036854775807L;
        if (this.o1) {
            long g10 = t0Var.g();
            if (this.m1 && z11 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.p1 - j10) / (h() != null ? h().a : 1.0f)) / 2.0f));
            }
        } else if (z11 || this.K0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if ("AXON 7 mini".equals(r7) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.firebase.messaging.l T(r2.o oVar, b2.w wVar, MediaCrypto mediaCrypto, float f7) {
        boolean z10;
        String str;
        int i10;
        b2.w[] wVarArr = this.s;
        wVarArr.getClass();
        int E0 = E0(oVar, wVar);
        String str2 = oVar.a;
        int i11 = 0;
        if (wVarArr.length != 1) {
            for (b2.w wVar2 : wVarArr) {
                if (oVar.b(wVar, wVar2).d != 0) {
                    E0 = Math.max(E0, E0(oVar, wVar2));
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
                int i14 = wVar.K;
                str = wVar.s;
                mediaFormat.setInteger("channel-count", i14);
                int i15 = wVar.L;
                mediaFormat.setInteger("sample-rate", i15);
                e2.a.k(mediaFormat, wVar.v);
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
                    Pair b10 = e2.g.b(wVar);
                    if (b10 != null) {
                        e2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
                        e2.a.j(mediaFormat, "level", ((Integer) b10.second).intValue());
                    }
                    if (i12 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                a0 a0Var = this.b1;
                if (i12 >= 24) {
                    if (((t0) a0Var).j(e2.m0.E(4, wVar.K, i15)) == 2) {
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
                    q qVar = ((t0) a0Var).r;
                    b bVar = qVar instanceof k0 ? ((k0) qVar).h : null;
                    int i16 = 12;
                    if (bVar == null) {
                        e2.a.l("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        e9.y0 y0Var = v0.a;
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
                            if (v0.a.contains(num)) {
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
                                if (v0.a.contains(num2)) {
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
                this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : wVar;
                return new com.google.firebase.messaging.l(oVar, mediaFormat, wVar, null, mediaCrypto, this.c1);
            }
        }
        z10 = false;
        this.e1 = z10;
        this.f1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = oVar.c;
        int i132 = this.d1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i142 = wVar.K;
        str = wVar.s;
        mediaFormat2.setInteger("channel-count", i142);
        int i152 = wVar.L;
        mediaFormat2.setInteger("sample-rate", i152);
        e2.a.k(mediaFormat2, wVar.v);
        e2.a.j(mediaFormat2, "max-input-size", i132);
        mediaFormat2.setInteger("priority", 0);
        if (f7 != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        a0 a0Var2 = this.b1;
        if (i12 >= 24) {
        }
        if (i12 >= 32) {
        }
        if (i12 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        F(mediaFormat2);
        this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : wVar;
        return new com.google.firebase.messaging.l(oVar, mediaFormat2, wVar, null, mediaCrypto, this.c1);
    }

    @Override // r2.r
    public final void U(h2.h hVar) {
        b2.w wVar;
        q0 q0Var;
        if (Build.VERSION.SDK_INT < 29 || (wVar = hVar.a) == null || !Objects.equals(wVar.s, "audio/opus") || !this.y0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        b2.w wVar2 = hVar.a;
        wVar2.getClass();
        int i10 = wVar2.N;
        if (byteBuffer.remaining() == 8) {
            int i11 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            t0 t0Var = (t0) this.b1;
            i0 i0Var = t0Var.t;
            if (i0Var == null || !i0Var.c() || (q0Var = t0Var.p) == null || !((p) q0Var.e).k) {
                return;
            }
            t0Var.t.d(i10, i11);
        }
    }

    @Override // i2.v0
    public final long a() {
        if (this.n == 2) {
            F0();
        }
        return this.i1;
    }

    @Override // r2.r
    public final void a0(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        qf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new r(bVar, exc, 0));
        }
    }

    @Override // i2.v0
    public final boolean b() {
        boolean z10 = this.l1;
        this.l1 = false;
        return z10;
    }

    @Override // r2.r
    public final void b0(long j10, long j11, String str) {
        qf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new a3.h0(bVar, str, j10, j11, 3));
        }
    }

    @Override // r2.r
    public final void c0(i2.d dVar) {
        qf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new hi.t(16, bVar, dVar));
        }
    }

    @Override // r2.r, i2.b, i2.k1
    public final void d(int i10, Object obj) {
        r2.j jVar;
        a0 a0Var = this.b1;
        if (i10 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            t0 t0Var = (t0) a0Var;
            if (t0Var.H != floatValue) {
                t0Var.H = floatValue;
                if (t0Var.p()) {
                    t0Var.t.a.setVolume(t0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.f fVar = (b2.f) obj;
            fVar.getClass();
            t0 t0Var2 = (t0) a0Var;
            if (t0Var2.u.equals(fVar)) {
                return;
            }
            t0Var2.u = fVar;
            if (t0Var2.V) {
                return;
            }
            t0Var2.v();
            return;
        }
        if (i10 == 6) {
            b2.g gVar = (b2.g) obj;
            gVar.getClass();
            ((t0) a0Var).A(gVar);
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            t0 t0Var3 = (t0) a0Var;
            t0Var3.T = audioDeviceInfo;
            i0 i0Var = t0Var3.t;
            if (i0Var != null) {
                i0Var.a.setPreferredDevice(audioDeviceInfo);
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
            t0 t0Var4 = (t0) a0Var;
            t0Var4.y = ((Boolean) obj).booleanValue();
            r0 r0Var = new r0(t0Var4.D() ? b2.z0.d : t0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (t0Var4.p()) {
                t0Var4.v = r0Var;
                return;
            } else {
                t0Var4.w = r0Var;
                return;
            }
        }
        if (i10 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((t0) a0Var).z(intValue);
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
                ((t0) a0Var).y((q) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        t0 t0Var5 = (t0) a0Var;
        t0Var5.getClass();
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (t0Var5.U == intValue2) {
            return;
        }
        t0Var5.U = intValue2;
        t0Var5.v();
    }

    @Override // r2.r
    public final void d0(String str) {
        qf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new hi.t(15, bVar, str));
        }
    }

    @Override // r2.r
    public final i2.f e0(qf.b bVar) {
        b2.w wVar = (b2.w) bVar.c;
        wVar.getClass();
        this.g1 = wVar;
        i2.f e02 = super.e0(bVar);
        qf.b bVar2 = this.a1;
        Handler handler = (Handler) bVar2.b;
        if (handler != null) {
            handler.post(new d2(bVar2, wVar, e02, 1));
        }
        return e02;
    }

    @Override // i2.v0
    public final void f(b2.z0 z0Var) {
        ((t0) this.b1).C(z0Var);
    }

    @Override // r2.r
    public final void f0(b2.w wVar, MediaFormat mediaFormat) {
        b2.w wVar2 = this.h1;
        boolean z10 = true;
        int[] iArr = null;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (this.d0 != null) {
            mediaFormat.getClass();
            String str = wVar.s;
            int i10 = wVar.K;
            int D = "audio/raw".equals(str) ? wVar.M : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? e2.m0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            b2.v vVar = new b2.v();
            vVar.r = b2.v0.n("audio/raw");
            vVar.L = D;
            vVar.M = wVar.N;
            vVar.N = wVar.O;
            vVar.k = wVar.l;
            vVar.a = wVar.a;
            vVar.b = wVar.b;
            vVar.c = e9.n0.u(wVar.c);
            vVar.d = wVar.d;
            vVar.e = wVar.e;
            vVar.f = wVar.f;
            vVar.J = mediaFormat.getInteger("channel-count");
            vVar.K = mediaFormat.getInteger("sample-rate");
            wVar = new b2.w(vVar);
            boolean z11 = this.e1;
            int i11 = wVar.K;
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
            a0 a0Var = this.b1;
            if (i13 >= 29) {
                if (this.y0) {
                    p1 p1Var = this.d;
                    p1Var.getClass();
                    if (p1Var.a != 0) {
                        p1 p1Var2 = this.d;
                        p1Var2.getClass();
                        int i14 = p1Var2.a;
                        t0 t0Var = (t0) a0Var;
                        t0Var.getClass();
                        if (i13 < 29) {
                            z10 = false;
                        }
                        u6.p(z10);
                        t0Var.i = i14;
                    }
                }
                t0 t0Var2 = (t0) a0Var;
                t0Var2.getClass();
                if (i13 < 29) {
                    z10 = false;
                }
                u6.p(z10);
                t0Var2.i = 0;
            }
            ((t0) a0Var).c(wVar, iArr);
        } catch (w e) {
            throw c(e, e.a, false, 5001);
        }
    }

    @Override // r2.r
    public final void g0() {
        this.b1.getClass();
    }

    @Override // i2.v0
    public final b2.z0 h() {
        return ((t0) this.b1).x;
    }

    @Override // r2.r
    public final void i0() {
        ((t0) this.b1).E = true;
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
        t0 t0Var = (t0) this.b1;
        if (t0Var.p()) {
            return t0Var.L && !t0Var.n();
        }
        return true;
    }

    @Override // r2.r
    public final boolean l0(long j10, long j11, r2.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b2.w wVar) {
        int i13;
        int i14;
        byteBuffer.getClass();
        this.p1 = -9223372036854775807L;
        if (this.h1 != null && (i11 & 2) != 0) {
            lVar.getClass();
            lVar.c(i10);
            return true;
        }
        a0 a0Var = this.b1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.f += i12;
            ((t0) a0Var).E = true;
            return true;
        }
        try {
            if (!((t0) a0Var).m(j12, i12, byteBuffer)) {
                this.p1 = j12;
                return false;
            }
            if (lVar != null) {
                lVar.c(i10);
            }
            this.O0.e += i12;
            return true;
        } catch (x e) {
            b2.w wVar2 = this.g1;
            if (this.y0) {
                p1 p1Var = this.d;
                p1Var.getClass();
                if (p1Var.a != 0) {
                    i14 = 5004;
                    throw c(e, wVar2, e.a, i14);
                }
            }
            i14 = 5001;
            throw c(e, wVar2, e.a, i14);
        } catch (z e7) {
            if (this.y0) {
                p1 p1Var2 = this.d;
                p1Var2.getClass();
                if (p1Var2.a != 0) {
                    i13 = 5003;
                    throw c(e7, wVar, e7.b, i13);
                }
            }
            i13 = 5002;
            throw c(e7, wVar, e7.b, i13);
        }
    }

    @Override // i2.b
    public final boolean m() {
        return ((t0) this.b1).n();
    }

    @Override // r2.r, i2.b
    public final void n() {
        qf.b bVar = this.a1;
        this.k1 = true;
        this.g1 = null;
        this.p1 = -9223372036854775807L;
        this.m1 = false;
        try {
            ((t0) this.b1).f();
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
        i2.e eVar = new i2.e();
        this.O0 = eVar;
        qf.b bVar = this.a1;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new s(bVar, eVar, 1));
        }
        p1 p1Var = this.d;
        p1Var.getClass();
        boolean z12 = p1Var.b;
        a0 a0Var = this.b1;
        if (z12) {
            t0 t0Var = (t0) a0Var;
            u6.p(t0Var.P);
            if (!t0Var.V) {
                t0Var.V = true;
                t0Var.v();
            }
        } else {
            t0 t0Var2 = (t0) a0Var;
            if (t0Var2.V) {
                t0Var2.V = false;
                t0Var2.v();
            }
        }
        j2.j jVar = this.f;
        jVar.getClass();
        t0 t0Var3 = (t0) a0Var;
        t0Var3.m = jVar;
        e2.g0 g0Var = this.h;
        g0Var.getClass();
        ((k0) t0Var3.r).g = g0Var;
        t0Var3.n = new w0(this, 0);
    }

    @Override // r2.r
    public final void o0() {
        try {
            ((t0) this.b1).t();
            long j10 = this.P0.f;
            if (j10 != -9223372036854775807L) {
                this.p1 = j10;
            }
        } catch (z e) {
            throw c(e, e.c, e.b, this.y0 ? 5003 : 5002);
        }
    }

    @Override // r2.r, i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((t0) this.b1).f();
        this.i1 = j10;
        this.p1 = -9223372036854775807L;
        this.l1 = false;
        this.m1 = false;
        this.j1 = true;
    }

    @Override // i2.b
    public final void q() {
        r2.j jVar;
        ((k0) ((t0) this.b1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.c1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // i2.b
    public final void r() {
        a0 a0Var = this.b1;
        this.l1 = false;
        this.m1 = false;
        this.p1 = -9223372036854775807L;
        try {
            try {
                this.y0 = false;
                p0();
                n0();
            } finally {
                o1.D(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.k1) {
                this.k1 = false;
                ((t0) a0Var).w();
            }
        }
    }

    @Override // i2.b
    public final void s() {
        ((t0) this.b1).r();
        this.o1 = true;
    }

    @Override // i2.b
    public final void t() {
        F0();
        this.o1 = false;
        ((t0) this.b1).q();
        this.m1 = false;
    }

    @Override // r2.r
    public final boolean y0(b2.w wVar) {
        p1 p1Var = this.d;
        p1Var.getClass();
        if (p1Var.a != 0) {
            int D0 = D0(wVar);
            if ((D0 & 512) != 0) {
                p1 p1Var2 = this.d;
                p1Var2.getClass();
                if (p1Var2.a == 2 || (D0 & 1024) != 0 || (wVar.N == 0 && wVar.O == 0)) {
                    return true;
                }
            }
        }
        return ((t0) this.b1).j(wVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (r2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // r2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(r2.i iVar, b2.w wVar) {
        int i10;
        t0 t0Var;
        x1 g10;
        boolean z10;
        boolean z11;
        int c10 = o1.c(1, 0, 0, 0);
        String str = wVar.s;
        String str2 = wVar.s;
        if (!b2.v0.i(str)) {
            return o1.c(0, 0, 0, 0);
        }
        int i11 = wVar.T;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        a0 a0Var = this.b1;
        if (z13) {
            if (z12) {
                List e = r2.w.e("audio/raw", false, false);
            }
            i10 = D0(wVar);
            if (((t0) a0Var).j(wVar) != 0) {
                return o1.c(4, 8, 32, i10);
            }
            if ("audio/raw".equals(str2) || ((t0) a0Var).j(wVar) != 0) {
                t0Var = (t0) a0Var;
                if (t0Var.j(e2.m0.E(2, wVar.K, wVar.L)) != 0) {
                    if (str2 == null) {
                        g10 = x1.e;
                    } else {
                        if (t0Var.j(wVar) != 0) {
                            List e7 = r2.w.e("audio/raw", false, false);
                            r2.o oVar = e7.isEmpty() ? null : (r2.o) e7.get(0);
                            if (oVar != null) {
                                g10 = e9.n0.y(oVar);
                            }
                        }
                        g10 = r2.w.g(iVar, wVar, false, false);
                    }
                    if (!g10.isEmpty()) {
                        if (!z13) {
                            return o1.c(2, 0, 0, 0);
                        }
                        r2.o oVar2 = (r2.o) g10.get(0);
                        Context context = this.Z0;
                        boolean e10 = oVar2.e(context, wVar);
                        if (!e10) {
                            for (int i13 = 1; i13 < g10.d; i13++) {
                                r2.o oVar3 = (r2.o) g10.get(i13);
                                if (oVar3.e(context, wVar)) {
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
                        if (z10 && oVar2.f(wVar)) {
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
        t0Var = (t0) a0Var;
        if (t0Var.j(e2.m0.E(2, wVar.K, wVar.L)) != 0) {
        }
        return c10;
    }

    @Override // i2.b
    public final i2.v0 i() {
        return this;
    }
}
