package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 1;
        int i12 = 17;
        int i13 = 5;
        int i14 = 0;
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
                aa aaVar = (aa) obj;
                aaVar.getClass();
                AndroidUtilities.runOnUIThread(new z2(i11, aaVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new z2(28, (fr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new z2(29, (ks) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gt(i13, (ww) obj, tLObject));
                break;
            case 5:
                jy jyVar = (jy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gt(10, jyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new gt(18, (n60) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new g((x60) obj, tL_error, tLObject, 14));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new g((vb0) obj, tL_error, tLObject, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new gt(27, (ug0) obj, tLObject));
                break;
            case 10:
                fj0 fj0Var = (fj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i15 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fj0Var.post(new rm(fj0Var, i15, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gj0((pj0) obj, tLObject, i14));
                break;
            case 12:
                at0 at0Var = (at0) obj;
                at0Var.getClass();
                AndroidUtilities.runOnUIThread(new g(at0Var, tL_error, tLObject, 26));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new yw0((nx0) obj, tL_error, tLObject, 2));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new jh.b7(tLObject, (Utilities.Callback) obj, i11));
                break;
            case 15:
                m21 m21Var = (m21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(m21Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ii0(i12, m21Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ii0(19, (k31) obj, tLObject));
                break;
            case 17:
                r41 r41Var = (r41) obj;
                r41Var.getClass();
                AndroidUtilities.runOnUIThread(new yw0(r41Var, tL_error, tLObject, i13));
                break;
            default:
                int i16 = UndoView.a0;
                AndroidUtilities.runOnUIThread(new ii0(23, (UndoView) obj, tLObject));
                break;
        }
    }
}
