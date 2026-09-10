package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ cb(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                pc pcVar = this.b;
                FrameLayout frameLayout = pcVar.h;
                tb tbVar = pcVar.e;
                nb nbVar = pcVar.p;
                if (nbVar != null && !tbVar.top) {
                    nbVar.c(0.0f);
                    pcVar.p.d(pcVar);
                }
                tbVar.transitionRunningExit = false;
                tbVar.onExitTransitionEnd();
                tbVar.onHide();
                frameLayout.removeView(pcVar.f);
                frameLayout.removeOnLayoutChangeListener(pcVar.c);
                tbVar.onDetach();
                Runnable runnable = pcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                pc pcVar2 = this.b;
                FrameLayout frameLayout2 = pcVar2.h;
                frameLayout2.removeView(pcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(pcVar2.c);
                break;
        }
    }
}
