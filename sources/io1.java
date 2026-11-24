// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class io1 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ io1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // gu2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                yv1 yv1Var = this.b;
                if (intValue != 0) {
                    yv1Var.jd(true);
                    yv1Var.J(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    yv1Var.A1 = 0;
                    yv1Var.jd(true);
                    yv1Var.getMessagesController().x3(yv1Var.l6, yv1Var.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                yv1 yv1Var2 = this.b;
                if (intValue2 != 0) {
                    int i = yv1Var2.B1 - 1;
                    yv1Var2.B1 = i;
                    if (i <= 0) {
                        yv1Var2.getMessagesController().w3(yv1Var2.l6, yv1Var2.d());
                    }
                    yv1Var2.id(true);
                    yv1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    yv1Var2.B1 = 0;
                    yv1Var2.id(true);
                    yv1Var2.getMessagesController().w3(yv1Var2.l6, yv1Var2.d());
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                yv1 yv1Var3 = this.b;
                yv1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    yv1Var3.N6();
                    break;
                }
                break;
        }
    }
}
