package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ rn(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = this.b;
                if (f2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.T0 = true;
                    f2Var.presentFragment(themeActivity);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.v4.q0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.v4.q0(8, this.b, null);
                break;
            default:
                this.b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
        }
    }
}
