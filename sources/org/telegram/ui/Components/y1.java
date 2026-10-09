package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int i11 = 13;
        int i12 = 25;
        int i13 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                ga gaVar = (ga) obj;
                gaVar.getClass();
                AndroidUtilities.runOnUIThread(new ea(i13, gaVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zr(1, (ds) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new zr(2, (gt) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new zr(8, (tx) obj, tLObject));
                break;
            case 5:
                ez ezVar = (ez) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zr(i11, ezVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zr(21, (t70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((d80) obj, tL_error, tLObject, i12));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((zc0) obj, tL_error, tLObject, 28));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ci0(i13, (di0) obj, tLObject));
                break;
            case 10:
                kk0 kk0Var = (kk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    kk0Var.post(new zk(kk0Var, i14, tL_messages_messageReactionsList, 9));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new lk0((uk0) obj, tLObject, i13));
                break;
            case 12:
                mu0 mu0Var = (mu0) obj;
                mu0Var.getClass();
                AndroidUtilities.runOnUIThread(new og0(mu0Var, tL_error, tLObject, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new og0((xy0) obj, tL_error, tLObject, i11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new jy0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                c41 c41Var = (c41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(c41Var.b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ci0(20, c41Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ci0(22, (b51) obj, tLObject));
                break;
            case 17:
                k61 k61Var = (k61) obj;
                k61Var.getClass();
                AndroidUtilities.runOnUIThread(new og0(k61Var, tL_error, tLObject, 16));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new ci0(i12, (UndoView) obj, tLObject));
                break;
        }
    }
}
