package m2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import b8.zb;
import ci.y4;
import g9.s1;
import gi.v5;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k2.p1;
import k2.q1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 extends t2.r implements k2.w0 {
    public final Context a1;
    public final t b1;
    public final z c1;
    public final t2.j d1;
    public int e1;
    public boolean f1;
    public boolean g1;
    public d2.v h1;
    public d2.v i1;
    public long j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public int o1;
    public boolean p1;
    public long q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, t2.k kVar, Handler handler, k2.c0 c0Var, z zVar) {
        super(context.getApplicationContext(), 1, kVar, 44100.0f);
        t2.j jVar = Build.VERSION.SDK_INT >= 35 ? new t2.j() : null;
        this.a1 = context.getApplicationContext();
        this.c1 = zVar;
        this.d1 = jVar;
        this.o1 = -1000;
        this.b1 = new t(handler, c0Var);
        this.q1 = -9223372036854775807L;
    }

    public final int D0(d2.v vVar) {
        f a10;
        s0 s0Var = (s0) this.c1;
        if (s0Var.X) {
            a10 = f.d;
        } else {
            k b10 = ((j0) s0Var.r).b(s0Var.i(vVar));
            ha.a aVar = new ha.a();
            aVar.a = b10.a;
            aVar.b = b10.b;
            aVar.c = b10.c;
            a10 = aVar.a();
        }
        if (!a10.a) {
            return 0;
        }
        int i3 = a10.b ? 1536 : 512;
        return a10.c ? i3 | 2048 : i3;
    }

    public final int E0(t2.o oVar, d2.v vVar) {
        if ("OMX.google.raw.decoder".equals(oVar.a) && Build.VERSION.SDK_INT == 23 && !g2.n0.P(this.a1)) {
            return -1;
        }
        return vVar.t;
    }

    public final void F0() {
        l();
        long h = ((s0) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.k1) {
                h = Math.max(this.j1, h);
            }
            this.j1 = h;
            this.k1 = false;
        }
    }

    @Override // t2.r
    public final k2.e H(t2.o oVar, d2.v vVar, d2.v vVar2, boolean z10) {
        k2.e b10 = oVar.b(vVar, vVar2);
        int i3 = b10.e;
        if (this.Y == null && y0(vVar2)) {
            i3 |= 32768;
        }
        if (E0(oVar, vVar2) > this.e1) {
            i3 |= 64;
        }
        int i10 = i3;
        return new k2.e(oVar.a, vVar, vVar2, i10 != 0 ? 0 : b10.d, i10);
    }

    @Override // t2.r
    public final float P(float f10, d2.v vVar, d2.v[] vVarArr) {
        int i3 = -1;
        for (d2.v vVar2 : vVarArr) {
            int i10 = vVar2.L;
            if (i10 != -1) {
                i3 = Math.max(i3, i10);
            }
        }
        if (i3 == -1) {
            return -1.0f;
        }
        return i3 * f10;
    }

    @Override // t2.r
    public final ArrayList Q(t2.i iVar, d2.v vVar, boolean z10) {
        s1 g7;
        if (vVar.s == null) {
            g7 = s1.e;
        } else {
            if (((s0) this.c1).j(vVar) != 0) {
                List e10 = t2.w.e("audio/raw", false, false);
                t2.o oVar = e10.isEmpty() ? null : (t2.o) e10.get(0);
                if (oVar != null) {
                    g7 = g9.i0.u(oVar);
                }
            }
            g7 = t2.w.g(iVar, vVar, z10, false);
        }
        HashMap hashMap = t2.w.a;
        ArrayList arrayList = new ArrayList(g7);
        Collections.sort(arrayList, new y4(new na1(11, this.a1, vVar), 4));
        return arrayList;
    }

    @Override // t2.r
    public final long R(long j10, long j11, boolean z10) {
        s0 s0Var = (s0) this.c1;
        boolean z11 = s0Var.n() && this.q1 != -9223372036854775807L;
        if (this.p1) {
            long g7 = s0Var.g();
            if (this.n1 && z11 && g7 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g7, this.q1 - j10) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z11 || this.L0) {
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
    @Override // t2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l2.e T(t2.o oVar, d2.v vVar, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        String str;
        int i3;
        d2.v[] vVarArr = this.s;
        vVarArr.getClass();
        int E0 = E0(oVar, vVar);
        String str2 = oVar.a;
        int i10 = 0;
        if (vVarArr.length != 1) {
            for (d2.v vVar2 : vVarArr) {
                if (oVar.b(vVar, vVar2).d != 0) {
                    E0 = Math.max(E0, E0(oVar, vVar2));
                }
            }
        }
        this.e1 = E0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z10 = true;
                this.f1 = z10;
                this.g1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = oVar.c;
                int i12 = this.e1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i13 = vVar.K;
                str = vVar.s;
                mediaFormat.setInteger("channel-count", i13);
                int i14 = vVar.L;
                mediaFormat.setInteger("sample-rate", i14);
                g2.a.k(mediaFormat, vVar.v);
                g2.a.j(mediaFormat, "max-input-size", i12);
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
                    Pair b10 = g2.h.b(vVar);
                    if (b10 != null) {
                        g2.a.j(mediaFormat, "profile", ((Integer) b10.first).intValue());
                        g2.a.j(mediaFormat, "level", ((Integer) b10.second).intValue());
                    }
                    if (i11 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                z zVar = this.c1;
                if (i11 >= 24) {
                    if (((s0) zVar).j(g2.n0.E(4, vVar.K, i14)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i11 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i11 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.o1));
                }
                if (Objects.equals(str, "audio/iamf")) {
                    o oVar2 = ((s0) zVar).r;
                    b bVar = oVar2 instanceof j0 ? ((j0) oVar2).h : null;
                    int i15 = 12;
                    if (bVar == null) {
                        g2.a.l("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        g9.t0 t0Var = u0.a;
                        g9.i0 i0Var = bVar.d;
                        int size = i0Var.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                i3 = 0;
                                break;
                            }
                            Object obj = i0Var.get(i16);
                            i16++;
                            Integer num = (Integer) obj;
                            i3 = num.intValue();
                            if (u0.a.contains(num)) {
                                break;
                            }
                        }
                        if (i3 != 0) {
                            i15 = i3;
                        } else {
                            g9.i0 i0Var2 = bVar.c;
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
                                if (u0.a.contains(num2)) {
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
                this.i1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : vVar;
                return new l2.e(oVar, mediaFormat, vVar, null, mediaCrypto, this.d1);
            }
        }
        z10 = false;
        this.f1 = z10;
        this.g1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = oVar.c;
        int i122 = this.e1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i132 = vVar.K;
        str = vVar.s;
        mediaFormat2.setInteger("channel-count", i132);
        int i142 = vVar.L;
        mediaFormat2.setInteger("sample-rate", i142);
        g2.a.k(mediaFormat2, vVar.v);
        g2.a.j(mediaFormat2, "max-input-size", i122);
        mediaFormat2.setInteger("priority", 0);
        if (f10 != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        z zVar2 = this.c1;
        if (i11 >= 24) {
        }
        if (i11 >= 32) {
        }
        if (i11 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        F(mediaFormat2);
        this.i1 = ("audio/raw".equals(oVar.b) || "audio/raw".equals(str)) ? null : vVar;
        return new l2.e(oVar, mediaFormat2, vVar, null, mediaCrypto, this.d1);
    }

    @Override // t2.r
    public final void U(j2.h hVar) {
        d2.v vVar;
        p0 p0Var;
        if (Build.VERSION.SDK_INT < 29 || (vVar = hVar.a) == null || !Objects.equals(vVar.s, "audio/opus") || !this.z0) {
            return;
        }
        ByteBuffer byteBuffer = hVar.f;
        byteBuffer.getClass();
        d2.v vVar2 = hVar.a;
        vVar2.getClass();
        int i3 = vVar2.N;
        if (byteBuffer.remaining() == 8) {
            int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            s0 s0Var = (s0) this.c1;
            h0 h0Var = s0Var.t;
            if (h0Var == null || !h0Var.c() || (p0Var = s0Var.p) == null || !((n) p0Var.e).k) {
                return;
            }
            s0Var.t.d(i3, i10);
        }
    }

    @Override // k2.w0
    public final long a() {
        if (this.n == 2) {
            F0();
        }
        return this.j1;
    }

    @Override // t2.r
    public final void a0(Exception exc) {
        g2.a.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new p(tVar, exc, 0));
        }
    }

    @Override // k2.w0
    public final boolean b() {
        boolean z10 = this.m1;
        this.m1 = false;
        return z10;
    }

    @Override // t2.r
    public final void b0(long j10, String str, long j11) {
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new c3.f0(tVar, str, j10, j11, 3));
        }
    }

    @Override // k2.w0
    public final void c(d2.y0 y0Var) {
        ((s0) this.c1).C(y0Var);
    }

    @Override // t2.r
    public final void c0(k2.c cVar) {
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new s(0, tVar, cVar));
        }
    }

    @Override // t2.r, k2.b, k2.l1
    public final void d(int i3, Object obj) {
        t2.j jVar;
        z zVar = this.c1;
        if (i3 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            s0 s0Var = (s0) zVar;
            if (s0Var.H != floatValue) {
                s0Var.H = floatValue;
                if (s0Var.p()) {
                    s0Var.t.a.setVolume(s0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 3) {
            d2.f fVar = (d2.f) obj;
            fVar.getClass();
            s0 s0Var2 = (s0) zVar;
            if (s0Var2.u.equals(fVar)) {
                return;
            }
            s0Var2.u = fVar;
            if (s0Var2.V) {
                return;
            }
            s0Var2.v();
            return;
        }
        if (i3 == 6) {
            d2.g gVar = (d2.g) obj;
            gVar.getClass();
            ((s0) zVar).A(gVar);
            return;
        }
        if (i3 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            s0 s0Var3 = (s0) zVar;
            s0Var3.T = audioDeviceInfo;
            h0 h0Var = s0Var3.t;
            if (h0Var != null) {
                h0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i3 == 16) {
            obj.getClass();
            this.o1 = ((Integer) obj).intValue();
            t2.l lVar = this.e0;
            if (lVar != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.o1));
                lVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i3 == 9) {
            obj.getClass();
            s0 s0Var4 = (s0) zVar;
            s0Var4.y = ((Boolean) obj).booleanValue();
            q0 q0Var = new q0(s0Var4.D() ? d2.y0.d : s0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (s0Var4.p()) {
                s0Var4.v = q0Var;
                return;
            } else {
                s0Var4.w = q0Var;
                return;
            }
        }
        if (i3 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((s0) zVar).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (jVar = this.d1) == null) {
                return;
            }
            jVar.d(intValue);
            return;
        }
        if (i3 != 19) {
            if (i3 != 20) {
                super.d(i3, obj);
                return;
            } else {
                obj.getClass();
                ((s0) zVar).y((o) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        s0 s0Var5 = (s0) zVar;
        s0Var5.getClass();
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (s0Var5.U == intValue2) {
            return;
        }
        s0Var5.U = intValue2;
        s0Var5.v();
    }

    @Override // t2.r
    public final void d0(String str) {
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new ii.e(29, tVar, str));
        }
    }

    @Override // t2.r
    public final k2.e e0(tf.b bVar) {
        d2.v vVar = (d2.v) bVar.b;
        vVar.getClass();
        this.h1 = vVar;
        k2.e e02 = super.e0(bVar);
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new lg.y(tVar, vVar, e02, 5));
        }
        return e02;
    }

    @Override // t2.r
    public final void f0(d2.v vVar, MediaFormat mediaFormat) {
        d2.v vVar2 = this.i1;
        boolean z10 = true;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (this.e0 != null) {
            mediaFormat.getClass();
            String str = vVar.s;
            int i3 = vVar.K;
            int D = "audio/raw".equals(str) ? vVar.M : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? g2.n0.D(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            d2.u uVar = new d2.u();
            uVar.r = d2.u0.n("audio/raw");
            uVar.L = D;
            uVar.M = vVar.N;
            uVar.N = vVar.O;
            uVar.k = vVar.l;
            uVar.a = vVar.a;
            uVar.b = vVar.b;
            uVar.c = g9.i0.q(vVar.c);
            uVar.d = vVar.d;
            uVar.e = vVar.e;
            uVar.f = vVar.f;
            uVar.J = mediaFormat.getInteger("channel-count");
            uVar.K = mediaFormat.getInteger("sample-rate");
            vVar = new d2.v(uVar);
            boolean z11 = this.f1;
            int i10 = vVar.K;
            if (z11 && i10 == 6 && i3 < 6) {
                iArr = new int[i3];
                for (int i11 = 0; i11 < i3; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.g1) {
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
            z zVar = this.c1;
            if (i12 >= 29) {
                if (this.z0) {
                    q1 q1Var = this.d;
                    q1Var.getClass();
                    if (q1Var.a != 0) {
                        q1 q1Var2 = this.d;
                        q1Var2.getClass();
                        int i13 = q1Var2.a;
                        s0 s0Var = (s0) zVar;
                        s0Var.getClass();
                        if (i12 < 29) {
                            z10 = false;
                        }
                        zb.p(z10);
                        s0Var.i = i13;
                    }
                }
                s0 s0Var2 = (s0) zVar;
                s0Var2.getClass();
                if (i12 < 29) {
                    z10 = false;
                }
                zb.p(z10);
                s0Var2.i = 0;
            }
            ((s0) zVar).c(vVar, iArr);
        } catch (v e10) {
            throw e(e10, e10.a, false, 5001);
        }
    }

    @Override // k2.w0
    public final d2.y0 g() {
        return ((s0) this.c1).x;
    }

    @Override // t2.r
    public final void g0() {
        this.c1.getClass();
    }

    @Override // t2.r
    public final void i0() {
        ((s0) this.c1).E = true;
    }

    @Override // k2.b
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        if (!this.L0) {
            return false;
        }
        s0 s0Var = (s0) this.c1;
        if (s0Var.p()) {
            return s0Var.L && !s0Var.n();
        }
        return true;
    }

    @Override // t2.r
    public final boolean l0(long j10, long j11, t2.l lVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j12, boolean z10, boolean z11, d2.v vVar) {
        int i12;
        int i13;
        byteBuffer.getClass();
        this.q1 = -9223372036854775807L;
        if (this.i1 != null && (i10 & 2) != 0) {
            lVar.getClass();
            lVar.c(i3);
            return true;
        }
        z zVar = this.c1;
        if (z10) {
            if (lVar != null) {
                lVar.c(i3);
            }
            this.P0.f += i11;
            ((s0) zVar).E = true;
            return true;
        }
        try {
            if (!((s0) zVar).m(j12, i11, byteBuffer)) {
                this.q1 = j12;
                return false;
            }
            if (lVar != null) {
                lVar.c(i3);
            }
            this.P0.e += i11;
            return true;
        } catch (w e10) {
            d2.v vVar2 = this.h1;
            if (this.z0) {
                q1 q1Var = this.d;
                q1Var.getClass();
                if (q1Var.a != 0) {
                    i13 = 5004;
                    throw e(e10, vVar2, e10.a, i13);
                }
            }
            i13 = 5001;
            throw e(e10, vVar2, e10.a, i13);
        } catch (y e11) {
            if (this.z0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.a != 0) {
                    i12 = 5003;
                    throw e(e11, vVar, e11.b, i12);
                }
            }
            i12 = 5002;
            throw e(e11, vVar, e11.b, i12);
        }
    }

    @Override // k2.b
    public final boolean m() {
        return ((s0) this.c1).n();
    }

    @Override // t2.r, k2.b
    public final void n() {
        t tVar = this.b1;
        this.l1 = true;
        this.h1 = null;
        this.q1 = -9223372036854775807L;
        this.n1 = false;
        try {
            ((s0) this.c1).f();
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

    @Override // k2.b
    public final void o(boolean z10, boolean z11) {
        k2.d dVar = new k2.d();
        this.P0 = dVar;
        t tVar = this.b1;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new q(tVar, dVar, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.b;
        z zVar = this.c1;
        if (z12) {
            s0 s0Var = (s0) zVar;
            zb.p(s0Var.P);
            if (!s0Var.V) {
                s0Var.V = true;
                s0Var.v();
            }
        } else {
            s0 s0Var2 = (s0) zVar;
            if (s0Var2.V) {
                s0Var2.V = false;
                s0Var2.v();
            }
        }
        l2.k kVar = this.f;
        kVar.getClass();
        s0 s0Var3 = (s0) zVar;
        s0Var3.m = kVar;
        g2.h0 h0Var = this.h;
        h0Var.getClass();
        ((j0) s0Var3.r).g = h0Var;
        s0Var3.n = new v5(this, 14);
    }

    @Override // t2.r
    public final void o0() {
        try {
            ((s0) this.c1).t();
            long j10 = this.Q0.f;
            if (j10 != -9223372036854775807L) {
                this.q1 = j10;
            }
        } catch (y e10) {
            throw e(e10, e10.c, e10.b, this.z0 ? 5003 : 5002);
        }
    }

    @Override // t2.r, k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        super.p(j10, z10, z11);
        ((s0) this.c1).f();
        this.j1 = j10;
        this.q1 = -9223372036854775807L;
        this.m1 = false;
        this.n1 = false;
        this.k1 = true;
    }

    @Override // k2.b
    public final void q() {
        t2.j jVar;
        ((j0) ((s0) this.c1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (jVar = this.d1) == null) {
            return;
        }
        jVar.b();
    }

    @Override // k2.b
    public final void r() {
        z zVar = this.c1;
        this.m1 = false;
        this.n1 = false;
        this.q1 = -9223372036854775807L;
        try {
            try {
                this.z0 = false;
                p0();
                n0();
            } finally {
                f1.E(this.Y, null);
                this.Y = null;
            }
        } finally {
            if (this.l1) {
                this.l1 = false;
                ((s0) zVar).w();
            }
        }
    }

    @Override // k2.b
    public final void s() {
        ((s0) this.c1).r();
        this.p1 = true;
    }

    @Override // k2.b
    public final void t() {
        F0();
        this.p1 = false;
        ((s0) this.c1).q();
        this.n1 = false;
    }

    @Override // t2.r
    public final boolean y0(d2.v vVar) {
        q1 q1Var = this.d;
        q1Var.getClass();
        if (q1Var.a != 0) {
            int D0 = D0(vVar);
            if ((D0 & 512) != 0) {
                q1 q1Var2 = this.d;
                q1Var2.getClass();
                if (q1Var2.a == 2 || (D0 & 1024) != 0 || (vVar.N == 0 && vVar.O == 0)) {
                    return true;
                }
            }
        }
        return ((s0) this.c1).j(vVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if ((r7.isEmpty() ? null : (t2.o) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @Override // t2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z0(t2.i iVar, d2.v vVar) {
        int i3;
        s0 s0Var;
        s1 g7;
        boolean z10;
        boolean z11;
        int a10 = p1.a(1, 0, 0, 0);
        String str = vVar.s;
        String str2 = vVar.s;
        if (!d2.u0.i(str)) {
            return p1.a(0, 0, 0, 0);
        }
        int i10 = vVar.T;
        boolean z12 = i10 != 0;
        boolean z13 = i10 == 0 || i10 == 2;
        int i11 = 8;
        z zVar = this.c1;
        if (z13) {
            if (z12) {
                List e10 = t2.w.e("audio/raw", false, false);
            }
            i3 = D0(vVar);
            if (((s0) zVar).j(vVar) != 0) {
                return p1.a(4, 8, 32, i3);
            }
            if ("audio/raw".equals(str2) || ((s0) zVar).j(vVar) != 0) {
                s0Var = (s0) zVar;
                if (s0Var.j(g2.n0.E(2, vVar.K, vVar.L)) != 0) {
                    if (str2 == null) {
                        g7 = s1.e;
                    } else {
                        if (s0Var.j(vVar) != 0) {
                            List e11 = t2.w.e("audio/raw", false, false);
                            t2.o oVar = e11.isEmpty() ? null : (t2.o) e11.get(0);
                            if (oVar != null) {
                                g7 = g9.i0.u(oVar);
                            }
                        }
                        g7 = t2.w.g(iVar, vVar, false, false);
                    }
                    if (!g7.isEmpty()) {
                        if (!z13) {
                            return p1.a(2, 0, 0, 0);
                        }
                        t2.o oVar2 = (t2.o) g7.get(0);
                        Context context = this.a1;
                        boolean e12 = oVar2.e(context, vVar);
                        if (!e12) {
                            for (int i12 = 1; i12 < g7.d; i12++) {
                                t2.o oVar3 = (t2.o) g7.get(i12);
                                if (oVar3.e(context, vVar)) {
                                    z11 = false;
                                    oVar2 = oVar3;
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        z10 = e12;
                        z11 = true;
                        int i13 = z10 ? 4 : 3;
                        if (z10 && oVar2.f(vVar)) {
                            i11 = 16;
                        }
                        return (oVar2.g ? 64 : 0) | i13 | i11 | 32 | (z11 ? 128 : 0) | i3;
                    }
                }
            }
            return a10;
        }
        i3 = 0;
        if ("audio/raw".equals(str2)) {
        }
        s0Var = (s0) zVar;
        if (s0Var.j(g2.n0.E(2, vVar.K, vVar.L)) != 0) {
        }
        return a10;
    }

    @Override // k2.b
    public final k2.w0 i() {
        return this;
    }
}
