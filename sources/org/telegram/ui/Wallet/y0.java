package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var, int i10, long j10) {
        this.c = z0Var;
        this.a = i10;
        this.b = j10;
    }

    public final void a(lc.v vVar, lc.y yVar, lc.y yVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(yVar == null ? "none" : Integer.valueOf(yVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(yVar2 != null ? Integer.valueOf(yVar2.b()) : "none");
        org.telegram.messenger.i0.g3(new d11(this.c, vVar, this.a, sb2.toString(), 13));
    }

    public final void b(lc.v vVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i10 = this.a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        org.telegram.messenger.f8.b(sb2.toString());
        try {
            org.telegram.messenger.i0.g3(new d11(this, vVar, i10, new JSONObject(str), 14));
        } catch (JSONException unused) {
            org.telegram.messenger.i0.g3(new x0(this, vVar, i10, 0));
        }
    }
}
