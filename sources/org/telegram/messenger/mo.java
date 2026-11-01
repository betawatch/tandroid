package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class mo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mo(f1 f1Var, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11;
        int size;
        int i12;
        TLRPC.Chat chat;
        wp wpVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.Message message;
        int i13;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ArrayList arrayList3;
        switch (this.a) {
            case 0:
                wp wpVar2 = (wp) this.b;
                ConcurrentHashMap concurrentHashMap = wpVar2.P;
                ConcurrentHashMap concurrentHashMap2 = wpVar2.O;
                Integer num = 0;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList4 = new ArrayList(tL_messages_peerDialogs.dialogs);
                    wpVar2.v0(tL_messages_peerDialogs);
                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                    tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                    tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    a0.h hVar3 = new a0.h();
                    int i14 = 0;
                    while (i14 < tL_messages_peerDialogs.users.size()) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i14);
                        hVar2.k(user, user.id);
                        i14++;
                        num = num;
                    }
                    Integer num2 = num;
                    for (int i15 = 0; i15 < tL_messages_peerDialogs.chats.size(); i15++) {
                        TLRPC.Chat chat4 = tL_messages_peerDialogs.chats.get(i15);
                        hVar3.k(chat4, chat4.id);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int i16 = 0;
                    while (i16 < tL_messages_peerDialogs.messages.size()) {
                        TLRPC.Message message2 = tL_messages_peerDialogs.messages.get(i16);
                        TLRPC.Peer peer = message2.peer_id;
                        int i17 = i16;
                        TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs2 = tL_messages_peerDialogs;
                        long j10 = peer.channel_id;
                        if (j10 != 0) {
                            TLRPC.Chat chat5 = (TLRPC.Chat) hVar3.f(j10);
                            if (chat5 != null && chat5.left) {
                            }
                            kj kjVar = new kj(wpVar2.currentAccount, message2, hVar2, hVar3, false, false);
                            arrayList5.add(kjVar);
                            long B0 = kj.B0(kjVar.k);
                            arrayList3 = (ArrayList) hVar.f(B0);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(kjVar);
                            hVar.k(arrayList3, B0);
                        } else {
                            long j11 = peer.chat_id;
                            if (j11 != 0 && (chat3 = (TLRPC.Chat) hVar3.f(j11)) != null && chat3.migrated_to != null) {
                            }
                            kj kjVar2 = new kj(wpVar2.currentAccount, message2, hVar2, hVar3, false, false);
                            arrayList5.add(kjVar2);
                            long B02 = kj.B0(kjVar2.k);
                            arrayList3 = (ArrayList) hVar.f(B02);
                            if (arrayList3 == null) {
                            }
                            arrayList3.add(kjVar2);
                            hVar.k(arrayList3, B02);
                        }
                        i16 = i17 + 1;
                        tL_messages_peerDialogs = tL_messages_peerDialogs2;
                    }
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs3 = tL_messages_peerDialogs;
                    boolean z10 = true;
                    if (!arrayList4.isEmpty()) {
                        i10 = 0;
                        if (arrayList4.get(0) instanceof TLRPC.TL_dialogFolder) {
                            i11 = 1;
                            size = arrayList4.size();
                            i12 = i10;
                            while (i12 < size) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i12);
                                dialog.pinned = z10;
                                o5.x(dialog);
                                if (!o5.y(dialog) ? !o5.z(dialog.id) || (chat = (TLRPC.Chat) hVar3.f(-dialog.id)) == null || chat.migrated_to == null : (chat2 = (TLRPC.Chat) hVar3.f(-dialog.id)) == null || !chat2.left) {
                                    if (dialog.last_message_date == 0 && (arrayList2 = (ArrayList) hVar.f(dialog.id)) != null) {
                                        int i18 = TLObject.FLAG_31;
                                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                                            kj kjVar3 = (kj) arrayList2.get(i19);
                                            if (kjVar3 != null && (message = kjVar3.k) != null && (i13 = message.date) > i18) {
                                                i18 = i13;
                                            }
                                        }
                                        if (i18 > Integer.MIN_VALUE) {
                                            dialog.last_message_date = i18;
                                        }
                                    }
                                    Integer num3 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                                    if (num3 == null) {
                                        num3 = num2;
                                    }
                                    wpVar = wpVar2;
                                    arrayList = arrayList4;
                                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num3.intValue(), dialog.read_inbox_max_id)));
                                    Integer num4 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                                    if (num4 == null) {
                                        num4 = num2;
                                    }
                                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num4.intValue(), dialog.read_outbox_max_id)));
                                } else {
                                    wpVar = wpVar2;
                                    arrayList = arrayList4;
                                }
                                i12++;
                                wpVar2 = wpVar;
                                arrayList4 = arrayList;
                                z10 = true;
                            }
                            wpVar2.getMessagesStorage().a.c(new sj(wpVar2, this.c, arrayList4, i11, tL_messages_peerDialogs3, hVar, tL_messages_dialogs, 0));
                            break;
                        }
                    } else {
                        i10 = 0;
                    }
                    i11 = i10;
                    size = arrayList4.size();
                    i12 = i10;
                    while (i12 < size) {
                    }
                    wpVar2.getMessagesStorage().a.c(new sj(wpVar2, this.c, arrayList4, i11, tL_messages_peerDialogs3, hVar, tL_messages_dialogs, 0));
                }
                break;
            case 1:
                i0.g3(new o7((wp) this.b, tLObject, this.c, 12));
                break;
            case 2:
                wp wpVar3 = (wp) this.b;
                if (tL_error == null) {
                    wpVar3.getMessagesStorage().a.c(new o7(wpVar3, (TLRPC.messages_Dialogs) tLObject, this.c, 14));
                    break;
                } else {
                    i0.g3(new ak(wpVar3, 24));
                    break;
                }
            default:
                i0.g3(new dg((i5) this.b, tL_error, tLObject, this.c, 4));
                break;
        }
    }
}
