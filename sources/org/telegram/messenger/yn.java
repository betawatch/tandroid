package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class yn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ yn(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = this.b;
                if (k2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.T0 = true;
                    k2Var.presentFragment(themeActivity);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.s4.s0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.s4.s0(8, this.b, null);
                break;
            default:
                this.b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
        }
    }
}
