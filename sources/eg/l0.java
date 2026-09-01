package eg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l0 extends xn {
    public final /* synthetic */ c1 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c1 c1Var) {
        super(null);
        this.Nc = c1Var;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.Components.rg, org.telegram.ui.Components.s50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.s50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Nc.getContext());
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final g6 getResourceProvider() {
        return this.Nc.N1;
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.Components.rg
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.xn
    public final boolean x9() {
        return false;
    }
}
