package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c0 {
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

    public c0(int i7, long j3) {
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
        getsuggestedstarrefbots.peer = np.u1(i7).l1(this.b);
        getsuggestedstarrefbots.limit = 20;
        int i10 = this.g;
        getsuggestedstarrefbots.order_by_date = i10 == 3;
        getsuggestedstarrefbots.order_by_revenue = i10 == 2;
        if (TextUtils.isEmpty(this.j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.j;
        }
        ConnectionsManager.getInstance(i7).sendRequest(getsuggestedstarrefbots, new ai.g1(this, 2));
    }
}
