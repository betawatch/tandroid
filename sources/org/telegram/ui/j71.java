package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j71 implements r9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public j71(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public final void K(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new i71(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.f.add(0, tL_authorization);
            sessionsActivity.R = 4;
            sessionsActivity.j0(false);
        } else {
            sessionsActivity.e.add(0, tL_authorization);
        }
        sessionsActivity.l0();
        sessionsActivity.a.l();
        sessionsActivity.s.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.r9
    public final boolean i1(String str, j9 j9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new ye0(this, str, j9Var, 29), 750L);
        return true;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void onDismiss() {
    }
}
