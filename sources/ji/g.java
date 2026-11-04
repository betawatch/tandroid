package ji;

import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ g(n nVar, int i3) {
        this.a = i3;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        n nVar = this.b;
        switch (i3) {
            case 0:
                n.b0(nVar);
                break;
            default:
                hs notificationCenter = nVar.getNotificationCenter();
                int i10 = hp.C8;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
