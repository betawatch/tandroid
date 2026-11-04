package gi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.a60;
import org.telegram.ui.hm;
import org.telegram.ui.hn;
import org.telegram.ui.ln;
import org.telegram.ui.rn;
import org.telegram.ui.sm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ci.v6((c3) this.c, tLObject, this.b, 4));
                break;
            case 1:
                ((VoIPService) this.c).lambda$acknowledgeCall$13(this.b, tLObject, tL_error);
                break;
            case 2:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) this.c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    h9Var.getMessagesController().O3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new b3(2, h9Var, z10));
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new ci.v6((hm) this.c, tLObject, this.b, 15));
                break;
            case 4:
                ln lnVar = (ln) this.c;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    org.telegram.messenger.g0.h3(new hn(lnVar, 3));
                    break;
                } else {
                    lnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new ci.e1(21, lnVar, this.b));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new rn(this.c, (Object) tL_error, (Object) tLObject, this.b, 0));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.e7((hc0) this.c, tL_error, tLObject, this.b));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new rn(this.c, (Object) tL_error, (Object) tLObject, this.b, 9));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new rn(this.c, (Object) tL_error, (Object) tLObject, this.b, 10));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new rn(this.c, (Object) tL_error, (Object) tLObject, this.b, 13));
                break;
            case 10:
                sm0 sm0Var = (sm0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new a60(sm0Var, tLObject, this.b, 5));
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.g0.h3(new rn(this.c, (Object) tL_error, (Object) tLObject, this.b, 14));
                break;
            default:
                org.telegram.messenger.g0.h3(new a60((WallpapersListActivity) this.c, tLObject, this.b, 14));
                break;
        }
    }
}
