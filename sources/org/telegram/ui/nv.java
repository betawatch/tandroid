package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                org.telegram.ui.ActionBar.i6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.G1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                of.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                of.f.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
