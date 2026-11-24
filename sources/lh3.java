// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lh3 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;

    public /* synthetic */ lh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.Q1 = (Long) obj;
                nk3Var.q5();
                break;
            default:
                nk3Var.q4((TL_account.TL_birthday) obj);
                break;
        }
    }
}
