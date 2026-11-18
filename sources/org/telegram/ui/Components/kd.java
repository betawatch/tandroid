package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ kd(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.n7;
                if (h2Var == null) {
                    if (h2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) h2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new ug.z0(h2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                h2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                h2Var.presentFragment(themeActivity);
                break;
        }
    }
}
