package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 23;
        int i12 = 14;
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
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(27, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kd(24, (nr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new kd(25, (rs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new vw(1, (fx) obj, tLObject));
                break;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new vw(6, qyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new vw(i12, (c70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((m70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((kc0) obj, tL_error, tLObject, 26));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new vw(i11, (jh0) obj, tLObject));
                break;
            case 10:
                qj0 qj0Var = (qj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    qj0Var.post(new xm(qj0Var, i14, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new rj0((ak0) obj, tLObject, i13));
                break;
            case 12:
                ut0 ut0Var = (ut0) obj;
                ut0Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(ut0Var, tL_error, tLObject, 5));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new cn0((fy0) obj, tL_error, tLObject, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new rx0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                k31 k31Var = (k31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(k31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new wn0(13, k31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new wn0(15, (i41) obj, tLObject));
                break;
            case 17:
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(q51Var, tL_error, tLObject, i12));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new wn0(19, (UndoView) obj, tLObject));
                break;
        }
    }
}
