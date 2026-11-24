// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nj6 implements h59, ee {
    public final /* synthetic */ ak6 a;

    public /* synthetic */ nj6(ak6 ak6Var) {
        this.a = ak6Var;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        ak6 ak6Var = this.a;
        if ((i < ak6Var.E || i >= ak6Var.F) && (i < ak6Var.I || i >= ak6Var.J)) {
            return false;
        }
        ((xj6) view).y.callOnClick();
        try {
            view.performHapticFeedback(0, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        TLRPC.TL_messages_deleteRevokedExportedChatInvites tL_messages_deleteRevokedExportedChatInvites = new TLRPC.TL_messages_deleteRevokedExportedChatInvites();
        ak6 ak6Var = this.a;
        tL_messages_deleteRevokedExportedChatInvites.peer = ak6Var.getMessagesController().i1(-ak6Var.n);
        long j = ak6Var.f;
        if (j == ak6Var.getUserConfig().e()) {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ak6Var.getMessagesController().p1(ak6Var.getUserConfig().f());
        } else {
            tL_messages_deleteRevokedExportedChatInvites.admin_id = ak6Var.getMessagesController().n1(j);
        }
        ak6Var.d0 = true;
        ak6Var.getConnectionsManager().sendRequest(tL_messages_deleteRevokedExportedChatInvites, new jj6(ak6Var, (byte) 1));
    }
}
