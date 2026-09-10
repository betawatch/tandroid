package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 12;
        int i12 = 0;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.qh(25, caVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ee(22, (sr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ee(23, (ws) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ee(29, (ix) obj, tLObject));
                break;
            case 5:
                wy wyVar = (wy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new hy(4, wyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hy(i11, (a70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gf((k70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new gf((ic0) obj, tL_error, tLObject, 15));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new hy(21, (ih0) obj, tLObject));
                break;
            case 10:
                pj0 pj0Var = (pj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i13 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    pj0Var.post(new my(pj0Var, i13, tL_messages_messageReactionsList, 6));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new qj0((zj0) obj, tLObject, i12));
                break;
            case 12:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                AndroidUtilities.runOnUIThread(new gf(st0Var, tL_error, tLObject, 24));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new sx0(obj, (Object) tL_error, (Object) tLObject, i12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, (Utilities.Callback) obj, i12));
                break;
            case 15:
                k31 k31Var = (k31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(k31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yo0(11, k31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new yo0(13, (i41) obj, tLObject));
                break;
            case 17:
                q51 q51Var = (q51) obj;
                q51Var.getClass();
                AndroidUtilities.runOnUIThread(new sx0((Object) q51Var, (Object) tL_error, (Object) tLObject, 3));
                break;
            default:
                int i14 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new yo0(17, (UndoView) obj, tLObject));
                break;
        }
    }
}
