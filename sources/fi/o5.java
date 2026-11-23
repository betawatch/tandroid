package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ o5(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                if (updates != null) {
                    p6 p6Var = this.b;
                    mp.u1(p6Var.a).U3(updates.updates, updates.users, updates.chats, false, updates.date);
                    org.telegram.messenger.g0.g3(new v5(p6Var, 1));
                    break;
                }
                break;
            case 1:
                final int i7 = 1;
                final p6 p6Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: fi.t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                p6 p6Var3 = p6Var2;
                                HashSet hashSet = p6Var3.L;
                                int i10 = p6Var3.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    mp.u1(i10).f4(tL_contacts_blocked.users, false);
                                    mp.u1(i10).Z3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked.peer_id)));
                                    }
                                    p6Var3.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    p6Var3.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    mp.u1(i10).f4(tL_contacts_blockedSlice.users, false);
                                    mp.u1(i10).Z3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    p6Var3.N = tL_contacts_blockedSlice.count;
                                    p6Var3.O = hashSet.size() >= p6Var3.N;
                                }
                                ks.f(i10).k(ks.c3, new Object[0]);
                                p6Var3.P = false;
                                p6Var3.Q = System.currentTimeMillis();
                                break;
                            default:
                                p6 p6Var4 = p6Var2;
                                int i13 = p6Var4.a;
                                ArrayList arrayList3 = p6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    mp.u1(i13).Z3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(mp.n1(chat));
                                    }
                                }
                                p6Var4.U = false;
                                p6Var4.V = true;
                                ks.f(i13).k(ks.e3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final p6 p6Var3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: fi.t5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                p6 p6Var32 = p6Var3;
                                HashSet hashSet = p6Var32.L;
                                int i102 = p6Var32.a;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_contacts_blocked) {
                                    TLRPC.TL_contacts_blocked tL_contacts_blocked = (TLRPC.TL_contacts_blocked) tLObject2;
                                    mp.u1(i102).f4(tL_contacts_blocked.users, false);
                                    mp.u1(i102).Z3(tL_contacts_blocked.chats, false);
                                    hashSet.clear();
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList = tL_contacts_blocked.blocked;
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked = arrayList.get(i11);
                                        i11++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked.peer_id)));
                                    }
                                    p6Var32.N = Math.max(hashSet.size(), tL_contacts_blocked.count);
                                    p6Var32.O = true;
                                } else if (tLObject2 instanceof TLRPC.TL_contacts_blockedSlice) {
                                    TLRPC.TL_contacts_blockedSlice tL_contacts_blockedSlice = (TLRPC.TL_contacts_blockedSlice) tLObject2;
                                    mp.u1(i102).f4(tL_contacts_blockedSlice.users, false);
                                    mp.u1(i102).Z3(tL_contacts_blockedSlice.chats, false);
                                    ArrayList<TLRPC.TL_peerBlocked> arrayList2 = tL_contacts_blockedSlice.blocked;
                                    int size2 = arrayList2.size();
                                    int i12 = 0;
                                    while (i12 < size2) {
                                        TLRPC.TL_peerBlocked tL_peerBlocked2 = arrayList2.get(i12);
                                        i12++;
                                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(tL_peerBlocked2.peer_id)));
                                    }
                                    p6Var32.N = tL_contacts_blockedSlice.count;
                                    p6Var32.O = hashSet.size() >= p6Var32.N;
                                }
                                ks.f(i102).k(ks.c3, new Object[0]);
                                p6Var32.P = false;
                                p6Var32.Q = System.currentTimeMillis();
                                break;
                            default:
                                p6 p6Var4 = p6Var3;
                                int i13 = p6Var4.a;
                                ArrayList arrayList3 = p6Var4.T;
                                arrayList3.clear();
                                arrayList3.add(new TLRPC.TL_inputPeerSelf());
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                    ArrayList<TLRPC.Chat> arrayList4 = ((TLRPC.TL_messages_chats) tLObject3).chats;
                                    mp.u1(i13).Z3(arrayList4, false);
                                    int size3 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        TLRPC.Chat chat = arrayList4.get(i14);
                                        i14++;
                                        arrayList3.add(mp.n1(chat));
                                    }
                                }
                                p6Var4.U = false;
                                p6Var4.V = true;
                                ks.f(i13).k(ks.e3, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            case 3:
                p6 p6Var4 = this.b;
                p6Var4.getClass();
                org.telegram.messenger.g0.g3(new v5(p6Var4, 0));
                break;
            case 4:
                p6 p6Var5 = this.b;
                p6Var5.getClass();
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new v5(p6Var5, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new di.a8(this.b, tLObject, tL_error, 5));
                break;
        }
    }
}
