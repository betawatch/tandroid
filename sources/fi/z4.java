package fi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z4 extends org.telegram.ui.ActionBar.m2 {
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
