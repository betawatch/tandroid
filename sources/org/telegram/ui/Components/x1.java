package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        int i11 = 25;
        int i12 = 16;
        int i13 = 14;
        int i14 = 0;
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
                da daVar = (da) obj;
                daVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.eh(i11, daVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ee(26, (xr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ee(27, (zs) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new yt(3, (lx) obj, tLObject));
                break;
            case 5:
                yy yyVar = (yy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new yt(8, yyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yt(i12, (m70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new lg((x70) obj, tL_error, tLObject, 11));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new lg((vc0) obj, tL_error, tLObject, i13));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yt(i11, (xh0) obj, tLObject));
                break;
            case 10:
                gk0 gk0Var = (gk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i15 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    gk0Var.post(new org.telegram.ui.h4(gk0Var, i15, tL_messages_messageReactionsList, i13));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hk0((qk0) obj, tLObject, i14));
                break;
            case 12:
                iu0 iu0Var = (iu0) obj;
                iu0Var.getClass();
                AndroidUtilities.runOnUIThread(new lg(iu0Var, tL_error, tLObject, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new lg((ty0) obj, tL_error, tLObject, 29));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ai.n9(tLObject, (Utilities.Callback) obj, 1));
                break;
            case 15:
                w31 w31Var = (w31) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(w31Var.b).lambda$processUpdates$377(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ko0(i13, w31Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ko0(i12, (y41) obj, tLObject));
                break;
            case 17:
                h61 h61Var = (h61) obj;
                h61Var.getClass();
                AndroidUtilities.runOnUIThread(new fy0(h61Var, tL_error, tLObject, 2));
                break;
            default:
                int i16 = UndoView.i0;
                AndroidUtilities.runOnUIThread(new ko0(19, (UndoView) obj, tLObject));
                break;
        }
    }
}
