package dg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n0 extends zn {
    public final /* synthetic */ e1 Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(e1 e1Var) {
        super(null);
        this.Nc = e1Var;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.rg, org.telegram.ui.Components.r50
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.r50
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.Nc.getContext());
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final f6 getResourceProvider() {
        return this.Nc.N1;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.Components.rg
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.zn
    public final boolean x9() {
        return false;
    }
}
