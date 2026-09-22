package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 5:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                nf.f.s(this.b, "https://promote.telegram.org/guidelines");
                break;
            default:
                nf.f.s(this.b, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
        }
    }
}
