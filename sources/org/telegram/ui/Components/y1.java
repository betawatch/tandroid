package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rh(22, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ph(19, (nr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ph(i11, (rs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ph(26, (ex) obj, tLObject));
                break;
            case 5:
                qy qyVar = (qy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new oy(1, qyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new oy(9, (s60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((c70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((yb0) obj, tL_error, tLObject, 23));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new oy(18, (zg0) obj, tLObject));
                break;
            case 10:
                gj0 gj0Var = (gj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gj0Var.post(new xm(gj0Var, i14, tL_messages_messageReactionsList, i12));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hj0((qj0) obj, tLObject, i13));
                break;
            case 12:
                jt0 jt0Var = (jt0) obj;
                jt0Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(jt0Var, tL_error, tLObject, 2));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new fr0((ux0) obj, tL_error, tLObject, i12));
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
                        AndroidUtilities.runOnUIThread(new ar0(i12, w21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ar0(10, (u31) obj, tLObject));
                break;
            case 17:
                c51 c51Var = (c51) obj;
                c51Var.getClass();
                AndroidUtilities.runOnUIThread(new fr0(c51Var, tL_error, tLObject, 11));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new ar0(14, (UndoView) obj, tLObject));
                break;
        }
    }
}
