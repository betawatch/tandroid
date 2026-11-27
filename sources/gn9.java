// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;

    public /* synthetic */ gn9(pq8 pq8Var, byte b) {
        this.a = b;
        this.b = pq8Var;
    }

    public final void a(Exception exc) {
        byte b = this.a;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                ((jp9) pq8Var.b).i.post(new zo9(pq8Var, exc, (byte) 0));
                break;
            default:
                ((jp9) pq8Var.b).i.post(new zo9(pq8Var, exc, (byte) 1));
                break;
        }
    }
}
