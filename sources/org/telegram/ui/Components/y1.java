package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        int i11 = 2;
        int i12 = 20;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(28, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new uc(25, (lr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new uc(26, (ps) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new zu(i11, (dx) obj, tLObject));
                break;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zu(7, pyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zu(15, (r60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((b70) obj, tL_error, tLObject, i12));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((ac0) obj, tL_error, tLObject, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new zu(24, (yg0) obj, tLObject));
                break;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new org.telegram.ui.dm(fj0Var, i14, tL_messages_messageReactionsList, 9));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, i13));
                break;
            case 12:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                AndroidUtilities.runOnUIThread(new er0(it0Var, tL_error, tLObject, i11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new er0((ux0) obj, tL_error, tLObject, 8));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gx0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                w21 w21Var = (w21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new jn0(14, w21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new jn0(16, (u31) obj, tLObject));
                break;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new er0(c51Var, tL_error, tLObject, 11));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new jn0(i12, (UndoView) obj, tLObject));
                break;
        }
    }
}
