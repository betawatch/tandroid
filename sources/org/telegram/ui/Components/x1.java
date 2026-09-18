package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 20;
        int i12 = 8;
        int i13 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                ba baVar = (ba) obj;
                baVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.wh(22, baVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new oh(19, (mr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new oh(i11, (qs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new oh(26, (dx) obj, tLObject));
                break;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ny(1, pyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ny(9, (r60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((b70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q((zb0) obj, tL_error, tLObject, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ny(18, (zg0) obj, tLObject));
                break;
            case 10:
                gj0 gj0Var = (gj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gj0Var.post(new wm(gj0Var, i14, tL_messages_messageReactionsList, i12));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hj0((qj0) obj, tLObject, i13));
                break;
            case 12:
                kt0 kt0Var = (kt0) obj;
                kt0Var.getClass();
                AndroidUtilities.runOnUIThread(new gr0(kt0Var, tL_error, tLObject, 2));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gr0((wx0) obj, tL_error, tLObject, i12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ix0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                y21 y21Var = (y21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(y21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new br0(i12, y21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new br0(10, (w31) obj, tLObject));
                break;
            case 17:
                e51 e51Var = (e51) obj;
                e51Var.getClass();
                AndroidUtilities.runOnUIThread(new gr0(e51Var, tL_error, tLObject, 11));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new br0(14, (UndoView) obj, tLObject));
                break;
        }
    }
}
