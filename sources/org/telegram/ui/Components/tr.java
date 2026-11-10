package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tr {
    public final int a;
    public final qr b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public tr(int i7, qr qrVar) {
        this.a = i7;
        this.b = qrVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z9 = this.d;
        int i7 = this.a;
        if (!z9) {
            sr srVar = new sr(this, 0);
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
            a02.a.c(new mg(this, a02, srVar, 4));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new w1(this, 2));
    }
}
