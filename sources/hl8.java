// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ml8 b;

    public /* synthetic */ hl8(ml8 ml8Var, byte b) {
        this.a = b;
        this.b = ml8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ml8 ml8Var = this.b;
        switch (b) {
            case 0:
                vk2 vk2Var = ml8Var.h;
                if (vk2Var != null) {
                    vk2Var.close();
                    break;
                }
                break;
            default:
                ml8Var.a();
                break;
        }
    }
}
