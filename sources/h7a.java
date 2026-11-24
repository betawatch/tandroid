// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h7a implements View.OnClickListener {
    public final /* synthetic */ p7a a;

    public h7a(p7a p7aVar) {
        this.a = p7aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s09 s09Var = this.a.n1;
        if (s09Var.b() || s09Var.getAnimatedDrawable() == null) {
            return;
        }
        s09Var.getAnimatedDrawable().H(40);
        s09Var.d();
    }
}
