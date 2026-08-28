package d5;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public c0(Handler handler) {
        this.a = handler;
    }

    public static b0 b() {
        b0 b0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                b0Var = arrayList.isEmpty() ? new b0() : (b0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    public final b0 a(int i9, Object obj) {
        b0 b10 = b();
        b10.a = this.a.obtainMessage(i9, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final boolean d(int i9) {
        return this.a.sendEmptyMessage(i9);
    }
}
