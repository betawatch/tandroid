package ei;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class y4 extends org.telegram.ui.ActionBar.m2 {
    @Override // org.telegram.ui.ActionBar.m2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.G1);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.G1 : findActivity;
    }
}
