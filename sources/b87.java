// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class b87 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ b87(uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        if (r4.left != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        r16 = r1;
        r1 = r7;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r4.migrated_to != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        boolean z;
        int size;
        int i2;
        TLRPC.Chat chat;
        zh6 zh6Var;
        ArrayList arrayList;
        TLRPC.Message message;
        int i3;
        TLRPC.Chat chat2;
        int i4;
        zh6 zh6Var2;
        zh6 zh6Var3;
        ArrayList arrayList2;
        byte b = this.a;
        int i5 = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7 uc7Var2 = this.b;
                ConcurrentHashMap concurrentHashMap = uc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var2.P;
                Integer num = 0;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    ArrayList arrayList3 = new ArrayList(tL_messages_peerDialogs.dialogs);
                    uc7Var2.o(tL_messages_peerDialogs.dialogs);
                    uc7Var2.u0(tL_messages_peerDialogs);
                    TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                    tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                    tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                    tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                    tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                    zh6 zh6Var4 = new zh6();
                    zh6 zh6Var5 = new zh6();
                    zh6 zh6Var6 = new zh6();
                    for (int i6 = 0; i6 < tL_messages_peerDialogs.users.size(); i6++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i6);
                        zh6Var5.k(user.id, user);
                    }
                    for (int i7 = 0; i7 < tL_messages_peerDialogs.chats.size(); i7++) {
                        TLRPC.Chat chat3 = tL_messages_peerDialogs.chats.get(i7);
                        zh6Var6.k(chat3.id, chat3);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int i8 = 0;
                    while (i8 < tL_messages_peerDialogs.messages.size()) {
                        TLRPC.Message message2 = tL_messages_peerDialogs.messages.get(i8);
                        TLRPC.Peer peer = message2.peer_id;
                        Integer num2 = num;
                        long j = peer.channel_id;
                        if (j != 0) {
                            TLRPC.Chat chat4 = (TLRPC.Chat) zh6Var6.f(j);
                            if (chat4 != null) {
                                break;
                            }
                            i4 = i8;
                            zh6Var2 = zh6Var5;
                            zh6 zh6Var7 = zh6Var6;
                            r47 r47Var = new r47(uc7Var2.currentAccount, message2, zh6Var2, zh6Var7, false, false);
                            zh6Var3 = zh6Var7;
                            arrayList4.add(r47Var);
                            long B0 = r47.B0(r47Var.k);
                            arrayList2 = (ArrayList) zh6Var4.f(B0);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(r47Var);
                            zh6Var4.k(B0, arrayList2);
                        } else {
                            long j2 = peer.chat_id;
                            if (j2 != 0) {
                                TLRPC.Chat chat5 = (TLRPC.Chat) zh6Var6.f(j2);
                                if (chat5 != null) {
                                    break;
                                }
                            }
                            i4 = i8;
                            zh6Var2 = zh6Var5;
                            zh6 zh6Var72 = zh6Var6;
                            r47 r47Var2 = new r47(uc7Var2.currentAccount, message2, zh6Var2, zh6Var72, false, false);
                            zh6Var3 = zh6Var72;
                            arrayList4.add(r47Var2);
                            long B02 = r47.B0(r47Var2.k);
                            arrayList2 = (ArrayList) zh6Var4.f(B02);
                            if (arrayList2 == null) {
                            }
                            arrayList2.add(r47Var2);
                            zh6Var4.k(B02, arrayList2);
                        }
                        i8 = i4 + 1;
                        zh6Var6 = zh6Var3;
                        zh6Var5 = zh6Var2;
                        num = num2;
                    }
                    Integer num3 = num;
                    zh6 zh6Var8 = zh6Var6;
                    boolean z2 = true;
                    if (!arrayList3.isEmpty()) {
                        i = 0;
                        if (arrayList3.get(0) instanceof TLRPC.TL_dialogFolder) {
                            z = 1;
                            size = arrayList3.size();
                            i2 = i;
                            while (i2 < size) {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList3.get(i2);
                                dialog.pinned = z2;
                                wf3.w(dialog);
                                boolean x = wf3.x(dialog);
                                long j3 = dialog.id;
                                if (!x ? !wf3.y(j3) || (chat = (TLRPC.Chat) zh6Var8.f(-dialog.id)) == null || chat.migrated_to == null : (chat2 = (TLRPC.Chat) zh6Var8.f(-j3)) == null || !chat2.left) {
                                    if (dialog.last_message_date != 0 || (arrayList = (ArrayList) zh6Var4.f(dialog.id)) == null) {
                                        zh6Var = zh6Var8;
                                    } else {
                                        zh6Var = zh6Var8;
                                        int i9 = TLObject.FLAG_31;
                                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                            r47 r47Var3 = (r47) arrayList.get(i10);
                                            if (r47Var3 != null && (message = r47Var3.k) != null && (i3 = message.date) > i9) {
                                                i9 = i3;
                                            }
                                        }
                                        if (i9 > Integer.MIN_VALUE) {
                                            dialog.last_message_date = i9;
                                        }
                                    }
                                    Integer num4 = (Integer) concurrentHashMap2.get(Long.valueOf(dialog.id));
                                    if (num4 == null) {
                                        num4 = num3;
                                    }
                                    concurrentHashMap2.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num4.intValue(), dialog.read_inbox_max_id)));
                                    Integer num5 = (Integer) concurrentHashMap.get(Long.valueOf(dialog.id));
                                    if (num5 == null) {
                                        num5 = num3;
                                    }
                                    concurrentHashMap.put(Long.valueOf(dialog.id), Integer.valueOf(Math.max(num5.intValue(), dialog.read_outbox_max_id)));
                                } else {
                                    zh6Var = zh6Var8;
                                }
                                i2++;
                                zh6Var8 = zh6Var;
                                z2 = true;
                            }
                            uc7Var2.getMessagesStorage().a.c(new y87(uc7Var2, this.c, arrayList3, z, tL_messages_peerDialogs, zh6Var4, tL_messages_dialogs, (byte) 0));
                            break;
                        }
                    } else {
                        i = 0;
                    }
                    z = i;
                    size = arrayList3.size();
                    i2 = i;
                    while (i2 < size) {
                    }
                    uc7Var2.getMessagesStorage().a.c(new y87(uc7Var2, this.c, arrayList3, z, tL_messages_peerDialogs, zh6Var4, tL_messages_dialogs, (byte) 0));
                }
                break;
            case 1:
                hl.c3(new l65(uc7Var, tLObject, i5, (byte) 10));
                break;
            default:
                if (tL_error == null) {
                    uc7Var.getMessagesStorage().a.c(new l65(uc7Var, (TLRPC.messages_Dialogs) tLObject, i5, (byte) 11));
                    break;
                } else {
                    hl.c3(new pa7(uc7Var, (byte) 4));
                    break;
                }
        }
    }
}
