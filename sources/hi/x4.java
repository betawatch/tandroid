package hi;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
