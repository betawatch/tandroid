// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class j64 implements b86 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s64 b;

    public /* synthetic */ j64(s64 s64Var, byte b) {
        this.a = b;
        this.b = s64Var;
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        s64 s64Var = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 2:
                bg8Var.K(s64Var.P);
                break;
            default:
                bg8Var.C(s64Var.R);
                break;
        }
    }
}
