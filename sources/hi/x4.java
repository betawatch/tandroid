package hi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x4 extends org.telegram.ui.ActionBar.r2 {
    @Override // org.telegram.ui.ActionBar.r2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.I1);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.I1 : findActivity;
    }
}
