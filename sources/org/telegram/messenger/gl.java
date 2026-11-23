package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gl implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ r10 c;

    public /* synthetic */ gl(np npVar, r10 r10Var, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = r10Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7;
        switch (this.a) {
            case 0:
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                np npVar = this.b;
                npVar.getClass();
                r10 r10Var = this.c;
                if (messages_chats == null) {
                    r10Var.a(null, tL_error);
                    break;
                } else {
                    ArrayList arrayList = new ArrayList(messages_chats.chats.size());
                    npVar.Z3(messages_chats.chats, true);
                    ArrayList<TLRPC.Chat> arrayList2 = messages_chats.chats;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Chat chat = arrayList2.get(i10);
                        i10++;
                        TLRPC.Chat chat2 = chat;
                        if (chat2.creator && !v3.p0(chat2) && !v3.Y(chat2)) {
                            arrayList.add(chat2);
                        }
                    }
                    r10Var.a(arrayList, null);
                    break;
                }
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                r10 r10Var2 = this.c;
                if (updates == null) {
                    if (r10Var2 != null) {
                        g0.g3(new gi(23, r10Var2, tL_error2));
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
                                    i7 = 2;
                                } else if (messageAction instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                    i7 = 1;
                                }
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    np npVar2 = this.b;
                    npVar2.V3(updates, false);
                    g0.g3(new l7(npVar2, r10Var2, i7, 13));
                    break;
                }
                break;
        }
    }
}
