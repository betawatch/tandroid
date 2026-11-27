// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i92 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v92 b;

    public /* synthetic */ i92(v92 v92Var, byte b) {
        this.a = b;
        this.b = v92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v92 v92Var = this.b;
        switch (b) {
            case 0:
                v92Var.d0 = true;
                v92Var.g0();
                break;
            case 1:
                v92Var.Y = v92Var.getMessagesController().M0(Long.valueOf(v92Var.a0));
                v92Var.d0();
                break;
            case 2:
                v92Var.f0(false);
                break;
            case 3:
                v92Var.d0 = true;
                if (v92Var.b.length() > 0) {
                    v92Var.b0(v92Var.b.getText().toString());
                }
                v92Var.g0();
                break;
            case 4:
                v92Var.d0();
                break;
            default:
                v92Var.f0(true);
                break;
        }
    }
}
