package n2;

import a8.wa;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import c8.e1;
import c8.z9;
import h9.t1;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b {
    public static final t1 e;
    public static final b f;
    public static final t1 g;
    public static final h9.l0 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final h9.i0 c;
    public final h9.i0 d;

    static {
        t1 u10 = h9.i0.u(12);
        e = u10;
        f = new b(h9.i0.u(a.d), u10, t1.e);
        Object[] objArr = {2, 5, 6};
        h9.o.e(3, objArr);
        g = h9.i0.o(3, objArr);
        wa waVar = new wa(4, 10);
        waVar.v(5, 6);
        waVar.v(17, 6);
        waVar.v(7, 6);
        waVar.v(30, 10);
        waVar.v(18, 6);
        waVar.v(6, 8);
        waVar.v(8, 8);
        waVar.v(14, 8);
        h = waVar.d(true);
    }

    public b(t1 t1Var, List list, List list2) {
        for (int i7 = 0; i7 < t1Var.d; i7++) {
            a aVar = (a) t1Var.get(i7);
            this.a.put(aVar.a, aVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.a.size(); i11++) {
            i10 = Math.max(i10, ((a) this.a.valueAt(i11)).b);
        }
        this.b = i10;
        this.c = h9.i0.q(list);
        this.d = h9.i0.q(list2);
    }

    public static t1 a(int[] iArr, int i7) {
        h9.f0 p10 = h9.i0.p();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            p10.c(new a(i10, i7));
        }
        return p10.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b b(Context context, Intent intent, e2.e eVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager d = f2.i.d(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? g0.a.d(d, eVar) : null;
        }
        h9.i0 b10 = audioDeviceInfo != null ? w0.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (h2.m0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return g0.a.c(d, eVar, b10, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? d.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (z9.a(audioDeviceInfo2.getType())) {
                return new b(h9.i0.u(a.d), b10, list);
            }
        }
        h9.s0 s0Var = new h9.s0(4);
        s0Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (h2.m0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            t1 d2 = ab.x.d(eVar);
            d2.getClass();
            s0Var.d(d2);
            return new b(a(e1.f(s0Var.g()), 10), b10, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z9 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z9) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            t1 t1Var = g;
            t1Var.getClass();
            s0Var.d(t1Var);
        }
        if (intent == null || z9 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(e1.f(s0Var.g()), 10), b10, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a10 = e1.a(intArrayExtra);
            a10.getClass();
            s0Var.d(a10);
        }
        return new b(a(e1.f(s0Var.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), b10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(e2.e eVar, e2.u uVar) {
        int t6;
        String str = uVar.s;
        str.getClass();
        int c10 = e2.s0.c(str, uVar.k);
        Integer valueOf = Integer.valueOf(c10);
        h9.l0 l0Var = h;
        if (!l0Var.containsKey(valueOf)) {
            return null;
        }
        int i7 = 6;
        SparseArray sparseArray = this.a;
        if (c10 == 18 && !h2.m0.k(sparseArray, 18)) {
            c10 = 6;
        } else if ((c10 == 8 && !h2.m0.k(sparseArray, 8)) || (c10 == 30 && !h2.m0.k(sparseArray, 30))) {
            c10 = 7;
        }
        if (!h2.m0.k(sparseArray, c10)) {
            return null;
        }
        a aVar = (a) sparseArray.get(c10);
        aVar.getClass();
        int i10 = aVar.b;
        h9.t0 t0Var = aVar.c;
        int i11 = uVar.K;
        boolean z9 = false;
        if (i11 == -1 || c10 == 18) {
            int i12 = uVar.L;
            if (i12 == -1) {
                i12 = 48000;
            }
            int i13 = aVar.a;
            if (t0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = ab.x.e(i13, i12, eVar);
                } else {
                    Object obj = l0Var.get(Integer.valueOf(i13));
                    i10 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i11 = i10;
        } else if (!uVar.s.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (t0Var != null) {
                int t10 = h2.m0.t(i11);
                if (t10 != 0) {
                    z9 = t0Var.contains(Integer.valueOf(t10));
                }
            } else if (i11 <= i10) {
                z9 = true;
            }
            if (!z9) {
                return null;
            }
        } else if (i11 > 10) {
            return null;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 <= 28) {
            if (i11 == 7) {
                i7 = 8;
            } else if (i11 != 3) {
                if (i11 != 4) {
                }
            }
            if (i14 <= 26 && "fugu".equals(Build.DEVICE) && i7 == 1) {
                i7 = 2;
            }
            t6 = h2.m0.t(i7);
            if (t6 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c10), Integer.valueOf(t6));
        }
        i7 = i11;
        if (i14 <= 26) {
            i7 = 2;
        }
        t6 = h2.m0.t(i7);
        if (t6 != 0) {
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
        return h2.m0.m(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((h2.m0.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
