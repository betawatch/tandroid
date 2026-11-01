package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class nl implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ k20 c;

    public /* synthetic */ nl(wp wpVar, k20 k20Var, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = k20Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10;
        switch (this.a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                wp wpVar = this.b;
                wpVar.getClass();
                k20 k20Var = this.c;
                if (messages_chats == null) {
                    k20Var.a(null, tL_error);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    wpVar.P3(messages_chats.chats, true);
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
                    k20Var.a(arrayList, null);
                    break;
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k20 k20Var2 = this.c;
                if (updates == null) {
                    if (k20Var2 != null) {
                        i0.g3(new pi(21, k20Var2, tL_error2));
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
                    wp wpVar2 = this.b;
                    wpVar2.L3(updates, false);
                    i0.g3(new o7(wpVar2, k20Var2, i10, 13));
                    break;
                }
                break;
        }
    }
}
