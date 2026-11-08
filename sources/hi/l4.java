package hi;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
