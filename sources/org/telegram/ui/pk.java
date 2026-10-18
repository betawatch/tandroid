package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ pk(sn snVar, int i10) {
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
                AnimatorSet animatorSet = snVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.V9.start();
                    break;
                }
                break;
            default:
                sn snVar2 = this.b;
                if (snVar2.O2 == this && (chVar = snVar2.M0) != null && (frameLayout = snVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
