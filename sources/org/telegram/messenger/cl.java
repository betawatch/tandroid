package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cl implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ n10 c;

    public /* synthetic */ cl(hp hpVar, n10 n10Var, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = n10Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3;
        switch (this.a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hp hpVar = this.b;
                hpVar.getClass();
                n10 n10Var = this.c;
                if (messages_chats == null) {
                    n10Var.a(null, tL_error);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    hpVar.S3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Chat chat = arrayList2.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !t3.p0(chat2) && !t3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    n10Var.a(arrayList, null);
                    break;
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                n10 n10Var2 = this.c;
                if (updates == null) {
                    if (n10Var2 != null) {
                        g0.h3(new yh(23, n10Var2, tL_error2));
                        break;
                    }
                } else {
                    ArrayList<TLRPC.Update> arrayList3 = updates.updates;
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            TLRPC.Update update = arrayList3.get(i11);
                            i11++;
                            TLRPC.Update update2 = update;
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) update2).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    i3 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i3 = 1;
                                }
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    hp hpVar2 = this.b;
                    hpVar2.O3(updates, false);
                    g0.h3(new k7(hpVar2, n10Var2, i3, 13));
                    break;
                }
                break;
        }
    }
}
