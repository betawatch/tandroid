package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ e30(Context context, int i10) {
        this.a = i10;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c30.j(this.b);
                break;
            case 1:
                af.g.s(this.b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, fg.v0.A1(10)));
                    break;
                }
                break;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, fg.v0.A1(9)));
                    break;
                }
                break;
        }
    }
}
