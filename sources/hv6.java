// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hv6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv6 b;

    public /* synthetic */ hv6(rv6 rv6Var, byte b) {
        this.a = b;
        this.b = rv6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rv6 rv6Var = this.b;
        switch (b) {
            case 0:
                rv6Var.dismiss();
                break;
            default:
                if (rv6Var.r.g()) {
                    rv6Var.f.getClass();
                    gw6.j(2);
                }
                rv6Var.dismiss();
                break;
        }
    }
}
