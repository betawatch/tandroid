package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ id(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = this.b;
        switch (i9) {
            case 0:
                int i10 = ChatActivityEnterView.i5;
                if (o2Var == null) {
                    if (o2Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) o2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                        break;
                    }
                } else {
                    new zf.x0(o2Var, 11, false).show();
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
