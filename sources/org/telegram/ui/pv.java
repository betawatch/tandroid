package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ pv(Context context, int i10) {
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
