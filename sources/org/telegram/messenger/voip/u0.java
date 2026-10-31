package org.telegram.messenger.voip;

import bi.n4;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bk0;
import org.telegram.ui.cp;
import org.telegram.ui.e60;
import org.telegram.ui.fn;
import org.telegram.ui.ho;
import org.telegram.ui.j9;
import org.telegram.ui.kp;
import org.telegram.ui.lo0;
import org.telegram.ui.oo;
import org.telegram.ui.sm0;
import org.telegram.ui.tc1;
import org.telegram.ui.yk0;
import vh.j2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPService) this.c).lambda$acknowledgeCall$13(this.b, tLObject, tL_error);
                break;
            case 1:
                j9 j9Var = (j9) this.c;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().L3(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        boolean z10 = this.b;
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u0(1, j9Var, z10));
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.messenger.i0.g3(new ag.j0((fn) this.c, tLObject, this.b, 12));
                break;
            case 3:
                oo ooVar = (oo) this.c;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    org.telegram.messenger.i0.g3(new ho(ooVar, 3));
                    break;
                } else {
                    ooVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new k2.v(11, ooVar, this.b));
                    break;
                }
            case 4:
                org.telegram.messenger.i0.g3(new n4((cp) this.c, tL_error, tLObject, this.b, 28));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new jg((hd0) this.c, tL_error, tLObject, this.b));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new kp((e60) this.c, tL_error, tLObject, this.b, 7));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new kp((yk0) this.c, tL_error, tLObject, this.b, 8));
                break;
            case 8:
                org.telegram.messenger.i0.g3(new kp((sm0) this.c, tL_error, tLObject, this.b, 11));
                break;
            case 9:
                lo0 lo0Var = (lo0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new bk0(lo0Var, tLObject, this.b, 2));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new kp((tc1) this.c, tL_error, tLObject, this.b, 12));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new bk0((WallpapersListActivity) this.c, tLObject, this.b, 11));
                break;
            default:
                org.telegram.messenger.i0.g3(new bk0((j2) this.c, tLObject, this.b, 18));
                break;
        }
    }
}
