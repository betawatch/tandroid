package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ pk(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                AnimatorSet animatorSet = unVar.ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar.ha.start();
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                if (unVar2.a3 == this && (chVar = unVar2.Y0) != null && (frameLayout = unVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
