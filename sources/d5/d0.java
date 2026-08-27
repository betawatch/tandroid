package d5;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public d0(Handler handler) {
        this.a = handler;
    }

    public static c0 b() {
        c0 c0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                c0Var = arrayList.isEmpty() ? new c0() : (c0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    public final c0 a(int i10, Object obj) {
        c0 b10 = b();
        b10.a = this.a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.a.sendEmptyMessage(i10);
    }
}
