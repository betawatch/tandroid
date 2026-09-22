package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m81 extends UndoView {
    public final /* synthetic */ SessionsActivity f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m81(SessionsActivity sessionsActivity, Context context) {
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
            i11 = ((org.telegram.ui.ActionBar.n2) this.f0).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new bc0(19, this, tL_authorization));
        }
        super.e(i10, z10);
    }
}
