package org.telegram.messenger;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class c6 {
    public static double a;
    public static long b;
    public static final String[] c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static mv d;
    public static mv e;
    public static mv f;
    public static SharedPreferences g;

    public static void a(int i7) {
        SharedPreferences sharedPreferences = g;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : g.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i7 + "_")) {
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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

    public static void c(String str, nc ncVar, mc mcVar) {
        d(str, ncVar, mcVar, false);
    }

    public static void d(String str, nc ncVar, mc mcVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.b;
                synchronized (pb.g.b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, ncVar, mcVar, true);
                    return;
                } else {
                    mcVar.q(e10);
                    a8.g(e10, false);
                    return;
                }
            } catch (Exception e11) {
                mcVar.q(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                mcVar.q(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.ec.a().h(str).addOnSuccessListener(new j1(ncVar, 10)).addOnFailureListener(new j1(mcVar, 11));
    }

    public static synchronized long e() {
        synchronized (c6.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return b3.g.c(t0.b).a();
            }
            return (long) a;
        }
    }

    public static mv f(int i7) {
        if (i7 == 1) {
            return d;
        }
        if (i7 == 2) {
            return e;
        }
        if (i7 == 4) {
            return f;
        }
        return null;
    }

    public static boolean g() {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) t0.b.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke(appOpsManager, 10020, Integer.valueOf(Process.myUid()), t0.b.getPackageName())).intValue() == 0;
        } catch (Exception e10) {
            a8.g(e10, true);
            return true;
        }
    }

    public static boolean h() {
        return e() >= 3000000;
    }

    public static boolean i() {
        return !TextUtils.isEmpty(g0.k1("ro.miui.ui.version.name"));
    }

    public static boolean j(int i7, long j3) {
        return g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void k(SharedPreferences sharedPreferences) {
        int i7 = (sharedPreferences.getBoolean("save_gallery", false) && s2.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            mv mvVar = new mv();
            d = mvVar;
            boolean z10 = (i7 & 1) != 0;
            mvVar.b = z10;
            mvVar.a = z10;
            mvVar.c = 104857600L;
            mv.c(mvVar, "user", sharedPreferences);
            mv mvVar2 = new mv();
            e = mvVar2;
            mv mvVar3 = d;
            boolean z11 = (i7 & 2) != 0;
            mvVar3.b = z11;
            mvVar2.a = z11;
            mvVar2.c = 104857600L;
            mv.c(mvVar2, "groups", sharedPreferences);
            mv mvVar4 = new mv();
            f = mvVar4;
            boolean z12 = (i7 & 4) != 0;
            mvVar4.b = z12;
            mvVar4.a = z12;
            mvVar4.c = 104857600L;
            mv.c(mvVar4, "channels", sharedPreferences);
        } else {
            d = mv.d("user", sharedPreferences);
            e = mv.d("groups", sharedPreferences);
            f = mv.d("channels", sharedPreferences);
        }
        d.d = 1;
        e.d = 2;
        f.d = 4;
    }

    public static LongSparseArray l(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            kv kvVar = new kv();
            kvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            kvVar.a = sharedPreferences.getBoolean(i10 + "_photo", false);
            kvVar.b = sharedPreferences.getBoolean(i10 + "_video", false);
            kvVar.c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = kvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, kvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean m(int i7, e8 e8Var, fj fjVar, int i10) {
        mv mvVar;
        if (i7 == 1) {
            mvVar = d;
        } else {
            if (i7 != 4) {
                if (i7 == 2) {
                    mvVar = e;
                }
                return false;
            }
            mvVar = f;
        }
        mvVar.getClass();
        kv kvVar = (kv) j10.i(i10).m(mvVar.d).get(e8Var.a);
        if (fjVar == null || (!fjVar.P3() && !fjVar.l4())) {
            boolean z10 = (fjVar != null && fj.L4(fjVar.k)) || e8Var.c == 3;
            long S1 = fjVar != null ? fjVar.S1() : e8Var.d;
            boolean z11 = mvVar.b;
            boolean z12 = mvVar.a;
            long j3 = mvVar.c;
            if (kvVar != null) {
                z11 = kvVar.b;
                z12 = kvVar.a;
                j3 = kvVar.c;
            }
            if (!z10 ? z12 : !(!z11 || (j3 != -1 && S1 >= j3))) {
                return true;
            }
        }
        return false;
    }

    public static void n(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            kv kvVar = (kv) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.gms.internal.vision.e2.i(i7, "_dialog_id"), kvVar.d);
            edit.putBoolean(i7 + "_photo", kvVar.a);
            edit.putBoolean(i7 + "_video", kvVar.b);
            edit.putLong(i7 + "_limitVideo", kvVar.c);
        }
        edit.apply();
    }

    public static void o(int i7) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            mv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            mv.c(e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            mv.c(f, "channels", sharedPreferences);
        }
    }

    public static void p(int i7, long j3) {
        g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
