// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ vh6 h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ b97(oc7 oc7Var, int i, ArrayList arrayList, boolean z, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, vh6 vh6Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = tL_messages_peerDialogs;
        this.h = vh6Var;
        this.n = tL_messages_dialogs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                ArrayList arrayList3 = oc7Var.y;
                vh6 vh6Var = oc7Var.R;
                SparseIntArray sparseIntArray = oc7Var.h2;
                int i4 = this.c;
                sparseIntArray.delete(i4);
                ArrayList arrayList4 = this.d;
                oc7Var.n(arrayList4);
                ArrayList V0 = oc7Var.V0(i4);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = false;
                int i7 = this.e;
                while (i5 < V0.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i5);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (pg3.B(dialog.id)) {
                            if (i7 < arrayList4.size()) {
                                arrayList4.add(i7, dialog);
                            } else {
                                arrayList4.add(dialog);
                            }
                            i7++;
                        } else if (dialog.pinned) {
                            i6 = Math.max(dialog.pinnedNum, i6);
                            dialog.pinned = false;
                            dialog.pinnedNum = 0;
                            i7++;
                            z2 = true;
                        } else if (dialog.id != oc7Var.s2) {
                            ArrayList arrayList5 = new ArrayList();
                            if (arrayList4.isEmpty()) {
                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = this.f;
                                oc7Var.d4(tL_messages_peerDialogs.users, false);
                                oc7Var.X3(tL_messages_peerDialogs.chats, false);
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList4.size();
                                int i8 = 0;
                                z = false;
                                ArrayList arrayList8 = arrayList4;
                                while (i8 < size) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList8.get(i8);
                                    dialog2.pinnedNum = (size - i8) + i6;
                                    ArrayList arrayList9 = arrayList6;
                                    arrayList5.add(Long.valueOf(dialog2.id));
                                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var.f(dialog2.id);
                                    if (dialog3 != null) {
                                        dialog3.pinned = true;
                                        dialog3.pinnedNum = dialog2.pinnedNum;
                                        arrayList6 = arrayList9;
                                        arrayList6.add(Long.valueOf(dialog2.id));
                                        arrayList7.add(Integer.valueOf(dialog2.pinnedNum));
                                        arrayList = arrayList8;
                                        i = size;
                                        i2 = i8;
                                    } else {
                                        i = size;
                                        arrayList6 = arrayList9;
                                        i2 = i8;
                                        vh6Var.k(dialog2, dialog2.id);
                                        ArrayList arrayList10 = (ArrayList) this.h.f(dialog2.id);
                                        oc7Var.S.k(arrayList10, dialog2.id);
                                        if (arrayList10 != null) {
                                            int i9 = 0;
                                            arrayList8 = arrayList8;
                                            while (i9 < arrayList10.size()) {
                                                k47 k47Var = (k47) arrayList10.get(i9);
                                                if (k47Var != null) {
                                                    i3 = i9;
                                                    if (k47Var.k.peer_id.channel_id == 0) {
                                                        oc7Var.V.put(k47Var.e1(), k47Var);
                                                        oc7Var.O = Math.min(oc7Var.O, k47Var.k.date);
                                                        long j = k47Var.k.random_id;
                                                        if (j != 0) {
                                                            arrayList2 = arrayList8;
                                                            oc7Var.T.k(k47Var, j);
                                                        }
                                                    }
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    arrayList2 = arrayList8;
                                                    i3 = i9;
                                                }
                                                i9 = i3 + 1;
                                                arrayList8 = arrayList2;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        oc7Var.i4.c(dialog2.id);
                                        z = true;
                                    }
                                    i8 = i2 + 1;
                                    size = i;
                                    arrayList8 = arrayList;
                                    z2 = true;
                                }
                                cf7 messagesStorage = oc7Var.getMessagesStorage();
                                messagesStorage.a.c(new zc7(messagesStorage, arrayList6, arrayList7, (byte) 0));
                            } else {
                                z = false;
                            }
                            if (z2) {
                                if (z) {
                                    arrayList3.clear();
                                    int m = vh6Var.m();
                                    for (int i10 = 0; i10 < m; i10++) {
                                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) vh6Var.n(i10);
                                        if (oc7Var.u0.h(dialog4.id) < 0) {
                                            arrayList3.add(dialog4);
                                        }
                                    }
                                }
                                oc7Var.b5(null);
                                oc7Var.getNotificationCenter().k(3, new Object[0]);
                            }
                            cf7 messagesStorage2 = oc7Var.getMessagesStorage();
                            messagesStorage2.a.c(new ad7(messagesStorage2, arrayList5, i4));
                            oc7Var.getMessagesStorage().a1(this.n, 1);
                            oc7Var.getUserConfig().x(i4, true);
                            oc7Var.getUserConfig().u(false);
                            break;
                        }
                    }
                    i5++;
                    i7 = i7;
                }
                ArrayList arrayList52 = new ArrayList();
                if (arrayList4.isEmpty()) {
                }
                if (z2) {
                }
                cf7 messagesStorage22 = oc7Var.getMessagesStorage();
                messagesStorage22.a.c(new ad7(messagesStorage22, arrayList52, i4));
                oc7Var.getMessagesStorage().a1(this.n, 1);
                oc7Var.getUserConfig().x(i4, true);
                oc7Var.getUserConfig().u(false);
            default:
                gm.c3(new b97(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                break;
        }
    }
}
