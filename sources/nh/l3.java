package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.fn;
import org.telegram.ui.fo;
import org.telegram.ui.hm0;
import org.telegram.ui.ko;
import org.telegram.ui.mp0;
import org.telegram.ui.v60;
import org.telegram.ui.yo;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 3;
        int i12 = 0;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new jh.r5((m3) obj, tLObject, z10, 4));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                break;
            case 3:
                org.telegram.ui.h9 h9Var = (org.telegram.ui.h9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    h9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        h9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new l3(i11, h9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new jh.r5((fn) obj, tLObject, z10, 11));
                break;
            case 5:
                ko koVar = (ko) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new fo(koVar, i11));
                    break;
                } else {
                    koVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new hh.f(24, koVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ag.w0((yo) obj, tL_error, tLObject, this.b, 11));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g((vd0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ag.w0((v60) obj, tL_error, tLObject, this.b, 20));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ag.w0((hm0) obj, tL_error, tLObject, this.b, 21));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ag.w0((bo0) obj, tL_error, tLObject, this.b, 24));
                break;
            case 11:
                zp0 zp0Var = (zp0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new mp0(zp0Var, tLObject, z10, i12));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ag.w0((cg1) obj, tL_error, tLObject, this.b, 26));
                break;
            default:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new mp0((WallpapersListActivity) obj, tLObject, z10, 7));
                break;
        }
    }
}
