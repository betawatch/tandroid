package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc b;

    public /* synthetic */ fb(sc scVar, int i10) {
        this.a = i10;
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                sc scVar = this.b;
                FrameLayout frameLayout = scVar.h;
                wb wbVar = scVar.e;
                qb qbVar = scVar.p;
                if (qbVar != null && !wbVar.top) {
                    qbVar.c(0.0f);
                    scVar.p.d(scVar);
                }
                wbVar.transitionRunningExit = false;
                wbVar.onExitTransitionEnd();
                wbVar.onHide();
                frameLayout.removeView(scVar.f);
                frameLayout.removeOnLayoutChangeListener(scVar.c);
                wbVar.onDetach();
                Runnable runnable = scVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                sc scVar2 = this.b;
                FrameLayout frameLayout2 = scVar2.h;
                frameLayout2.removeView(scVar2.f);
                frameLayout2.removeOnLayoutChangeListener(scVar2.c);
                break;
        }
    }
}
