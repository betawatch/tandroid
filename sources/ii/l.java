package ii;

import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Wallet.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
