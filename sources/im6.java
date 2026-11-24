// default package

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class im6 extends om6 implements fm6 {
    public final Context a1;
    public final lx6 b1;
    public final x40 c1;
    public final bi6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public go4 i1;
    public go4 j1;
    public long k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public int p1;
    public boolean q1;
    public long r1;
    public long s1;
    public boolean t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im6(Context context, gm6 gm6Var, Handler handler, c74 c74Var, x40 x40Var) {
        super(context.getApplicationContext(), 1, gm6Var);
        bi6 bi6Var = Build.VERSION.SDK_INT >= 35 ? new bi6() : null;
        this.a1 = context.getApplicationContext();
        this.c1 = x40Var;
        this.d1 = bi6Var;
        this.p1 = -1000;
        this.b1 = new lx6(handler, c74Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static y79 L0(go4 go4Var, boolean z, x40 x40Var) {
        if (go4Var.t == null) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        if (((cb3) x40Var).j(go4Var) != 0) {
            List e = tm6.e("audio/raw", false, false);
            lm6 lm6Var = e.isEmpty() ? null : (lm6) e.get(0);
            if (lm6Var != null) {
                return mo5.u(lm6Var);
            }
        }
        return tm6.g(go4Var, z, false);
    }

    @Override // om6
    public final boolean E0(go4 go4Var) {
        f99 f99Var = this.d;
        f99Var.getClass();
        if (f99Var.a != 0) {
            int J0 = J0(go4Var);
            if ((J0 & 512) != 0) {
                f99 f99Var2 = this.d;
                f99Var2.getClass();
                if (f99Var2.a == 2 || (J0 & 1024) != 0 || (go4Var.R == 0 && go4Var.S == 0)) {
                    return true;
                }
            }
        }
        return ((cb3) this.c1).j(go4Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r4.isEmpty() ? null : (lm6) r4.get(0)) != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // om6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(go4 go4Var) {
        int i;
        boolean z;
        boolean z2 = true;
        int a = kt6.a(1, 0, 0, 0);
        if (!wf7.i(go4Var.t)) {
            return kt6.a(0, 0, 0, 0);
        }
        int i2 = go4Var.X;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        x40 x40Var = this.c1;
        if (z4) {
            if (z3) {
                List e = tm6.e("audio/raw", false, false);
            }
            i = J0(go4Var);
            if (((cb3) x40Var).j(go4Var) != 0) {
                return kt6.a(4, 8, 32, i);
            }
            if ("audio/raw".equals(go4Var.t) || ((cb3) x40Var).j(go4Var) != 0) {
                if (((cb3) x40Var).j(hac.G(2, go4Var.N, go4Var.P)) != 0) {
                    y79 L0 = L0(go4Var, false, x40Var);
                    if (!L0.isEmpty()) {
                        if (!z4) {
                            return kt6.a(2, 0, 0, 0);
                        }
                        lm6 lm6Var = (lm6) L0.get(0);
                        Context context = this.a1;
                        boolean e2 = lm6Var.e(context, go4Var);
                        if (!e2) {
                            for (int i4 = 1; i4 < L0.d; i4++) {
                                lm6 lm6Var2 = (lm6) L0.get(i4);
                                if (lm6Var2.e(context, go4Var)) {
                                    z = false;
                                    lm6Var = lm6Var2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        z2 = e2;
                        int i5 = z2 ? 4 : 3;
                        if (z2 && lm6Var.f(go4Var)) {
                            i3 = 16;
                        }
                        return i5 | i3 | 32 | (lm6Var.g ? 64 : 0) | (z ? 128 : 0) | i;
                    }
                }
            }
            return a;
        }
        i = 0;
        if ("audio/raw".equals(go4Var.t)) {
        }
        if (((cb3) x40Var).j(hac.G(2, go4Var.N, go4Var.P)) != 0) {
        }
        return a;
    }

    public final int J0(go4 go4Var) {
        k10 a;
        cb3 cb3Var = (cb3) this.c1;
        if (cb3Var.a0) {
            a = k10.d;
        } else {
            o10 b = ((l50) cb3Var.r).b(cb3Var.i(go4Var));
            j10 j10Var = new j10();
            j10Var.a = b.a;
            j10Var.b = b.b;
            j10Var.c = b.c;
            a = j10Var.a();
        }
        if (!a.a) {
            return 0;
        }
        int i = a.b ? 1536 : 512;
        return a.c ? i | 2048 : i;
    }

    public final int K0(lm6 lm6Var, go4 go4Var) {
        if ("OMX.google.raw.decoder".equals(lm6Var.a) && Build.VERSION.SDK_INT == 23 && !hac.Q(this.a1)) {
            return -1;
        }
        return go4Var.u;
    }

    @Override // om6
    public pa3 M(lm6 lm6Var, go4 go4Var, go4 go4Var2, boolean z) {
        pa3 b = lm6Var.b(go4Var, go4Var2);
        int i = b.e;
        if (this.X == null && E0(go4Var2)) {
            i |= 32768;
        }
        if (K0(lm6Var, go4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        return new pa3(lm6Var.a, go4Var, go4Var2, i2 != 0 ? (byte) 0 : b.d, i2);
    }

    public final void M0() {
        n();
        long h = ((cb3) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override // om6
    public final ArrayList W(go4 go4Var, boolean z) {
        y79 L0 = L0(go4Var, z, this.c1);
        HashMap hashMap = tm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new i01(new nv4(this.a1, go4Var, (byte) 26), (byte) 4));
        return arrayList;
    }

    @Override // om6
    public final long X(long j, long j2, boolean z) {
        cb3 cb3Var = (cb3) this.c1;
        boolean z2 = cb3Var.n() && this.r1 != -9223372036854775807L;
        if (this.q1) {
            long g = cb3Var.g();
            if (this.o1 && z2 && g != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g, this.r1 - j) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.K0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if ("AXON 7 mini".equals(r7) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    @Override // om6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final eq Z(lm6 lm6Var, go4 go4Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        String str;
        int i;
        go4[] go4VarArr = this.s;
        go4VarArr.getClass();
        int K0 = K0(lm6Var, go4Var);
        String str2 = lm6Var.a;
        int i2 = 0;
        if (go4VarArr.length != 1) {
            for (go4 go4Var2 : go4VarArr) {
                if (lm6Var.b(go4Var, go4Var2).d != 0) {
                    K0 = Math.max(K0, K0(lm6Var, go4Var2));
                }
            }
        }
        this.f1 = K0;
        HashSet hashSet = ct6.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z = true;
                this.g1 = z;
                this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = lm6Var.c;
                int i4 = this.f1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i5 = go4Var.N;
                str = go4Var.t;
                mediaFormat.setInteger("channel-count", i5);
                int i6 = go4Var.P;
                mediaFormat.setInteger("sample-rate", i6);
                tqe.b(mediaFormat, go4Var.w);
                tqe.a(mediaFormat, "max-input-size", i4);
                mediaFormat.setInteger("priority", 0);
                if (f != -1.0f) {
                    if (i3 == 23) {
                        String str5 = Build.MODEL;
                        if (!"ZTE B2017G".equals(str5)) {
                        }
                    }
                    mediaFormat.setFloat("operating-rate", f);
                }
                if ("audio/ac4".equals(str)) {
                    Pair b = jl2.b(go4Var);
                    if (b != null) {
                        tqe.a(mediaFormat, "profile", ((Integer) b.first).intValue());
                        tqe.a(mediaFormat, "level", ((Integer) b.second).intValue());
                    }
                    if (i3 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                x40 x40Var = this.c1;
                if (i3 >= 24) {
                    if (((cb3) x40Var).j(hac.G(4, go4Var.N, i6)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i3 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i3 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.p1));
                }
                if (Objects.equals(str, "audio/iamf")) {
                    s10 s10Var = ((cb3) x40Var).r;
                    r00 r00Var = s10Var instanceof l50 ? ((l50) s10Var).g : null;
                    int i7 = 12;
                    if (r00Var == null) {
                        ncd.f("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        yo5 yo5Var = jl5.a;
                        mo5 mo5Var = r00Var.d;
                        int size = mo5Var.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                i = 0;
                                break;
                            }
                            Object obj = mo5Var.get(i8);
                            i8++;
                            Integer num = (Integer) obj;
                            i = num.intValue();
                            if (jl5.a.contains(num)) {
                                break;
                            }
                        }
                        if (i != 0) {
                            i7 = i;
                        } else {
                            mo5 mo5Var2 = r00Var.c;
                            int size2 = mo5Var2.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    break;
                                }
                                Object obj2 = mo5Var2.get(i9);
                                i9++;
                                Integer num2 = (Integer) obj2;
                                int intValue = num2.intValue();
                                if (jl5.a.contains(num2)) {
                                    i2 = intValue;
                                    break;
                                }
                            }
                            if (i2 != 0) {
                                i7 = i2;
                            }
                        }
                        int bitCount = Integer.bitCount(i7);
                        mediaFormat.setInteger("channel-mask", i7);
                        mediaFormat.setInteger("max-output-channel-count", bitCount);
                    }
                }
                K(mediaFormat);
                this.j1 = ("audio/raw".equals(lm6Var.b) || "audio/raw".equals(str)) ? null : go4Var;
                return new eq(lm6Var, mediaFormat, go4Var, null, mediaCrypto, this.d1);
            }
        }
        z = false;
        this.g1 = z;
        this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = lm6Var.c;
        int i42 = this.f1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i52 = go4Var.N;
        str = go4Var.t;
        mediaFormat2.setInteger("channel-count", i52);
        int i62 = go4Var.P;
        mediaFormat2.setInteger("sample-rate", i62);
        tqe.b(mediaFormat2, go4Var.w);
        tqe.a(mediaFormat2, "max-input-size", i42);
        mediaFormat2.setInteger("priority", 0);
        if (f != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        x40 x40Var2 = this.c1;
        if (i3 >= 24) {
        }
        if (i3 >= 32) {
        }
        if (i3 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        K(mediaFormat2);
        this.j1 = ("audio/raw".equals(lm6Var.b) || "audio/raw".equals(str)) ? null : go4Var;
        return new eq(lm6Var, mediaFormat2, go4Var, null, mediaCrypto, this.d1);
    }

    @Override // om6
    public final void a0(la3 la3Var) {
        go4 go4Var;
        ki2 ki2Var;
        if (Build.VERSION.SDK_INT < 29 || (go4Var = la3Var.a) == null || !Objects.equals(go4Var.t, "audio/opus") || !this.x0) {
            return;
        }
        ByteBuffer byteBuffer = la3Var.f;
        byteBuffer.getClass();
        go4 go4Var2 = la3Var.a;
        go4Var2.getClass();
        int i = go4Var2.R;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            cb3 cb3Var = (cb3) this.c1;
            j50 j50Var = cb3Var.t;
            if (j50Var == null || !j50Var.c() || (ki2Var = cb3Var.p) == null || !((r10) ki2Var.e).k) {
                return;
            }
            cb3Var.t.d(i, i2);
        }
    }

    @Override // fm6
    public final void b(ce8 ce8Var) {
        ((cb3) this.c1).C(ce8Var);
    }

    @Override // om6, uh0, ze8
    public final void d(int i, Object obj) {
        bi6 bi6Var;
        x40 x40Var = this.c1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            cb3 cb3Var = (cb3) x40Var;
            if (cb3Var.K != floatValue) {
                cb3Var.K = floatValue;
                if (cb3Var.p()) {
                    cb3Var.t.a.setVolume(cb3Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            o00 o00Var = (o00) obj;
            o00Var.getClass();
            cb3 cb3Var2 = (cb3) x40Var;
            if (cb3Var2.u.equals(o00Var)) {
                return;
            }
            cb3Var2.u = o00Var;
            if (cb3Var2.Y) {
                return;
            }
            cb3Var2.v();
            return;
        }
        if (i == 6) {
            tb0 tb0Var = (tb0) obj;
            tb0Var.getClass();
            ((cb3) x40Var).A(tb0Var);
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            cb3 cb3Var3 = (cb3) x40Var;
            cb3Var3.W = audioDeviceInfo;
            j50 j50Var = cb3Var3.t;
            if (j50Var != null) {
                j50Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.p1 = ((Integer) obj).intValue();
            hm6 hm6Var = this.c0;
            if (hm6Var == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.p1));
            hm6Var.setParameters(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            cb3 cb3Var4 = (cb3) x40Var;
            cb3Var4.y = ((Boolean) obj).booleanValue();
            bb3 bb3Var = new bb3(cb3Var4.E() ? ce8.d : cb3Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (cb3Var4.p()) {
                cb3Var4.v = bb3Var;
                return;
            } else {
                cb3Var4.w = bb3Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((cb3) x40Var).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (bi6Var = this.d1) == null) {
                return;
            }
            bi6Var.d(intValue);
            return;
        }
        if (i != 19) {
            if (i != 20) {
                super.d(i, obj);
                return;
            } else {
                obj.getClass();
                ((cb3) x40Var).y((s10) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        cb3 cb3Var5 = (cb3) x40Var;
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (cb3Var5.X != intValue2) {
            cb3Var5.X = intValue2;
            cb3Var5.v();
        }
    }

    @Override // fm6
    public final ce8 g() {
        return ((cb3) this.c1).x;
    }

    @Override // om6
    public final void g0(Exception exc) {
        ncd.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new j40(lx6Var, exc, (byte) 0));
        }
    }

    @Override // fm6
    public final long h() {
        if (this.n == 2) {
            M0();
        }
        return this.k1;
    }

    @Override // om6
    public final void h0(long j, String str, long j2) {
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new n40((Object) lx6Var, (Object) str, j, j2, (byte) 0));
        }
    }

    @Override // fm6
    public final boolean i() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override // om6
    public final void i0(hl2 hl2Var) {
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new x30(lx6Var, hl2Var, (byte) 3));
        }
    }

    @Override // om6
    public final void j0(String str) {
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new x30(lx6Var, str, (byte) 2));
        }
    }

    @Override // om6
    public final pa3 k0(mj4 mj4Var) {
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        this.i1 = go4Var;
        pa3 k0 = super.k0(mj4Var);
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        if (handler != null) {
            handler.post(new op6(lx6Var, go4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override // uh0
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // om6
    public final void l0(go4 go4Var, MediaFormat mediaFormat) {
        int integer;
        go4 go4Var2 = this.j1;
        io5 io5Var = null;
        if (go4Var2 != null) {
            go4Var = go4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = go4Var.t;
            int i = go4Var.N;
            int F = "audio/raw".equals(str) ? go4Var.Q : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? hac.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = go4Var.O;
            if (i2 == -1 || i != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("audio/raw");
            fo4Var.P = F;
            fo4Var.Q = go4Var.R;
            fo4Var.R = go4Var.S;
            fo4Var.l = go4Var.m;
            fo4Var.a = go4Var.a;
            fo4Var.b = go4Var.b;
            fo4Var.c = mo5.q(go4Var.c);
            fo4Var.d = go4Var.d;
            fo4Var.e = go4Var.e;
            fo4Var.f = go4Var.f;
            fo4Var.M = integer2;
            fo4Var.N = i2;
            fo4Var.O = mediaFormat.getInteger("sample-rate");
            go4Var = new go4(fo4Var);
            boolean z = this.g1;
            int i3 = go4Var.N;
            if (z && i3 == 6 && i < 6) {
                jte.c(i, "Invalid initialCapacity: %s", i >= 0);
                int[] iArr = new int[i];
                int i4 = 0;
                int i5 = 0;
                while (i4 < i) {
                    int i6 = i5 + 1;
                    if (i6 > iArr.length) {
                        int length = iArr.length;
                        if (i6 < 0) {
                            bh7.j("cannot store more than MAX_VALUE elements");
                            return;
                        }
                        int i7 = length + (length >> 1) + 1;
                        if (i7 < i6) {
                            i7 = Integer.highestOneBit(i5) << 1;
                        }
                        if (i7 < 0) {
                            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        iArr = Arrays.copyOf(iArr, i7);
                    }
                    int[] iArr2 = iArr;
                    iArr[i5] = i4;
                    i4++;
                    i5 = i6;
                    iArr = iArr2;
                }
                io5Var = i5 == 0 ? io5.c : new io5(iArr, i5);
            } else if (this.h1) {
                if (i3 == 3) {
                    io5Var = zlc.a;
                } else if (i3 == 5) {
                    io5Var = zlc.b;
                } else if (i3 == 6) {
                    io5Var = zlc.c;
                } else if (i3 == 7) {
                    io5Var = zlc.d;
                } else if (i3 != 8) {
                    io5 io5Var2 = zlc.a;
                } else {
                    io5Var = zlc.e;
                }
            }
        }
        try {
            int i8 = Build.VERSION.SDK_INT;
            x40 x40Var = this.c1;
            if (i8 >= 29) {
                if (this.x0) {
                    f99 f99Var = this.d;
                    f99Var.getClass();
                    if (f99Var.a != 0) {
                        f99 f99Var2 = this.d;
                        f99Var2.getClass();
                        byte b = f99Var2.a;
                        cb3 cb3Var = (cb3) x40Var;
                        jte.p(i8 >= 29);
                        cb3Var.i = b;
                    }
                }
                cb3 cb3Var2 = (cb3) x40Var;
                jte.p(i8 >= 29);
                cb3Var2.i = (byte) 0;
            }
            e7a e7aVar = new e7a(go4Var);
            e7aVar.b = io5Var;
            e7aVar.c = this.G;
            e7aVar.d = this.H;
            ((cb3) x40Var).c(e7aVar.k());
            G0(this.d0);
        } catch (s40 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override // om6
    public final void m0(long j) {
        ((cb3) this.c1).J = j;
    }

    @Override // uh0
    public final boolean n() {
        if (!this.K0) {
            return false;
        }
        cb3 cb3Var = (cb3) this.c1;
        if (cb3Var.p()) {
            return cb3Var.O && !cb3Var.n();
        }
        return true;
    }

    @Override // uh0
    public final boolean o() {
        if (((cb3) this.c1).n()) {
            this.s1 = -9223372036854775807L;
            this.t1 = true;
            return true;
        }
        if (!this.t1 || !this.q1 || !p() || m()) {
            return false;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.s1;
        if (j != -9223372036854775807L) {
            return elapsedRealtime - j < 100;
        }
        this.s1 = elapsedRealtime;
        return true;
    }

    @Override // om6
    public final void o0() {
        ((cb3) this.c1).G = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0.o(r3.O0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw r1;
     */
    @Override // om6, uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        lx6 lx6Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((cb3) this.c1).f();
        } finally {
            super.q();
        }
    }

    @Override // uh0
    public final void r(boolean z, boolean z2) {
        ia3 ia3Var = new ia3();
        this.O0 = ia3Var;
        lx6 lx6Var = this.b1;
        Handler handler = (Handler) lx6Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new k40(lx6Var, ia3Var, b));
        }
        f99 f99Var = this.d;
        f99Var.getClass();
        boolean z3 = f99Var.b;
        x40 x40Var = this.c1;
        if (z3) {
            cb3 cb3Var = (cb3) x40Var;
            jte.p(cb3Var.S);
            if (!cb3Var.Y) {
                cb3Var.Y = true;
                cb3Var.v();
            }
        } else {
            cb3 cb3Var2 = (cb3) x40Var;
            if (cb3Var2.Y) {
                cb3Var2.Y = false;
                cb3Var2.v();
            }
        }
        we8 we8Var = this.f;
        we8Var.getClass();
        cb3 cb3Var3 = (cb3) x40Var;
        cb3Var3.m = we8Var;
        bfb bfbVar = this.h;
        bfbVar.getClass();
        ((l50) cb3Var3.r).f = bfbVar;
        cb3Var3.n = new ai4((Object) this, (byte) 13);
    }

    @Override // om6
    public final boolean r0(long j, long j2, hm6 hm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, go4 go4Var) {
        im6 im6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            hm6Var.getClass();
            hm6Var.c(i);
            return true;
        }
        if (z) {
            if (hm6Var != null) {
                hm6Var.c(i);
            }
            this.O0.f += i3;
            ((cb3) this.c1).G = true;
            return true;
        }
        try {
            try {
                im6Var = this;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                dq9.o(e2);
                return false;
            }
        } catch (t40 e3) {
            e = e3;
            im6Var = this;
        } catch (w40 e4) {
            e = e4;
            im6Var = this;
        }
        try {
            cg cgVar = new cg(im6Var, byteBuffer, j3, i3);
            if (hm6Var != null) {
                hm6Var.i(cgVar);
            } else {
                cgVar.run();
            }
            if (!im6Var.e1.get()) {
                im6Var.r1 = j3;
                return false;
            }
            if (hm6Var != null) {
                hm6Var.c(i);
            }
            im6Var.O0.e += i3;
            return true;
        } catch (t40 e5) {
            e = e5;
            t40 t40Var = e;
            go4 go4Var2 = im6Var.i1;
            if (im6Var.x0) {
                f99 f99Var = im6Var.d;
                f99Var.getClass();
                if (f99Var.a != 0) {
                    i5 = 5004;
                    throw im6Var.e(t40Var, go4Var2, t40Var.a, i5);
                }
            }
            i5 = 5001;
            throw im6Var.e(t40Var, go4Var2, t40Var.a, i5);
        } catch (w40 e6) {
            e = e6;
            w40 w40Var = e;
            if (im6Var.x0) {
                f99 f99Var2 = im6Var.d;
                f99Var2.getClass();
                if (f99Var2.a != 0) {
                    i4 = 5003;
                    throw im6Var.e(w40Var, go4Var, w40Var.b, i4);
                }
            }
            i4 = 5002;
            throw im6Var.e(w40Var, go4Var, w40Var.b, i4);
        }
    }

    @Override // om6, uh0
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((cb3) this.c1).f();
        this.k1 = j;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
        this.n1 = false;
        this.o1 = false;
        this.l1 = true;
    }

    @Override // uh0
    public final void t() {
        bi6 bi6Var;
        ((l50) ((cb3) this.c1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (bi6Var = this.d1) == null) {
            return;
        }
        bi6Var.b();
    }

    @Override // om6
    public final void u0() {
        try {
            ((cb3) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (w40 e) {
            throw e(e, e.c, e.b, this.x0 ? 5003 : 5002);
        }
    }

    @Override // uh0
    public final void v() {
        x40 x40Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            try {
                this.x0 = false;
                v0();
                t0();
            } finally {
                ts2.B(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((cb3) x40Var).w();
            }
        }
    }

    @Override // uh0
    public final void w() {
        ((cb3) this.c1).r();
        this.q1 = true;
    }

    @Override // uh0
    public final void x() {
        M0();
        this.q1 = false;
        ((cb3) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override // uh0
    public final fm6 k() {
        return this;
    }
}
