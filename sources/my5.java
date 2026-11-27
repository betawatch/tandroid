// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class my5 extends zu1 {
    public final /* synthetic */ wy5 Jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my5(wy5 wy5Var) {
        super(null);
        this.Jd = wy5Var;
    }

    @Override // zu1
    public final boolean Y7() {
        return false;
    }

    @Override // zu1, kz1
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        return hl.W(this.Jd.getContext());
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.Jd.A1;
    }

    @Override // zu1, kz1
    public final TLRPC.User h() {
        return yac.h(this.currentAccount).f();
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return false;
    }
}
