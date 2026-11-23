package hi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.b80;
import org.telegram.ui.cn0;
import org.telegram.ui.mm;
import org.telegram.ui.mn;
import org.telegram.ui.rn;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new di.p6((c3) this.c, tLObject, this.b, 4));
                break;
            case 1:
                ((VoIPService) this.c).lambda$acknowledgeCall$13(this.b, tLObject, tL_error);
                break;
            case 2:
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) this.c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().V3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, j9Var, z10));
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.g3(new di.p6((mm) this.c, tLObject, this.b, 15));
                break;
            case 4:
                rn rnVar = (rn) this.c;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    org.telegram.messenger.g0.g3(new mn(rnVar, 3));
                    break;
                } else {
                    rnVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(new ch.k(21, rnVar, this.b));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.g3(new yn(this.c, (Object) tL_error, (Object) tLObject, this.b, 0));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.g((yc0) this.c, tL_error, tLObject, this.b));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new yn(this.c, (Object) tL_error, (Object) tLObject, this.b, 9));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new yn(this.c, (Object) tL_error, (Object) tLObject, this.b, 10));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new yn(this.c, (Object) tL_error, (Object) tLObject, this.b, 13));
                break;
            case 10:
                cn0 cn0Var = (cn0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new b80(cn0Var, tLObject, this.b, 4));
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.g0.g3(new yn(this.c, (Object) tL_error, (Object) tLObject, this.b, 14));
                break;
            default:
                org.telegram.messenger.g0.g3(new b80((WallpapersListActivity) this.c, tLObject, this.b, 13));
                break;
        }
    }
}
