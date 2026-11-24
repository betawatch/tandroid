// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class js1 extends ne2 {
    public final /* synthetic */ yv1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js1(yv1 yv1Var, Context context) {
        super(context);
        this.f = yv1Var;
    }

    @Override // ne2
    public final void a(boolean z) {
        yv1 yv1Var = this.f;
        yv1Var.G5();
        yv1Var.E5();
        yv1Var.H5();
        yv1Var.I5();
        ft1 ft1Var = yv1Var.Jb;
        if (ft1Var != null) {
            ft1Var.setTranslationY(yv1Var.T9 + getCurrentHeight());
        }
        if (!z) {
            yv1Var.O7();
        } else {
            yv1Var.aa = true;
            yv1Var.Rc();
        }
    }
}
