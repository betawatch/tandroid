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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class km6 extends qm6 implements hm6 {
    public final Context a1;
    public final lh2 b1;
    public final y30 c1;
    public final fi6 d1;
    public final AtomicBoolean e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public ko4 i1;
    public ko4 j1;
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
    public km6(Context context, im6 im6Var, Handler handler, n64 n64Var, y30 y30Var) {
        super(context.getApplicationContext(), 1, im6Var);
        fi6 fi6Var = Build.VERSION.SDK_INT >= 35 ? new fi6() : null;
        this.a1 = context.getApplicationContext();
        this.c1 = y30Var;
        this.d1 = fi6Var;
        this.p1 = -1000;
        this.b1 = new lh2(handler, n64Var);
        this.e1 = new AtomicBoolean();
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    public static j99 L0(ko4 ko4Var, boolean z, y30 y30Var) {
        if (ko4Var.t == null) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        if (((ja3) y30Var).j(ko4Var) != 0) {
            List e = wm6.e("audio/raw", false, false);
            nm6 nm6Var = e.isEmpty() ? null : (nm6) e.get(0);
            if (nm6Var != null) {
                return po5.u(nm6Var);
            }
        }
        return wm6.g(ko4Var, z, false);
    }

    @Override // qm6
    public final boolean E0(ko4 ko4Var) {
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        if (qa9Var.a != 0) {
            int J0 = J0(ko4Var);
            if ((J0 & 512) != 0) {
                qa9 qa9Var2 = this.d;
                qa9Var2.getClass();
                if (qa9Var2.a == 2 || (J0 & 1024) != 0 || (ko4Var.R == 0 && ko4Var.S == 0)) {
                    return true;
                }
            }
        }
        return ((ja3) this.c1).j(ko4Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r4.isEmpty() ? null : (nm6) r4.get(0)) != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    @Override // qm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(ko4 ko4Var) {
        int i;
        boolean z;
        boolean z2 = true;
        int a = qu6.a(1, 0, 0, 0);
        if (!dg7.i(ko4Var.t)) {
            return qu6.a(0, 0, 0, 0);
        }
        int i2 = ko4Var.X;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        y30 y30Var = this.c1;
        if (z4) {
            if (z3) {
                List e = wm6.e("audio/raw", false, false);
            }
            i = J0(ko4Var);
            if (((ja3) y30Var).j(ko4Var) != 0) {
                return qu6.a(4, 8, 32, i);
            }
            if ("audio/raw".equals(ko4Var.t) || ((ja3) y30Var).j(ko4Var) != 0) {
                if (((ja3) y30Var).j(gcc.G(2, ko4Var.N, ko4Var.P)) != 0) {
                    j99 L0 = L0(ko4Var, false, y30Var);
                    if (!L0.isEmpty()) {
                        if (!z4) {
                            return qu6.a(2, 0, 0, 0);
                        }
                        nm6 nm6Var = (nm6) L0.get(0);
                        Context context = this.a1;
                        boolean e2 = nm6Var.e(context, ko4Var);
                        if (!e2) {
                            for (int i4 = 1; i4 < L0.d; i4++) {
                                nm6 nm6Var2 = (nm6) L0.get(i4);
                                if (nm6Var2.e(context, ko4Var)) {
                                    z = false;
                                    nm6Var = nm6Var2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        z2 = e2;
                        int i5 = z2 ? 4 : 3;
                        if (z2 && nm6Var.f(ko4Var)) {
                            i3 = 16;
                        }
                        return i5 | i3 | 32 | (nm6Var.g ? 64 : 0) | (z ? 128 : 0) | i;
                    }
                }
            }
            return a;
        }
        i = 0;
        if ("audio/raw".equals(ko4Var.t)) {
        }
        if (((ja3) y30Var).j(gcc.G(2, ko4Var.N, ko4Var.P)) != 0) {
        }
        return a;
    }

    public final int J0(ko4 ko4Var) {
        l00 a;
        ja3 ja3Var = (ja3) this.c1;
        if (ja3Var.a0) {
            a = l00.d;
        } else {
            p00 b = ((n40) ja3Var.r).b(ja3Var.i(ko4Var));
            k00 k00Var = new k00();
            k00Var.a = b.a;
            k00Var.b = b.b;
            k00Var.c = b.c;
            a = k00Var.a();
        }
        if (!a.a) {
            return 0;
        }
        int i = a.b ? 1536 : 512;
        return a.c ? i | 2048 : i;
    }

    public final int K0(nm6 nm6Var, ko4 ko4Var) {
        if ("OMX.google.raw.decoder".equals(nm6Var.a) && Build.VERSION.SDK_INT == 23 && !gcc.Q(this.a1)) {
            return -1;
        }
        return ko4Var.u;
    }

    @Override // qm6
    public w93 M(nm6 nm6Var, ko4 ko4Var, ko4 ko4Var2, boolean z) {
        w93 b = nm6Var.b(ko4Var, ko4Var2);
        int i = b.e;
        if (this.X == null && E0(ko4Var2)) {
            i |= 32768;
        }
        if (K0(nm6Var, ko4Var2) > this.f1) {
            i |= 64;
        }
        int i2 = i;
        return new w93(nm6Var.a, ko4Var, ko4Var2, i2 != 0 ? (byte) 0 : b.d, i2);
    }

    public final void M0() {
        n();
        long h = ((ja3) this.c1).h();
        if (h != Long.MIN_VALUE) {
            if (!this.l1) {
                h = Math.max(this.k1, h);
            }
            this.k1 = h;
            this.l1 = false;
        }
    }

    @Override // qm6
    public final ArrayList W(ko4 ko4Var, boolean z) {
        j99 L0 = L0(ko4Var, z, this.c1);
        HashMap hashMap = wm6.a;
        ArrayList arrayList = new ArrayList(L0);
        Collections.sort(arrayList, new jz0(new rm6(this.a1, ko4Var, (byte) 0), (byte) 4));
        return arrayList;
    }

    @Override // qm6
    public final long X(long j, long j2, boolean z) {
        ja3 ja3Var = (ja3) this.c1;
        boolean z2 = ja3Var.n() && this.r1 != -9223372036854775807L;
        if (this.q1) {
            long g = ja3Var.g();
            if (this.o1 && z2 && g != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g, this.r1 - j) / (f() != null ? f().a : 1.0f)) / 2.0f));
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
    @Override // qm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fp Z(nm6 nm6Var, ko4 ko4Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        String str;
        int i;
        ko4[] ko4VarArr = this.s;
        ko4VarArr.getClass();
        int K0 = K0(nm6Var, ko4Var);
        String str2 = nm6Var.a;
        int i2 = 0;
        if (ko4VarArr.length != 1) {
            for (ko4 ko4Var2 : ko4VarArr) {
                if (nm6Var.b(ko4Var, ko4Var2).d != 0) {
                    K0 = Math.max(K0, K0(nm6Var, ko4Var2));
                }
            }
        }
        this.f1 = K0;
        HashSet hashSet = gt6.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24 && "OMX.SEC.aac.dec".equals(str2) && "samsung".equals(Build.MANUFACTURER)) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("herolte") || str3.startsWith("heroqlte")) {
                z = true;
                this.g1 = z;
                this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
                String str4 = nm6Var.c;
                int i4 = this.f1;
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                int i5 = ko4Var.N;
                str = ko4Var.t;
                mediaFormat.setInteger("channel-count", i5);
                int i6 = ko4Var.P;
                mediaFormat.setInteger("sample-rate", i6);
                ite.b(mediaFormat, ko4Var.w);
                ite.a(mediaFormat, "max-input-size", i4);
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
                    Pair b = rk2.b(ko4Var);
                    if (b != null) {
                        ite.a(mediaFormat, "profile", ((Integer) b.first).intValue());
                        ite.a(mediaFormat, "level", ((Integer) b.second).intValue());
                    }
                    if (i3 <= 28) {
                        mediaFormat.setInteger("ac4-is-sync", 1);
                    }
                }
                y30 y30Var = this.c1;
                if (i3 >= 24) {
                    if (((ja3) y30Var).j(gcc.G(4, ko4Var.N, i6)) == 2) {
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
                    t00 t00Var = ((ja3) y30Var).r;
                    sz szVar = t00Var instanceof n40 ? ((n40) t00Var).g : null;
                    int i7 = 12;
                    if (szVar == null) {
                        efd.f("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                        mediaFormat.setInteger("channel-mask", 12);
                        mediaFormat.setInteger("max-output-channel-count", 2);
                    } else {
                        bp5 bp5Var = ml5.a;
                        po5 po5Var = szVar.d;
                        int size = po5Var.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                i = 0;
                                break;
                            }
                            Object obj = po5Var.get(i8);
                            i8++;
                            Integer num = (Integer) obj;
                            i = num.intValue();
                            if (ml5.a.contains(num)) {
                                break;
                            }
                        }
                        if (i != 0) {
                            i7 = i;
                        } else {
                            po5 po5Var2 = szVar.c;
                            int size2 = po5Var2.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size2) {
                                    break;
                                }
                                Object obj2 = po5Var2.get(i9);
                                i9++;
                                Integer num2 = (Integer) obj2;
                                int intValue = num2.intValue();
                                if (ml5.a.contains(num2)) {
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
                this.j1 = ("audio/raw".equals(nm6Var.b) || "audio/raw".equals(str)) ? null : ko4Var;
                return new fp(nm6Var, mediaFormat, ko4Var, null, mediaCrypto, this.d1);
            }
        }
        z = false;
        this.g1 = z;
        this.h1 = !str2.equals("OMX.google.opus.decoder") || str2.equals("c2.android.opus.decoder") || str2.equals("OMX.google.vorbis.decoder") || str2.equals("c2.android.vorbis.decoder");
        String str42 = nm6Var.c;
        int i42 = this.f1;
        MediaFormat mediaFormat2 = new MediaFormat();
        mediaFormat2.setString("mime", str42);
        int i52 = ko4Var.N;
        str = ko4Var.t;
        mediaFormat2.setInteger("channel-count", i52);
        int i62 = ko4Var.P;
        mediaFormat2.setInteger("sample-rate", i62);
        ite.b(mediaFormat2, ko4Var.w);
        ite.a(mediaFormat2, "max-input-size", i42);
        mediaFormat2.setInteger("priority", 0);
        if (f != -1.0f) {
        }
        if ("audio/ac4".equals(str)) {
        }
        y30 y30Var2 = this.c1;
        if (i3 >= 24) {
        }
        if (i3 >= 32) {
        }
        if (i3 >= 35) {
        }
        if (Objects.equals(str, "audio/iamf")) {
        }
        K(mediaFormat2);
        this.j1 = ("audio/raw".equals(nm6Var.b) || "audio/raw".equals(str)) ? null : ko4Var;
        return new fp(nm6Var, mediaFormat2, ko4Var, null, mediaCrypto, this.d1);
    }

    @Override // qm6
    public final void a0(s93 s93Var) {
        ko4 ko4Var;
        oh2 oh2Var;
        if (Build.VERSION.SDK_INT < 29 || (ko4Var = s93Var.a) == null || !Objects.equals(ko4Var.t, "audio/opus") || !this.x0) {
            return;
        }
        ByteBuffer byteBuffer = s93Var.f;
        byteBuffer.getClass();
        ko4 ko4Var2 = s93Var.a;
        ko4Var2.getClass();
        int i = ko4Var2.R;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            ja3 ja3Var = (ja3) this.c1;
            l40 l40Var = ja3Var.t;
            if (l40Var == null || !l40Var.c() || (oh2Var = ja3Var.p) == null || !((s00) oh2Var.e).k) {
                return;
            }
            ja3Var.t.d(i, i2);
        }
    }

    @Override // hm6
    public final void c(of8 of8Var) {
        ((ja3) this.c1).C(of8Var);
    }

    @Override // qm6, vg0, lg8
    public final void d(int i, Object obj) {
        fi6 fi6Var;
        y30 y30Var = this.c1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            ja3 ja3Var = (ja3) y30Var;
            if (ja3Var.K != floatValue) {
                ja3Var.K = floatValue;
                if (ja3Var.p()) {
                    ja3Var.t.a.setVolume(ja3Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            oz ozVar = (oz) obj;
            ozVar.getClass();
            ja3 ja3Var2 = (ja3) y30Var;
            if (ja3Var2.u.equals(ozVar)) {
                return;
            }
            ja3Var2.u = ozVar;
            if (ja3Var2.Y) {
                return;
            }
            ja3Var2.v();
            return;
        }
        if (i == 6) {
            va0 va0Var = (va0) obj;
            va0Var.getClass();
            ((ja3) y30Var).A(va0Var);
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            ja3 ja3Var3 = (ja3) y30Var;
            ja3Var3.W = audioDeviceInfo;
            l40 l40Var = ja3Var3.t;
            if (l40Var != null) {
                l40Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.p1 = ((Integer) obj).intValue();
            jm6 jm6Var = this.c0;
            if (jm6Var == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.p1));
            jm6Var.setParameters(bundle);
            return;
        }
        if (i == 9) {
            obj.getClass();
            ja3 ja3Var4 = (ja3) y30Var;
            ja3Var4.y = ((Boolean) obj).booleanValue();
            ia3 ia3Var = new ia3(ja3Var4.E() ? of8.d : ja3Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (ja3Var4.p()) {
                ja3Var4.v = ia3Var;
                return;
            } else {
                ja3Var4.w = ia3Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ((ja3) y30Var).z(intValue);
            if (Build.VERSION.SDK_INT < 35 || (fi6Var = this.d1) == null) {
                return;
            }
            fi6Var.d(intValue);
            return;
        }
        if (i != 19) {
            if (i != 20) {
                super.d(i, obj);
                return;
            } else {
                obj.getClass();
                ((ja3) y30Var).y((t00) obj);
                return;
            }
        }
        obj.getClass();
        int intValue2 = ((Integer) obj).intValue();
        ja3 ja3Var5 = (ja3) y30Var;
        if (intValue2 == 0 || intValue2 == -1) {
            intValue2 = -1;
        }
        if (ja3Var5.X != intValue2) {
            ja3Var5.X = intValue2;
            ja3Var5.v();
        }
    }

    @Override // hm6
    public final of8 f() {
        return ((ja3) this.c1).x;
    }

    @Override // hm6
    public final long g() {
        if (this.n == 2) {
            M0();
        }
        return this.k1;
    }

    @Override // qm6
    public final void g0(Exception exc) {
        efd.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 0));
        }
    }

    @Override // hm6
    public final boolean h() {
        boolean z = this.n1;
        this.n1 = false;
        return z;
    }

    @Override // qm6
    public final void h0(long j, long j2, String str) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new o30((Object) lh2Var, (Object) str, j, j2, (byte) 0));
        }
    }

    @Override // qm6
    public final void i0(pk2 pk2Var) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new a30(lh2Var, pk2Var, (byte) 2));
        }
    }

    @Override // qm6
    public final void j0(String str) {
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new a30(lh2Var, str, (byte) 1));
        }
    }

    @Override // qm6
    public final w93 k0(ym4 ym4Var) {
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        this.i1 = ko4Var;
        w93 k0 = super.k0(ym4Var);
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new es6(lh2Var, ko4Var, k0, (byte) 13));
        }
        return k0;
    }

    @Override // vg0
    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    @Override // qm6
    public final void l0(ko4 ko4Var, MediaFormat mediaFormat) {
        int integer;
        ko4 ko4Var2 = this.j1;
        lo5 lo5Var = null;
        if (ko4Var2 != null) {
            ko4Var = ko4Var2;
        } else if (this.c0 != null) {
            mediaFormat.getClass();
            String str = ko4Var.t;
            int i = ko4Var.N;
            int F = "audio/raw".equals(str) ? ko4Var.Q : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? gcc.F(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            int integer2 = mediaFormat.getInteger("channel-count");
            int i2 = ko4Var.O;
            if (i2 == -1 || i != integer2) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i2 = integer;
            }
            jo4 jo4Var = new jo4();
            jo4Var.s = dg7.n("audio/raw");
            jo4Var.P = F;
            jo4Var.Q = ko4Var.R;
            jo4Var.R = ko4Var.S;
            jo4Var.l = ko4Var.m;
            jo4Var.a = ko4Var.a;
            jo4Var.b = ko4Var.b;
            jo4Var.c = po5.q(ko4Var.c);
            jo4Var.d = ko4Var.d;
            jo4Var.e = ko4Var.e;
            jo4Var.f = ko4Var.f;
            jo4Var.M = integer2;
            jo4Var.N = i2;
            jo4Var.O = mediaFormat.getInteger("sample-rate");
            ko4Var = new ko4(jo4Var);
            boolean z = this.g1;
            int i3 = ko4Var.N;
            if (z && i3 == 6 && i < 6) {
                yve.c(i, "Invalid initialCapacity: %s", i >= 0);
                int[] iArr = new int[i];
                int i4 = 0;
                int i5 = 0;
                while (i4 < i) {
                    int i6 = i5 + 1;
                    if (i6 > iArr.length) {
                        int length = iArr.length;
                        if (i6 < 0) {
                            hz6.e("cannot store more than MAX_VALUE elements");
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
                lo5Var = i5 == 0 ? lo5.c : new lo5(iArr, i5);
            } else if (this.h1) {
                if (i3 == 3) {
                    lo5Var = moc.a;
                } else if (i3 == 5) {
                    lo5Var = moc.b;
                } else if (i3 == 6) {
                    lo5Var = moc.c;
                } else if (i3 == 7) {
                    lo5Var = moc.d;
                } else if (i3 != 8) {
                    lo5 lo5Var2 = moc.a;
                } else {
                    lo5Var = moc.e;
                }
            }
        }
        try {
            int i8 = Build.VERSION.SDK_INT;
            y30 y30Var = this.c1;
            if (i8 >= 29) {
                if (this.x0) {
                    qa9 qa9Var = this.d;
                    qa9Var.getClass();
                    if (qa9Var.a != 0) {
                        qa9 qa9Var2 = this.d;
                        qa9Var2.getClass();
                        byte b = qa9Var2.a;
                        ja3 ja3Var = (ja3) y30Var;
                        yve.p(i8 >= 29);
                        ja3Var.i = b;
                    }
                }
                ja3 ja3Var2 = (ja3) y30Var;
                yve.p(i8 >= 29);
                ja3Var2.i = (byte) 0;
            }
            u8a u8aVar = new u8a(ko4Var);
            u8aVar.b = lo5Var;
            u8aVar.c = this.G;
            u8aVar.d = this.H;
            ((ja3) y30Var).c(u8aVar.h());
            G0(this.d0);
        } catch (t30 e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override // qm6
    public final void m0(long j) {
        ((ja3) this.c1).J = j;
    }

    @Override // vg0
    public final boolean n() {
        if (!this.K0) {
            return false;
        }
        ja3 ja3Var = (ja3) this.c1;
        if (ja3Var.p()) {
            return ja3Var.O && !ja3Var.n();
        }
        return true;
    }

    @Override // vg0
    public final boolean o() {
        if (((ja3) this.c1).n()) {
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

    @Override // qm6
    public final void o0() {
        ((ja3) this.c1).G = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0.l(r3.O0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw r1;
     */
    @Override // qm6, vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        lh2 lh2Var = this.b1;
        this.m1 = true;
        this.i1 = null;
        this.r1 = -9223372036854775807L;
        this.o1 = false;
        try {
            ((ja3) this.c1).f();
        } finally {
            super.q();
        }
    }

    @Override // vg0
    public final void r(boolean z, boolean z2) {
        p93 p93Var = new p93();
        this.O0 = p93Var;
        lh2 lh2Var = this.b1;
        Handler handler = (Handler) lh2Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new l30(lh2Var, p93Var, b));
        }
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        boolean z3 = qa9Var.b;
        y30 y30Var = this.c1;
        if (z3) {
            ja3 ja3Var = (ja3) y30Var;
            yve.p(ja3Var.S);
            if (!ja3Var.Y) {
                ja3Var.Y = true;
                ja3Var.v();
            }
        } else {
            ja3 ja3Var2 = (ja3) y30Var;
            if (ja3Var2.Y) {
                ja3Var2.Y = false;
                ja3Var2.v();
            }
        }
        ig8 ig8Var = this.f;
        ig8Var.getClass();
        ja3 ja3Var3 = (ja3) y30Var;
        ja3Var3.m = ig8Var;
        vgb vgbVar = this.h;
        vgbVar.getClass();
        ((n40) ja3Var3.r).f = vgbVar;
        ja3Var3.n = new xh4((Object) this, (byte) 13);
    }

    @Override // qm6
    public final boolean r0(long j, long j2, jm6 jm6Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ko4 ko4Var) {
        km6 km6Var;
        int i4;
        int i5;
        byteBuffer.getClass();
        this.r1 = -9223372036854775807L;
        if (this.j1 != null && (i2 & 2) != 0) {
            jm6Var.getClass();
            jm6Var.c(i);
            return true;
        }
        if (z) {
            if (jm6Var != null) {
                jm6Var.c(i);
            }
            this.O0.f += i3;
            ((ja3) this.c1).G = true;
            return true;
        }
        try {
            try {
                km6Var = this;
                try {
                    ff ffVar = new ff(km6Var, byteBuffer, j3, i3);
                    if (jm6Var != null) {
                        jm6Var.i(ffVar);
                    } else {
                        ffVar.run();
                    }
                    if (!km6Var.e1.get()) {
                        km6Var.r1 = j3;
                        return false;
                    }
                    if (jm6Var != null) {
                        jm6Var.c(i);
                    }
                    km6Var.O0.e += i3;
                    return true;
                } catch (u30 e) {
                    e = e;
                    u30 u30Var = e;
                    ko4 ko4Var2 = km6Var.i1;
                    if (km6Var.x0) {
                        qa9 qa9Var = km6Var.d;
                        qa9Var.getClass();
                        if (qa9Var.a != 0) {
                            i5 = 5004;
                            throw km6Var.e(u30Var, ko4Var2, u30Var.a, i5);
                        }
                    }
                    i5 = 5001;
                    throw km6Var.e(u30Var, ko4Var2, u30Var.a, i5);
                } catch (x30 e2) {
                    e = e2;
                    x30 x30Var = e;
                    if (km6Var.x0) {
                        qa9 qa9Var2 = km6Var.d;
                        qa9Var2.getClass();
                        if (qa9Var2.a != 0) {
                            i4 = 5003;
                            throw km6Var.e(x30Var, ko4Var, x30Var.b, i4);
                        }
                    }
                    i4 = 5002;
                    throw km6Var.e(x30Var, ko4Var, x30Var.b, i4);
                }
            } catch (u30 e3) {
                e = e3;
                km6Var = this;
            } catch (x30 e4) {
                e = e4;
                km6Var = this;
            }
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception e6) {
            vr9.l(e6);
            return false;
        }
    }

    @Override // qm6, vg0
    public final void s(long j, boolean z, boolean z2) {
        super.s(j, z, z2);
        ((ja3) this.c1).f();
        this.k1 = j;
        this.r1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
        this.n1 = false;
        this.o1 = false;
        this.l1 = true;
    }

    @Override // vg0
    public final void t() {
        fi6 fi6Var;
        ((n40) ((ja3) this.c1).r).d();
        if (Build.VERSION.SDK_INT < 35 || (fi6Var = this.d1) == null) {
            return;
        }
        fi6Var.b();
    }

    @Override // qm6
    public final void u0() {
        try {
            ((ja3) this.c1).t();
            long j = this.P0.h;
            if (j != -9223372036854775807L) {
                this.r1 = j;
            }
        } catch (x30 e) {
            throw e(e, e.c, e.b, this.x0 ? 5003 : 5002);
        }
    }

    @Override // vg0
    public final void v() {
        y30 y30Var = this.c1;
        this.n1 = false;
        this.o1 = false;
        this.r1 = -9223372036854775807L;
        try {
            try {
                this.x0 = false;
                v0();
                t0();
            } finally {
                bs2.C(this.X, null);
                this.X = null;
            }
        } finally {
            if (this.m1) {
                this.m1 = false;
                ((ja3) y30Var).w();
            }
        }
    }

    @Override // vg0
    public final void w() {
        ((ja3) this.c1).r();
        this.q1 = true;
    }

    @Override // vg0
    public final void x() {
        M0();
        this.q1 = false;
        ((ja3) this.c1).q();
        this.o1 = false;
        this.s1 = -9223372036854775807L;
        this.t1 = false;
    }

    @Override // vg0
    public final hm6 k() {
        return this;
    }
}
