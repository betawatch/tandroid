package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fo(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int size;
        int i11;
        TLRPC.Chat chat;
        qp qpVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.Message message;
        int i12;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ArrayList arrayList3;
        switch (this.a) {
            case 0:
                qp qpVar2 = (qp) this.b;
                ConcurrentHashMap concurrentHashMap = qpVar2.P;
                ConcurrentHashMap concurrentHashMap2 = qpVar2.O;
                Integer num = 0;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList4 = new ArrayList(tL_messages_peerDialogs.dialogs);
                    qpVar2.v0(tL_messages_peerDialogs);
                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                    tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                    tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    a0.h hVar3 = new a0.h();
                    int i13 = 0;
                    while (i13 < tL_messages_peerDialogs.users.size()) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i13);
                        hVar2.k(user, user.id);
                        i13++;
                        num = num;
                    }
                    Integer num2 = num;
                    for (int i14 = 0; i14 < tL_messages_peerDialogs.chats.size(); i14++) {
                        TLRPC.Chat chat4 = tL_messages_peerDialogs.chats.get(i14);
                        hVar3.k(chat4, chat4.id);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i15 = 0;
                    while (i15 < tL_messages_peerDialogs.messages.size()) {
                        TLRPC.Message message2 = tL_messages_peerDialogs.messages.get(i15);
                        TLRPC.Peer peer = message2.peer_id;
                        int i16 = i15;
                        TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = tL_messages_peerDialogs;
                        long j3 = peer.channel_id;
                        if (j3 != 0) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) hVar3.f(j3);
                            if (chat5 != null && chat5.left) {
                            }
                            ij ijVar = new ij(qpVar2.currentAccount, message2, hVar2, hVar3, false, false);
                            arrayList5.add(ijVar);
                            long B0 = ij.B0(ijVar.k);
                            arrayList3 = (ArrayList) hVar.f(B0);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(ijVar);
                            hVar.k(arrayList3, B0);
                        } else {
                            long j10 = peer.chat_id;
                            if (j10 != 0 && (chat3 = (TLRPC.Chat) hVar3.f(j10)) != null && chat3.migrated_to != null) {
                            }
                            ij ijVar2 = new ij(qpVar2.currentAccount, message2, hVar2, hVar3, false, false);
                            arrayList5.add(ijVar2);
                            long B02 = ij.B0(ijVar2.k);
                            arrayList3 = (ArrayList) hVar.f(B02);
                            if (arrayList3 == null) {
                            }
                            arrayList3.add(ijVar2);
                            hVar.k(arrayList3, B02);
                        }
                        i15 = i16 + 1;
                        tL_messages_peerDialogs = tL_messages_peerDialogs2;
                    }
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs3 = tL_messages_peerDialogs;
                    boolean z9 = true;
                    if (!arrayList4.isEmpty()) {
                        i7 = 0;
                        if (arrayList4.get(0) instanceof TLRPC.TL_dialogFolder) {
                            i10 = 1;
                            size = arrayList4.size();
                            i11 = i7;
                            while (i11 < size) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i11);
                                dialog.pinned = z9;
                                m5.x(dialog);
                                if (!m5.y(dialog) ? !m5.z(dialog.id) || (chat = (TLRPC.Chat) hVar3.f(-dialog.id)) == null || chat.migrated_to == null : (chat2 = (TLRPC.Chat) hVar3.f(-dialog.id)) == null || !chat2.left) {
                                    if (dialog.last_message_date == 0 && (arrayList2 = (ArrayList) hVar.f(dialog.id)) != null) {
                                        int i17 = TLObject.FLAG_31;
                                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                                            ij ijVar3 = (ij) arrayList2.get(i18);
                                            if (ijVar3 != null && (message = ijVar3.k) != null && (i12 = message.date) > i17) {
                                                i17 = i12;
                                            }
                                        }
                                        if (i17 > Integer.MIN_VALUE) {
                                            dialog.last_message_date = i17;
                                        }
                                    }
                                    Integer num3 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                                    if (num3 == null) {
                                        num3 = num2;
                                    }
                                    qpVar = qpVar2;
                                    arrayList = arrayList4;
                                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num3.intValue(), dialog.read_inbox_max_id)));
                                    Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                                    if (num4 == null) {
                                        num4 = num2;
                                    }
                                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num4.intValue(), dialog.read_outbox_max_id)));
                                } else {
                                    qpVar = qpVar2;
                                    arrayList = arrayList4;
                                }
                                i11++;
                                qpVar2 = qpVar;
                                arrayList4 = arrayList;
                                z9 = true;
                            }
                            qpVar2.getMessagesStorage().a.c(new xj(qpVar2, this.c, arrayList4, i10, tL_messages_peerDialogs3, hVar, tL_messages_dialogs, 0));
                            break;
                        }
                    } else {
                        i7 = 0;
                    }
                    i10 = i7;
                    size = arrayList4.size();
                    i11 = i7;
                    while (i11 < size) {
                    }
                    qpVar2.getMessagesStorage().a.c(new xj(qpVar2, this.c, arrayList4, i10, tL_messages_peerDialogs3, hVar, tL_messages_dialogs, 0));
                }
                break;
            case 1:
                g0.h3(new l7((qp) this.b, tLObject, this.c, 12));
                break;
            case 2:
                qp qpVar3 = (qp) this.b;
                if (tL_error == null) {
                    qpVar3.getMessagesStorage().a.c(new l7(qpVar3, (TLRPC.messages_Dialogs) tLObject, this.c, 14));
                    break;
                } else {
                    g0.h3(new vj(qpVar3, 26));
                    break;
                }
            default:
                g0.h3(new dg((g5) this.b, tL_error, tLObject, this.c, 4));
                break;
        }
    }
}
