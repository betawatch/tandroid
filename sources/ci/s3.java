package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.br0;
import org.telegram.ui.ha0;
import org.telegram.ui.ih1;
import org.telegram.ui.ip;
import org.telegram.ui.l70;
import org.telegram.ui.ln;
import org.telegram.ui.mo;
import org.telegram.ui.uo;
import org.telegram.ui.vo0;
import org.telegram.ui.zm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s3(int i10, Object obj, boolean z10) {
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
                AndroidUtilities.runOnUIThread(new x0((u3) obj, tLObject, z10, 1));
                break;
            case 1:
                ((MessagesController) obj).lambda$updateTimerProc$155(z10, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z10, tLObject, tL_error);
                break;
            case 3:
                org.telegram.ui.j9 j9Var = (org.telegram.ui.j9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    j9Var.getMessagesController().lambda$processUpdates$377(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        j9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(i11, j9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new x0((ln) obj, tLObject, z10, 14));
                break;
            case 5:
                uo uoVar = (uo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new mo(uoVar, i11));
                    break;
                } else {
                    uoVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new bi.f(22, uoVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new ai.t4((ip) obj, tL_error, tLObject, this.b, 14));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((bf0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ai.t4((l70) obj, tL_error, tLObject, this.b, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ai.t4((zm0) obj, tL_error, tLObject, this.b, 24));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ai.t4((vo0) obj, tL_error, tLObject, this.b, 27));
                break;
            case 11:
                br0 br0Var = (br0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ha0(br0Var, tLObject, z10, i11));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ai.t4((ih1) obj, tL_error, tLObject, this.b, 29));
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new ha0((WallpapersListActivity) obj, tLObject, z10, 12));
                break;
        }
    }
}
