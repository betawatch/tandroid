// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class k87 implements i8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gk7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k87(na7 na7Var, long j, d dVar, TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights, boolean z) {
        this.d = na7Var;
        this.c = j;
        this.e = dVar;
        this.f = tL_messages_editChatDefaultBannedRights;
        this.b = z;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        boolean z = this.b;
        Object obj4 = this.e;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                na7 na7Var = (na7) gk7Var;
                d dVar = (d) obj4;
                TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = (TLRPC.TL_messages_editChatDefaultBannedRights) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ij.c0(na7Var.currentAccount, tL_error, dVar, tL_messages_editChatDefaultBannedRights, Boolean.valueOf(z));
                    break;
                } else {
                    na7Var.getClass();
                    gl.d3(new r57(na7Var, this.c, (byte) 21), 1000L);
                    break;
                }
            default:
                qpc qpcVar = (qpc) gk7Var;
                String str = (String) obj4;
                c cVar = (c) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (str2 == null) {
                    wallettransaction.peer = c.h(qpcVar.f, qpcVar.h, qpcVar.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z;
                    wallettransaction.date = qpcVar.getConnectionsManager().getCurrentTime();
                    gl.t1(qpcVar.I);
                    hmc.I0(qpcVar.getParentActivity(), qpcVar.getCurrentAccount(), wallettransaction, new hpc(qpcVar, cVar, this.c, (byte) 1), new fpc(qpcVar, (byte) 4), qpcVar.m0(), null, qpcVar.getResourceProvider());
                    gl.d3(new dpc(qpcVar, (byte) 3), 1000L);
                    break;
                } else {
                    qpcVar.e0.setLoading(false);
                    u21.b0(qpcVar).f0(str2, false);
                    break;
                }
        }
    }

    public /* synthetic */ k87(qpc qpcVar, String str, boolean z, c cVar, long j) {
        this.d = qpcVar;
        this.e = str;
        this.b = z;
        this.f = cVar;
        this.c = j;
    }
}
