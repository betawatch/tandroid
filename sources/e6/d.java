package e6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.car.app.j;
import g7.b8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d {
    public static String a;
    public static int b;
    public static Boolean c;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int i9 = b;
                if (i9 == 0) {
                    i9 = Process.myPid();
                    b = i9;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i9 > 0) {
                    try {
                        String str2 = "/proc/" + i9 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                l.h(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                b.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    b.a(bufferedReader);
                }
                a = str;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new j(b8.a(objArr));
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
