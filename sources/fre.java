// default package

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fre {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        w26.j(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        sc8.e();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ls6.u(sb, "Must be called on ", name2, " thread, but got ", name);
            fyb.k(sb, ".");
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        sc8.j(str);
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            w26.j("Given String is empty or null");
        }
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            w26.j(str2);
        }
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        fvc.f("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        fvc.f(str);
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        sc8.j(str);
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        sdb.a();
    }
}
