// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a61 implements lx5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d61 b;
    public final /* synthetic */ u51 c;

    public /* synthetic */ a61(d61 d61Var, u51 u51Var, byte b) {
        this.a = b;
        this.b = d61Var;
        this.c = u51Var;
    }

    @Override // lx5
    public final void a(int i) {
        byte b = this.a;
        u51 u51Var = this.c;
        d61 d61Var = this.b;
        switch (b) {
            case 0:
                u51Var.b = i;
                d61Var.getMessagesController().h4.h(d61Var.e, d61Var.d);
                hl.V3(d61Var.b);
                break;
            default:
                if (i == 4) {
                    d61Var.d.remove(u51Var);
                    d61Var.Y();
                } else {
                    u51Var.b = i;
                    hl.V3(d61Var.b);
                }
                d61Var.getMessagesController().h4.h(d61Var.e, d61Var.d);
                break;
        }
    }
}
