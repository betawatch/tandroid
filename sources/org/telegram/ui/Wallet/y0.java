package org.telegram.ui.Wallet;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public final void a(uc.u uVar, uc.x xVar, uc.x xVar2, boolean z10) {
        StringBuilder sb2 = new StringBuilder("websocket disconnected; closedByServer=");
        sb2.append(z10);
        sb2.append(", serverCloseCode=");
        sb2.append(xVar == null ? "none" : Integer.valueOf(xVar.b()));
        sb2.append(", clientCloseCode=");
        sb2.append(xVar2 != null ? Integer.valueOf(xVar2.b()) : "none");
        AndroidUtilities.runOnUIThread(new zr0(this.c, uVar, this.a, sb2.toString(), 18));
    }

    public final void b(uc.u uVar, String str) {
        StringBuilder sb2 = new StringBuilder("[gram-wallet-streaming] account=");
        sb2.append(this.c.a);
        sb2.append(" generation=");
        int i10 = this.a;
        sb2.append(i10);
        sb2.append(" receive <- ");
        sb2.append(str);
        FileLog.d(sb2.toString());
        try {
            AndroidUtilities.runOnUIThread(new zr0(this, uVar, i10, new JSONObject(str), 19));
        } catch (JSONException unused) {
            AndroidUtilities.runOnUIThread(new yx(this, uVar, i10, 14));
        }
    }
}
