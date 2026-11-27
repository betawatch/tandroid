// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
