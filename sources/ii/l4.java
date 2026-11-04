package ii;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l4 extends org.telegram.ui.ActionBar.d2 {
    @Override // org.telegram.ui.ActionBar.d2
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.K1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        return W == null ? LaunchActivity.K1 : W;
    }
}
