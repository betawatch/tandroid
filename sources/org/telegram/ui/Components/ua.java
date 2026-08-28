package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;

    public /* synthetic */ ua(gc gcVar, int i9) {
        this.a = i9;
        this.b = gcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                gc gcVar = this.b;
                FrameLayout frameLayout = gcVar.h;
                lb lbVar = gcVar.e;
                fb fbVar = gcVar.p;
                if (fbVar != null && !lbVar.top) {
                    fbVar.c(0.0f);
                    gcVar.p.d(gcVar);
                }
                lbVar.transitionRunningExit = false;
                lbVar.onExitTransitionEnd();
                lbVar.onHide();
                frameLayout.removeView(gcVar.f);
                frameLayout.removeOnLayoutChangeListener(gcVar.c);
                lbVar.onDetach();
                Runnable runnable = gcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                gc gcVar2 = this.b;
                FrameLayout frameLayout2 = gcVar2.h;
                frameLayout2.removeView(gcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(gcVar2.c);
                break;
        }
    }
}
