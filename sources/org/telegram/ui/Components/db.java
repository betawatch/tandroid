package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
