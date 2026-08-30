package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.dp;
import org.telegram.ui.fq0;
import org.telegram.ui.g70;
import org.telegram.ui.jn;
import org.telegram.ui.jo;
import org.telegram.ui.jo0;
import org.telegram.ui.og1;
import org.telegram.ui.pm0;
import org.telegram.ui.po;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.l9 l9Var = (org.telegram.ui.l9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    l9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z4;
                        l9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, l9Var, z4));
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lh.r5((jn) obj, tLObject, z4, i11));
                break;
            case 4:
                po poVar = (po) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new jo(poVar, 3));
                    break;
                } else {
                    poVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new jh.f(19, poVar, z4));
                    break;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new cg.u0((dp) obj, tL_error, tLObject, this.b, 9));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hp((de0) obj, tL_error, tLObject, z4));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.u0((g70) obj, tL_error, tLObject, this.b, 18));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new cg.u0((pm0) obj, tL_error, tLObject, this.b, 19));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new cg.u0((jo0) obj, tL_error, tLObject, this.b, 22));
                break;
            case 10:
                fq0 fq0Var = (fq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new lh.r5(fq0Var, tLObject, z4, 28));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.u0((og1) obj, tL_error, tLObject, this.b, 24));
                break;
            case 12:
                int[][] iArr = WallpapersListActivity.h0;
                AndroidUtilities.runOnUIThread(new vq0((WallpapersListActivity) obj, tLObject, z4, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new vq0((ph.z2) obj, tLObject, z4, i11));
                break;
        }
    }
}
