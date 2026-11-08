package fi;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.g60;
import org.telegram.ui.lm;
import org.telegram.ui.ln;
import org.telegram.ui.pn;
import org.telegram.ui.vn;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d3(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.u7((e3) this.c, tLObject, this.b, 4));
                break;
            case 1:
                ((VoIPService) this.c).lambda$acknowledgeCall$13(this.b, tLObject, tL_error);
                break;
            case 2:
                org.telegram.ui.i9 i9Var = (org.telegram.ui.i9) this.c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    i9Var.getMessagesController().O3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z9 = this.b;
                        tL_messages_deletePhoneCallHistory.revoke = z9;
                        i9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new d3(2, i9Var, z9));
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.g0.h3(new bi.u7((lm) this.c, tLObject, this.b, 15));
                break;
            case 4:
                pn pnVar = (pn) this.c;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    org.telegram.messenger.g0.h3(new ln(pnVar, 3));
                    break;
                } else {
                    pnVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(new bi.k1(21, pnVar, this.b));
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new vn(this.c, (Object) tL_error, (Object) tLObject, this.b, 0));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ng((mc0) this.c, tL_error, tLObject, this.b));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new vn(this.c, (Object) tL_error, (Object) tLObject, this.b, 9));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new vn(this.c, (Object) tL_error, (Object) tLObject, this.b, 10));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new vn(this.c, (Object) tL_error, (Object) tLObject, this.b, 13));
                break;
            case 10:
                xm0 xm0Var = (xm0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new g60(xm0Var, tLObject, this.b, 5));
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.g0.h3(new vn(this.c, (Object) tL_error, (Object) tLObject, this.b, 14));
                break;
            default:
                org.telegram.messenger.g0.h3(new g60((WallpapersListActivity) this.c, tLObject, this.b, 14));
                break;
        }
    }
}
