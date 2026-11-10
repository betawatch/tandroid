package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ y5(z6 z6Var, int i7) {
        this.a = i7;
        this.b = z6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    z6 z6Var = this.b;
                    qp.s1(z6Var.a).N3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.g0.h3(new f6(z6Var, 1));
                    break;
                }
                break;
            case 1:
                final int i7 = 1;
                final z6 z6Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.d6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                z6 z6Var3 = z6Var2;
                                HashSet hashSet = z6Var3.L;
                                int i10 = z6Var3.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    qp.s1(i10).Y3(tL_contacts_blocked.users, false);
                                    qp.s1(i10).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    z6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    z6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    qp.s1(i10).Y3(tL_contacts_blockedSlice.users, false);
                                    qp.s1(i10).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    z6Var3.N = tL_contacts_blockedSlice.count;
                                    z6Var3.O = hashSet.size() >= z6Var3.N;
                                }
                                qs.f(i10).k(qs.a3, new Object[0]);
                                z6Var3.P = false;
                                z6Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                z6 z6Var4 = z6Var2;
                                int i13 = z6Var4.a;
                                ArrayList arrayList3 = z6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    qp.s1(i13).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(qp.l1(chat));
                                    }
                                }
                                z6Var4.U = false;
                                z6Var4.V = true;
                                qs.f(i13).k(qs.c3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final z6 z6Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: di.d6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                z6 z6Var32 = z6Var3;
                                HashSet hashSet = z6Var32.L;
                                int i102 = z6Var32.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    qp.s1(i102).Y3(tL_contacts_blocked.users, false);
                                    qp.s1(i102).S3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked.peer_id)));
                                    }
                                    z6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    z6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    qp.s1(i102).Y3(tL_contacts_blockedSlice.users, false);
                                    qp.s1(i102).S3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    z6Var32.N = tL_contacts_blockedSlice.count;
                                    z6Var32.O = hashSet.size() >= z6Var32.N;
                                }
                                qs.f(i102).k(qs.a3, new Object[0]);
                                z6Var32.P = false;
                                z6Var32.Q = System.currentTimeMillis();
                                break;
                            default:
                                z6 z6Var4 = z6Var3;
                                int i13 = z6Var4.a;
                                ArrayList arrayList3 = z6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    qp.s1(i13).S3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(qp.l1(chat));
                                    }
                                }
                                z6Var4.U = false;
                                z6Var4.V = true;
                                qs.f(i13).k(qs.c3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                z6 z6Var4 = this.b;
                z6Var4.getClass();
                org.telegram.messenger.g0.h3(new f6(z6Var4, 0));
                break;
            case 4:
                z6 z6Var5 = this.b;
                z6Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new f6(z6Var5, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new aa.s(this.b, tLObject, tL_error, 25));
                break;
        }
    }
}
