package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ bd(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.N6;
                if (e2Var == null) {
                    if (e2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) e2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new ug.x0(e2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                e2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                e2Var.presentFragment(themeActivity);
                break;
        }
    }
}
