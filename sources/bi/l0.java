package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l0 {
    public final int a;
    public final long b;
    public int c;
    public boolean d;
    public long f;
    public boolean h;
    public boolean i;
    public String j;
    public final ArrayList e = new ArrayList();
    public int g = 1;

    public l0(int i7, long j3) {
        this.h = false;
        this.i = false;
        this.j = null;
        this.a = i7;
        this.b = j3;
        if (System.currentTimeMillis() - this.f > 900000) {
            this.c = 0;
            this.d = false;
            this.i = false;
            this.f = 0L;
            this.j = null;
            this.h = false;
            a();
        }
    }

    public final void a() {
        if (this.h || this.i || this.d) {
            return;
        }
        this.f = System.currentTimeMillis();
        this.h = true;
        TL_payments.getSuggestedStarRefBots getsuggestedstarrefbots = new TL_payments.getSuggestedStarRefBots();
        int i7 = this.a;
        getsuggestedstarrefbots.peer = qp.s1(i7).j1(this.b);
        getsuggestedstarrefbots.limit = 20;
        int i10 = this.g;
        getsuggestedstarrefbots.order_by_date = i10 == 3;
        getsuggestedstarrefbots.order_by_revenue = i10 == 2;
        if (TextUtils.isEmpty(this.j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.j;
        }
        ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new j0(this, 1));
    }
}
