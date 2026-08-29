package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                org.telegram.ui.ActionBar.g6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                ye.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                ye.d.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
