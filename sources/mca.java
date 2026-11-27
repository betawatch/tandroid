// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mca extends e {
    @Override // org.telegram.ui.ActionBar.e
    public final Context getContext() {
        return hl.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        Activity W = hl.W(a.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
