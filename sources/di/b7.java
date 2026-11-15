package di;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.v5 b;

    public /* synthetic */ b7(bi.v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            case 2:
                org.telegram.messenger.g0.h3(new b7(this.b, 3));
                break;
            default:
                this.b.a(Boolean.FALSE, null);
                break;
        }
    }
}
