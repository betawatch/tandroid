package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        int i11 = 26;
        int i12 = 14;
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
                ca caVar = (ca) obj;
                caVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gh(28, caVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new tc(25, (mr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new tc(i11, (qs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bv(2, (ex) obj, tLObject));
                break;
            case 5:
                py pyVar = (py) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new bv(7, pyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new bv(15, (z60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((j70) obj, tL_error, tLObject, 23));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((hc0) obj, tL_error, tLObject, i11));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new bv(24, (ih0) obj, tLObject));
                break;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new wm(pj0Var, i14, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, i13));
                break;
            case 12:
                ut0 ut0Var = (ut0) obj;
                ut0Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(ut0Var, tL_error, tLObject, 5));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new cn0((gy0) obj, tL_error, tLObject, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new sx0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                l31 l31Var = (l31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(l31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new wn0(i12, l31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new wn0(16, (j41) obj, tLObject));
                break;
            case 17:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                AndroidUtilities.runOnUIThread(new cn0(r51Var, tL_error, tLObject, i12));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new wn0(20, (UndoView) obj, tLObject));
                break;
        }
    }
}
