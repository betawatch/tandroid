package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ja(wb wbVar, int i10) {
        this.a = i10;
        this.b = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                wb wbVar = this.b;
                FrameLayout frameLayout = wbVar.h;
                bb bbVar = wbVar.e;
                ua uaVar = wbVar.p;
                if (uaVar != null && !bbVar.top) {
                    uaVar.c(0.0f);
                    wbVar.p.d(wbVar);
                }
                bbVar.transitionRunningExit = false;
                bbVar.onExitTransitionEnd();
                bbVar.onHide();
                frameLayout.removeView(wbVar.f);
                frameLayout.removeOnLayoutChangeListener(wbVar.c);
                bbVar.onDetach();
                Runnable runnable = wbVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                wb wbVar2 = this.b;
                FrameLayout frameLayout2 = wbVar2.h;
                frameLayout2.removeView(wbVar2.f);
                frameLayout2.removeOnLayoutChangeListener(wbVar2.c);
                break;
        }
    }
}
