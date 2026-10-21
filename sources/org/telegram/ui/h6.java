package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ bi.c f;

    public /* synthetic */ h6(c7 c7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, bi.c cVar, int i10) {
        this.a = i10;
        this.b = c7Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                c7 c7Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                bi.c cVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        c7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        c7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((v6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.ui.ActionBar.i4(4));
                AndroidUtilities.runOnUIThread(new h6(c7Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                break;
            default:
                c7 c7Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                bi.c cVar2 = this.f;
                boolean z12 = true;
                c7Var2.getMessagesController().putUsers(arrayList6, true);
                c7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z13 = false;
                v6 v6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    v6 v6Var2 = (v6) arrayList8.get(i11);
                    if (c7Var2.getMessagesController().getUserOrChat(v6Var2.a) == null) {
                        v6Var2.a = Long.MAX_VALUE;
                        if (v6Var != null) {
                            SparseArray sparseArray = v6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = v6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    w6 w6Var = (w6) sparseArray2.valueAt(i12);
                                    w6 w6Var2 = (w6) sparseArray.get(keyAt, z13);
                                    if (w6Var2 == null) {
                                        w6Var2 = new w6();
                                        sparseArray.put(keyAt, w6Var2);
                                    }
                                    w6Var.getClass();
                                    v6 v6Var3 = v6Var;
                                    w6Var2.a += w6Var.a;
                                    v6Var3.c += w6Var.a;
                                    w6Var2.b.addAll(w6Var.b);
                                    i12++;
                                    v6Var = v6Var3;
                                    z12 = z12;
                                    z13 = false;
                                } else {
                                    z10 = z12;
                                    v6Var.b += v6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = z10;
                                }
                            }
                        } else {
                            z10 = z12;
                            v6Var = v6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new org.telegram.ui.ActionBar.i4(4));
                        }
                    } else {
                        z10 = z12;
                    }
                    i11++;
                    z12 = z10;
                    z13 = false;
                }
                boolean z14 = z12;
                cVar2.b = arrayList8;
                LongSparseArray longSparseArray = cVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    v6 v6Var4 = (v6) obj;
                    longSparseArray.put(v6Var4.a, v6Var4);
                }
                if (!c7.k0) {
                    c7Var2.Y = cVar2;
                    z6 z6Var = c7Var2.N;
                    if (z6Var != null) {
                        z6Var.setCacheModel(cVar2);
                    }
                    c7Var2.w0(z14);
                    c7Var2.v0();
                    if (c7Var2.R != null && !c7Var2.L && System.currentTimeMillis() - c7Var2.U > 120) {
                        n6 n6Var = c7Var2.R;
                        long j10 = c7Var2.H;
                        boolean z15 = j10 > 0 ? z14 : false;
                        long j11 = c7Var2.I;
                        float f7 = 0.0f;
                        float f10 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (c7Var2.J > 0 && j11 > 0) {
                            f7 = (j11 - r11) / j11;
                        }
                        n6Var.b(f10, f7, z15);
                        break;
                    }
                }
                break;
        }
    }
}
