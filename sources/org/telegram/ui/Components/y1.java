package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        int i11 = 7;
        int i12 = 6;
        int i13 = 25;
        int i14 = 1;
        int i15 = 0;
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
                v9 v9Var = (v9) obj;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(9, v9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gm(i12, (lr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gm(i11, (qs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gm(13, (cx) obj, tLObject));
                break;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gm(18, qyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gm(26, (u60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, 10));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a90(5, (gh0) obj, tLObject));
                break;
            case 10:
                qj0 qj0Var = (qj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i16 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    qj0Var.post(new gy(qj0Var, i16, tL_messages_messageReactionsList, i12));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new rj0((ak0) obj, tLObject, i15));
                break;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) jt0Var, (Object) tL_error, tLObject, 19));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, i13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new mh.c7(tLObject, (Utilities.Callback) obj, i14));
                break;
            case 15:
                x21 x21Var = (x21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(x21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new a90(i13, x21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new a90(27, (w31) obj, tLObject));
                break;
            case 17:
                e51 e51Var = (e51) obj;
                e51Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) e51Var, (Object) tL_error, tLObject, 28));
                break;
            default:
                int i17 = UndoView.b0;
                AndroidUtilities.runOnUIThread(new l41(i14, (UndoView) obj, tLObject));
                break;
        }
    }
}
