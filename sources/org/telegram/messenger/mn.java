package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ mn(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.b;
                if (g2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    g2Var.presentFragment(themeActivity);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.c5.q0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.c5.q0(8, this.b, null);
                break;
            default:
                this.b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
        }
    }
}
