package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i12 = 10;
        int i13 = 6;
        int i14 = 19;
        int i15 = 28;
        int i16 = 0;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hp(i12, v9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new il(i11, (jr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new il(8, (os) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new il(14, (ax) obj, tLObject));
                break;
            case 5:
                oy oyVar = (oy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new il(i14, oyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new il(27, (s60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new hp(obj, (Object) tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new hp(obj, (Object) tL_error, tLObject, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new i80(i13, (eh0) obj, tLObject));
                break;
            case 10:
                oj0 oj0Var = (oj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i17 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    oj0Var.post(new ey(oj0Var, i17, tL_messages_messageReactionsList, i13));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new pj0((yj0) obj, tLObject, i16));
                break;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new hp((Object) it0Var, (Object) tL_error, tLObject, i14));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hp(obj, (Object) tL_error, tLObject, 25));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new lh.c7(tLObject, (Utilities.Callback) obj, 1));
                break;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new i80(26, w21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new i80(i15, (v31) obj, tLObject));
                break;
            case 17:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                AndroidUtilities.runOnUIThread(new hp((Object) d51Var, (Object) tL_error, tLObject, i15));
                break;
            default:
                int i18 = UndoView.b0;
                AndroidUtilities.runOnUIThread(new k41(2, (UndoView) obj, tLObject));
                break;
        }
    }
}
