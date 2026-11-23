package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b0 {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public final ArrayList e = new ArrayList();
    public long f;
    public boolean g;
    public boolean h;
    public int i;

    public b0(int i7, long j3) {
        this.g = false;
        this.h = false;
        this.a = i7;
        this.b = j3;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.h = false;
            this.d = false;
            if (this.i != 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.i, true);
                this.i = 0;
            }
            this.g = false;
            a();
        }
    }

    public final void a() {
        if (this.g || this.h || this.d) {
            return;
        }
        this.f = System.currentTimeMillis();
        this.g = true;
        TL_payments.getConnectedStarRefBots getconnectedstarrefbots = new TL_payments.getConnectedStarRefBots();
        int i7 = this.a;
        getconnectedstarrefbots.peer = np.u1(i7).l1(this.b);
        getconnectedstarrefbots.limit = 20;
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) i5.c.h(1, arrayList);
            getconnectedstarrefbots.flags |= 4;
            getconnectedstarrefbots.offset_date = connectedbotstarref.date;
            getconnectedstarrefbots.offset_link = connectedbotstarref.url;
        }
        this.i = ConnectionsManager.getInstance(i7).sendRequest(getconnectedstarrefbots, new ai.g1(this, 1));
    }
}
