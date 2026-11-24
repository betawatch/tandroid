// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gx0 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx0 b;

    public /* synthetic */ gx0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                if (i != -1) {
                    if (i == R.id.menu_collapse_bot) {
                        wx0Var.z0 = true;
                        wx0Var.m(true);
                        break;
                    }
                } else if (!wx0Var.E.A()) {
                    wx0Var.v();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    wx0Var.v();
                    break;
                }
                break;
        }
    }
}
