// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jnb implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rob b;

    public /* synthetic */ jnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        rob robVar = this.b;
        switch (b) {
            case 0:
                robVar.p1 = ((Float) obj).floatValue();
                robVar.z0.invalidate();
                robVar.X0();
                break;
            case 1:
                robVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                robVar.W1 = true;
                robVar.m1(true);
                robVar.V1 = false;
                break;
            default:
                robVar.Y0((vh1) obj);
                break;
        }
    }
}
