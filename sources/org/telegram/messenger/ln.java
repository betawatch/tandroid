package org.telegram.messenger;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ ln(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = this.b;
                if (h2Var != null) {
                    ThemeActivity themeActivity = new ThemeActivity(0);
                    themeActivity.V0 = true;
                    h2Var.presentFragment(themeActivity);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.b5.q0(7, this.b, null);
                break;
            case 2:
                org.telegram.ui.Components.b5.q0(8, this.b, null);
                break;
            default:
                this.b.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                break;
        }
    }
}
