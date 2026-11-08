package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.d10;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var, int i7, long j3) {
        this.c = z0Var;
        this.a = i7;
        this.b = j3;
    }

    public final void a(rc.u uVar, rc.x xVar, rc.x xVar2, boolean z9) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z9);
        sb2.append(", serverCloseCode=");
        sb2.append(xVar == null ? "none" : Integer.valueOf(xVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(xVar2 != null ? Integer.valueOf(xVar2.b()) : "none");
        org.telegram.messenger.g0.h3(new pp0(this.c, uVar, this.a, sb2.toString(), 18));
    }

    public final void b(rc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i7 = this.a;
        sb2.append(i7);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.a8.b(sb2.toString());
        try {
            org.telegram.messenger.g0.h3(new pp0(this, uVar, i7, new JSONObject(str), 19));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.h3(new d10(this, uVar, i7, 13));
        }
    }
}
