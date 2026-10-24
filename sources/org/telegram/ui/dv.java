package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ dv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.J1;
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
