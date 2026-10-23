package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g71 extends UndoView {
    public final /* synthetic */ SessionsActivity j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(SessionsActivity sessionsActivity, Context context) {
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
            i11 = ((org.telegram.ui.ActionBar.o2) this.j0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new a50(26, this, tL_authorization));
        }
        super.d(i10, z10);
    }
}
