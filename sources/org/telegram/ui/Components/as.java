package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class as {
    public final int a;
    public final xr b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public as(int i7, xr xrVar) {
        this.a = i7;
        this.b = xrVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z10 = this.d;
        int i7 = this.a;
        if (!z10) {
            zr zrVar = new zr(this, 0);
            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
            a02.a.c(new yf(this, a02, zrVar, 6));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new v1(this, 2));
    }
}
