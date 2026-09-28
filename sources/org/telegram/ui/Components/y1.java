package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(27, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kd(24, (or) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new kd(25, (ss) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ww(1, (gx) obj, tLObject));
                break;
            case 5:
                ry ryVar = (ry) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ww(6, ryVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ww(i12, (e70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((o70) obj, tL_error, tLObject, i11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((mc0) obj, tL_error, tLObject, 26));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ww(i11, (lh0) obj, tLObject));
                break;
            case 10:
                sj0 sj0Var = (sj0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i14 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    sj0Var.post(new ym(sj0Var, i14, tL_messages_messageReactionsList, 8));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new tj0((ck0) obj, tLObject, i13));
                break;
            case 12:
                wt0 wt0Var = (wt0) obj;
                wt0Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(wt0Var, tL_error, tLObject, 5));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new en0((hy0) obj, tL_error, tLObject, 11));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, (Utilities.Callback) obj, i13));
                break;
            case 15:
                m31 m31Var = (m31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(m31Var.b).processUpdates(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new yn0(13, m31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new yn0(15, (k41) obj, tLObject));
                break;
            case 17:
                s51 s51Var = (s51) obj;
                s51Var.getClass();
                AndroidUtilities.runOnUIThread(new en0(s51Var, tL_error, tLObject, i12));
                break;
            default:
                int i15 = UndoView.e0;
                AndroidUtilities.runOnUIThread(new yn0(19, (UndoView) obj, tLObject));
                break;
        }
    }
}
