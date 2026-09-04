package k2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import b2.r0;
import e9.a1;
import java.util.List;
import ji.u4;
import v7.x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public static final b c = new b(e9.i0.z(a.d));
    public static final a1 d;
    public static final e9.k0 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        e9.q.d(3, objArr);
        d = e9.i0.t(3, objArr);
        a5.a aVar = new a5.a(4, 5);
        aVar.t(5, 6);
        aVar.t(17, 6);
        aVar.t(7, 6);
        aVar.t(30, 10);
        aVar.t(18, 6);
        aVar.t(6, 8);
        aVar.t(8, 8);
        aVar.t(14, 8);
        e = aVar.c();
    }

    public b(a1 a1Var) {
        for (int i10 = 0; i10 < a1Var.d; i10++) {
            a aVar = (a) a1Var.get(i10);
            this.a.put(aVar.a, aVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.a.size(); i12++) {
            i11 = Math.max(i11, ((a) this.a.valueAt(i12)).b);
        }
        this.b = i11;
    }

    public static a1 a(int i10, int[] iArr) {
        e9.f0 u10 = e9.i0.u();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            u10.b(new a(i11, i10));
        }
        return u10.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r3.equals("Xiaomi") == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b b(Context context, Intent intent, b2.e eVar, u4 u4Var) {
        AudioManager e7 = c2.d.e(context);
        if (u4Var == null) {
            u4Var = Build.VERSION.SDK_INT >= 33 ? g0.a.d(e7, eVar) : null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (e2.d0.N(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return g0.a.c(e7, eVar);
        }
        if (i10 >= 23 && e0.b.o(e7, u4Var)) {
            return c;
        }
        e9.l0 l0Var = new e9.l0(4);
        l0Var.b(2);
        if (i10 >= 29 && (e2.d0.N(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            a1 d10 = b2.c.d(eVar);
            d10.getClass();
            l0Var.d(d10);
            return new b(a(10, x7.f(l0Var.i())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            a1 a1Var = d;
            a1Var.getClass();
            l0Var.d(a1Var);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(10, x7.f(l0Var.i())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List a2 = x7.a(intArrayExtra);
            a2.getClass();
            l0Var.d(a2);
        }
        return new b(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), x7.f(l0Var.i())));
    }

    public static b c(Context context, b2.e eVar, u4 u4Var) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, u4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r9 != 5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(b2.e eVar, b2.s sVar) {
        int s10;
        String str = sVar.r;
        str.getClass();
        int c10 = r0.c(str, sVar.k);
        Integer valueOf = Integer.valueOf(c10);
        e9.k0 k0Var = e;
        if (!k0Var.containsKey(valueOf)) {
            return null;
        }
        int i10 = 6;
        SparseArray sparseArray = this.a;
        if (c10 == 18 && !e2.d0.j(sparseArray, 18)) {
            c10 = 6;
        } else if ((c10 == 8 && !e2.d0.j(sparseArray, 8)) || (c10 == 30 && !e2.d0.j(sparseArray, 30))) {
            c10 = 7;
        }
        if (!e2.d0.j(sparseArray, c10)) {
            return null;
        }
        a aVar = (a) sparseArray.get(c10);
        aVar.getClass();
        int i11 = aVar.b;
        e9.m0 m0Var = aVar.c;
        int i12 = sVar.J;
        boolean z10 = false;
        if (i12 == -1 || c10 == 18) {
            int i13 = sVar.K;
            if (i13 == -1) {
                i13 = 48000;
            }
            int i14 = aVar.a;
            if (m0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i11 = b2.c.e(i14, i13, eVar);
                } else {
                    Object obj = k0Var.get(Integer.valueOf(i14));
                    i11 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i12 = i11;
        } else if (!sVar.r.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (m0Var != null) {
                int s11 = e2.d0.s(i12);
                if (s11 != 0) {
                    z10 = m0Var.contains(Integer.valueOf(s11));
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
            s10 = e2.d0.s(i10);
            if (s10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c10), Integer.valueOf(s10));
        }
        i10 = i12;
        if (i15 <= 26) {
            i10 = 2;
        }
        s10 = e2.d0.s(i10);
        if (s10 != 0) {
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
        return e2.d0.l(this.a, bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return (e2.d0.m(this.a) * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
