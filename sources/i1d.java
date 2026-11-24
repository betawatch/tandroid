// default package

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i1d implements ey4, fy4 {
    public final /* synthetic */ j1d a;

    public /* synthetic */ i1d(j1d j1dVar) {
        this.a = j1dVar;
    }

    @Override // ey4
    public final void onConnected(Bundle bundle) {
        j1d j1dVar = this.a;
        fre.h(j1dVar.I);
        eha ehaVar = j1dVar.w;
        fre.h(ehaVar);
        ehaVar.B(new h1d(j1dVar));
    }

    @Override // fy4
    public final void onConnectionFailed(ds2 ds2Var) {
        j1d j1dVar = this.a;
        ReentrantLock reentrantLock = j1dVar.b;
        reentrantLock.lock();
        try {
            if (j1dVar.x && !ds2Var.b()) {
                j1dVar.f();
                j1dVar.b();
            } else {
                j1dVar.g(ds2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ey4
    public final void onConnectionSuspended(int i) {
    }
}
