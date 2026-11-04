package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ x0 c;

    public w0(x0 x0Var, int i3, long j10) {
        this.c = x0Var;
        this.a = i3;
        this.b = j10;
    }

    public final void a(oc.u uVar, oc.x xVar, oc.x xVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(xVar == null ? "none" : Integer.valueOf(xVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(xVar2 != null ? Integer.valueOf(xVar2.b()) : "none");
        org.telegram.messenger.g0.h3(new zo0(this.c, uVar, this.a, sb2.toString(), 19));
    }

    public final void b(oc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i3 = this.a;
        sb2.append(i3);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.h3(new zo0(this, uVar, i3, new JSONObject(str), 20));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.h3(new rw(this, uVar, i3, 14));
        }
    }
}
