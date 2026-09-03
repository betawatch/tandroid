package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i11 = 6;
        int i12 = 25;
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
                v9 v9Var = (v9) obj;
                v9Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(8, v9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new eo(5, (lr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new eo(i11, (qs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new eo(12, (cx) obj, tLObject));
                break;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new eo(17, qyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new eo(i12, (u60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, 7));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, 10));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new b90(4, (gh0) obj, tLObject));
                break;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new gy(pj0Var, i14, tL_messages_messageReactionsList, i11));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, i13));
                break;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) it0Var, (Object) tL_error, tLObject, 19));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new jp(obj, (Object) tL_error, tLObject, i12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new mh.c7(tLObject, (Utilities.Callback) obj, 1));
                break;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new b90(24, w21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new b90(26, (v31) obj, tLObject));
                break;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new jp((Object) c51Var, (Object) tL_error, tLObject, 28));
                break;
            default:
                int i15 = UndoView.b0;
                AndroidUtilities.runOnUIThread(new q51(i13, (UndoView) obj, tLObject));
                break;
        }
    }
}
