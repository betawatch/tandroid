package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc b;

    public /* synthetic */ eb(rc rcVar, int i10) {
        this.a = i10;
        this.b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                rc rcVar = this.b;
                FrameLayout frameLayout = rcVar.h;
                vb vbVar = rcVar.e;
                pb pbVar = rcVar.p;
                if (pbVar != null && !vbVar.top) {
                    pbVar.c(0.0f);
                    rcVar.p.d(rcVar);
                }
                vbVar.transitionRunningExit = false;
                vbVar.onExitTransitionEnd();
                vbVar.onHide();
                frameLayout.removeView(rcVar.f);
                frameLayout.removeOnLayoutChangeListener(rcVar.c);
                vbVar.onDetach();
                Runnable runnable = rcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                rc rcVar2 = this.b;
                FrameLayout frameLayout2 = rcVar2.h;
                frameLayout2.removeView(rcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(rcVar2.c);
                break;
        }
    }
}
