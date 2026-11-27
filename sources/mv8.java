// default package

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
