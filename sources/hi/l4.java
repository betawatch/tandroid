package hi;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class l4 extends org.telegram.ui.ActionBar.f2 {
    @Override // org.telegram.ui.ActionBar.f2
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.G1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
        return W == null ? LaunchActivity.G1 : W;
    }
}
