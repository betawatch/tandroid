package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l41 extends UndoView {
    public final /* synthetic */ SessionsActivity j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l41(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.j0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void d(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.k2) this.j0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new ul0(9, this, tL_authorization));
        }
        super.d(i10, z10);
    }
}
