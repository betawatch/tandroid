package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ ud(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.r5;
                if (r2Var == null) {
                    if (r2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) r2Var.getContext()).u0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new tg.y0(r2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                r2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                r2Var.presentFragment(themeActivity);
                break;
        }
    }
}
