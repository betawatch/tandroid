package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f71 extends UndoView {
    public final /* synthetic */ SessionsActivity b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.b0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void e(int i10, boolean z10) {
        int i11;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i11 = ((org.telegram.ui.ActionBar.n2) this.b0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new v80(23, this, tL_authorization));
        }
        super.e(i10, z10);
    }
}
