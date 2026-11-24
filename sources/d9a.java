// default package

import android.content.Context;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d9a extends UndoView {
    public final /* synthetic */ SessionsActivity k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9a(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.k0 = sessionsActivity;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void d(int i, boolean z) {
        int i2;
        if (!z && getCurrentInfoObject() != null) {
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            i2 = ((d) this.k0).currentAccount;
            ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new jl7(this, tL_authorization, (byte) 21));
        }
        super.d(i, z);
    }
}
