package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class kk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ kk(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                AnimatorSet animatorSet = wnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wnVar.V9.start();
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.O2 == this && (dhVar = wnVar2.M0) != null && (frameLayout = wnVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
