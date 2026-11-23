package ki;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class z3 extends org.telegram.ui.ActionBar.g2 {
    @Override // org.telegram.ui.ActionBar.g2
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
