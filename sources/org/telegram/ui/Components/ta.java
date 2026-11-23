package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc b;

    public /* synthetic */ ta(fc fcVar, int i7) {
        this.a = i7;
        this.b = fcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                fc fcVar = this.b;
                FrameLayout frameLayout = fcVar.h;
                kb kbVar = fcVar.e;
                eb ebVar = fcVar.p;
                if (ebVar != null && !kbVar.top) {
                    ebVar.c(0.0f);
                    fcVar.p.d(fcVar);
                }
                kbVar.transitionRunningExit = false;
                kbVar.onExitTransitionEnd();
                kbVar.onHide();
                frameLayout.removeView(fcVar.f);
                frameLayout.removeOnLayoutChangeListener(fcVar.c);
                kbVar.onDetach();
                Runnable runnable = fcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                fc fcVar2 = this.b;
                FrameLayout frameLayout2 = fcVar2.h;
                frameLayout2.removeView(fcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(fcVar2.c);
                break;
        }
    }
}
