package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cn0;
import org.telegram.ui.cr0;
import org.telegram.ui.dm0;
import org.telegram.ui.ih1;
import org.telegram.ui.kp;
import org.telegram.ui.nn;
import org.telegram.ui.oo;
import org.telegram.ui.p70;
import org.telegram.ui.wo;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 3;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((w3) obj, tLObject, z10, 1));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$156(z10, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                break;
            case 3:
                org.telegram.ui.m9 m9Var = (org.telegram.ui.m9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    m9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u3(i11, m9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new y0((nn) obj, tLObject, z10, 13));
                break;
            case 5:
                wo woVar = (wo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new oo(woVar, i11));
                    break;
                } else {
                    woVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(20, woVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.s4((kp) obj, tL_error, tLObject, this.b, 13));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((ae0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.s4((p70) obj, tL_error, tLObject, this.b, 22));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.s4((cn0) obj, tL_error, tLObject, this.b, 23));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.s4((yo0) obj, tL_error, tLObject, this.b, 26));
                break;
            case 11:
                cr0 cr0Var = (cr0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dm0(cr0Var, tLObject, z10, 2));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.s4((ih1) obj, tL_error, tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.i0;
                AndroidUtilities.runOnUIThread(new dm0((WallpapersListActivity) obj, tLObject, z10, 9));
                break;
        }
    }
}
