package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uh(22, baVar, tLObject));
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((b70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((zb0) obj, tL_error, tLObject, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ny(18, (yg0) obj, tLObject));
                break;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new wm(fj0Var, i14, tL_messages_messageReactionsList, i12));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, i13));
                break;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(jt0Var, tL_error, tLObject, 2));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new fr0((vx0) obj, tL_error, tLObject, i12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hx0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                x21 x21Var = (x21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(x21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ar0(i12, x21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ar0(10, (v31) obj, tLObject));
                break;
            case 17:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(d51Var, tL_error, tLObject, 11));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new ar0(14, (UndoView) obj, tLObject));
                break;
        }
    }
}
