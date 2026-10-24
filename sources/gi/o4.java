package gi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o4 extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.J1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.J1 : findActivity;
    }
}
