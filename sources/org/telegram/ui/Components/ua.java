package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic b;

    public /* synthetic */ ua(ic icVar, int i10) {
        this.a = i10;
        this.b = icVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                ic icVar = this.b;
                FrameLayout frameLayout = icVar.h;
                nb nbVar = icVar.e;
                fb fbVar = icVar.p;
                if (fbVar != null && !nbVar.top) {
                    fbVar.c(0.0f);
                    icVar.p.d(icVar);
                }
                nbVar.transitionRunningExit = false;
                nbVar.onExitTransitionEnd();
                nbVar.onHide();
                frameLayout.removeView(icVar.f);
                frameLayout.removeOnLayoutChangeListener(icVar.c);
                nbVar.onDetach();
                Runnable runnable = icVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ic icVar2 = this.b;
                FrameLayout frameLayout2 = icVar2.h;
                frameLayout2.removeView(icVar2.f);
                frameLayout2.removeOnLayoutChangeListener(icVar2.c);
                break;
        }
    }
}
