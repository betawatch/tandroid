// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
