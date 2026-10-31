package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ rj(vp vpVar, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.a = i11;
        this.b = vpVar;
        this.c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f = tL_messages_peerDialogs;
        this.h = hVar;
        this.n = tL_messages_dialogs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        switch (this.a) {
            case 0:
                i0.g3(new rj(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1));
                break;
            default:
                vp vpVar = this.b;
                ArrayList arrayList3 = vpVar.y;
                a0.h hVar = vpVar.Q;
                SparseIntArray sparseIntArray = vpVar.o2;
                int i13 = this.c;
                sparseIntArray.delete(i13);
                ArrayList arrayList4 = this.d;
                vpVar.r(arrayList4);
                ArrayList V0 = vpVar.V0(i13);
                int i14 = 0;
                int i15 = 0;
                boolean z11 = false;
                int i16 = this.e;
                while (i14 < V0.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i14);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (o5.C(dialog.id)) {
                            if (i16 < arrayList4.size()) {
                                arrayList4.add(i16, dialog);
                            } else {
                                arrayList4.add(dialog);
                            }
                            i16++;
                        } else if (dialog.pinned) {
                            i15 = Math.max(dialog.pinnedNum, i15);
                            dialog.pinned = false;
                            dialog.pinnedNum = 0;
                            i16++;
                            z11 = true;
                        } else if (dialog.id != vpVar.z2) {
                            ArrayList arrayList5 = new ArrayList();
                            if (arrayList4.isEmpty()) {
                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = this.f;
                                vpVar.V3(tL_messages_peerDialogs.users, false);
                                vpVar.P3(tL_messages_peerDialogs.chats, false);
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList4.size();
                                int i17 = 0;
                                z10 = false;
                                ArrayList arrayList8 = arrayList4;
                                while (i17 < size) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList8.get(i17);
                                    dialog2.pinnedNum = (size - i17) + i15;
                                    ArrayList arrayList9 = arrayList7;
                                    arrayList5.add(Long.valueOf(dialog2.id));
                                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(dialog2.id);
                                    if (dialog3 != null) {
                                        dialog3.pinned = true;
                                        dialog3.pinnedNum = dialog2.pinnedNum;
                                        arrayList6.add(Long.valueOf(dialog2.id));
                                        arrayList7 = arrayList9;
                                        arrayList7.add(Integer.valueOf(dialog2.pinnedNum));
                                        arrayList = arrayList8;
                                        i10 = size;
                                        i11 = i17;
                                    } else {
                                        i10 = size;
                                        arrayList7 = arrayList9;
                                        i11 = i17;
                                        hVar.k(dialog2, dialog2.id);
                                        ArrayList arrayList10 = (ArrayList) this.h.f(dialog2.id);
                                        vpVar.R.k(arrayList10, dialog2.id);
                                        if (arrayList10 != null) {
                                            int i18 = 0;
                                            arrayList8 = arrayList8;
                                            while (i18 < arrayList10.size()) {
                                                jj jjVar = (jj) arrayList10.get(i18);
                                                if (jjVar != null) {
                                                    i12 = i18;
                                                    if (jjVar.k.peer_id.channel_id == 0) {
                                                        vpVar.U.put(jjVar.f1(), jjVar);
                                                        vpVar.N = Math.min(vpVar.N, jjVar.k.date);
                                                        long j10 = jjVar.k.random_id;
                                                        if (j10 != 0) {
                                                            arrayList2 = arrayList8;
                                                            vpVar.S.k(jjVar, j10);
                                                        }
                                                    }
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    arrayList2 = arrayList8;
                                                    i12 = i18;
                                                }
                                                i18 = i12 + 1;
                                                arrayList8 = arrayList2;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        vpVar.t7.d(dialog2.id);
                                        z10 = true;
                                    }
                                    i17 = i11 + 1;
                                    size = i10;
                                    arrayList8 = arrayList;
                                    z11 = true;
                                }
                                hs messagesStorage = vpVar.getMessagesStorage();
                                messagesStorage.a.c(new eq(messagesStorage, arrayList6, arrayList7, 0));
                            } else {
                                z10 = false;
                            }
                            if (z11) {
                                if (z10) {
                                    arrayList3.clear();
                                    int m10 = hVar.m();
                                    for (int i19 = 0; i19 < m10; i19++) {
                                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar.n(i19);
                                        if (vpVar.D0.h(dialog4.id) < 0) {
                                            arrayList3.add(dialog4);
                                        }
                                    }
                                }
                                vpVar.Q4(null);
                                vpVar.getNotificationCenter().k(3, new Object[0]);
                            }
                            hs messagesStorage2 = vpVar.getMessagesStorage();
                            messagesStorage2.a.c(new zp(messagesStorage2, arrayList5, i13));
                            vpVar.getMessagesStorage().d1(this.n, 1);
                            vpVar.getUserConfig().y(i13, true);
                            vpVar.getUserConfig().v(false);
                            break;
                        }
                    }
                    i14++;
                    i16 = i16;
                }
                ArrayList arrayList52 = new ArrayList();
                if (arrayList4.isEmpty()) {
                }
                if (z11) {
                }
                hs messagesStorage22 = vpVar.getMessagesStorage();
                messagesStorage22.a.c(new zp(messagesStorage22, arrayList52, i13));
                vpVar.getMessagesStorage().d1(this.n, 1);
                vpVar.getUserConfig().y(i13, true);
                vpVar.getUserConfig().v(false);
        }
    }
}
