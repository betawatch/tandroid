package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.fp;
import org.telegram.ui.i70;
import org.telegram.ui.ln;
import org.telegram.ui.lo;
import org.telegram.ui.lo0;
import org.telegram.ui.mq0;
import org.telegram.ui.rm0;
import org.telegram.ui.ro;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class zd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 9;
        boolean z4 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((MessagesController) obj).lambda$updateTimerProc$156(z4, tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z4, tLObject, tL_error);
                break;
            case 2:
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    n9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z4;
                        n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, n9Var, z4));
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lh.r5((ln) obj, tLObject, z4, i11));
                break;
            case 4:
                ro roVar = (ro) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new lo(roVar, 3));
                    break;
                } else {
                    roVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new jh.f(19, roVar, z4));
                    break;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new cg.u0((fp) obj, tL_error, tLObject, this.b, 9));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gp((ee0) obj, tL_error, tLObject, z4));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.u0((i70) obj, tL_error, tLObject, this.b, 18));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new cg.u0((rm0) obj, tL_error, tLObject, this.b, 19));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new cg.u0((lo0) obj, tL_error, tLObject, this.b, 22));
                break;
            case 10:
                mq0 mq0Var = (mq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new lh.r5(mq0Var, tLObject, z4, 28));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.u0((wg1) obj, tL_error, tLObject, this.b, 24));
                break;
            case 12:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new cr0((WallpapersListActivity) obj, tLObject, z4, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new cr0((ph.z2) obj, tLObject, z4, i11));
                break;
        }
    }
}
