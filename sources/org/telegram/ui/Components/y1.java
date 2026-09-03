package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.np(9, v9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new em(i12, (ir) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new em(i11, (ns) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new em(13, (ax) obj, tLObject));
                break;
            case 5:
                oy oyVar = (oy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new em(18, oyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new em(26, (t60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gp(obj, (Object) tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gp(obj, (Object) tL_error, tLObject, 10));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new z80(5, (fh0) obj, tLObject));
                break;
            case 10:
                oj0 oj0Var = (oj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i16 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    oj0Var.post(new ey(oj0Var, i16, tL_messages_messageReactionsList, i12));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new pj0((yj0) obj, tLObject, i15));
                break;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new gp((Object) it0Var, (Object) tL_error, tLObject, 19));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gp(obj, (Object) tL_error, tLObject, i13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new lh.c7(tLObject, (Utilities.Callback) obj, i14));
                break;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new z80(i13, w21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new z80(27, (v31) obj, tLObject));
                break;
            case 17:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                AndroidUtilities.runOnUIThread(new gp((Object) d51Var, (Object) tL_error, tLObject, 28));
                break;
            default:
                int i17 = UndoView.b0;
                AndroidUtilities.runOnUIThread(new k41(i14, (UndoView) obj, tLObject));
                break;
        }
    }
}
