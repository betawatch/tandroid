package b6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.q5;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class m {
    public static final Object a = new Object();
    public static boolean b;
    public static int c;

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(ai.k("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void k(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.common.api.f m(Status status) {
        return status.c != null ? new com.google.android.gms.common.api.p(status) : new com.google.android.gms.common.api.f(status);
    }

    public static Task n(q5 q5Var, l lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        q5Var.b(new u(q5Var, taskCompletionSource, lVar));
        return taskCompletionSource.getTask();
    }
}
