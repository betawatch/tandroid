package ki;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
