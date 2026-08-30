package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ kk(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                AnimatorSet animatorSet = xnVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.S9.start();
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.L2 == this && (sgVar = xnVar2.J0) != null && (frameLayout = xnVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
