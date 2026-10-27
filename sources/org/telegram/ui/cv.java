package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ cv(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.y6.J(this.b, false);
                break;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity == null) {
                    findActivity = LaunchActivity.I1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                qf.d.r(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                qf.d.r(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
