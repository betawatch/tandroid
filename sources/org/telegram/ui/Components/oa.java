package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc b;

    public /* synthetic */ oa(bc bcVar, int i7) {
        this.a = i7;
        this.b = bcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                bc bcVar = this.b;
                FrameLayout frameLayout = bcVar.h;
                fb fbVar = bcVar.e;
                za zaVar = bcVar.p;
                if (zaVar != null && !fbVar.top) {
                    zaVar.c(0.0f);
                    bcVar.p.d(bcVar);
                }
                fbVar.transitionRunningExit = false;
                fbVar.onExitTransitionEnd();
                fbVar.onHide();
                frameLayout.removeView(bcVar.f);
                frameLayout.removeOnLayoutChangeListener(bcVar.c);
                fbVar.onDetach();
                Runnable runnable = bcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                bc bcVar2 = this.b;
                FrameLayout frameLayout2 = bcVar2.h;
                frameLayout2.removeView(bcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(bcVar2.c);
                break;
        }
    }
}
