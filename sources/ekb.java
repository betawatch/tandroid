// default package

import android.view.Menu;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ekb implements zy5, yy5 {
    public final /* synthetic */ nu3 a;
    public final /* synthetic */ Menu b;

    public /* synthetic */ ekb(nu3 nu3Var, Menu menu) {
        this.a = nu3Var;
        this.b = menu;
    }

    @Override // zy5
    public final void a(String str) {
        nu3 nu3Var = this.a;
        nu3Var.b = str;
        nu3Var.b(this.b);
    }

    @Override // yy5
    public final void o(Exception exc) {
        fc4.d("mlkit: failed to detect language in selection");
        fc4.g(exc, true);
        nu3 nu3Var = this.a;
        nu3Var.b = null;
        nu3Var.b(this.b);
    }
}
