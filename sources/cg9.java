// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cg9(ne9 ne9Var, int i, byte b) {
        this.a = b;
        this.b = ne9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                break;
            case 1:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                break;
            case 2:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                break;
            case 3:
                ne9Var.O();
                ne9Var.setSelection(Math.min(i, ne9Var.length()));
                break;
            default:
                ne9Var.O();
                ne9Var.setSelection(Math.max(0, Math.min(i, ne9Var.length())));
                break;
        }
    }
}
