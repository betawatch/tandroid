package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ea eaVar = (ea) obj;
                eaVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.oh(i12, eaVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new be(i11, (pr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new be(24, (ts) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new yw(i15, (ix) obj, tLObject));
                break;
            case 5:
                sy syVar = (sy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new yw(i13, syVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yw(13, (f70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((p70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((nc0) obj, tL_error, tLObject, i12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yw(22, (lh0) obj, tLObject));
                break;
            case 10:
                sj0 sj0Var = (sj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i16 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    sj0Var.post(new zm(sj0Var, i16, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new tj0((ck0) obj, tLObject, i15));
                break;
            case 12:
                au0 au0Var = (au0) obj;
                au0Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(au0Var, tL_error, tLObject, i13));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new in0((qy0) obj, tL_error, tLObject, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new cy0(tLObject, (Utilities.Callback) obj, i15));
                break;
            case 15:
                v31 v31Var = (v31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(v31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new uo0(12, v31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new uo0(i14, (t41) obj, tLObject));
                break;
            case 17:
                b61 b61Var = (b61) obj;
                b61Var.getClass();
                AndroidUtilities.runOnUIThread(new in0(b61Var, tL_error, tLObject, i14));
                break;
            default:
                int i17 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new uo0(18, (UndoView) obj, tLObject));
                break;
        }
    }
}
