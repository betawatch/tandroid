package fi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class z4 extends org.telegram.ui.ActionBar.n2 {
    @Override // org.telegram.ui.ActionBar.n2
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.G1);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return findActivity == null ? LaunchActivity.G1 : findActivity;
    }
}
