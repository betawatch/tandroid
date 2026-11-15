package ki;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class f4 extends org.telegram.ui.ActionBar.e2 {
    @Override // org.telegram.ui.ActionBar.e2
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
