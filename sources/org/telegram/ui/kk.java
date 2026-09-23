package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                AnimatorSet animatorSet = xnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.V9.start();
                    break;
                }
                break;
            default:
                xn xnVar2 = this.b;
                if (xnVar2.O2 == this && (chVar = xnVar2.M0) != null && (frameLayout = xnVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
