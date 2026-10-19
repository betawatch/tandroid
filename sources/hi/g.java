package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.c, r0.b, new i(this.b, 0));
                break;
            default:
                o oVar = this.b;
                oVar.getClass();
                oVar.presentFragment(qn.W9(this.c));
                break;
        }
    }
}
