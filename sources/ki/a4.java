package ki;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class a4 extends org.telegram.ui.ActionBar.h2 {
    @Override // org.telegram.ui.ActionBar.h2
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.H1);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        return W == null ? LaunchActivity.H1 : W;
    }
}
