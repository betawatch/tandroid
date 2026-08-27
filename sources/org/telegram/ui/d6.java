package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ih.b f;

    public /* synthetic */ d6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ih.b bVar, int i10) {
        this.a = i10;
        this.b = z6Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                ih.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new k9.a(11));
                AndroidUtilities.runOnUIThread(new d6(z6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                z6 z6Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                ih.b bVar2 = this.f;
                z6Var2.getMessagesController().putUsers(arrayList6, true);
                z6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                s6 s6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i11);
                    if (z6Var2.getMessagesController().getUserOrChat(s6Var2.a) == null) {
                        s6Var2.a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i12);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z11);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.a += t6Var.a;
                                    s6Var3.c += t6Var.a;
                                    t6Var2.b.addAll(t6Var.b);
                                    i12++;
                                    s6Var = s6Var3;
                                    z11 = false;
                                } else {
                                    s6Var.b += s6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            s6Var = s6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new k9.a(11));
                        }
                    }
                    i11++;
                    z11 = false;
                }
                bVar2.b = arrayList8;
                LongSparseArray longSparseArray = bVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.a, s6Var4);
                }
                if (!z6.g0) {
                    z6Var2.U = bVar2;
                    w6 w6Var = z6Var2.J;
                    if (w6Var != null) {
                        w6Var.setCacheModel(bVar2);
                    }
                    z6Var2.w0(true);
                    z6Var2.v0();
                    if (z6Var2.N != null && !z6Var2.H && System.currentTimeMillis() - z6Var2.Q > 120) {
                        k6 k6Var = z6Var2.N;
                        long j10 = z6Var2.D;
                        boolean z12 = j10 > 0;
                        long j11 = z6Var2.E;
                        float f10 = 0.0f;
                        float f11 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (z6Var2.F > 0 && j11 > 0) {
                            f10 = (j11 - r11) / j11;
                        }
                        k6Var.b(f11, f10, z12);
                        break;
                    }
                }
                break;
        }
    }
}
