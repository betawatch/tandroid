package h5;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public a0(Handler handler) {
        this.a = handler;
    }

    public static z b() {
        z zVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                zVar = arrayList.isEmpty() ? new z() : (z) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public final z a(int i10, Object obj) {
        z b10 = b();
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
