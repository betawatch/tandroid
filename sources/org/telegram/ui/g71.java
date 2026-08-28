package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g71 extends UndoView {
    public final /* synthetic */ SessionsActivity b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.b0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void e(int i9, boolean z10) {
        int i10;
        if (!z10 && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i10 = ((org.telegram.ui.ActionBar.o2) this.b0).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new v40(26, this, tL_authorization));
        }
        super.e(i9, z10);
    }
}
