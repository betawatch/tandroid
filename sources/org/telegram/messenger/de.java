package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ us d;

    public /* synthetic */ de(us usVar, int i10, int i11, int i12) {
        this.a = i12;
        this.d = usVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        us usVar = this.d;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                i0.g3(new bi.u0(this.b, this.c, 5, (MediaController) usVar, tLObject, tL_error));
                break;
            case 1:
                vp vpVar = (vp) usVar;
                LongSparseIntArray longSparseIntArray = vpVar.Y0;
                int i11 = 0;
                if (tL_error == null) {
                    TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) tLObject;
                    if (updates_difference instanceof TLRPC.TL_updates_differenceTooLong) {
                        i0.g3(new i2.a0(vpVar, updates_difference, this.b, this.c, 4));
                        break;
                    } else {
                        if (updates_difference instanceof TLRPC.TL_updates_differenceSlice) {
                            TLRPC.TL_updates_state tL_updates_state = updates_difference.intermediate_state;
                            vpVar.X0(tL_updates_state.pts, tL_updates_state.date, tL_updates_state.qts, true);
                        }
                        a0.h hVar = new a0.h();
                        a0.h hVar2 = new a0.h();
                        for (int i12 = 0; i12 < updates_difference.users.size(); i12++) {
                            TLRPC.User user = updates_difference.users.get(i12);
                            hVar.k(user, user.id);
                        }
                        for (int i13 = 0; i13 < updates_difference.chats.size(); i13++) {
                            TLRPC.Chat chat = updates_difference.chats.get(i13);
                            hVar2.k(chat, chat.id);
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!updates_difference.other_updates.isEmpty()) {
                            while (i11 < updates_difference.other_updates.size()) {
                                TLRPC.Update update = updates_difference.other_updates.get(i11);
                                if (update instanceof TL_update.TL_updateMessageID) {
                                    arrayList.add((TL_update.TL_updateMessageID) update);
                                    updates_difference.other_updates.remove(i11);
                                } else {
                                    if (vp.X1(update) == 2) {
                                        long U1 = vp.U1(update);
                                        int i14 = longSparseIntArray.get(U1);
                                        if (i14 == 0 && (i14 = vpVar.getMessagesStorage().N(U1)) != 0) {
                                            longSparseIntArray.put(U1, i14);
                                        }
                                        if (i14 != 0 && vp.V1(update) <= i14) {
                                            updates_difference.other_updates.remove(i11);
                                        }
                                    }
                                    i11++;
                                }
                                i11--;
                                i11++;
                            }
                        }
                        i0.g3(new oi(9, vpVar, updates_difference));
                        vpVar.getMessagesStorage().a.c(new cn(vpVar, updates_difference, arrayList, hVar, hVar2, 7));
                        break;
                    }
                } else {
                    vpVar.f2 = false;
                    vpVar.getConnectionsManager().setIsUpdating(false);
                    f8.b("received: isUpdating = false");
                    break;
                }
                break;
            default:
                i0.g3(new zp0((zt0) usVar, tL_error, this.b, this.c, tLObject, 0));
                break;
        }
    }
}
