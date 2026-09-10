package ei;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                pVar.presentFragment(eo.R9(this.c));
                break;
        }
    }
}
