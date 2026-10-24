package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k71 implements v9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public k71(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.v9
    public final void E(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new j71(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.U = 4;
            sessionsActivity.k0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.m0();
        sessionsActivity.a.l();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.v9
    public final boolean U0(String str, n9 n9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new h71(this, str, n9Var, 1), 750L);
        return true;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void onDismiss() {
    }
}
