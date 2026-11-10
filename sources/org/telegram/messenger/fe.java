package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.ys0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class fe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ls d;

    public /* synthetic */ fe(ls lsVar, int i7, int i10, int i11) {
        this.a = i11;
        this.d = lsVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        ls lsVar = this.d;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                g0.h3(new hi.j4(this.b, this.c, 7, (MediaController) lsVar, tLObject, tL_error));
                break;
            case 1:
                qp qpVar = (qp) lsVar;
                LongSparseIntArray longSparseIntArray = qpVar.Y0;
                int i10 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        g0.h3(new l2.z(qpVar, updates_difference, this.b, this.c, 4));
                        break;
                    } else {
                        if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                            TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                            qpVar.Y0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                        }
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        for (int i11 = 0; i11 < updates_difference.users.size(); i11++) {
                            TLRPC.User user = updates_difference.users.get(i11);
                            hVar.k(user, user.id);
                        }
                        for (int i12 = 0; i12 < updates_difference.chats.size(); i12++) {
                            TLRPC.Chat chat = updates_difference.chats.get(i12);
                            hVar2.k(chat, chat.id);
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!updates_difference.other_updates.isEmpty()) {
                            while (i10 < updates_difference.other_updates.size()) {
                                TLRPC.Update update = updates_difference.other_updates.get(i10);
                                if (update instanceof TL_update.TL_updateMessageID) {
                                    arrayList.add((TL_update.TL_updateMessageID) update);
                                    updates_difference.other_updates.remove(i10);
                                } else {
                                    if (qp.Y1(update) == 2) {
                                        long V1 = qp.V1(update);
                                        int i13 = longSparseIntArray.get(V1);
                                        if (i13 == 0 && (i13 = qpVar.getMessagesStorage().N(V1)) != 0) {
                                            longSparseIntArray.put(V1, i13);
                                        }
                                        if (i13 != 0 && qp.W1(update) <= i13) {
                                            updates_difference.other_updates.remove(i10);
                                        }
                                    }
                                    i10++;
                                }
                                i10--;
                                i10++;
                            }
                        }
                        g0.h3(new hi(26, qpVar, updates_difference));
                        qpVar.getMessagesStorage().a.c(new mn(qpVar, updates_difference, arrayList, hVar, hVar2, 10));
                        break;
                    }
                } else {
                    qpVar.f2 = false;
                    qpVar.getConnectionsManager().setIsUpdating(false);
                    a8.b("received: isUpdating = false");
                    break;
                }
                break;
            default:
                g0.h3(new xo0((ys0) lsVar, tL_error, this.b, this.c, tLObject, 0));
                break;
        }
    }
}
