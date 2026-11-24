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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class fk6 extends lk6 implements ck6 {
    public final Context a1;
    public final tg2 b1;
    public final x30 c1;
    public final bg6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public fm4 i1;
    public fm4 j1;
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
    public fk6(Context context, dk6 dk6Var, Handler handler, t54 t54Var, x30 x30Var) {
        super(context.getApplicationContext(), 1, dk6Var);
        bg6 bg6Var = Build.VERSION.SDK_INT >= 35 ? new bg6() : null;
        this.a1 = context.getApplicationContext();
        this.c1 = x30Var;
        this.d1 = bg6Var;
        this.p1 = -1000;
        this.b1 = new tg2(handler, t54Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static w59 L0(fm4 fm4Var, boolean z, x30 x30Var) {
        if (fm4Var.t == null) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        if (((q93) x30Var).j(fm4Var) != 0) {
            List e = qk6.e("audio/raw", false, false);
            ik6 ik6Var = e.isEmpty() ? null : (ik6) e.get(0);
            if (ik6Var != null) {
                return mm5.u(ik6Var);
            }
        }
        return qk6.g(fm4Var, z, false);
    }

    @Override // lk6
    public final boolean E0(fm4 fm4Var) {
        d79 d79Var = this.d;
        d79Var.getClass();
        if (d79Var.a != 0) {
            int J0 = J0(fm4Var);
            if ((J0 & 512) != 0) {
                d79 d79Var2 = this.d;
                d79Var2.getClass();
                if (d79Var2.a == 2 || (J0 & 1024) != 0 || (fm4Var.R == 0 && fm4Var.S == 0)) {
                    return true;
                }
            }
        }
        return ((q93) this.c1).j(fm4Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r4.isEmpty() ? null : (ik6) r4.get(0)) != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // lk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(fm4 fm4Var) {
        int i;
        boolean z;
        boolean z2 = true;
        int a = ls6.a(1, 0, 0, 0);
        if (!ud7.i(fm4Var.t)) {
            return ls6.a(0, 0, 0, 0);
        }
        int i2 = fm4Var.X;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        x30 x30Var = this.c1;
        if (z4) {
            if (z3) {
                List e = qk6.e("audio/raw", false, false);
            }
            i = J0(fm4Var);
            if (((q93) x30Var).j(fm4Var) != 0) {
                return ls6.a(4, 8, 32, i);
            }
            if ("audio/raw".equals(fm4Var.t) || ((q93) x30Var).j(fm4Var) != 0) {
                if (((q93) x30Var).j(g8c.G(2, fm4Var.N, fm4Var.P)) != 0) {
                    w59 L0 = L0(fm4Var, false, x30Var);
                    if (!L0.isEmpty()) {
                        if (!z4) {
                            return ls6.a(2, 0, 0, 0);
                        }
                        ik6 ik6Var = (ik6) L0.get(0);
                        Context context = this.a1;
                        boolean e2 = ik6Var.e(context, fm4Var);
                        if (!e2) {
                            for (int i4 = 1; i4 < L0.d; i4++) {
                                ik6 ik6Var2 = (ik6) L0.get(i4);
                                if (ik6Var2.e(context, fm4Var)) {
                                    z = false;
                                    ik6Var = ik6Var2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        z2 = e2;
                        int i5 = z2 ? 4 : 3;
                        if (z2 && ik6Var.f(fm4Var)) {
                            i3 = 16;
                        }
                        return i5 | i3 | 32 | (ik6Var.g ? 64 : 0) | (z ? 128 : 0) | i;
                    }
                }
            }
            return a;
        }
        i = 0;
        if ("audio/raw".equals(fm4Var.t)) {
        }
        if (((q93) x30Var).j(g8c.G(2, fm4Var.N, fm4Var.P)) != 0) {
        }
        return a;
    }

    public final int J0(fm4 fm4Var) {
        k00 a;
        q93 q93Var = (q93) this.c1;
        if (q93Var.a0) {
            a = k00.d;
        } else {
            o00 b = ((l40) q93Var.r).b(q93Var.i(fm4Var));
            j00 j00Var = new j00();
            j00Var.a = b.a;
            j00Var.b = b.b;
            j00Var.c = b.c;
            a = j00Var.a();
        }
        if (!a.a) {
            return 0;
        }
        int i = a.b ? 1536 : 512;
        return a.c ? i | 2048 : i;
    }

    public final int K0(ik6 ik6Var, fm4 fm4Var) {
        if ("OMX.google.raw.decoder".equals(ik6Var.a) && Build.VERSION.SDK_INT == 23 && !g8c.Q(this.a1)) {
            return -1;
        }
        return fm4Var.u;
    }

    @Override // lk6
    public d93 M(ik6 ik6Var, fm4 fm4Var, fm4 fm4Var2, boolean z) {
        d93 b = ik6Var.b(fm4Var, fm4Var2);
        int i = b.e;
        if (this.X == null && E0(fm4Var2)) {
            i |= 32768;
        }
        if (K0(ik6Var, fm4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        return new d93(ik6Var.a, fm4Var, fm4Var2, i2 != 0 ? (byte) 0 : b.d, i2);
    }

    public final void M0() {
        n();
        long h = ((q93) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override // lk6
    public final ArrayList W(fm4 fm4Var, boolean z) {
        w59 L0 = L0(fm4Var, z, this.c1);
        HashMap hashMap = qk6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new bz0(new h45(this.a1, fm4Var, (byte) 25), (byte) 3));
        return arrayList;
    }

    @Override // lk6
    public final long X(long j, long j2, boolean z) {
        q93 q93Var = (q93) this.c1;
        boolean z2 = q93Var.n() && this.r1 != -9223372036854775807L;
        if (this.q1) {
            long g = q93Var.g();
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
    @Override // lk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ep Z(ik6 ik6Var, fm4 fm4Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        String str;
        int i;
        fm4[] fm4VarArr = this.s;
        fm4VarArr.getClass();
        int K0 = K0(ik6Var, fm4Var);
        String str2 = ik6Var.a;
        int i2 = 0;
        if (fm4VarArr.length != 1) {
            for (fm4 fm4Var2 : fm4VarArr) {
                if (ik6Var.b(fm4Var, fm4Var2).d != 0) {
                    K0 = Math.max(K0, K0(ik6Var, fm4Var2));
                }
            }
        }
        this.f1 = K0;
        HashSet hashSet = cr6.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z = true;
                this.g1 = z;
                this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = ik6Var.c;
                int i4 = this.f1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i5 = fm4Var.N;
                str = fm4Var.t;
                mediaFormat.setInteger("channel-count", i5);
                int i6 = fm4Var.P;
                mediaFormat.setInteger("sample-rate", i6);
                qoe.b(mediaFormat, fm4Var.w);
                qoe.a(mediaFormat, "max-input-size", i4);
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
                    Pair b = wj2.b(fm4Var);
                    if (b != null) {
                        qoe.a(mediaFormat, "profile", ((Integer) b.first).intValue());
                        qoe.a(mediaFormat, "level", ((Integer) b.second).intValue());
                    }
                    if (i3 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                x30 x30Var = this.c1;
                if (i3 >= 24) {
                    if (((q93) x30Var).j(g8c.G(4, fm4Var.N, i6)) == 2) {
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
                    s00 s00Var = ((q93) x30Var).r;
                    rz rzVar = s00Var instanceof l40 ? ((l40) s00Var).g : null;
                    int i7 = 12;
                    if (rzVar == null) {
                        lad.f("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        ym5 ym5Var = kj5.a;
                        mm5 mm5Var = rzVar.d;
                        int size = mm5Var.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                i = 0;
                                break;
                            }
                            Object obj = mm5Var.get(i8);
                            i8++;
                            Integer num = (Integer) obj;
                            i = num.intValue();
                            if (kj5.a.contains(num)) {
                                break;
                            }
                        }
                        if (i != 0) {
                            i7 = i;
                        } else {
                            mm5 mm5Var2 = rzVar.c;
                            int size2 = mm5Var2.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    break;
                                }
                                Object obj2 = mm5Var2.get(i9);
                                i9++;
                                Integer num2 = (Integer) obj2;
                                int intValue = num2.intValue();
                                if (kj5.a.contains(num2)) {
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
                this.j1 = ("audio/raw".equals(ik6Var.b) || "audio/raw".equals(str)) ? null : fm4Var;
                return new ep(ik6Var, mediaFormat, fm4Var, null, mediaCrypto, this.d1);
            }
        }
        z = false;
        this.g1 = z;
        this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = ik6Var.c;
        int i42 = this.f1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i52 = fm4Var.N;
        str = fm4Var.t;
        mediaFormat2.setInteger("channel-count", i52);
        int i62 = fm4Var.P;
        mediaFormat2.setInteger("sample-rate", i62);
        qoe.b(mediaFormat2, fm4Var.w);
        qoe.a(mediaFormat2, "max-input-size", i42);
        mediaFormat2.setInteger("priority", 0);
        if (f != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        x30 x30Var2 = this.c1;
        if (i3 >= 24) {
        }
        if (i3 >= 32) {
        }
        if (i3 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        K(mediaFormat2);
        this.j1 = ("audio/raw".equals(ik6Var.b) || "audio/raw".equals(str)) ? null : fm4Var;
        return new ep(ik6Var, mediaFormat2, fm4Var, null, mediaCrypto, this.d1);
    }

    @Override // lk6
    public final void a0(z83 z83Var) {
        fm4 fm4Var;
        wg2 wg2Var;
        if (Build.VERSION.SDK_INT < 29 || (fm4Var = z83Var.a) == null || !Objects.equals(fm4Var.t, "audio/opus") || !this.x0) {
            return;
        }
        ByteBuffer byteBuffer = z83Var.f;
        byteBuffer.getClass();
        fm4 fm4Var2 = z83Var.a;
        fm4Var2.getClass();
        int i = fm4Var2.R;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            q93 q93Var = (q93) this.c1;
            j40 j40Var = q93Var.t;
            if (j40Var == null || !j40Var.c() || (wg2Var = q93Var.p) == null || !((r00) wg2Var.e).k) {
                return;
            }
            q93Var.t.d(i, i2);
        }
    }

    @Override // ck6
    public final void b(zb8 zb8Var) {
        ((q93) this.c1).C(zb8Var);
    }

    @Override // lk6, ug0, xc8
    public final void d(int i, Object obj) {
        bg6 bg6Var;
        x30 x30Var = this.c1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            q93 q93Var = (q93) x30Var;
            if (q93Var.K != floatValue) {
                q93Var.K = floatValue;
                if (q93Var.p()) {
                    q93Var.t.a.setVolume(q93Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            nz nzVar = (nz) obj;
            nzVar.getClass();
            q93 q93Var2 = (q93) x30Var;
            if (q93Var2.u.equals(nzVar)) {
                return;
            }
            q93Var2.u = nzVar;
            if (q93Var2.Y) {
                return;
            }
            q93Var2.v();
            return;
        }
        if (i == 6) {
            ta0 ta0Var = (ta0) obj;
            ta0Var.getClass();
            ((q93) x30Var).A(ta0Var);
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            q93 q93Var3 = (q93) x30Var;
            q93Var3.W = audioDeviceInfo;
            j40 j40Var = q93Var3.t;
            if (j40Var != null) {
                j40Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.p1 = ((Integer) obj).intValue();
            ek6 ek6Var = this.c0;
            if (ek6Var == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.p1));
            ek6Var.setParameters(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            q93 q93Var4 = (q93) x30Var;
            q93Var4.y = ((Boolean) obj).booleanValue();
            p93 p93Var = new p93(q93Var4.E() ? zb8.d : q93Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (q93Var4.p()) {
                q93Var4.v = p93Var;
                return;
            } else {
                q93Var4.w = p93Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((q93) x30Var).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (bg6Var = this.d1) == null) {
                return;
            }
            bg6Var.d(intValue);
            return;
        }
        if (i != 19) {
            if (i != 20) {
                super.d(i, obj);
                return;
            } else {
                obj.getClass();
                ((q93) x30Var).y((s00) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        q93 q93Var5 = (q93) x30Var;
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (q93Var5.X != intValue2) {
            q93Var5.X = intValue2;
            q93Var5.v();
        }
    }

    @Override // ck6
    public final zb8 g() {
        return ((q93) this.c1).x;
    }

    @Override // lk6
    public final void g0(Exception exc) {
        lad.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 0));
        }
    }

    @Override // ck6
    public final long h() {
        if (this.n == 2) {
            M0();
        }
        return this.k1;
    }

    @Override // lk6
    public final void h0(long j, String str, long j2) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new n30((Object) tg2Var, (Object) str, j, j2, (byte) 0));
        }
    }

    @Override // ck6
    public final boolean i() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override // lk6
    public final void i0(uj2 uj2Var) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new z20(tg2Var, uj2Var, (byte) 2));
        }
    }

    @Override // lk6
    public final void j0(String str) {
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new z20(tg2Var, str, (byte) 1));
        }
    }

    @Override // lk6
    public final d93 k0(sk4 sk4Var) {
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        this.i1 = fm4Var;
        d93 k0 = super.k0(sk4Var);
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new nn6(tg2Var, fm4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override // ug0
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // lk6
    public final void l0(fm4 fm4Var, MediaFormat mediaFormat) {
        int integer;
        fm4 fm4Var2 = this.j1;
        im5 im5Var = null;
        if (fm4Var2 != null) {
            fm4Var = fm4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = fm4Var.t;
            int i = fm4Var.N;
            int F = "audio/raw".equals(str) ? fm4Var.Q : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? g8c.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = fm4Var.O;
            if (i2 == -1 || i != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            em4 em4Var = new em4();
            em4Var.s = ud7.n("audio/raw");
            em4Var.P = F;
            em4Var.Q = fm4Var.R;
            em4Var.R = fm4Var.S;
            em4Var.l = fm4Var.m;
            em4Var.a = fm4Var.a;
            em4Var.b = fm4Var.b;
            em4Var.c = mm5.q(fm4Var.c);
            em4Var.d = fm4Var.d;
            em4Var.e = fm4Var.e;
            em4Var.f = fm4Var.f;
            em4Var.M = integer2;
            em4Var.N = i2;
            em4Var.O = mediaFormat.getInteger("sample-rate");
            fm4Var = new fm4(em4Var);
            boolean z = this.g1;
            int i3 = fm4Var.N;
            if (z && i3 == 6 && i < 6) {
                gre.c(i, "Invalid initialCapacity: %s", i >= 0);
                int[] iArr = new int[i];
                int i4 = 0;
                int i5 = 0;
                while (i4 < i) {
                    int i6 = i5 + 1;
                    if (i6 > iArr.length) {
                        int length = iArr.length;
                        if (i6 < 0) {
                            fi7.g("cannot store more than MAX_VALUE elements");
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
                im5Var = i5 == 0 ? im5.c : new im5(iArr, i5);
            } else if (this.h1) {
                if (i3 == 3) {
                    im5Var = zjc.a;
                } else if (i3 == 5) {
                    im5Var = zjc.b;
                } else if (i3 == 6) {
                    im5Var = zjc.c;
                } else if (i3 == 7) {
                    im5Var = zjc.d;
                } else if (i3 != 8) {
                    im5 im5Var2 = zjc.a;
                } else {
                    im5Var = zjc.e;
                }
            }
        }
        try {
            int i8 = Build.VERSION.SDK_INT;
            x30 x30Var = this.c1;
            if (i8 >= 29) {
                if (this.x0) {
                    d79 d79Var = this.d;
                    d79Var.getClass();
                    if (d79Var.a != 0) {
                        d79 d79Var2 = this.d;
                        d79Var2.getClass();
                        byte b = d79Var2.a;
                        q93 q93Var = (q93) x30Var;
                        gre.p(i8 >= 29);
                        q93Var.i = b;
                    }
                }
                q93 q93Var2 = (q93) x30Var;
                gre.p(i8 >= 29);
                q93Var2.i = (byte) 0;
            }
            c5a c5aVar = new c5a(fm4Var);
            c5aVar.c = im5Var;
            c5aVar.d = this.G;
            c5aVar.e = this.H;
            ((q93) x30Var).c(c5aVar.e());
            G0(this.d0);
        } catch (s30 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override // lk6
    public final void m0(long j) {
        ((q93) this.c1).J = j;
    }

    @Override // ug0
    public final boolean n() {
        if (!this.K0) {
            return false;
        }
        q93 q93Var = (q93) this.c1;
        if (q93Var.p()) {
            return q93Var.O && !q93Var.n();
        }
        return true;
    }

    @Override // ug0
    public final boolean o() {
        if (((q93) this.c1).n()) {
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

    @Override // lk6
    public final void o0() {
        ((q93) this.c1).G = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0.u(r3.O0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw r1;
     */
    @Override // lk6, ug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        tg2 tg2Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((q93) this.c1).f();
        } finally {
            super.q();
        }
    }

    @Override // ug0
    public final void r(boolean z, boolean z2) {
        w83 w83Var = new w83();
        this.O0 = w83Var;
        tg2 tg2Var = this.b1;
        Handler handler = (Handler) tg2Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new k30(tg2Var, w83Var, b));
        }
        d79 d79Var = this.d;
        d79Var.getClass();
        boolean z3 = d79Var.b;
        x30 x30Var = this.c1;
        if (z3) {
            q93 q93Var = (q93) x30Var;
            gre.p(q93Var.S);
            if (!q93Var.Y) {
                q93Var.Y = true;
                q93Var.v();
            }
        } else {
            q93 q93Var2 = (q93) x30Var;
            if (q93Var2.Y) {
                q93Var2.Y = false;
                q93Var2.v();
            }
        }
        uc8 uc8Var = this.f;
        uc8Var.getClass();
        q93 q93Var3 = (q93) x30Var;
        q93Var3.m = uc8Var;
        adb adbVar = this.h;
        adbVar.getClass();
        ((l40) q93Var3.r).f = adbVar;
        q93Var3.n = new z24(this, (byte) 16);
    }

    @Override // lk6
    public final boolean r0(long j, long j2, ek6 ek6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, fm4 fm4Var) {
        fk6 fk6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            ek6Var.getClass();
            ek6Var.c(i);
            return true;
        }
        if (z) {
            if (ek6Var != null) {
                ek6Var.c(i);
            }
            this.O0.f += i3;
            ((q93) this.c1).G = true;
            return true;
        }
        try {
            try {
                fk6Var = this;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                ho9.n(e2);
                return false;
            }
        } catch (t30 e3) {
            e = e3;
            fk6Var = this;
        } catch (w30 e4) {
            e = e4;
            fk6Var = this;
        }
        try {
            bf bfVar = new bf(fk6Var, byteBuffer, j3, i3);
            if (ek6Var != null) {
                ek6Var.i(bfVar);
            } else {
                bfVar.run();
            }
            if (!fk6Var.e1.get()) {
                fk6Var.r1 = j3;
                return false;
            }
            if (ek6Var != null) {
                ek6Var.c(i);
            }
            fk6Var.O0.e += i3;
            return true;
        } catch (t30 e5) {
            e = e5;
            t30 t30Var = e;
            fm4 fm4Var2 = fk6Var.i1;
            if (fk6Var.x0) {
                d79 d79Var = fk6Var.d;
                d79Var.getClass();
                if (d79Var.a != 0) {
                    i5 = 5004;
                    throw fk6Var.e(t30Var, fm4Var2, t30Var.a, i5);
                }
            }
            i5 = 5001;
            throw fk6Var.e(t30Var, fm4Var2, t30Var.a, i5);
        } catch (w30 e6) {
            e = e6;
            w30 w30Var = e;
            if (fk6Var.x0) {
                d79 d79Var2 = fk6Var.d;
                d79Var2.getClass();
                if (d79Var2.a != 0) {
                    i4 = 5003;
                    throw fk6Var.e(w30Var, fm4Var, w30Var.b, i4);
                }
            }
            i4 = 5002;
            throw fk6Var.e(w30Var, fm4Var, w30Var.b, i4);
        }
    }

    @Override // lk6, ug0
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((q93) this.c1).f();
        this.k1 = j;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
        this.n1 = false;
        this.o1 = false;
        this.l1 = true;
    }

    @Override // ug0
    public final void t() {
        bg6 bg6Var;
        ((l40) ((q93) this.c1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (bg6Var = this.d1) == null) {
            return;
        }
        bg6Var.b();
    }

    @Override // lk6
    public final void u0() {
        try {
            ((q93) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (w30 e) {
            throw e(e, e.c, e.b, this.x0 ? 5003 : 5002);
        }
    }

    @Override // ug0
    public final void v() {
        x30 x30Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            try {
                this.x0 = false;
                v0();
                t0();
            } finally {
                ir2.C(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((q93) x30Var).w();
            }
        }
    }

    @Override // ug0
    public final void w() {
        ((q93) this.c1).r();
        this.q1 = true;
    }

    @Override // ug0
    public final void x() {
        M0();
        this.q1 = false;
        ((q93) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override // ug0
    public final ck6 k() {
        return this;
    }
}
