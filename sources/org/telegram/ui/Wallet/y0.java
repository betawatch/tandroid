package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.fz0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class y0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ z0 c;

    public y0(z0 z0Var, int i10, long j10) {
        this.c = z0Var;
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
        AndroidUtilities.runOnUIThread(new fz0(this.c, uVar, this.a, sb2.toString(), 16));
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
            AndroidUtilities.runOnUIThread(new fz0(this, uVar, i10, new JSONObject(str), 17));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new c41(this, uVar, i10, 16));
        }
    }
}
