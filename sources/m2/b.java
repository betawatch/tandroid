package m2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import b8.ce;
import b8.kg;
import b8.od;
import g9.s1;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public static final s1 e;
    public static final b f;
    public static final s1 g;
    public static final g9.l0 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final g9.i0 c;
    public final g9.i0 d;

    static {
        s1 u10 = g9.i0.u(12);
        e = u10;
        f = new b(g9.i0.u(a.d), u10, s1.e);
        Object[] objArr = {2, 5, 6};
        g9.o.e(3, objArr);
        g = g9.i0.o(3, objArr);
        kg kgVar = new kg(4, 8);
        kgVar.w(5, 6);
        kgVar.w(17, 6);
        kgVar.w(7, 6);
        kgVar.w(30, 10);
        kgVar.w(18, 6);
        kgVar.w(6, 8);
        kgVar.w(8, 8);
        kgVar.w(14, 8);
        h = kgVar.e(true);
    }

    public b(s1 s1Var, List list, List list2) {
        for (int i3 = 0; i3 < s1Var.d; i3++) {
            a aVar = (a) s1Var.get(i3);
            this.a.put(aVar.a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.a.valueAt(i11)).b);
        }
        this.b = i10;
        this.c = g9.i0.q(list);
        this.d = g9.i0.q(list2);
    }

    public static s1 a(int[] iArr, int i3) {
        g9.f0 p10 = g9.i0.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            p10.c(new a(i10, i3));
        }
        return p10.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b b(Context context, Intent intent, d2.f fVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager e10 = e2.h.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? g0.a.d(e10, fVar) : null;
        }
        g9.i0 b10 = audioDeviceInfo != null ? y0.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (g2.n0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return g0.a.c(e10, fVar, b10, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e10.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (ce.a(audioDeviceInfo2.getType())) {
                return new b(g9.i0.u(a.d), b10, list);
            }
        }
        g9.s0 s0Var = new g9.s0(4);
        s0Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (g2.n0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            s1 d = d2.d.d(fVar);
            d.getClass();
            s0Var.d(d);
            return new b(a(od.f(s0Var.g()), 10), b10, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            s1 s1Var = g;
            s1Var.getClass();
            s0Var.d(s1Var);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(od.f(s0Var.g()), 10), b10, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a10 = od.a(intArrayExtra);
            a10.getClass();
            s0Var.d(a10);
        }
        return new b(a(od.f(s0Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(d2.f fVar, d2.v vVar) {
        int t10;
        String str = vVar.s;
        str.getClass();
        int c2 = d2.u0.c(str, vVar.k);
        Integer valueOf = Integer.valueOf(c2);
        g9.l0 l0Var = h;
        if (!l0Var.containsKey(valueOf)) {
            return null;
        }
        int i3 = 6;
        SparseArray sparseArray = this.a;
        if (c2 == 18 && !g2.n0.k(sparseArray, 18)) {
            c2 = 6;
        } else if ((c2 == 8 && !g2.n0.k(sparseArray, 8)) || (c2 == 30 && !g2.n0.k(sparseArray, 30))) {
            c2 = 7;
        }
        if (!g2.n0.k(sparseArray, c2)) {
            return null;
        }
        a aVar = (a) sparseArray.get(c2);
        aVar.getClass();
        int i10 = aVar.b;
        g9.t0 t0Var = aVar.c;
        int i11 = vVar.K;
        boolean z10 = false;
        if (i11 == -1 || c2 == 18) {
            int i12 = vVar.L;
            if (i12 == -1) {
                i12 = 48000;
            }
            int i13 = aVar.a;
            if (t0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = d2.d.e(i13, i12, fVar);
                } else {
                    Object obj = l0Var.get(Integer.valueOf(i13));
                    i10 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i11 = i10;
        } else if (!vVar.s.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (t0Var != null) {
                int t11 = g2.n0.t(i11);
                if (t11 != 0) {
                    z10 = t0Var.contains(Integer.valueOf(t11));
                }
            } else if (i11 <= i10) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 <= 28) {
            if (i11 == 7) {
                i3 = 8;
            } else if (i11 != 3) {
                if (i11 != 4) {
                }
            }
            if (i14 <= 26 && "fugu".equals(Build.DEVICE) && i3 == 1) {
                i3 = 2;
            }
            t10 = g2.n0.t(i3);
            if (t10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c2), Integer.valueOf(t10));
        }
        i3 = i11;
        if (i14 <= 26) {
            i3 = 2;
        }
        t10 = g2.n0.t(i3);
        if (t10 != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g2.n0.m(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((g2.n0.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
