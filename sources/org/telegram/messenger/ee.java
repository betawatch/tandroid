package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.np0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ee implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gs d;

    public /* synthetic */ ee(gs gsVar, int i7, int i10, int i11) {
        this.a = i11;
        this.d = gsVar;
        this.b = i7;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        gs gsVar = this.d;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                g0.g3(new jg.o1(this.b, this.c, 7, (MediaController) gsVar, tLObject, tL_error));
                break;
            case 1:
                np npVar = (np) gsVar;
                LongSparseIntArray longSparseIntArray = npVar.Z0;
                int i10 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        g0.g3(new l2.x(npVar, updates_difference, this.b, this.c, 4));
                        break;
                    } else {
                        if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                            TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                            npVar.a1(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
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
                                    if (np.a2(update) == 2) {
                                        long X1 = np.X1(update);
                                        int i13 = longSparseIntArray.get(X1);
                                        if (i13 == 0 && (i13 = npVar.getMessagesStorage().N(X1)) != 0) {
                                            longSparseIntArray.put(X1, i13);
                                        }
                                        if (i13 != 0 && np.Y1(update) <= i13) {
                                            updates_difference.other_updates.remove(i10);
                                        }
                                    }
                                    i10++;
                                }
                                i10--;
                                i10++;
                            }
                        }
                        g0.g3(new gi(11, npVar, updates_difference));
                        npVar.getMessagesStorage().a.c(new gn(npVar, updates_difference, arrayList, hVar, hVar2, 8));
                        break;
                    }
                } else {
                    npVar.i2 = false;
                    npVar.getConnectionsManager().setIsUpdating(false);
                    a8.b("received: isUpdating = false");
                    break;
                }
                break;
            default:
                g0.g3(new np0((jt0) gsVar, tL_error, this.b, this.c, tLObject, 0));
                break;
        }
    }
}
