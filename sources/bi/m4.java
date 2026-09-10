package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.je0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.an0;
import org.telegram.ui.br0;
import org.telegram.ui.cm0;
import org.telegram.ui.m70;
import org.telegram.ui.mh1;
import org.telegram.ui.mp;
import org.telegram.ui.pn;
import org.telegram.ui.qo;
import org.telegram.ui.wo0;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(int i10, Object obj, boolean z10) {
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
                AndroidUtilities.runOnUIThread(new c1((o4) obj, tLObject, z10, 1));
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
                        k9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new m4(i11, k9Var, z10));
                        break;
                    }
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c1((pn) obj, tLObject, z10, 13));
                break;
            case 5:
                yo yoVar = (yo) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    AndroidUtilities.runOnUIThread(new qo(yoVar, i11));
                    break;
                } else {
                    yoVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new ai.j(20, yoVar, z10));
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new g2(13, (mp) obj, tL_error, tLObject, this.b, false));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gf((je0) obj, tL_error, tLObject, z10));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new g2(22, (m70) obj, tL_error, tLObject, this.b, false));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new g2(23, (an0) obj, tL_error, tLObject, this.b, false));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new g2(26, (wo0) obj, tL_error, tLObject, this.b, false));
                break;
            case 11:
                br0 br0Var = (br0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new cm0(br0Var, tLObject, z10, 2));
                    break;
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new g2(28, (mh1) obj, tL_error, tLObject, this.b, false));
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                AndroidUtilities.runOnUIThread(new cm0((WallpapersListActivity) obj, tLObject, z10, 9));
                break;
        }
    }
}
