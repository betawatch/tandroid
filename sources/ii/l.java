package ii;

import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Wallet.n6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                n10.m(1, this.b);
                break;
        }
    }
}
