package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.j6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                ze.d.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                ze.d.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
