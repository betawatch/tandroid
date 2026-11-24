// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class es8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ es8(d dVar, TL_wallet.card cardVar, byte b) {
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
                dVar.presentFragment(new qpc(dVar.getCurrentAccount(), cardVar.address));
                break;
            default:
                dVar.presentFragment(new qpc(dVar.getCurrentAccount(), cardVar.address));
                break;
        }
    }
}
