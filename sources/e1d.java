// default package

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e1d implements eg0 {
    public final WeakReference a;
    public final yn b;
    public final boolean c;

    public e1d(j1d j1dVar, yn ynVar, boolean z) {
        this.a = new WeakReference(j1dVar);
        this.b = ynVar;
        this.c = z;
    }

    @Override // eg0
    public final void a(ds2 ds2Var) {
        j1d j1dVar = (j1d) this.a.get();
        if (j1dVar == null) {
            return;
        }
        ReentrantLock reentrantLock = j1dVar.b;
        fre.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == j1dVar.a.o.h);
        reentrantLock.lock();
        try {
            if (j1dVar.j(0)) {
                if (!ds2Var.c()) {
                    j1dVar.d(ds2Var, this.b, this.c);
                }
                if (j1dVar.k()) {
                    j1dVar.b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
