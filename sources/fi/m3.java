package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.te0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.d80;
import org.telegram.ui.fn;
import org.telegram.ui.go;
import org.telegram.ui.mo;
import org.telegram.ui.rq0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(int i10, Object obj, boolean z10) {
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
                AndroidUtilities.runOnUIThread(new bi.u7((n3) obj, tLObject, z10, 4));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$155(z10, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                break;
            case 3:
                org.telegram.ui.o9 o9Var = (org.telegram.ui.o9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    o9Var.getMessagesController().lambda$processUpdates$379(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        o9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new m3(i11, o9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bi.u7((fn) obj, tLObject, z10, 15));
                break;
            case 5:
                mo moVar = (mo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new go(moVar, i11));
                    break;
                } else {
                    moVar.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bh.n(25, moVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new kg((te0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 24));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 27));
                break;
            case 11:
                rq0 rq0Var = (rq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new d80(rq0Var, tLObject, z10, 5));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new d80((WallpapersListActivity) obj, tLObject, z10, 14));
                break;
        }
    }
}
