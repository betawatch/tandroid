package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.f80;
import org.telegram.ui.hn;
import org.telegram.ui.io;
import org.telegram.ui.oo;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                AndroidUtilities.runOnUIThread(new bi.u7((hn) obj, tLObject, z10, 15));
                break;
            case 5:
                oo ooVar = (oo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new io(ooVar, i11));
                    break;
                } else {
                    ooVar.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bh.n(25, ooVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new kg((ue0) obj, tL_error, tLObject, z10));
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
                tq0 tq0Var = (tq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new f80(tq0Var, tLObject, z10, 5));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.s9(obj, (Object) tL_error, (Object) tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.g0;
                AndroidUtilities.runOnUIThread(new f80((WallpapersListActivity) obj, tLObject, z10, 14));
                break;
        }
    }
}
