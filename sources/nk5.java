// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nk5 extends ActionBarLayout {
    public final /* synthetic */ xg0 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk5(Activity activity, xg0 xg0Var) {
        super(activity, false);
        this.z1 = xg0Var;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, tk5
    public final my0 getBottomSheet() {
        return ((my0[]) this.z1.b)[0];
    }
}
