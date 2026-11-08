package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc b;

    public /* synthetic */ pa(cc ccVar, int i7) {
        this.a = i7;
        this.b = ccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                cc ccVar = this.b;
                FrameLayout frameLayout = ccVar.h;
                gb gbVar = ccVar.e;
                ab abVar = ccVar.p;
                if (abVar != null && !gbVar.top) {
                    abVar.c(0.0f);
                    ccVar.p.d(ccVar);
                }
                gbVar.transitionRunningExit = false;
                gbVar.onExitTransitionEnd();
                gbVar.onHide();
                frameLayout.removeView(ccVar.f);
                frameLayout.removeOnLayoutChangeListener(ccVar.c);
                gbVar.onDetach();
                Runnable runnable = ccVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                cc ccVar2 = this.b;
                FrameLayout frameLayout2 = ccVar2.h;
                frameLayout2.removeView(ccVar2.f);
                frameLayout2.removeOnLayoutChangeListener(ccVar2.c);
                break;
        }
    }
}
