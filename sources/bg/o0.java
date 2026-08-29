package bg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o0 extends tn {
    public final /* synthetic */ g1 Mc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(g1 g1Var) {
        super(null);
        this.Mc = g1Var;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.Components.ug, org.telegram.ui.Components.l50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.l50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Mc.getContext());
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final c6 getResourceProvider() {
        return this.Mc.M1;
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.Components.ug
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.tn
    public final boolean x9() {
        return false;
    }
}
