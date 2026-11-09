package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public ur(int i7, rr rrVar) {
        this.a = i7;
        this.b = rrVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z9 = this.d;
        int i7 = this.a;
        if (!z9) {
            tr trVar = new tr(this, 0);
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
            a02.a.c(new ng(this, a02, trVar, 4));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new x1(this, 2));
    }
}
