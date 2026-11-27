// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;
    public final /* synthetic */ TL_wallet.card c;

    public /* synthetic */ mv8(e eVar, TL_wallet.card cardVar, byte b) {
        this.a = b;
        this.b = eVar;
        this.c = cardVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_wallet.card cardVar = this.c;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(new euc(eVar.getCurrentAccount(), cardVar.address));
                break;
            default:
                eVar.presentFragment(new euc(eVar.getCurrentAccount(), cardVar.address));
                break;
        }
    }
}
