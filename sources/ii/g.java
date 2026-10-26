package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                oVar.presentFragment(un.ba(this.c));
                break;
        }
    }
}
