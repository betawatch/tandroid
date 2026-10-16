package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ g(p pVar, long j10, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.c, r0.b, new i(this.b, 0));
                break;
            default:
                p pVar = this.b;
                pVar.getClass();
                pVar.presentFragment(fo.W9(this.c));
                break;
        }
    }
}
