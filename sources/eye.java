// default package

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class eye {
    public static kt9 a;
    public static kt9 b;
    public static kt9 c;

    public static kt9 a(int i) {
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 4) {
            return c;
        }
        return null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        int i = (sharedPreferences.getBoolean("save_gallery", false) && f11.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            kt9 kt9Var = new kt9();
            a = kt9Var;
            boolean z = (i & 1) != 0;
            kt9Var.b = z;
            kt9Var.a = z;
            kt9Var.c = 104857600L;
            kt9Var.e("user", sharedPreferences);
            kt9 kt9Var2 = new kt9();
            b = kt9Var2;
            kt9 kt9Var3 = a;
            boolean z2 = (i & 2) != 0;
            kt9Var3.b = z2;
            kt9Var2.a = z2;
            kt9Var2.c = 104857600L;
            kt9Var2.e("groups", sharedPreferences);
            kt9 kt9Var4 = new kt9();
            c = kt9Var4;
            boolean z3 = (i & 4) != 0;
            kt9Var4.b = z3;
            kt9Var4.a = z3;
            kt9Var4.c = 104857600L;
            kt9Var4.e("channels", sharedPreferences);
        } else {
            a = kt9.d("user", sharedPreferences);
            b = kt9.d("groups", sharedPreferences);
            c = kt9.d("channels", sharedPreferences);
        }
        a.d = (byte) 1;
        b.d = (byte) 2;
        c.d = (byte) 4;
    }

    public static LongSparseArray c(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            it9 it9Var = new it9();
            it9Var.d = sharedPreferences.getLong(i2 + "_dialog_id", 0L);
            it9Var.a = sharedPreferences.getBoolean(i2 + "_photo", false);
            it9Var.b = sharedPreferences.getBoolean(i2 + "_video", false);
            it9Var.c = sharedPreferences.getLong(i2 + "_limitVideo", 104857600L);
            long j = it9Var.d;
            if (j != 0) {
                longSparseArray.put(j, it9Var);
            }
        }
        return longSparseArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r47.K4(r9.k) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i, hc4 hc4Var, r47 r47Var, int i2) {
        kt9 kt9Var;
        boolean z;
        if (i == 1) {
            kt9Var = a;
        } else {
            if (i != 4) {
                if (i == 2) {
                    kt9Var = b;
                }
            }
            kt9Var = c;
        }
        kt9Var.getClass();
        it9 it9Var = (it9) yac.h(i2).l(kt9Var.d).get(hc4Var.a);
        if (r47Var != null) {
            if (!r47Var.O3() && !r47Var.k4()) {
            }
        }
        if (hc4Var.c != 3) {
            z = false;
            long S1 = r47Var == null ? r47Var.S1() : hc4Var.d;
            boolean z2 = kt9Var.b;
            boolean z3 = kt9Var.a;
            long j = kt9Var.c;
            if (it9Var != null) {
                z2 = it9Var.b;
                z3 = it9Var.a;
                j = it9Var.c;
            }
            return z ? z3 : !(!z2 || (j != -1 && S1 >= j));
        }
        z = true;
        if (r47Var == null) {
        }
        boolean z22 = kt9Var.b;
        boolean z32 = kt9Var.a;
        long j2 = kt9Var.c;
        if (it9Var != null) {
        }
        if (z) {
        }
    }

    public static void e(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i = 0; i < longSparseArray.size(); i++) {
            it9 it9Var = (it9) longSparseArray.valueAt(i);
            edit.putLong(bp1.n(i, "_dialog_id"), it9Var.d);
            edit.putBoolean(i + "_photo", it9Var.a);
            edit.putBoolean(i + "_video", it9Var.b);
            edit.putLong(i + "_limitVideo", it9Var.c);
        }
        edit.apply();
    }

    public static void f(int i) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        if (i == 1) {
            a.e("user", sharedPreferences);
        } else if (i == 2) {
            b.e("groups", sharedPreferences);
        } else if (i == 4) {
            c.e("channels", sharedPreferences);
        }
    }
}
