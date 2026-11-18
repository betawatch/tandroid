package ii;

import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Wallet.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ l(int i7, h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new n6());
                break;
            default:
                n10.m(1, this.b);
                break;
        }
    }
}
