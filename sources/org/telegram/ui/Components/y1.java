package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int i12 = 11;
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
                fa faVar = (fa) obj;
                faVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rp(i12, faVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new sk(12, (as) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new sk(13, (dt) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new sk(19, (px) obj, tLObject));
                break;
            case 5:
                az azVar = (az) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new sk(24, azVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new f60(i11, (p70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new n2.h((a80) obj, tL_error, tLObject, 29));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new v70((ad0) obj, tL_error, tLObject, i11));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new f60(i12, (zh0) obj, tLObject));
                break;
            case 10:
                gk0 gk0Var = (gk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gk0Var.post(new org.telegram.ui.gm(gk0Var, i14, tL_messages_messageReactionsList, 10));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hk0((qk0) obj, tLObject, i13));
                break;
            case 12:
                iu0 iu0Var = (iu0) obj;
                iu0Var.getClass();
                AndroidUtilities.runOnUIThread(new v70(iu0Var, tL_error, tLObject, i12));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new v70((ty0) obj, tL_error, tLObject, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new fy0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                y31 y31Var = (y31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(y31Var.b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new k31(1, y31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new k31(3, (x41) obj, tLObject));
                break;
            case 17:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                AndroidUtilities.runOnUIThread(new v70(g61Var, tL_error, tLObject, 20));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new k31(6, (UndoView) obj, tLObject));
                break;
        }
    }
}
