// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cp0 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ cp0(lp0 lp0Var, byte b) {
        this.a = b;
        this.b = lp0Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        lp0 lp0Var = this.b;
        switch (b) {
            case 0:
                lp0Var.V = (vh1) obj;
                break;
            default:
                gm.c3(new x30(lp0Var, (TL_stories.TL_premium_boostsStatus) obj, (byte) 15));
                break;
        }
    }
}
