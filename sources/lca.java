// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lca extends e {
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
