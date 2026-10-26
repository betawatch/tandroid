package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 6;
        int i12 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AccountInstance accountInstance = (AccountInstance) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    accountInstance.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 1:
                ha haVar = (ha) obj;
                haVar.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ip(i11, haVar, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new so(i11, (zr) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new so(7, (bt) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new so(13, (lx) obj, tLObject));
                break;
            case 5:
                xy xyVar = (xy) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new so(18, xyVar, tLObject));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new so(26, (n70) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new kg((y70) obj, tL_error, tLObject, 12));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new kg((rc0) obj, tL_error, tLObject, 15));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new t90(5, (wh0) obj, tLObject));
                break;
            case 10:
                fk0 fk0Var = (fk0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i13 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    fk0Var.post(new org.telegram.ui.g4(fk0Var, i13, tL_messages_messageReactionsList, 14));
                    break;
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gk0((pk0) obj, tLObject, i12));
                break;
            case 12:
                lu0 lu0Var = (lu0) obj;
                lu0Var.getClass();
                AndroidUtilities.runOnUIThread(new kg(lu0Var, tL_error, tLObject, 23));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new kg((cz0) obj, tL_error, tLObject, 29));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new bi.i9(tLObject, (Utilities.Callback) obj, 1));
                break;
            case 15:
                e41 e41Var = (e41) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    MessagesController.getInstance(e41Var.b).lambda$processUpdates$379(updates, false);
                    if (!updates.chats.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new t90(25, e41Var, updates), 1000L);
                        break;
                    }
                }
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new t90(27, (f51) obj, tLObject));
                break;
            case 17:
                o61 o61Var = (o61) obj;
                o61Var.getClass();
                AndroidUtilities.runOnUIThread(new ny0(o61Var, tL_error, tLObject, 2));
                break;
            default:
                int i14 = UndoView.i0;
                AndroidUtilities.runOnUIThread(new c71(i12, (UndoView) obj, tLObject));
                break;
        }
    }
}
