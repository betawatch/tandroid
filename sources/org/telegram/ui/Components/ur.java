package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ur {
    public final int a;
    public final rr b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public ur(int i3, rr rrVar) {
        this.a = i3;
        this.b = rrVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z10 = this.d;
        int i3 = this.a;
        if (!z10) {
            tr trVar = new tr(this, 0);
            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
            a02.a.c(new e7(this, a02, trVar, 8));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i3).sendRequest(getpopularappbots, new w1(this, 2));
    }
}
