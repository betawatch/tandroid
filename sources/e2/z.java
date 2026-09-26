package e2;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class z {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public z(Handler handler) {
        this.a = handler;
    }

    public static y b() {
        y yVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                yVar = arrayList.isEmpty() ? new y() : (y) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public final y a(int i10, Object obj) {
        y b10 = b();
        b10.a = this.a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void d(int i10) {
        d.b(i10 != 0);
        this.a.removeMessages(i10);
    }

    public final boolean e(int i10) {
        return this.a.sendEmptyMessage(i10);
    }
}
