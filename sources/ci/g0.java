package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 {
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

    public g0(int i3, long j10) {
        this.h = false;
        this.i = false;
        this.j = null;
        this.a = i3;
        this.b = j10;
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
        int i3 = this.a;
        getsuggestedstarrefbots.peer = hp.s1(i3).j1(this.b);
        getsuggestedstarrefbots.limit = 20;
        int i10 = this.g;
        getsuggestedstarrefbots.order_by_date = i10 == 3;
        getsuggestedstarrefbots.order_by_revenue = i10 == 2;
        if (TextUtils.isEmpty(this.j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.j;
        }
        ConnectionsManager.getInstance(i3).sendRequest(getsuggestedstarrefbots, new d0(this, 1));
    }
}
