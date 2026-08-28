package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ cv(Context context, int i9) {
        this.a = i9;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f6.J(this.b, false);
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
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                ve.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                ve.e.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
