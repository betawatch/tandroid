// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n92 b;

    public /* synthetic */ f92(n92 n92Var, byte b) {
        this.a = b;
        this.b = n92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        n92 n92Var = this.b;
        switch (b) {
            case 0:
                n92Var.h.requestFocus();
                break;
            case 1:
                n92Var.h.setFocusableInTouchMode(true);
                break;
            case 2:
                n92Var.finishFragment();
                break;
            case 3:
                if (n92Var.Q && !n92Var.P) {
                    n92Var.P = true;
                    nm7.e().k(99, 512);
                    n92Var.c.setVisibility(0);
                    n92Var.c.setLayerType(2, null);
                    n92Var.j0(n92Var.R.e);
                    n92Var.R.a(true, true);
                    break;
                }
                break;
            case 4:
                l11.u(n92Var.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                l11.u(n92Var.getParentActivity(), jb6.M0(2131752353, null));
                break;
            default:
                n92Var.e0(false);
                break;
        }
    }
}
