package ih;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ t5(v6 v6Var, int i9) {
        this.a = i9;
        this.b = v6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    v6 v6Var = this.b;
                    MessagesController.getInstance(v6Var.a).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                    AndroidUtilities.runOnUIThread(new z5(v6Var, 1));
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h3(this.b, tLObject, tL_error, 3));
                break;
            case 2:
                final int i9 = 1;
                final v6 v6Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.x5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                v6 v6Var3 = v6Var2;
                                HashSet hashSet = v6Var3.L;
                                int i10 = v6Var3.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    v6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    v6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i10).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i10).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    v6Var3.N = tL_contacts_blockedSlice.count;
                                    v6Var3.O = hashSet.size() >= v6Var3.N;
                                }
                                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                v6Var3.P = false;
                                v6Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                v6 v6Var4 = v6Var2;
                                int i13 = v6Var4.a;
                                ArrayList arrayList3 = v6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i13).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                v6Var4.U = false;
                                v6Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i10 = 0;
                final v6 v6Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ih.x5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v6 v6Var32 = v6Var3;
                                HashSet hashSet = v6Var32.L;
                                int i102 = v6Var32.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    MessagesController.getInstance(i102).putUsers(tL_contacts_blocked.users, false);
                                    MessagesController.getInstance(i102).putChats(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked.peer_id)));
                                    }
                                    v6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    v6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    MessagesController.getInstance(i102).putUsers(tL_contacts_blockedSlice.users, false);
                                    MessagesController.getInstance(i102).putChats(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_peerBlocked2.peer_id)));
                                    }
                                    v6Var32.N = tL_contacts_blockedSlice.count;
                                    v6Var32.O = hashSet.size() >= v6Var32.N;
                                }
                                NotificationCenter.getInstance(i102).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
                                v6Var32.P = false;
                                v6Var32.Q = System.currentTimeMillis();
                                break;
                            default:
                                v6 v6Var4 = v6Var3;
                                int i13 = v6Var4.a;
                                ArrayList arrayList3 = v6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    MessagesController.getInstance(i13).putChats(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(MessagesController.getInputPeer(chat));
                                    }
                                }
                                v6Var4.U = false;
                                v6Var4.V = true;
                                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesSendAsUpdate, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 4:
                v6 v6Var4 = this.b;
                v6Var4.getClass();
                AndroidUtilities.runOnUIThread(new z5(v6Var4, 0));
                break;
            default:
                v6 v6Var5 = this.b;
                v6Var5.getClass();
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new z5(v6Var5, 0));
                    break;
                }
                break;
        }
    }
}
