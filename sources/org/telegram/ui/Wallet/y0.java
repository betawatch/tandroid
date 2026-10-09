package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.x21;
import org.telegram.ui.bi0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var, int i10, long j3) {
        this.c = z0Var;
        this.a = i10;
        this.b = j3;
    }

    public final void a(sc.u uVar, sc.y yVar, sc.y yVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(yVar == null ? "none" : Integer.valueOf(yVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(yVar2 != null ? Integer.valueOf(yVar2.b()) : "none");
        AndroidUtilities.runOnUIThread(new x21(this.c, uVar, this.a, sb2.toString(), 13));
    }

    public final void b(sc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i10 = this.a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new x21(this, uVar, i10, new JSONObject(str), 14));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new bi0(this, uVar, i10, 11));
        }
    }
}
