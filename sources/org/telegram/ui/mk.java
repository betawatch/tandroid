package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ mk(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                AnimatorSet animatorSet = znVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.V9.start();
                    break;
                }
                break;
            default:
                zn znVar2 = this.b;
                if (znVar2.O2 == this && (chVar = znVar2.M0) != null && (frameLayout = znVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
