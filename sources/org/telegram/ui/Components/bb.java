package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ bb(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                oc ocVar = this.b;
                FrameLayout frameLayout = ocVar.h;
                sb sbVar = ocVar.e;
                mb mbVar = ocVar.p;
                if (mbVar != null && !sbVar.top) {
                    mbVar.c(0.0f);
                    ocVar.p.d(ocVar);
                }
                sbVar.transitionRunningExit = false;
                sbVar.onExitTransitionEnd();
                sbVar.onHide();
                frameLayout.removeView(ocVar.f);
                frameLayout.removeOnLayoutChangeListener(ocVar.c);
                sbVar.onDetach();
                Runnable runnable = ocVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                oc ocVar2 = this.b;
                FrameLayout frameLayout2 = ocVar2.h;
                frameLayout2.removeView(ocVar2.f);
                frameLayout2.removeOnLayoutChangeListener(ocVar2.c);
                break;
        }
    }
}
