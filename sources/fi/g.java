package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                pVar.presentFragment(wn.R9(this.c));
                break;
        }
    }
}
