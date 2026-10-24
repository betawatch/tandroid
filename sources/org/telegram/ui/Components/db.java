package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc b;

    public /* synthetic */ db(qc qcVar, int i10) {
        this.a = i10;
        this.b = qcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                qc qcVar = this.b;
                FrameLayout frameLayout = qcVar.h;
                ub ubVar = qcVar.e;
                ob obVar = qcVar.p;
                if (obVar != null && !ubVar.top) {
                    obVar.c(0.0f);
                    qcVar.p.d(qcVar);
                }
                ubVar.transitionRunningExit = false;
                ubVar.onExitTransitionEnd();
                ubVar.onHide();
                frameLayout.removeView(qcVar.f);
                frameLayout.removeOnLayoutChangeListener(qcVar.c);
                ubVar.onDetach();
                Runnable runnable = qcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                qc qcVar2 = this.b;
                FrameLayout frameLayout2 = qcVar2.h;
                frameLayout2.removeView(qcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(qcVar2.c);
                break;
        }
    }
}
