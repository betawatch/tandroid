package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        int i10 = 13;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.b;
        switch (i9) {
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(4, v9Var, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zq(i11, (cr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new zq(2, (gs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new zq(8, (pw) obj, tLObject));
                break;
            case 5:
                ay ayVar = (ay) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zq(i10, ayVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zq(21, (a60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((k60) obj, tL_error, tLObject, 25));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((gb0) obj, tL_error, tLObject, 28));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new jg0(i12, (kg0) obj, tLObject));
                break;
            case 10:
                ui0 ui0Var = (ui0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i13 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    ui0Var.post(new org.telegram.ui.rl(ui0Var, i13, tL_messages_messageReactionsList, 9));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new vi0((ej0) obj, tLObject, i12));
                break;
            case 12:
                ps0 ps0Var = (ps0) obj;
                ps0Var.getClass();
                AndroidUtilities.runOnUIThread(new ue0(ps0Var, tL_error, tLObject, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ue0((cx0) obj, tL_error, tLObject, i10));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gh.e7(tLObject, (Utilities.Callback) obj, i11));
                break;
            case 15:
                b21 b21Var = (b21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(b21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new jg0(20, b21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new jg0(22, (z21) obj, tLObject));
                break;
            case 17:
                g41 g41Var = (g41) obj;
                g41Var.getClass();
                AndroidUtilities.runOnUIThread(new ue0(g41Var, tL_error, tLObject, 16));
                break;
            default:
                int i14 = UndoView.a0;
                AndroidUtilities.runOnUIThread(new jg0(26, (UndoView) obj, tLObject));
                break;
        }
    }
}
