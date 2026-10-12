package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.fn0;
import org.telegram.ui.hr0;
import org.telegram.ui.ma0;
import org.telegram.ui.np;
import org.telegram.ui.oh1;
import org.telegram.ui.qn;
import org.telegram.ui.ro;
import org.telegram.ui.s70;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    n9Var.getMessagesController().lambda$processUpdates$377(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new s3(i11, n9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new x0((qn) obj, tLObject, z10, 15));
                break;
            case 5:
                zo zoVar = (zo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new ro(zoVar, i11));
                    break;
                } else {
                    zoVar.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.t(23, zoVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.h4((np) obj, tL_error, tLObject, this.b, 13));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new v70((ze0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.h4((s70) obj, tL_error, tLObject, this.b, 22));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.h4((fn0) obj, tL_error, tLObject, this.b, 23));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.h4((cp0) obj, tL_error, tLObject, this.b, 26));
                break;
            case 11:
                hr0 hr0Var = (hr0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ma0(hr0Var, tLObject, z10, 4));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.h4((oh1) obj, tL_error, tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new ma0((WallpapersListActivity) obj, tLObject, z10, 13));
                break;
        }
    }
}
