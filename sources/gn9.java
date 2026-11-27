// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
