package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ rd(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.n5;
                if (o2Var == null) {
                    if (o2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) o2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new rg.x0(o2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                o2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                o2Var.presentFragment(themeActivity);
                break;
        }
    }
}
