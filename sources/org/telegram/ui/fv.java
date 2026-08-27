package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fv(Context context, int i10) {
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
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                we.e.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                we.e.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
