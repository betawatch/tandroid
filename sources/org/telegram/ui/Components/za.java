package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mc b;

    public /* synthetic */ za(mc mcVar, int i10) {
        this.a = i10;
        this.b = mcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                mc mcVar = this.b;
                FrameLayout frameLayout = mcVar.h;
                rb rbVar = mcVar.e;
                kb kbVar = mcVar.p;
                if (kbVar != null && !rbVar.top) {
                    kbVar.c(0.0f);
                    mcVar.p.d(mcVar);
                }
                rbVar.transitionRunningExit = false;
                rbVar.onExitTransitionEnd();
                rbVar.onHide();
                frameLayout.removeView(mcVar.f);
                frameLayout.removeOnLayoutChangeListener(mcVar.c);
                rbVar.onDetach();
                Runnable runnable = mcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                mc mcVar2 = this.b;
                FrameLayout frameLayout2 = mcVar2.h;
                frameLayout2.removeView(mcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(mcVar2.c);
                break;
        }
    }
}
