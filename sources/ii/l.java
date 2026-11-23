package ii;

import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.o6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ l(int i7, g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new o6());
                break;
            default:
                m10.m(1, this.b);
                break;
        }
    }
}
