package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ml implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ j20 c;

    public /* synthetic */ ml(vp vpVar, j20 j20Var, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = j20Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10;
        switch (this.a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                vp vpVar = this.b;
                vpVar.getClass();
                j20 j20Var = this.c;
                if (messages_chats == null) {
                    j20Var.a(null, tL_error);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    vpVar.P3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Chat chat = arrayList2.get(i11);
                        i11++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !w3.p0(chat2) && !w3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    j20Var.a(arrayList, null);
                    break;
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j20 j20Var2 = this.c;
                if (updates == null) {
                    if (j20Var2 != null) {
                        i0.g3(new oi(21, j20Var2, tL_error2));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Update> arrayList3 = updates.updates;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TLRPC.Update update = arrayList3.get(i12);
                            i12++;
                            TLRPC.Update update2 = update;
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    i10 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i10 = 1;
                                }
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    vp vpVar2 = this.b;
                    vpVar2.L3(updates, false);
                    i0.g3(new o7(vpVar2, j20Var2, i10, 13));
                    break;
                }
                break;
        }
    }
}
