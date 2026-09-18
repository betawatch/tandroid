package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        int i11 = 23;
        int i12 = 26;
        int i13 = 5;
        int i14 = 14;
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
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.qh(i12, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zd(i11, (mr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new zd(24, (qs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new uw(i15, (ex) obj, tLObject));
                break;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new uw(i13, pyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new uw(13, (a70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((k70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((ic0) obj, tL_error, tLObject, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new uw(22, (jh0) obj, tLObject));
                break;
            case 10:
                qj0 qj0Var = (qj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i16 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    qj0Var.post(new wm(qj0Var, i16, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new rj0((ak0) obj, tLObject, i15));
                break;
            case 12:
                vt0 vt0Var = (vt0) obj;
                vt0Var.getClass();
                AndroidUtilities.runOnUIThread(new dn0(vt0Var, tL_error, tLObject, i13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new dn0((hy0) obj, tL_error, tLObject, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, (Utilities.Callback) obj, i15));
                break;
            case 15:
                m31 m31Var = (m31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(m31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new po0(12, m31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new po0(i14, (k41) obj, tLObject));
                break;
            case 17:
                s51 s51Var = (s51) obj;
                s51Var.getClass();
                AndroidUtilities.runOnUIThread(new dn0(s51Var, tL_error, tLObject, i14));
                break;
            default:
                int i17 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new po0(18, (UndoView) obj, tLObject));
                break;
        }
    }
}
