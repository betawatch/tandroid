package k2;

import a8.ed;
import a8.ld;
import a8.ng;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import f9.s1;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public static final s1 e;
    public static final b f;
    public static final s1 g;
    public static final f9.l0 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final f9.i0 c;
    public final f9.i0 d;

    static {
        s1 y3 = f9.i0.y(12);
        e = y3;
        f = new b(f9.i0.y(a.d), y3, s1.e);
        Object[] objArr = {2, 5, 6};
        f9.o.d(3, objArr);
        g = f9.i0.s(3, objArr);
        ng ngVar = new ng(4, 7);
        ngVar.w(5, 6);
        ngVar.w(17, 6);
        ngVar.w(7, 6);
        ngVar.w(30, 10);
        ngVar.w(18, 6);
        ngVar.w(6, 8);
        ngVar.w(8, 8);
        ngVar.w(14, 8);
        h = ngVar.c(true);
    }

    public b(s1 s1Var, List list, List list2) {
        for (int i10 = 0; i10 < s1Var.d; i10++) {
            a aVar = (a) s1Var.get(i10);
            this.a.put(aVar.a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.a.valueAt(i12)).b);
        }
        this.b = i11;
        this.c = f9.i0.u(list);
        this.d = f9.i0.u(list2);
    }

    public static s1 a(int i10, int[] iArr) {
        f9.f0 t10 = f9.i0.t();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            t10.c(new a(i11, i10));
        }
        return t10.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (r0.equals("Xiaomi") == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b b(Context context, Intent intent, b2.f fVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager e10 = c2.j.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? g0.a.b(e10, fVar) : null;
        }
        f9.i0 b10 = audioDeviceInfo != null ? a1.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (e2.n0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return g0.a.a(e10, fVar, b10, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e10.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (ld.a(audioDeviceInfo2.getType())) {
                return new b(f9.i0.y(a.d), b10, list);
            }
        }
        f9.s0 s0Var = new f9.s0(4);
        s0Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (e2.n0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            s1 e11 = b2.d.e(fVar);
            e11.getClass();
            s0Var.d(e11);
            return new b(a(10, ed.f(s0Var.g())), b10, list);
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
            return new b(a(10, ed.f(s0Var.g())), b10, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a2 = ed.a(intArrayExtra);
            a2.getClass();
            s0Var.d(a2);
        }
        return new b(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), ed.f(s0Var.g())), b10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(b2.f fVar, b2.x xVar) {
        int t10;
        String str = xVar.s;
        str.getClass();
        int c10 = b2.w0.c(str, xVar.k);
        Integer valueOf = Integer.valueOf(c10);
        f9.l0 l0Var = h;
        if (!l0Var.containsKey(valueOf)) {
            return null;
        }
        int i10 = 6;
        SparseArray sparseArray = this.a;
        if (c10 == 18 && !e2.n0.k(sparseArray, 18)) {
            c10 = 6;
        } else if ((c10 == 8 && !e2.n0.k(sparseArray, 8)) || (c10 == 30 && !e2.n0.k(sparseArray, 30))) {
            c10 = 7;
        }
        if (!e2.n0.k(sparseArray, c10)) {
            return null;
        }
        a aVar = (a) sparseArray.get(c10);
        aVar.getClass();
        int i11 = aVar.b;
        f9.t0 t0Var = aVar.c;
        int i12 = xVar.K;
        boolean z10 = false;
        if (i12 == -1 || c10 == 18) {
            int i13 = xVar.L;
            if (i13 == -1) {
                i13 = 48000;
            }
            int i14 = aVar.a;
            if (t0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i11 = b2.d.f(i14, i13, fVar);
                } else {
                    Object obj = l0Var.get(Integer.valueOf(i14));
                    i11 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i12 = i11;
        } else if (!xVar.s.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (t0Var != null) {
                int t11 = e2.n0.t(i12);
                if (t11 != 0) {
                    z10 = t0Var.contains(Integer.valueOf(t11));
                }
            } else if (i12 <= i11) {
                z10 = true;
            }
            if (!z10) {
                return null;
            }
        } else if (i12 > 10) {
            return null;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 <= 28) {
            if (i12 == 7) {
                i10 = 8;
            } else if (i12 != 3) {
                if (i12 != 4) {
                }
            }
            if (i15 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
                i10 = 2;
            }
            t10 = e2.n0.t(i10);
            if (t10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c10), Integer.valueOf(t10));
        }
        i10 = i12;
        if (i15 <= 26) {
            i10 = 2;
        }
        t10 = e2.n0.t(i10);
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
        return e2.n0.m(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((e2.n0.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
