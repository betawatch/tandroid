// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class da2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa2 b;

    public /* synthetic */ da2(qa2 qa2Var, byte b) {
        this.a = b;
        this.b = qa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qa2 qa2Var = this.b;
        switch (b) {
            case 0:
                qa2Var.d0 = true;
                qa2Var.h0();
                break;
            case 1:
                qa2Var.Y = qa2Var.getMessagesController().L0(Long.valueOf(qa2Var.a0));
                qa2Var.e0();
                break;
            case 2:
                qa2Var.g0(false);
                break;
            case 3:
                qa2Var.d0 = true;
                if (qa2Var.b.length() > 0) {
                    qa2Var.c0(qa2Var.b.getText().toString());
                }
                qa2Var.h0();
                break;
            case 4:
                qa2Var.e0();
                break;
            default:
                qa2Var.g0(true);
                break;
        }
    }
}
