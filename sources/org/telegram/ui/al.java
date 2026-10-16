package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
