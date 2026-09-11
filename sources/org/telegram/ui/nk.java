package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ nk(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                co coVar = this.b;
                AnimatorSet animatorSet = coVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    coVar.V9.start();
                    break;
                }
                break;
            default:
                co coVar2 = this.b;
                if (coVar2.O2 == this && (dhVar = coVar2.M0) != null && (frameLayout = coVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
