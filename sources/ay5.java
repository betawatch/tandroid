// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay5 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hc8 b;

    public /* synthetic */ ay5(hc8 hc8Var, byte b) {
        this.a = b;
        this.b = hc8Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        hc8 hc8Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                hc8Var.m0(num);
                break;
            default:
                hc8Var.l0(num);
                break;
        }
    }
}
