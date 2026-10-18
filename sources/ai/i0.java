package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class i0 {
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

    public i0(int i10, long j10) {
        this.h = false;
        this.i = false;
        this.j = null;
        this.a = i10;
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
        int i10 = this.a;
        getsuggestedstarrefbots.peer = MessagesController.getInstance(i10).getInputPeer(this.b);
        getsuggestedstarrefbots.limit = 20;
        int i11 = this.g;
        getsuggestedstarrefbots.order_by_date = i11 == 3;
        getsuggestedstarrefbots.order_by_revenue = i11 == 2;
        if (TextUtils.isEmpty(this.j)) {
            getsuggestedstarrefbots.offset = "";
        } else {
            getsuggestedstarrefbots.offset = this.j;
        }
        ConnectionsManager.getInstance(i10).sendRequest(getsuggestedstarrefbots, new h(this, 2));
    }
}
