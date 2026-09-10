package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ pk(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.fh fhVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                AnimatorSet animatorSet = eoVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    eoVar.V9.start();
                    break;
                }
                break;
            default:
                eo eoVar2 = this.b;
                if (eoVar2.O2 == this && (fhVar = eoVar2.M0) != null && (frameLayout = eoVar2.N2) != null) {
                    fhVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
