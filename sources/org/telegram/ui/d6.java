package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ kh.b f;

    public /* synthetic */ d6(x6 x6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kh.b bVar, int i10) {
        this.a = i10;
        this.b = x6Var;
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
                x6 x6Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                kh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((q6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new lh.e4(11));
                AndroidUtilities.runOnUIThread(new d6(x6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                x6 x6Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                kh.b bVar2 = this.f;
                x6Var2.getMessagesController().putUsers(arrayList6, true);
                x6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                q6 q6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    q6 q6Var2 = (q6) arrayList8.get(i11);
                    if (x6Var2.getMessagesController().getUserOrChat(q6Var2.a) == null) {
                        q6Var2.a = Long.MAX_VALUE;
                        if (q6Var != null) {
                            SparseArray sparseArray = q6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = q6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    r6 r6Var = (r6) sparseArray2.valueAt(i12);
                                    r6 r6Var2 = (r6) sparseArray.get(keyAt, z11);
                                    if (r6Var2 == null) {
                                        r6Var2 = new r6();
                                        sparseArray.put(keyAt, r6Var2);
                                    }
                                    r6Var.getClass();
                                    q6 q6Var3 = q6Var;
                                    r6Var2.a += r6Var.a;
                                    q6Var3.c += r6Var.a;
                                    r6Var2.b.addAll(r6Var.b);
                                    i12++;
                                    q6Var = q6Var3;
                                    z11 = false;
                                } else {
                                    q6Var.b += q6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            q6Var = q6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new lh.e4(11));
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
                    q6 q6Var4 = (q6) obj;
                    longSparseArray.put(q6Var4.a, q6Var4);
                }
                if (!x6.g0) {
                    x6Var2.U = bVar2;
                    u6 u6Var = x6Var2.J;
                    if (u6Var != null) {
                        u6Var.setCacheModel(bVar2);
                    }
                    x6Var2.w0(true);
                    x6Var2.v0();
                    if (x6Var2.N != null && !x6Var2.H && System.currentTimeMillis() - x6Var2.Q > 120) {
                        j6 j6Var = x6Var2.N;
                        long j10 = x6Var2.D;
                        boolean z12 = j10 > 0;
                        long j11 = x6Var2.E;
                        float f9 = 0.0f;
                        float f10 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (x6Var2.F > 0 && j11 > 0) {
                            f9 = (j11 - r11) / j11;
                        }
                        j6Var.b(f10, f9, z12);
                        break;
                    }
                }
                break;
        }
    }
}
