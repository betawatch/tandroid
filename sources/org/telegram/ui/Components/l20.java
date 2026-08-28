package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ l20(Context context, int i9) {
        this.a = i9;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j20.j(this.b);
                break;
            case 1:
                ve.e.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, zf.j0.A1(10)));
                    break;
                }
                break;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, zf.j0.A1(9)));
                    break;
                }
                break;
        }
    }
}
