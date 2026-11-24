// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ez9 extends pj8 {
    public final /* synthetic */ fz9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez9(fz9 fz9Var, Context context) {
        super(2, null, context);
        this.N = fz9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        fz9 fz9Var = this.N;
        if (fz9Var.getParent() instanceof View) {
            ((View) fz9Var.getParent()).invalidate();
        }
    }
}
