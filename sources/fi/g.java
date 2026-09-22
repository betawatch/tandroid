package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ g(p pVar, long j3, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = j3;
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
                pVar.presentFragment(bo.R9(this.c));
                break;
        }
    }
}
