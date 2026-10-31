package org.telegram.messenger;

import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class v2 {
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
        if (w0.b != null) {
            w0.b.getSharedPreferences("systemConfig", 0);
            a = true;
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: org.telegram.messenger.u2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    f8.i(th2, false);
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
            j = Boolean.valueOf(w0.b != null && "org.telegram.messenger.beta".equals(w0.b.getPackageName()));
        }
        return j.booleanValue();
    }

    public static boolean b() {
        c5.m mVar;
        if (u1.n) {
            return true;
        }
        w0.u();
        a();
        w0.r();
        if (u1.i().k() && (mVar = u1.l) != null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ArrayList arrayList2 = ((c5.l) obj).b.a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    c5.j jVar = (c5.j) obj2;
                    ArrayList arrayList3 = vp.r1(d20.s0).l7;
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        if (Objects.equals(jVar.c, (String) obj3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
