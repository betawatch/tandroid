package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ long c;

    public /* synthetic */ g(o oVar, long j10, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.c, r0.c, new i(this.b, 0));
                break;
            default:
                o oVar = this.b;
                oVar.getClass();
                oVar.presentFragment(sn.W9(this.c));
                break;
        }
    }
}
