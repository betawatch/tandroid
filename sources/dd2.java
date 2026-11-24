// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fd2 b;

    public /* synthetic */ dd2(fd2 fd2Var, byte b) {
        this.a = b;
        this.b = fd2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fd2 fd2Var = this.b;
        switch (b) {
            case 0:
                fd2Var.c(true);
                break;
            default:
                fd2Var.e = fd2Var.b();
                byte b2 = fd2Var.f;
                byte b3 = fd2Var.h;
                mu1 mu1Var = fd2Var.a;
                if (fd2Var.b == null) {
                    ed2 ed2Var = new ed2((mu1Var.getUserConfig().e() > mu1Var.a() ? 1 : (mu1Var.getUserConfig().e() == mu1Var.a() ? 0 : -1)) == 0 ? 3 : 0, mu1Var.getCurrentAccount(), mu1Var.getResourceProvider(), fd2Var.getContext(), fd2Var.a);
                    ed2Var.n1 = 1.0f;
                    ed2Var.setWillNotDraw(false);
                    fd2Var.b = ed2Var;
                    int L = gl.L(4.0f) + (k96.a0 ? (byte) 0 : b3);
                    int L2 = gl.L(4.0f);
                    int L3 = gl.L(4.0f);
                    if (!k96.a0) {
                        b3 = 0;
                    }
                    ed2Var.setPadding(L, L2, L3 + b3, gl.L(b2));
                    fd2Var.b.setDelegate(new qx4(fd2Var));
                    fd2Var.b.setClipChildren(false);
                    fd2Var.b.setClipToPadding(false);
                    fd2Var.addView(fd2Var.b, nme.e(-2, b2 + 70, 5));
                }
                fd2Var.c(false);
                if (!fd2Var.b.isEnabled()) {
                    fd2Var.y = false;
                    fd2Var.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    fd2Var.y = true;
                    fd2Var.b.m(fd2Var.e, mu1Var.r8, true);
                    fd2Var.b.p(false);
                    break;
                }
        }
    }
}
