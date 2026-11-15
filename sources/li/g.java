package li;

import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ g(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n nVar = this.b;
        switch (i7) {
            case 0:
                n.b0(nVar);
                break;
            default:
                ns notificationCenter = nVar.getNotificationCenter();
                int i10 = np.D8;
                notificationCenter.k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
        }
    }
}
