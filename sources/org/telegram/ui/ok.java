package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ok(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                AnimatorSet animatorSet = snVar.ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.ha.start();
                    break;
                }
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.a3 == this && (chVar = snVar2.Y0) != null && (frameLayout = snVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
