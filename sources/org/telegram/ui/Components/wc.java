package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ wc(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.s5;
                if (k2Var == null) {
                    if (k2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) k2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new kg.i1(k2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                k2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                k2Var.presentFragment(themeActivity);
                break;
        }
    }
}
