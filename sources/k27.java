// default package

import android.view.ActionProvider;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k27 implements ActionProvider.VisibilityListener {
    public final ActionProvider a;
    public xh4 b;

    public k27(n27 n27Var, ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        xh4 xh4Var = this.b;
        if (xh4Var != null) {
            f27 f27Var = ((j27) xh4Var.b).n;
            f27Var.h = true;
            f27Var.p(true);
        }
    }
}
