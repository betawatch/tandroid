// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hy5 extends yv1 {
    public final /* synthetic */ ry5 Gd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy5(ry5 ry5Var) {
        super(null);
        this.Gd = ry5Var;
    }

    @Override // yv1
    public final boolean Y7() {
        return false;
    }

    @Override // yv1, f02
    public final long a() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        return gm.W(this.Gd.getContext());
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.Gd.G1;
    }

    @Override // yv1, f02
    public final TLRPC.User h() {
        return z8c.h(this.currentAccount).f();
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return false;
    }
}
