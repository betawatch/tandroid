package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ md(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        switch (i10) {
            case 0:
                int i11 = ChatActivityEnterView.i5;
                if (o2Var == null) {
                    if (o2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) o2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new cg.p1(o2Var, 11, false).show();
                    break;
                }
                break;
            case 1:
                o2Var.presentFragment(new StickersActivity(0, null));
                break;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                o2Var.presentFragment(themeActivity);
                break;
        }
    }
}
