package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc b;

    public /* synthetic */ gb(tc tcVar, int i10) {
        this.a = i10;
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                tc tcVar = this.b;
                FrameLayout frameLayout = tcVar.h;
                xb xbVar = tcVar.e;
                rb rbVar = tcVar.p;
                if (rbVar != null && !xbVar.top) {
                    rbVar.c(0.0f);
                    tcVar.p.d(tcVar);
                }
                xbVar.transitionRunningExit = false;
                xbVar.onExitTransitionEnd();
                xbVar.onHide();
                frameLayout.removeView(tcVar.f);
                frameLayout.removeOnLayoutChangeListener(tcVar.c);
                xbVar.onDetach();
                Runnable runnable = tcVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                tc tcVar2 = this.b;
                FrameLayout frameLayout2 = tcVar2.h;
                frameLayout2.removeView(tcVar2.f);
                frameLayout2.removeOnLayoutChangeListener(tcVar2.c);
                break;
        }
    }
}
