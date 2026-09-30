package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ ud(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.n5;
                if (m2Var == null) {
                    if (m2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) m2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new rg.x0(m2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                m2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                m2Var.presentFragment(themeActivity);
                break;
        }
    }
}
