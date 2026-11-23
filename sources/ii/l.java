package ii;

import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.n6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                this.b.presentFragment(new n6());
                break;
            default:
                o10.m(1, this.b);
                break;
        }
    }
}
