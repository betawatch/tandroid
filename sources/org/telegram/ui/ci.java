package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ ci(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.hg hgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                if (unVar.c3 == this && (hgVar = unVar.a1) != null && (frameLayout = unVar.b3) != null) {
                    hgVar.i(frameLayout, false, true);
                    break;
                }
                break;
            default:
                un unVar2 = this.b;
                AnimatorSet animatorSet = unVar2.oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar2.oa.start();
                    break;
                }
                break;
        }
    }
}
