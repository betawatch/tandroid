package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class td implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ td(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.m5;
                if (n2Var == null) {
                    if (n2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) n2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new sg.a1(n2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                n2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                n2Var.presentFragment(themeActivity);
                break;
        }
    }
}
