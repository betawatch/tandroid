package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class r2 {
    public static boolean a = true;
    public static final boolean b;
    public static final String c;
    public static final int d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static String h;
    public static final boolean i;
    public static Boolean j;

    static {
        b = Build.VERSION.SDK_INT <= 29;
        c = "13.2.0";
        d = 4;
        e = "014b35b6184100b085b0d0572f9b5103";
        f = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        g = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        h = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        i = true;
        if (t0.b != null) {
            t0.b.getSharedPreferences("systemConfig", 0);
            a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.telegram.messenger.q2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    a8.i(th2, false);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    }
                }
            });
        }
    }

    public static boolean a() {
        if (j == null) {
            j = Boolean.valueOf(t0.b != null && "org.telegram.messenger.beta".equals(t0.b.getPackageName()));
        }
        return j.booleanValue();
    }

    public static boolean b() {
        e5.l lVar;
        if (r1.n) {
            return true;
        }
        t0.u();
        a();
        t0.r();
        if (r1.i().k() && (lVar = r1.l) != null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ArrayList arrayList2 = ((e5.k) obj).b.b;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    e5.i iVar = (e5.i) obj2;
                    ArrayList arrayList3 = hp.s1(h10.t0).k7;
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        if (Objects.equals(iVar.c, (String) obj3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
