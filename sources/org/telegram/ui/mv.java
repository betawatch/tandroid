package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ mv(Context context, int i10) {
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
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    findActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 2:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                af.g.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                af.g.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
