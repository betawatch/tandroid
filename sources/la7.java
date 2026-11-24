// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class la7 implements jac {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ la7(oc7 oc7Var, long j, d dVar, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        this.d = oc7Var;
        this.c = j;
        this.e = dVar;
        this.f = tL_messages_editChatDefaultBannedRights;
        this.b = z;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        boolean z = this.b;
        Object obj4 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                oc7 oc7Var = (oc7) jm7Var;
                d dVar = (d) obj4;
                TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = (TLRPC.TL_messages_editChatDefaultBannedRights) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ik.c0(oc7Var.currentAccount, tL_error, dVar, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
                    break;
                } else {
                    oc7Var.getClass();
                    gm.d3(new r77(oc7Var, this.c, (byte) 22), 1000L);
                    break;
                }
            default:
                rrc rrcVar = (rrc) jm7Var;
                String str = (String) obj4;
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (str2 == null) {
                    wallettransaction.peer = c.h(rrcVar.f, rrcVar.h, rrcVar.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z;
                    wallettransaction.date = rrcVar.getConnectionsManager().getCurrentTime();
                    gm.t1(rrcVar.I);
                    goc.J0(rrcVar.getParentActivity(), rrcVar.getCurrentAccount(), wallettransaction, new jrc(rrcVar, cVar, this.c, (byte) 1), new hrc(rrcVar, (byte) 4), rrcVar.n0(), null, rrcVar.getResourceProvider());
                    gm.d3(new frc(rrcVar, (byte) 3), 1000L);
                    break;
                } else {
                    rrcVar.e0.setLoading(false);
                    c41.b0(rrcVar).f0(str2, false);
                    break;
                }
        }
    }

    public /* synthetic */ la7(rrc rrcVar, String str, boolean z, c cVar, long j) {
        this.d = rrcVar;
        this.e = str;
        this.b = z;
        this.f = cVar;
        this.c = j;
    }
}
