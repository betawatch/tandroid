// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eo1 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tv0 d;

    public /* synthetic */ eo1(byte b, tv0 tv0Var, yv1 yv1Var, String str) {
        this.a = b;
        this.b = yv1Var;
        this.c = str;
        this.d = tv0Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        tv0 tv0Var = this.d;
        String str = this.c;
        yv1 yv1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        yv1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        yv1Var.getMessagesController().m(str, false);
                    }
                    tv0Var.run();
                    yv1Var.getParentActivity();
                    l11.p(str);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        yv1Var.getMessagesController().m(str, true);
                    }
                    tv0Var.run();
                    l11.o(yv1Var.getParentActivity(), str, false, null);
                    break;
                }
                break;
        }
    }
}
