package ai;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ x7(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    l9 l9Var = this.b;
                    MessagesController.getInstance(l9Var.a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new i8(l9Var, 1));
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0(this.b, tLObject, tL_error, 4));
                break;
            case 2:
                final int i10 = 1;
                final l9 l9Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.f8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l9 l9Var3 = l9Var2;
                                HashSet hashSet = l9Var3.L;
                                int i11 = l9Var3.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i11).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i11).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    l9Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    l9Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i11).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i11).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    l9Var3.N = tL_contacts_blockedSlice.count;
                                    l9Var3.O = hashSet.size() >= l9Var3.N;
                                }
                                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                l9Var3.P = false;
                                l9Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                l9 l9Var4 = l9Var2;
                                int i14 = l9Var4.a;
                                ArrayList arrayList3 = l9Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i14).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i15);
                                        i15++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                l9Var4.U = false;
                                l9Var4.V = true;
                                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i11 = 0;
                final l9 l9Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.f8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l9 l9Var32 = l9Var3;
                                HashSet hashSet = l9Var32.L;
                                int i112 = l9Var32.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i112).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i112).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    l9Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    l9Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i112).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i112).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i13);
                                        i13++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    l9Var32.N = tL_contacts_blockedSlice.count;
                                    l9Var32.O = hashSet.size() >= l9Var32.N;
                                }
                                NotificationCenter.getInstance(i112).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                l9Var32.P = false;
                                l9Var32.Q = System.currentTimeMillis();
                                break;
                            default:
                                l9 l9Var4 = l9Var3;
                                int i14 = l9Var4.a;
                                ArrayList arrayList3 = l9Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i14).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i15);
                                        i15++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                l9Var4.U = false;
                                l9Var4.V = true;
                                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 4:
                l9 l9Var4 = this.b;
                l9Var4.getClass();
                AndroidUtilities.runOnUIThread(new i8(l9Var4, 0));
                break;
            default:
                l9 l9Var5 = this.b;
                l9Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new i8(l9Var5, 0));
                    break;
                }
                break;
        }
    }
}
