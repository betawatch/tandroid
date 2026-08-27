package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec b;

    public /* synthetic */ sa(ec ecVar, int i10) {
        this.a = i10;
        this.b = ecVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                ec ecVar = this.b;
                FrameLayout frameLayout = ecVar.h;
                jb jbVar = ecVar.e;
                db dbVar = ecVar.p;
                if (dbVar != null && !jbVar.top) {
                    dbVar.c(0.0f);
                    ecVar.p.d(ecVar);
                }
                jbVar.transitionRunningExit = false;
                jbVar.onExitTransitionEnd();
                jbVar.onHide();
                frameLayout.removeView(ecVar.f);
                frameLayout.removeOnLayoutChangeListener(ecVar.c);
                jbVar.onDetach();
                Runnable runnable = ecVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ec ecVar2 = this.b;
                FrameLayout frameLayout2 = ecVar2.h;
                frameLayout2.removeView(ecVar2.f);
                frameLayout2.removeOnLayoutChangeListener(ecVar2.c);
                break;
        }
    }
}
