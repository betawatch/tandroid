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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class b6 {
    public static double a;
    public static long b;
    public static final String[] c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static qv d;
    public static qv e;
    public static qv f;
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

    public static void c(String str, oc ocVar, nc ncVar) {
        d(str, ocVar, ncVar, false);
    }

    public static void d(String str, oc ocVar, nc ncVar, boolean z10) {
        if (z10) {
            try {
                Context context = t0.b;
                synchronized (pb.g.b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z10) {
                    d(str, ocVar, ncVar, true);
                    return;
                } else {
                    ncVar.r(e10);
                    a8.g(e10, false);
                    return;
                }
            } catch (Exception e11) {
                ncVar.r(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                ncVar.r(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.bc.a().g(str).addOnSuccessListener(new j1(ocVar, 9)).addOnFailureListener(new j1(ncVar, 10));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return b3.g.c(t0.b).a();
            }
            return (long) a;
        }
    }

    public static qv f(int i7) {
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
        int i7 = (sharedPreferences.getBoolean("save_gallery", false) && r2.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            qv qvVar = new qv();
            d = qvVar;
            boolean z10 = (i7 & 1) != 0;
            qvVar.b = z10;
            qvVar.a = z10;
            qvVar.c = 104857600L;
            qv.c(qvVar, "user", sharedPreferences);
            qv qvVar2 = new qv();
            e = qvVar2;
            qv qvVar3 = d;
            boolean z11 = (i7 & 2) != 0;
            qvVar3.b = z11;
            qvVar2.a = z11;
            qvVar2.c = 104857600L;
            qv.c(qvVar2, "groups", sharedPreferences);
            qv qvVar4 = new qv();
            f = qvVar4;
            boolean z12 = (i7 & 4) != 0;
            qvVar4.b = z12;
            qvVar4.a = z12;
            qvVar4.c = 104857600L;
            qv.c(qvVar4, "channels", sharedPreferences);
        } else {
            d = qv.d("user", sharedPreferences);
            e = qv.d("groups", sharedPreferences);
            f = qv.d("channels", sharedPreferences);
        }
        d.d = 1;
        e.d = 2;
        f.d = 4;
    }

    public static LongSparseArray l(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            ov ovVar = new ov();
            ovVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            ovVar.a = sharedPreferences.getBoolean(i10 + "_photo", false);
            ovVar.b = sharedPreferences.getBoolean(i10 + "_video", false);
            ovVar.c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = ovVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, ovVar);
            }
        }
        return longSparseArray;
    }

    public static boolean m(int i7, e8 e8Var, gj gjVar, int i10) {
        qv qvVar;
        if (i7 == 1) {
            qvVar = d;
        } else {
            if (i7 != 4) {
                if (i7 == 2) {
                    qvVar = e;
                }
                return false;
            }
            qvVar = f;
        }
        qvVar.getClass();
        ov ovVar = (ov) m10.i(i10).m(qvVar.d).get(e8Var.a);
        if (gjVar == null || (!gjVar.P3() && !gjVar.l4())) {
            boolean z10 = (gjVar != null && gj.L4(gjVar.k)) || e8Var.c == 3;
            long S1 = gjVar != null ? gjVar.S1() : e8Var.d;
            boolean z11 = qvVar.b;
            boolean z12 = qvVar.a;
            long j3 = qvVar.c;
            if (ovVar != null) {
                z11 = ovVar.b;
                z12 = ovVar.a;
                j3 = ovVar.c;
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
            ov ovVar = (ov) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.gms.internal.vision.e2.i(i7, "_dialog_id"), ovVar.d);
            edit.putBoolean(i7 + "_photo", ovVar.a);
            edit.putBoolean(i7 + "_video", ovVar.b);
            edit.putLong(i7 + "_limitVideo", ovVar.c);
        }
        edit.apply();
    }

    public static void o(int i7) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            qv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            qv.c(e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            qv.c(f, "channels", sharedPreferences);
        }
    }

    public static void p(int i7, long j3) {
        g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
