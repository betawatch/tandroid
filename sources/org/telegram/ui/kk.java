package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ kk(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.eh ehVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                AnimatorSet animatorSet = ynVar.T9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ynVar.T9.start();
                    break;
                }
                break;
            default:
                yn ynVar2 = this.b;
                if (ynVar2.M2 == this && (ehVar = ynVar2.K0) != null && (frameLayout = ynVar2.L2) != null) {
                    ehVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
