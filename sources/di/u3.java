package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bn0;
import org.telegram.ui.br0;
import org.telegram.ui.dm0;
import org.telegram.ui.hh1;
import org.telegram.ui.lp;
import org.telegram.ui.n70;
import org.telegram.ui.on;
import org.telegram.ui.po;
import org.telegram.ui.xo;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                org.telegram.ui.k9 k9Var = (org.telegram.ui.k9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    k9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z10;
                        k9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new u3(i11, k9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new y0((on) obj, tLObject, z10, 13));
                break;
            case 5:
                xo xoVar = (xo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new po(xoVar, i11));
                    break;
                } else {
                    xoVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ah.u(21, xoVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bi.e4((lp) obj, tL_error, tLObject, this.b, 13));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((ae0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bi.e4((n70) obj, tL_error, tLObject, this.b, 22));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new bi.e4((bn0) obj, tL_error, tLObject, this.b, 23));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new bi.e4((xo0) obj, tL_error, tLObject, this.b, 26));
                break;
            case 11:
                br0 br0Var = (br0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new dm0(br0Var, tLObject, z10, 2));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new bi.e4((hh1) obj, tL_error, tLObject, this.b, 28));
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new dm0((WallpapersListActivity) obj, tLObject, z10, 9));
                break;
        }
    }
}
