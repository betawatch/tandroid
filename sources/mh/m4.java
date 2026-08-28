package mh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m4 extends org.telegram.ui.ActionBar.o2 {
    @Override // org.telegram.ui.ActionBar.o2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.C1);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.C1 : findActivity;
    }
}
