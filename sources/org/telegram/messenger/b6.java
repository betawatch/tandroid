package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.TaskExecutors;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b6 {
    public static double a;
    public static long b;
    public static final String[] c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static kv d;
    public static kv e;
    public static kv f;
    public static SharedPreferences g;

    public static void a(int i3) {
        SharedPreferences sharedPreferences = g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : g.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i3 + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static boolean b() {
        File file = new File("/proc/bus/input/devices");
        ArrayList arrayList = null;
        if (file.canRead()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("N: Name=\"")) {
                        String substring = readLine.substring(9, readLine.length() - 1);
                        if (!TextUtils.isEmpty(substring)) {
                            arrayList2.add(substring);
                        }
                    }
                }
                bufferedReader.close();
                arrayList = arrayList2;
            } catch (IOException e10) {
                a8.g(e10, true);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                for (int i10 = 0; i10 < 3; i10++) {
                    if (str.toLowerCase().contains(c[i10])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void c(String str, jc jcVar, ic icVar) {
        d(str, jcVar, icVar, false);
    }

    public static void d(String str, jc jcVar, ic icVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.b;
                synchronized (mb.g.b) {
                    mb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, jcVar, icVar, true);
                    return;
                } else {
                    icVar.s(e10);
                    a8.g(e10, false);
                    return;
                }
            } catch (Exception e11) {
                icVar.s(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                icVar.s(null);
                a8.g(th2, false);
                return;
            }
        }
        b8.gf.a().g(str).addOnSuccessListener(new p1(jcVar, 8)).addOnFailureListener(new p1(icVar, 9));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return a3.g.c(t0.b).a();
            }
            return (long) a;
        }
    }

    public static kv f(int i3) {
        if (i3 == 1) {
            return d;
        }
        if (i3 == 2) {
            return e;
        }
        if (i3 == 4) {
            return f;
        }
        return null;
    }

    public static boolean g() {
        return e() >= 3000000;
    }

    public static boolean h(int i3, long j10) {
        return g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i3), Long.valueOf(j10)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i3 = (sharedPreferences.getBoolean("save_gallery", false) && r2.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i3 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            kv kvVar = new kv();
            d = kvVar;
            boolean z10 = (i3 & 1) != 0;
            kvVar.b = z10;
            kvVar.a = z10;
            kvVar.c = 104857600L;
            kv.c(kvVar, "user", sharedPreferences);
            kv kvVar2 = new kv();
            e = kvVar2;
            kv kvVar3 = d;
            boolean z11 = (i3 & 2) != 0;
            kvVar3.b = z11;
            kvVar2.a = z11;
            kvVar2.c = 104857600L;
            kv.c(kvVar2, "groups", sharedPreferences);
            kv kvVar4 = new kv();
            f = kvVar4;
            boolean z12 = (i3 & 4) != 0;
            kvVar4.b = z12;
            kvVar4.a = z12;
            kvVar4.c = 104857600L;
            kv.c(kvVar4, "channels", sharedPreferences);
        } else {
            d = kv.d("user", sharedPreferences);
            e = kv.d("groups", sharedPreferences);
            f = kv.d("channels", sharedPreferences);
        }
        d.d = 1;
        e.d = 2;
        f.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i3 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i3; i10++) {
            iv ivVar = new iv();
            ivVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            ivVar.a = sharedPreferences.getBoolean(i10 + "_photo", false);
            ivVar.b = sharedPreferences.getBoolean(i10 + "_video", false);
            ivVar.c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j10 = ivVar.d;
            if (j10 != 0) {
                longSparseArray.put(j10, ivVar);
            }
        }
        return longSparseArray;
    }

    public static boolean k(int i3, e8 e8Var, zi ziVar, int i10) {
        kv kvVar;
        if (i3 == 1) {
            kvVar = d;
        } else {
            if (i3 != 4) {
                if (i3 == 2) {
                    kvVar = e;
                }
                return false;
            }
            kvVar = f;
        }
        kvVar.getClass();
        iv ivVar = (iv) h10.i(i10).m(kvVar.d).get(e8Var.a);
        if (ziVar == null || (!ziVar.Q3() && !ziVar.m4())) {
            boolean z10 = (ziVar != null && zi.M4(ziVar.k)) || e8Var.c == 3;
            long T1 = ziVar != null ? ziVar.T1() : e8Var.d;
            boolean z11 = kvVar.b;
            boolean z12 = kvVar.a;
            long j10 = kvVar.c;
            if (ivVar != null) {
                z11 = ivVar.b;
                z12 = ivVar.a;
                j10 = ivVar.c;
            }
            if (!z10 ? z12 : !(!z11 || (j10 != -1 && T1 >= j10))) {
                return true;
            }
        }
        return false;
    }

    public static void l(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            iv ivVar = (iv) longSparseArray.valueAt(i3);
            edit.putLong(com.google.android.recaptcha.internal.a.h(i3, "_dialog_id"), ivVar.d);
            edit.putBoolean(i3 + "_photo", ivVar.a);
            edit.putBoolean(i3 + "_video", ivVar.b);
            edit.putLong(i3 + "_limitVideo", ivVar.c);
        }
        edit.apply();
    }

    public static void m(int i3) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        if (i3 == 1) {
            kv.c(d, "user", sharedPreferences);
        } else if (i3 == 2) {
            kv.c(e, "groups", sharedPreferences);
        } else if (i3 == 4) {
            kv.c(f, "channels", sharedPreferences);
        }
    }

    public static void n(int i3, long j10) {
        g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i3), Long.valueOf(j10)), true).apply();
    }
}
