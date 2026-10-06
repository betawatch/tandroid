package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ zh.b f;

    public /* synthetic */ g6(a7 a7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
        this.a = i10;
        this.b = a7Var;
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
                a7 a7Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                zh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((u6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new g6(a7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                a7 a7Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                zh.b bVar2 = this.f;
                a7Var2.getMessagesController().putUsers(arrayList6, true);
                a7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                u6 u6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    u6 u6Var2 = (u6) arrayList8.get(i11);
                    if (a7Var2.getMessagesController().getUserOrChat(u6Var2.a) == null) {
                        u6Var2.a = Long.MAX_VALUE;
                        if (u6Var != null) {
                            SparseArray sparseArray = u6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = u6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    v6 v6Var = (v6) sparseArray2.valueAt(i12);
                                    v6 v6Var2 = (v6) sparseArray.get(keyAt, z11);
                                    if (v6Var2 == null) {
                                        v6Var2 = new v6();
                                        sparseArray.put(keyAt, v6Var2);
                                    }
                                    v6Var.getClass();
                                    u6 u6Var3 = u6Var;
                                    v6Var2.a += v6Var.a;
                                    u6Var3.c += v6Var.a;
                                    v6Var2.b.addAll(v6Var.b);
                                    i12++;
                                    u6Var = u6Var3;
                                    z11 = false;
                                } else {
                                    u6Var.b += u6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            u6Var = u6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new a4.e(27));
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
                    u6 u6Var4 = (u6) obj;
                    longSparseArray.put(u6Var4.a, u6Var4);
                }
                if (!a7.m0) {
                    a7Var2.e0 = bVar2;
                    k6 k6Var = a7Var2.M;
                    if (k6Var != null) {
                        k6Var.setCacheModel(bVar2);
                    }
                    a7Var2.v0(true);
                    a7Var2.t0();
                    if (a7Var2.X != null && !a7Var2.K && System.currentTimeMillis() - a7Var2.a0 > 120) {
                        m6 m6Var = a7Var2.X;
                        long j3 = a7Var2.G;
                        boolean z12 = j3 > 0;
                        long j10 = a7Var2.H;
                        float f7 = 0.0f;
                        float f10 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (a7Var2.I > 0 && j10 > 0) {
                            f7 = (j10 - r11) / j10;
                        }
                        m6Var.b(f10, f7, z12);
                        break;
                    }
                }
                break;
        }
    }
}
