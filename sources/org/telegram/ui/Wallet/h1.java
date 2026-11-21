package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.mp0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class h1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ i1 c;

    public h1(i1 i1Var, int i7, long j3) {
        this.c = i1Var;
        this.a = i7;
        this.b = j3;
    }

    public final void a(rc.u uVar, rc.x xVar, rc.x xVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(xVar == null ? "none" : Integer.valueOf(xVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(xVar2 != null ? Integer.valueOf(xVar2.b()) : "none");
        org.telegram.messenger.g0.g3(new mp0(this.c, uVar, this.a, sb2.toString(), 19));
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
            org.telegram.messenger.g0.g3(new mp0(this, uVar, i7, new JSONObject(str), 20));
        } catch (JSONException unused) {
            org.telegram.messenger.g0.g3(new j01(this, uVar, i7, 17));
        }
    }
}
