package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ dk(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.og ogVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                AnimatorSet animatorSet = rnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    rnVar.R9.start();
                    break;
                }
                break;
            default:
                rn rnVar2 = this.b;
                if (rnVar2.K2 == this && (ogVar = rnVar2.I0) != null && (frameLayout = rnVar2.J2) != null) {
                    ogVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
