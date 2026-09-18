package ei;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class z4 extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.G1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.G1 : findActivity;
    }
}
