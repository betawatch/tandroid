package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.en;
import org.telegram.ui.eo;
import org.telegram.ui.ko;
import org.telegram.ui.kq0;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3(int i10, Object obj, boolean z10) {
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
                AndroidUtilities.runOnUIThread(new ai.x7((p3) obj, tLObject, z10, 4));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$155(z10, tLObject, tL_error);
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
                    m9Var.getMessagesController().lambda$processUpdates$377(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        m9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new o3(i11, m9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ai.x7((en) obj, tLObject, z10, 16));
                break;
            case 5:
                ko koVar = (ko) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new eo(koVar, i11));
                    break;
                } else {
                    koVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.t(25, koVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.y3(obj, (Object) tL_error, tLObject, this.b, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((te0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.y3(obj, (Object) tL_error, tLObject, this.b, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.y3(obj, (Object) tL_error, tLObject, this.b, 24));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.y3(obj, (Object) tL_error, tLObject, this.b, 27));
                break;
            case 11:
                kq0 kq0Var = (kq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new z70(kq0Var, tLObject, z10, 5));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.y3(obj, (Object) tL_error, tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new z70((WallpapersListActivity) obj, tLObject, z10, 14));
                break;
        }
    }
}
