package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ bv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.H1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                pf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                pf.d.r(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
