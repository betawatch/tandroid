package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class al implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ al(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                AnimatorSet animatorSet = foVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    foVar.V9.start();
                    break;
                }
                break;
            default:
                fo foVar2 = this.b;
                if (foVar2.O2 == this && (dhVar = foVar2.M0) != null && (frameLayout = foVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
