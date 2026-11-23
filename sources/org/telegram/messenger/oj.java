package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class oj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ a0.h h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ oj(np npVar, int i7, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.a = i10;
        this.b = npVar;
        this.c = i7;
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
        int i7;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.a) {
            case 0:
                g0.g3(new oj(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1));
                break;
            default:
                np npVar = this.b;
                ArrayList arrayList3 = npVar.y;
                a0.h hVar = npVar.R;
                SparseIntArray sparseIntArray = npVar.r2;
                int i12 = this.c;
                sparseIntArray.delete(i12);
                ArrayList arrayList4 = this.d;
                npVar.r(arrayList4);
                ArrayList Y0 = npVar.Y0(i12);
                int i13 = 0;
                int i14 = 0;
                boolean z11 = false;
                int i15 = this.e;
                while (i13 < Y0.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(i13);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (n5.C(dialog.id)) {
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
                            z11 = true;
                        } else if (dialog.id != npVar.C2) {
                            ArrayList arrayList5 = new ArrayList();
                            if (arrayList4.isEmpty()) {
                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = this.f;
                                npVar.f4(tL_messages_peerDialogs.users, false);
                                npVar.Z3(tL_messages_peerDialogs.chats, false);
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList4.size();
                                int i16 = 0;
                                z10 = false;
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
                                        npVar.S.k(arrayList10, dialog2.id);
                                        if (arrayList10 != null) {
                                            int i17 = 0;
                                            arrayList8 = arrayList8;
                                            while (i17 < arrayList10.size()) {
                                                gj gjVar = (gj) arrayList10.get(i17);
                                                if (gjVar != null) {
                                                    i11 = i17;
                                                    if (gjVar.k.peer_id.channel_id == 0) {
                                                        npVar.V.put(gjVar.e1(), gjVar);
                                                        npVar.O = Math.min(npVar.O, gjVar.k.date);
                                                        long j3 = gjVar.k.random_id;
                                                        if (j3 != 0) {
                                                            arrayList2 = arrayList8;
                                                            npVar.T.k(gjVar, j3);
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
                                        npVar.v7.d(dialog2.id);
                                        z10 = true;
                                    }
                                    i16 = i10 + 1;
                                    size = i7;
                                    arrayList8 = arrayList;
                                    z11 = true;
                                }
                                ur messagesStorage = npVar.getMessagesStorage();
                                messagesStorage.a.c(new tp(messagesStorage, arrayList6, arrayList7, 0));
                            } else {
                                z10 = false;
                            }
                            if (z11) {
                                if (z10) {
                                    arrayList3.clear();
                                    int m10 = hVar.m();
                                    for (int i18 = 0; i18 < m10; i18++) {
                                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar.n(i18);
                                        if (npVar.E0.h(dialog4.id) < 0) {
                                            arrayList3.add(dialog4);
                                        }
                                    }
                                }
                                npVar.f5(null);
                                npVar.getNotificationCenter().k(3, new Object[0]);
                            }
                            ur messagesStorage2 = npVar.getMessagesStorage();
                            messagesStorage2.a.c(new up(messagesStorage2, arrayList5, i12));
                            npVar.getMessagesStorage().d1(this.n, 1);
                            npVar.getUserConfig().y(i12, true);
                            npVar.getUserConfig().v(false);
                            break;
                        }
                    }
                    i13++;
                    i15 = i15;
                }
                ArrayList arrayList52 = new ArrayList();
                if (arrayList4.isEmpty()) {
                }
                if (z11) {
                }
                ur messagesStorage22 = npVar.getMessagesStorage();
                messagesStorage22.a.c(new up(messagesStorage22, arrayList52, i12));
                npVar.getMessagesStorage().d1(this.n, 1);
                npVar.getUserConfig().y(i12, true);
                npVar.getUserConfig().v(false);
        }
    }
}
