package n2;

import a8.b8;
import a8.ia;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import bi.h4;
import bi.s5;
import h9.t1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l2.q1;
import li.j3;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class t0 extends u2.r implements l2.w0 {
    public final Context Z0;
    public final j2.n a1;
    public final x b1;
    public final u2.j c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public e2.u g1;
    public e2.u h1;
    public long i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public boolean o1;
    public long p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, u2.k kVar, Handler handler, l2.c0 c0Var, x xVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        u2.j jVar = Build.VERSION.SDK_INT >= 35 ? new u2.j() : null;
        this.Z0 = context.getApplicationContext();
        this.b1 = xVar;
        this.c1 = jVar;
        this.n1 = -1000;
        this.a1 = new j2.n(handler, c0Var);
        this.p1 = -9223372036854775807L;
    }

    public final int D0(e2.u uVar) {
        f a10;
        q0 q0Var = (q0) this.b1;
        if (q0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((h0) q0Var.r).b(q0Var.i(uVar));
            ia.a aVar = new ia.a();
            aVar.a = b10.a;
            aVar.b = b10.b;
            aVar.c = b10.c;
            a10 = aVar.a();
        }
        if (!a10.a) {
            return 0;
        }
        int i7 = a10.b ? 1536 : 512;
        return a10.c ? i7 | 2048 : i7;
    }

    public final int E0(u2.o oVar, e2.u uVar) {
        if ("OMX.google.raw.decoder".equals(oVar.a) && Build.VERSION.SDK_INT == 23 && !h2.m0.P(this.Z0)) {
            return -1;
        }
        return uVar.t;
    }

    public final void F0() {
        l();
        long h = ((q0) this.b1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.j1) {
                h = Math.max(this.i1, h);
            }
            this.i1 = h;
            this.j1 = false;
        }
    }

    @Override // u2.r
    public final l2.e H(u2.o oVar, e2.u uVar, e2.u uVar2, boolean z9) {
        l2.e b10 = oVar.b(uVar, uVar2);
        int i7 = b10.e;
        if (this.X == null && y0(uVar2)) {
            i7 |= 32768;
        }
        if (E0(oVar, uVar2) > this.d1) {
            i7 |= 64;
        }
        int i10 = i7;
        return new l2.e(oVar.a, uVar, uVar2, i10 != 0 ? 0 : b10.d, i10);
    }

    @Override // u2.r
    public final float P(float f10, e2.u uVar, e2.u[] uVarArr) {
        int i7 = -1;
        for (e2.u uVar2 : uVarArr) {
            int i10 = uVar2.L;
            if (i10 != -1) {
                i7 = Math.max(i7, i10);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return i7 * f10;
    }

    @Override // u2.r
    public final ArrayList Q(u2.i iVar, e2.u uVar, boolean z9) {
        t1 g10;
        if (uVar.s == null) {
            g10 = t1.e;
        } else {
            if (((q0) this.b1).j(uVar) != 0) {
                List e10 = u2.w.e("audio/raw", false, false);
                u2.o oVar = e10.isEmpty() ? null : (u2.o) e10.get(0);
                if (oVar != null) {
                    g10 = h9.i0.u(oVar);
                }
            }
            g10 = u2.w.g(iVar, uVar, z9, false);
        }
        HashMap hashMap = u2.w.a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new s5(new org.telegram.ui.web.a0(10, this.Z0, uVar), 6));
        return arrayList;
    }

    @Override // u2.r
    public final long R(long j3, long j10, boolean z9) {
        q0 q0Var = (q0) this.b1;
        boolean z10 = q0Var.n() && this.p1 != -9223372036854775807L;
        if (this.o1) {
            long g10 = q0Var.g();
            if (this.m1 && z10 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.p1 - j3) / (j() != null ? j().a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.K0) {
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
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b8 T(u2.o oVar, e2.u uVar, MediaCrypto mediaCrypto, float f10) {
        boolean z9;
        String str;
        int i7;
        e2.u[] uVarArr = this.s;
        uVarArr.getClass();
        int E0 = E0(oVar, uVar);
        String str2 = oVar.a;
        int i10 = 0;
        if (uVarArr.length != 1) {
            for (e2.u uVar2 : uVarArr) {
                if (oVar.b(uVar, uVar2).d != 0) {
                    E0 = Math.max(E0, E0(oVar, uVar2));
                }
            }
        }
        this.d1 = E0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z9 = true;
                this.e1 = z9;
                this.f1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = oVar.c;
                int i12 = this.d1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i13 = uVar.K;
                str = uVar.s;
                mediaFormat.setInteger("channel-count", i13);
                int i14 = uVar.L;
                mediaFormat.setInteger("sample-rate", i14);
                h2.a.k(mediaFormat, uVar.v);
                h2.a.j(mediaFormat, "max-input-size", i12);
                mediaFormat.setInteger("priority", 0);
                if (f10 != -1.0f) {
                    if (i11 == 23) {
                        String str5 = Build.MODEL;
                        if (!"ZTE B2017G".equals(str5)) {
                        }
                    }
                    mediaFormat.setFloat("operating-rate", f10);
                }
                if ("audio/ac4".equals(str)) {
                    Pair b10 = h2.g.b(uVar);
                    if (b10 != null) {
                        h2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
                        h2.a.j(mediaFormat, "level", ((Integer) b10.second).intValue());
                    }
                    if (i11 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                x xVar = this.b1;
                if (i11 >= 24) {
                    if (((q0) xVar).j(h2.m0.E(4, uVar.K, i14)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i11 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i11 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.n1));
                }
                if (Objects.equals(str, "audio/iamf")) {
                    o oVar2 = ((q0) xVar).r;
                    b bVar = oVar2 instanceof h0 ? ((h0) oVar2).h : null;
                    int i15 = 12;
                    if (bVar == null) {
                        h2.a.l("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        h9.t0 t0Var = s0.a;
                        h9.i0 i0Var = bVar.d;
                        int size = i0Var.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                i7 = 0;
                                break;
                            }
                            Object obj = i0Var.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            i7 = num.intValue();
                            if (s0.a.contains(num)) {
                                break;
                            }
                        }
                        if (i7 != 0) {
                            i15 = i7;
                        } else {
                            h9.i0 i0Var2 = bVar.c;
                            int size2 = i0Var2.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    break;
                                }
                                Object obj2 = i0Var2.get(i17);
                                i17++;
                                Integer num2 = (Integer) obj2;
                                int intValue = num2.intValue();
                                if (s0.a.contains(num2)) {
                                    i10 = intValue;
                                    break;
                                }
                            }
                            if (i10 != 0) {
                                i15 = i10;
                            }
                        }
                        int bitCount = Integer.bitCount(i15);
                        mediaFormat.setInteger("channel-mask", i15);
                        mediaFormat.setInteger("max-output-channel-count", bitCount);
                    }
                }
                F(mediaFormat);
                this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : uVar;
                return new b8(oVar, mediaFormat, uVar, null, mediaCrypto, this.c1);
            }
        }
        z9 = false;
        this.e1 = z9;
        this.f1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = oVar.c;
        int i122 = this.d1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i132 = uVar.K;
        str = uVar.s;
        mediaFormat2.setInteger("channel-count", i132);
        int i142 = uVar.L;
        mediaFormat2.setInteger("sample-rate", i142);
        h2.a.k(mediaFormat2, uVar.v);
        h2.a.j(mediaFormat2, "max-input-size", i122);
        mediaFormat2.setInteger("priority", 0);
        if (f10 != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        x xVar2 = this.b1;
        if (i11 >= 24) {
        }
        if (i11 >= 32) {
        }
        if (i11 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        F(mediaFormat2);
        this.h1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : uVar;
        return new b8(oVar, mediaFormat2, uVar, null, mediaCrypto, this.c1);
    }

    @Override // u2.r
    public final void U(k2.h hVar) {
        e2.u uVar;
        n0 n0Var;
        if (Build.VERSION.SDK_INT < 29 || (uVar = hVar.a) == null || !Objects.equals(uVar.s, "audio/opus") || !this.y0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        e2.u uVar2 = hVar.a;
        uVar2.getClass();
        int i7 = uVar2.N;
        if (byteBuffer.remaining() == 8) {
            int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            q0 q0Var = (q0) this.b1;
            f0 f0Var = q0Var.t;
            if (f0Var == null || !f0Var.c() || (n0Var = q0Var.p) == null || !((n) n0Var.e).k) {
                return;
            }
            q0Var.t.d(i7, i10);
        }
    }

    @Override // l2.w0
    public final long a() {
        if (this.n == 2) {
            F0();
        }
        return this.i1;
    }

    @Override // u2.r
    public final void a0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new p(nVar, exc, 0));
        }
    }

    @Override // l2.w0
    public final boolean b() {
        boolean z9 = this.l1;
        this.l1 = false;
        return z9;
    }

    @Override // u2.r
    public final void b0(long j3, String str, long j10) {
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new h4(nVar, str, j3, j10, 3));
        }
    }

    @Override // u2.r, l2.b, l2.m1
    public final void c(int i7, Object obj) {
        u2.j jVar;
        x xVar = this.b1;
        if (i7 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            q0 q0Var = (q0) xVar;
            if (q0Var.H != floatValue) {
                q0Var.H = floatValue;
                if (q0Var.p()) {
                    q0Var.t.a.setVolume(q0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            e2.e eVar = (e2.e) obj;
            eVar.getClass();
            q0 q0Var2 = (q0) xVar;
            if (q0Var2.u.equals(eVar)) {
                return;
            }
            q0Var2.u = eVar;
            if (q0Var2.V) {
                return;
            }
            q0Var2.v();
            return;
        }
        if (i7 == 6) {
            e2.f fVar = (e2.f) obj;
            fVar.getClass();
            ((q0) xVar).A(fVar);
            return;
        }
        if (i7 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            q0 q0Var3 = (q0) xVar;
            q0Var3.T = audioDeviceInfo;
            f0 f0Var = q0Var3.t;
            if (f0Var != null) {
                f0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.n1 = ((Integer) obj).intValue();
            u2.l lVar = this.d0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.n1));
                lVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i7 == 9) {
            obj.getClass();
            q0 q0Var4 = (q0) xVar;
            q0Var4.y = ((Boolean) obj).booleanValue();
            o0 o0Var = new o0(q0Var4.D() ? e2.w0.d : q0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (q0Var4.p()) {
                q0Var4.v = o0Var;
                return;
            } else {
                q0Var4.w = o0Var;
                return;
            }
        }
        if (i7 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((q0) xVar).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (jVar = this.c1) == null) {
                return;
            }
            jVar.d(intValue);
            return;
        }
        if (i7 != 19) {
            if (i7 != 20) {
                super.c(i7, obj);
                return;
            } else {
                obj.getClass();
                ((q0) xVar).y((o) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        q0 q0Var5 = (q0) xVar;
        q0Var5.getClass();
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (q0Var5.U == intValue2) {
            return;
        }
        q0Var5.U = intValue2;
        q0Var5.v();
    }

    @Override // u2.r
    public final void c0(l2.c cVar) {
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new j3(10, nVar, cVar));
        }
    }

    @Override // u2.r
    public final void d0(String str) {
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new j3(9, nVar, str));
        }
    }

    @Override // l2.w0
    public final void e(e2.w0 w0Var) {
        ((q0) this.b1).C(w0Var);
    }

    @Override // u2.r
    public final l2.e e0(wf.b bVar) {
        e2.u uVar = (e2.u) bVar.c;
        uVar.getClass();
        this.g1 = uVar;
        l2.e e02 = super.e0(bVar);
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new l2.z0(nVar, uVar, e02, 9));
        }
        return e02;
    }

    @Override // u2.r
    public final void f0(e2.u uVar, MediaFormat mediaFormat) {
        e2.u uVar2 = this.h1;
        boolean z9 = true;
        int[] iArr = null;
        if (uVar2 != null) {
            uVar = uVar2;
        } else if (this.d0 != null) {
            mediaFormat.getClass();
            String str = uVar.s;
            int i7 = uVar.K;
            int D = "audio/raw".equals(str) ? uVar.M : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? h2.m0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            e2.t tVar = new e2.t();
            tVar.r = e2.s0.n("audio/raw");
            tVar.L = D;
            tVar.M = uVar.N;
            tVar.N = uVar.O;
            tVar.k = uVar.l;
            tVar.a = uVar.a;
            tVar.b = uVar.b;
            tVar.c = h9.i0.q(uVar.c);
            tVar.d = uVar.d;
            tVar.e = uVar.e;
            tVar.f = uVar.f;
            tVar.J = mediaFormat.getInteger("channel-count");
            tVar.K = mediaFormat.getInteger("sample-rate");
            uVar = new e2.u(tVar);
            boolean z10 = this.e1;
            int i10 = uVar.K;
            if (z10 && i10 == 6 && i7 < 6) {
                iArr = new int[i7];
                for (int i11 = 0; i11 < i7; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.f1) {
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i12 = Build.VERSION.SDK_INT;
            x xVar = this.b1;
            if (i12 >= 29) {
                if (this.y0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i13 = q1Var2.a;
                        q0 q0Var = (q0) xVar;
                        q0Var.getClass();
                        if (i12 < 29) {
                            z9 = false;
                        }
                        ia.p(z9);
                        q0Var.i = i13;
                    }
                }
                q0 q0Var2 = (q0) xVar;
                q0Var2.getClass();
                if (i12 < 29) {
                    z9 = false;
                }
                ia.p(z9);
                q0Var2.i = 0;
            }
            ((q0) xVar).c(uVar, iArr);
        } catch (t e10) {
            throw d(e10, e10.a, false, 5001);
        }
    }

    @Override // u2.r
    public final void g0() {
        this.b1.getClass();
    }

    @Override // l2.b
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // u2.r
    public final void i0() {
        ((q0) this.b1).E = true;
    }

    @Override // l2.w0
    public final e2.w0 j() {
        return ((q0) this.b1).x;
    }

    @Override // l2.b
    public final boolean l() {
        if (!this.K0) {
            return false;
        }
        q0 q0Var = (q0) this.b1;
        if (q0Var.p()) {
            return q0Var.L && !q0Var.n();
        }
        return true;
    }

    @Override // u2.r
    public final boolean l0(long j3, long j10, u2.l lVar, ByteBuffer byteBuffer, int i7, int i10, int i11, long j11, boolean z9, boolean z10, e2.u uVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.p1 = -9223372036854775807L;
        if (this.h1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.c(i7);
            return true;
        }
        x xVar = this.b1;
        if (z9) {
            if (lVar != null) {
                lVar.c(i7);
            }
            this.O0.f += i11;
            ((q0) xVar).E = true;
            return true;
        }
        try {
            if (!((q0) xVar).m(j11, i11, byteBuffer)) {
                this.p1 = j11;
                return false;
            }
            if (lVar != null) {
                lVar.c(i7);
            }
            this.O0.e += i11;
            return true;
        } catch (u e10) {
            e2.u uVar2 = this.g1;
            if (this.y0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.a != 0) {
                    i13 = 5004;
                    throw d(e10, uVar2, e10.a, i13);
                }
            }
            i13 = 5001;
            throw d(e10, uVar2, e10.a, i13);
        } catch (w e11) {
            if (this.y0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.a != 0) {
                    i12 = 5003;
                    throw d(e11, uVar, e11.b, i12);
                }
            }
            i12 = 5002;
            throw d(e11, uVar, e11.b, i12);
        }
    }

    @Override // l2.b
    public final boolean m() {
        return ((q0) this.b1).n();
    }

    @Override // u2.r, l2.b
    public final void n() {
        j2.n nVar = this.a1;
        this.k1 = true;
        this.g1 = null;
        this.p1 = -9223372036854775807L;
        this.m1 = false;
        try {
            ((q0) this.b1).f();
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

    @Override // l2.b
    public final void o(boolean z9, boolean z10) {
        l2.d dVar = new l2.d();
        this.O0 = dVar;
        j2.n nVar = this.a1;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new q(nVar, dVar, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z11 = q1Var.b;
        x xVar = this.b1;
        if (z11) {
            q0 q0Var = (q0) xVar;
            ia.p(q0Var.P);
            if (!q0Var.V) {
                q0Var.V = true;
                q0Var.v();
            }
        } else {
            q0 q0Var2 = (q0) xVar;
            if (q0Var2.V) {
                q0Var2.V = false;
                q0Var2.v();
            }
        }
        m2.j jVar = this.f;
        jVar.getClass();
        q0 q0Var3 = (q0) xVar;
        q0Var3.m = jVar;
        h2.g0 g0Var = this.h;
        g0Var.getClass();
        ((h0) q0Var3.r).g = g0Var;
        q0Var3.n = new g6.d0(this, 20);
    }

    @Override // u2.r
    public final void o0() {
        try {
            ((q0) this.b1).t();
            long j3 = this.P0.f;
            if (j3 != -9223372036854775807L) {
                this.p1 = j3;
            }
        } catch (w e10) {
            throw d(e10, e10.c, e10.b, this.y0 ? 5003 : 5002);
        }
    }

    @Override // u2.r, l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        super.p(j3, z9, z10);
        ((q0) this.b1).f();
        this.i1 = j3;
        this.p1 = -9223372036854775807L;
        this.l1 = false;
        this.m1 = false;
        this.j1 = true;
    }

    @Override // l2.b
    public final void q() {
        u2.j jVar;
        ((h0) ((q0) this.b1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.c1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // l2.b
    public final void r() {
        x xVar = this.b1;
        this.l1 = false;
        this.m1 = false;
        this.p1 = -9223372036854775807L;
        try {
            try {
                this.y0 = false;
                p0();
                n0();
            } finally {
                f1.B(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.k1) {
                this.k1 = false;
                ((q0) xVar).w();
            }
        }
    }

    @Override // l2.b
    public final void s() {
        ((q0) this.b1).r();
        this.o1 = true;
    }

    @Override // l2.b
    public final void t() {
        F0();
        this.o1 = false;
        ((q0) this.b1).q();
        this.m1 = false;
    }

    @Override // u2.r
    public final boolean y0(e2.u uVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.a != 0) {
            int D0 = D0(uVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.a == 2 || (D0 & 1024) != 0 || (uVar.N == 0 && uVar.O == 0)) {
                    return true;
                }
            }
        }
        return ((q0) this.b1).j(uVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (u2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(u2.i iVar, e2.u uVar) {
        int i7;
        q0 q0Var;
        t1 g10;
        boolean z9;
        boolean z10;
        int b10 = jg.g.b(1, 0, 0, 0);
        String str = uVar.s;
        String str2 = uVar.s;
        if (!e2.s0.i(str)) {
            return jg.g.b(0, 0, 0, 0);
        }
        int i10 = uVar.T;
        boolean z11 = i10 != 0;
        boolean z12 = i10 == 0 || i10 == 2;
        int i11 = 8;
        x xVar = this.b1;
        if (z12) {
            if (z11) {
                List e10 = u2.w.e("audio/raw", false, false);
            }
            i7 = D0(uVar);
            if (((q0) xVar).j(uVar) != 0) {
                return jg.g.b(4, 8, 32, i7);
            }
            if ("audio/raw".equals(str2) || ((q0) xVar).j(uVar) != 0) {
                q0Var = (q0) xVar;
                if (q0Var.j(h2.m0.E(2, uVar.K, uVar.L)) != 0) {
                    if (str2 == null) {
                        g10 = t1.e;
                    } else {
                        if (q0Var.j(uVar) != 0) {
                            List e11 = u2.w.e("audio/raw", false, false);
                            u2.o oVar = e11.isEmpty() ? null : (u2.o) e11.get(0);
                            if (oVar != null) {
                                g10 = h9.i0.u(oVar);
                            }
                        }
                        g10 = u2.w.g(iVar, uVar, false, false);
                    }
                    if (!g10.isEmpty()) {
                        if (!z12) {
                            return jg.g.b(2, 0, 0, 0);
                        }
                        u2.o oVar2 = (u2.o) g10.get(0);
                        Context context = this.Z0;
                        boolean e12 = oVar2.e(context, uVar);
                        if (!e12) {
                            for (int i12 = 1; i12 < g10.d; i12++) {
                                u2.o oVar3 = (u2.o) g10.get(i12);
                                if (oVar3.e(context, uVar)) {
                                    z10 = false;
                                    oVar2 = oVar3;
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        z9 = e12;
                        z10 = true;
                        int i13 = z9 ? 4 : 3;
                        if (z9 && oVar2.f(uVar)) {
                            i11 = 16;
                        }
                        return (oVar2.g ? 64 : 0) | i13 | i11 | 32 | (z10 ? 128 : 0) | i7;
                    }
                }
            }
            return b10;
        }
        i7 = 0;
        if ("audio/raw".equals(str2)) {
        }
        q0Var = (q0) xVar;
        if (q0Var.j(h2.m0.E(2, uVar.K, uVar.L)) != 0) {
        }
        return b10;
    }

    @Override // l2.b
    public final l2.w0 h() {
        return this;
    }
}
