// default package

import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k3d implements f05, g05 {
    public final /* synthetic */ l3d a;

    public /* synthetic */ k3d(l3d l3dVar) {
        this.a = l3dVar;
    }

    @Override // f05
    public final void onConnected(Bundle bundle) {
        l3d l3dVar = this.a;
        ite.h(l3dVar.I);
        gja gjaVar = l3dVar.w;
        ite.h(gjaVar);
        gjaVar.B(new j3d(l3dVar));
    }

    @Override // g05
    public final void onConnectionFailed(ot2 ot2Var) {
        l3d l3dVar = this.a;
        ReentrantLock reentrantLock = l3dVar.b;
        reentrantLock.lock();
        try {
            if (l3dVar.x && !ot2Var.b()) {
                l3dVar.f();
                l3dVar.b();
            } else {
                l3dVar.g(ot2Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // f05
    public final void onConnectionSuspended(int i) {
    }
}
