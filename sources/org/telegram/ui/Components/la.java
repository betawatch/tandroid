package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb b;

    public /* synthetic */ la(xb xbVar, int i7) {
        this.a = i7;
        this.b = xbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            case 1:
                xb xbVar = this.b;
                FrameLayout frameLayout = xbVar.h;
                cb cbVar = xbVar.e;
                wa waVar = xbVar.p;
                if (waVar != null && !cbVar.top) {
                    waVar.c(0.0f);
                    xbVar.p.d(xbVar);
                }
                cbVar.transitionRunningExit = false;
                cbVar.onExitTransitionEnd();
                cbVar.onHide();
                frameLayout.removeView(xbVar.f);
                frameLayout.removeOnLayoutChangeListener(xbVar.c);
                cbVar.onDetach();
                Runnable runnable = xbVar.v;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                xb xbVar2 = this.b;
                FrameLayout frameLayout2 = xbVar2.h;
                frameLayout2.removeView(xbVar2.f);
                frameLayout2.removeOnLayoutChangeListener(xbVar2.c);
                break;
        }
    }
}
