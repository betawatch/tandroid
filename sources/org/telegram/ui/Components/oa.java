package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac b;

    public /* synthetic */ oa(ac acVar, int i3) {
        this.a = i3;
        this.b = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                ac acVar = this.b;
                FrameLayout frameLayout = acVar.h;
                fb fbVar = acVar.e;
                za zaVar = acVar.p;
                if (zaVar != null && !fbVar.top) {
                    zaVar.c(0.0f);
                    acVar.p.d(acVar);
                }
                fbVar.transitionRunningExit = false;
                fbVar.onExitTransitionEnd();
                fbVar.onHide();
                frameLayout.removeView(acVar.f);
                frameLayout.removeOnLayoutChangeListener(acVar.c);
                fbVar.onDetach();
                Runnable runnable = acVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ac acVar2 = this.b;
                FrameLayout frameLayout2 = acVar2.h;
                frameLayout2.removeView(acVar2.f);
                frameLayout2.removeOnLayoutChangeListener(acVar2.c);
                break;
        }
    }
}
