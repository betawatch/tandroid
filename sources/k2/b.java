package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import e9.x1;
import j$.util.Objects;
import java.util.List;
import v7.b8;
import v7.c9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b {
    public static final x1 e;
    public static final b f;
    public static final x1 g;
    public static final e9.q0 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final e9.n0 c;
    public final e9.n0 d;

    static {
        x1 y3 = e9.n0.y(12);
        e = y3;
        f = new b(e9.n0.y(a.d), y3, x1.e);
        Object[] objArr = {2, 5, 6};
        e9.s.d(3, objArr);
        g = e9.n0.s(3, objArr);
        a5.a aVar = new a5.a(4, 5);
        aVar.x(5, 6);
        aVar.x(17, 6);
        aVar.x(7, 6);
        aVar.x(30, 10);
        aVar.x(18, 6);
        aVar.x(6, 8);
        aVar.x(8, 8);
        aVar.x(14, 8);
        h = aVar.d(true);
    }

    public b(x1 x1Var, List list, List list2) {
        for (int i10 = 0; i10 < x1Var.d; i10++) {
            a aVar = (a) x1Var.get(i10);
            this.a.put(aVar.a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.a.valueAt(i12)).b);
        }
        this.b = i11;
        this.c = e9.n0.u(list);
        this.d = e9.n0.u(list2);
    }

    public static x1 a(int i10, int[] iArr) {
        e9.k0 t10 = e9.n0.t();
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
        AudioManager e7 = c2.i.e(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? g0.a.d(e7, fVar) : null;
        }
        e9.n0 b10 = audioDeviceInfo != null ? z0.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (e2.m0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return g0.a.c(e7, fVar, b10, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? e7.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (c9.a(audioDeviceInfo2.getType())) {
                return new b(e9.n0.y(a.d), b10, list);
            }
        }
        e9.x0 x0Var = new e9.x0(4);
        x0Var.c(2);
        if (Build.VERSION.SDK_INT >= 29 && (e2.m0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            x1 e10 = b2.d.e(fVar);
            e10.getClass();
            x0Var.d(e10);
            return new b(a(10, b8.f(x0Var.g())), b10, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            x1 x1Var = g;
            x1Var.getClass();
            x0Var.d(x1Var);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(10, b8.f(x0Var.g())), b10, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a2 = b8.a(intArrayExtra);
            a2.getClass();
            x0Var.d(a2);
        }
        return new b(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), b8.f(x0Var.g())), b10, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(b2.f fVar, b2.w wVar) {
        int t10;
        String str = wVar.s;
        str.getClass();
        int c10 = b2.v0.c(str, wVar.k);
        Integer valueOf = Integer.valueOf(c10);
        e9.q0 q0Var = h;
        if (!q0Var.containsKey(valueOf)) {
            return null;
        }
        int i10 = 6;
        SparseArray sparseArray = this.a;
        if (c10 == 18 && !e2.m0.k(sparseArray, 18)) {
            c10 = 6;
        } else if ((c10 == 8 && !e2.m0.k(sparseArray, 8)) || (c10 == 30 && !e2.m0.k(sparseArray, 30))) {
            c10 = 7;
        }
        if (!e2.m0.k(sparseArray, c10)) {
            return null;
        }
        a aVar = (a) sparseArray.get(c10);
        aVar.getClass();
        int i11 = aVar.b;
        e9.y0 y0Var = aVar.c;
        int i12 = wVar.K;
        boolean z10 = false;
        if (i12 == -1 || c10 == 18) {
            int i13 = wVar.L;
            if (i13 == -1) {
                i13 = 48000;
            }
            int i14 = aVar.a;
            if (y0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i11 = b2.d.f(i14, i13, fVar);
                } else {
                    Object obj = q0Var.get(Integer.valueOf(i14));
                    i11 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i12 = i11;
        } else if (!wVar.s.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (y0Var != null) {
                int t11 = e2.m0.t(i12);
                if (t11 != 0) {
                    z10 = y0Var.contains(Integer.valueOf(t11));
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
            t10 = e2.m0.t(i10);
            if (t10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c10), Integer.valueOf(t10));
        }
        i10 = i12;
        if (i15 <= 26) {
            i10 = 2;
        }
        t10 = e2.m0.t(i10);
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
        return e2.m0.m(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((e2.m0.n(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
