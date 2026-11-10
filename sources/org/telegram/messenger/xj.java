package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ xj(qp qpVar, int i7, ArrayList arrayList, boolean z9, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.c = i7;
        this.d = arrayList;
        this.e = z9;
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
        boolean z9;
        int i7;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.a) {
            case 0:
                g0.h3(new xj(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1));
                break;
            default:
                qp qpVar = this.b;
                ArrayList arrayList3 = qpVar.y;
                a0.h hVar = qpVar.Q;
                SparseIntArray sparseIntArray = qpVar.o2;
                int i12 = this.c;
                sparseIntArray.delete(i12);
                ArrayList arrayList4 = this.d;
                qpVar.r(arrayList4);
                ArrayList W0 = qpVar.W0(i12);
                int i13 = 0;
                int i14 = 0;
                boolean z10 = false;
                int i15 = this.e;
                while (i13 < W0.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i13);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (m5.C(dialog.id)) {
                            if (i15 < arrayList4.size()) {
                                arrayList4.add(i15, dialog);
                            } else {
                                arrayList4.add(dialog);
                            }
                            i15++;
                        } else if (dialog.pinned) {
                            i14 = Math.max(dialog.pinnedNum, i14);
                            dialog.pinned = false;
                            dialog.pinnedNum = 0;
                            i15++;
                            z10 = true;
                        } else if (dialog.id != qpVar.z2) {
                            ArrayList arrayList5 = new ArrayList();
                            if (arrayList4.isEmpty()) {
                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = this.f;
                                qpVar.Y3(tL_messages_peerDialogs.users, false);
                                qpVar.S3(tL_messages_peerDialogs.chats, false);
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList4.size();
                                int i16 = 0;
                                z9 = false;
                                ArrayList arrayList8 = arrayList4;
                                while (i16 < size) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList8.get(i16);
                                    dialog2.pinnedNum = (size - i16) + i14;
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
                                        i7 = size;
                                        i10 = i16;
                                    } else {
                                        i7 = size;
                                        arrayList7 = arrayList9;
                                        i10 = i16;
                                        hVar.k(dialog2, dialog2.id);
                                        ArrayList arrayList10 = (ArrayList) this.h.f(dialog2.id);
                                        qpVar.R.k(arrayList10, dialog2.id);
                                        if (arrayList10 != null) {
                                            int i17 = 0;
                                            arrayList8 = arrayList8;
                                            while (i17 < arrayList10.size()) {
                                                ij ijVar = (ij) arrayList10.get(i17);
                                                if (ijVar != null) {
                                                    i11 = i17;
                                                    if (ijVar.k.peer_id.channel_id == 0) {
                                                        qpVar.U.put(ijVar.e1(), ijVar);
                                                        qpVar.N = Math.min(qpVar.N, ijVar.k.date);
                                                        long j3 = ijVar.k.random_id;
                                                        if (j3 != 0) {
                                                            arrayList2 = arrayList8;
                                                            qpVar.S.k(ijVar, j3);
                                                        }
                                                    }
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    arrayList2 = arrayList8;
                                                    i11 = i17;
                                                }
                                                i17 = i11 + 1;
                                                arrayList8 = arrayList2;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        qpVar.s7.d(dialog2.id);
                                        z9 = true;
                                    }
                                    i16 = i10 + 1;
                                    size = i7;
                                    arrayList8 = arrayList;
                                    z10 = true;
                                }
                                yr messagesStorage = qpVar.getMessagesStorage();
                                messagesStorage.a.c(new yp(messagesStorage, arrayList6, arrayList7, 0));
                            } else {
                                z9 = false;
                            }
                            if (z10) {
                                if (z9) {
                                    arrayList3.clear();
                                    int m10 = hVar.m();
                                    for (int i18 = 0; i18 < m10; i18++) {
                                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar.n(i18);
                                        if (qpVar.D0.h(dialog4.id) < 0) {
                                            arrayList3.add(dialog4);
                                        }
                                    }
                                }
                                qpVar.T4(null);
                                qpVar.getNotificationCenter().k(3, new Object[0]);
                            }
                            yr messagesStorage2 = qpVar.getMessagesStorage();
                            messagesStorage2.a.c(new up(messagesStorage2, arrayList5, i12));
                            qpVar.getMessagesStorage().d1(this.n, 1);
                            qpVar.getUserConfig().y(i12, true);
                            qpVar.getUserConfig().v(false);
                            break;
                        }
                    }
                    i13++;
                    i15 = i15;
                }
                ArrayList arrayList52 = new ArrayList();
                if (arrayList4.isEmpty()) {
                }
                if (z10) {
                }
                yr messagesStorage22 = qpVar.getMessagesStorage();
                messagesStorage22.a.c(new up(messagesStorage22, arrayList52, i12));
                qpVar.getMessagesStorage().d1(this.n, 1);
                qpVar.getUserConfig().y(i12, true);
                qpVar.getUserConfig().v(false);
        }
    }
}
