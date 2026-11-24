// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class irc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrc b;

    public /* synthetic */ irc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                rrcVar.r0((String) obj);
                break;
            case 1:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                rrcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
