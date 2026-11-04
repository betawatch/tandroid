package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ bd(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = this.b;
        switch (i3) {
            case 0:
                int i10 = ChatActivityEnterView.t5;
                if (d2Var == null) {
                    if (d2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) d2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new vg.v0(d2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                d2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.U0 = true;
                d2Var.presentFragment(themeActivity);
                break;
        }
    }
}
