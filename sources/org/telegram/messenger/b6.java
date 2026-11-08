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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class b6 {
    public static double a;
    public static long b;
    public static final String[] c = {"bluestacks", "memuhyperv", "virtualbox"};
    public static sv d;
    public static sv e;
    public static sv f;
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

    public static void c(String str, pc pcVar, oc ocVar) {
        d(str, pcVar, ocVar, false);
    }

    public static void d(String str, pc pcVar, oc ocVar, boolean z9) {
        if (z9) {
            try {
                Context context = t0.b;
                synchronized (pb.g.b) {
                    pb.g.d(context, TaskExecutors.MAIN_THREAD);
                }
            } catch (IllegalStateException e10) {
                if (!z9) {
                    d(str, pcVar, ocVar, true);
                    return;
                } else {
                    ocVar.r(e10);
                    a8.g(e10, false);
                    return;
                }
            } catch (Exception e11) {
                ocVar.r(e11);
                a8.g(e11, true);
                return;
            } catch (Throwable th2) {
                ocVar.r(null);
                a8.g(th2, false);
                return;
            }
        }
        c8.ac.a().g(str).addOnSuccessListener(new j1(pcVar, 9)).addOnFailureListener(new j1(ocVar, 10));
    }

    public static synchronized long e() {
        synchronized (b6.class) {
            if (b == 0 || SystemClock.elapsedRealtime() - b > 60000) {
                return b3.g.c(t0.b).a();
            }
            return (long) a;
        }
    }

    public static sv f(int i7) {
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
        return e() >= 3000000;
    }

    public static boolean h(int i7, long j3) {
        return g.getBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), false);
    }

    public static void i(SharedPreferences sharedPreferences) {
        int i7 = (sharedPreferences.getBoolean("save_gallery", false) && r2.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i7 != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            sv svVar = new sv();
            d = svVar;
            boolean z9 = (i7 & 1) != 0;
            svVar.b = z9;
            svVar.a = z9;
            svVar.c = 104857600L;
            sv.c(svVar, "user", sharedPreferences);
            sv svVar2 = new sv();
            e = svVar2;
            sv svVar3 = d;
            boolean z10 = (i7 & 2) != 0;
            svVar3.b = z10;
            svVar2.a = z10;
            svVar2.c = 104857600L;
            sv.c(svVar2, "groups", sharedPreferences);
            sv svVar4 = new sv();
            f = svVar4;
            boolean z11 = (i7 & 4) != 0;
            svVar4.b = z11;
            svVar4.a = z11;
            svVar4.c = 104857600L;
            sv.c(svVar4, "channels", sharedPreferences);
        } else {
            d = sv.d("user", sharedPreferences);
            e = sv.d("groups", sharedPreferences);
            f = sv.d("channels", sharedPreferences);
        }
        d.d = 1;
        e.d = 2;
        f.d = 4;
    }

    public static LongSparseArray j(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i7 = sharedPreferences.getInt("count", 0);
        for (int i10 = 0; i10 < i7; i10++) {
            qv qvVar = new qv();
            qvVar.d = sharedPreferences.getLong(i10 + "_dialog_id", 0L);
            qvVar.a = sharedPreferences.getBoolean(i10 + "_photo", false);
            qvVar.b = sharedPreferences.getBoolean(i10 + "_video", false);
            qvVar.c = sharedPreferences.getLong(i10 + "_limitVideo", 104857600L);
            long j3 = qvVar.d;
            if (j3 != 0) {
                longSparseArray.put(j3, qvVar);
            }
        }
        return longSparseArray;
    }

    public static boolean k(int i7, e8 e8Var, ij ijVar, int i10) {
        sv svVar;
        if (i7 == 1) {
            svVar = d;
        } else {
            if (i7 != 4) {
                if (i7 == 2) {
                    svVar = e;
                }
                return false;
            }
            svVar = f;
        }
        svVar.getClass();
        qv qvVar = (qv) p10.i(i10).m(svVar.d).get(e8Var.a);
        if (ijVar == null || (!ijVar.Q3() && !ijVar.m4())) {
            boolean z9 = (ijVar != null && ij.M4(ijVar.k)) || e8Var.c == 3;
            long T1 = ijVar != null ? ijVar.T1() : e8Var.d;
            boolean z10 = svVar.b;
            boolean z11 = svVar.a;
            long j3 = svVar.c;
            if (qvVar != null) {
                z10 = qvVar.b;
                z11 = qvVar.a;
                j3 = qvVar.c;
            }
            if (!z9 ? z11 : !(!z10 || (j3 != -1 && T1 >= j3))) {
                return true;
            }
        }
        return false;
    }

    public static void l(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            qv qvVar = (qv) longSparseArray.valueAt(i7);
            edit.putLong(com.google.android.recaptcha.internal.a.i(i7, "_dialog_id"), qvVar.d);
            edit.putBoolean(i7 + "_photo", qvVar.a);
            edit.putBoolean(i7 + "_video", qvVar.b);
            edit.putLong(i7 + "_limitVideo", qvVar.c);
        }
        edit.apply();
    }

    public static void m(int i7) {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("mainconfig", 0);
        if (i7 == 1) {
            sv.c(d, "user", sharedPreferences);
        } else if (i7 == 2) {
            sv.c(e, "groups", sharedPreferences);
        } else if (i7 == 4) {
            sv.c(f, "channels", sharedPreferences);
        }
    }

    public static void n(int i7, long j3) {
        g.edit().putBoolean(String.format("confirm_shown_%d_%d", Integer.valueOf(i7), Long.valueOf(j3)), true).apply();
    }
}
