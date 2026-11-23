package di;

import org.telegram.messenger.r10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r10 b;

    public /* synthetic */ t6(r10 r10Var, int i7) {
        this.a = i7;
        this.b = r10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.FALSE, null);
                break;
            case 1:
                this.b.a(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.a(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                org.telegram.messenger.a8.b("StarsController.buy onCanceled");
                org.telegram.messenger.g0.g3(new t6(this.b, 0));
                break;
        }
    }
}
