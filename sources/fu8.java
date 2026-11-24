// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ fu8(d dVar, TL_wallet.card cardVar, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_wallet.card cardVar = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(new rrc(dVar.getCurrentAccount(), cardVar.address));
                break;
            default:
                dVar.presentFragment(new rrc(dVar.getCurrentAccount(), cardVar.address));
                break;
        }
    }
}
