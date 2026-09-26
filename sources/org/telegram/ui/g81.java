package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class g81 extends UndoView {
    public final /* synthetic */ SessionsActivity f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g81(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void e(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.m2) this.f0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new vb0(19, this, tL_authorization));
        }
        super.e(i10, z10);
    }
}
