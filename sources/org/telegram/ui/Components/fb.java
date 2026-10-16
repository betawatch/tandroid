package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
