package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a1 c;

    public z0(a1 a1Var, int i10, long j10) {
        this.c = a1Var;
        this.a = i10;
        this.b = j10;
    }

    public final void a(tc.u uVar, tc.x xVar, tc.x xVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(xVar == null ? "none" : Integer.valueOf(xVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(xVar2 != null ? Integer.valueOf(xVar2.b()) : "none");
        AndroidUtilities.runOnUIThread(new bz0(this.c, uVar, this.a, sb2.toString(), 15, false));
    }

    public final void b(tc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i10 = this.a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new bz0(this, uVar, i10, new JSONObject(str), 16));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new x31(this, uVar, i10, 16));
        }
    }
}
