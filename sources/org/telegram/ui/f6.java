package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ zh.b f;

    public /* synthetic */ f6(a7 a7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zh.b bVar, int i10) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        a7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((t6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(27));
                AndroidUtilities.runOnUIThread(new f6(a7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
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
                t6 t6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    t6 t6Var2 = (t6) arrayList8.get(i11);
                    if (a7Var2.getMessagesController().getUserOrChat(t6Var2.a) == null) {
                        t6Var2.a = Long.MAX_VALUE;
                        if (t6Var != null) {
                            SparseArray sparseArray = t6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = t6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    u6 u6Var = (u6) sparseArray2.valueAt(i12);
                                    u6 u6Var2 = (u6) sparseArray.get(keyAt, z11);
                                    if (u6Var2 == null) {
                                        u6Var2 = new u6();
                                        sparseArray.put(keyAt, u6Var2);
                                    }
                                    u6Var.getClass();
                                    t6 t6Var3 = t6Var;
                                    u6Var2.a += u6Var.a;
                                    t6Var3.c += u6Var.a;
                                    u6Var2.b.addAll(u6Var.b);
                                    i12++;
                                    t6Var = t6Var3;
                                    z11 = false;
                                } else {
                                    t6Var.b += t6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            t6Var = t6Var2;
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
                    t6 t6Var4 = (t6) obj;
                    longSparseArray.put(t6Var4.a, t6Var4);
                }
                if (!a7.l0) {
                    a7Var2.c0 = bVar2;
                    x6 x6Var = a7Var2.M;
                    if (x6Var != null) {
                        x6Var.setCacheModel(bVar2);
                    }
                    a7Var2.y0(true);
                    a7Var2.w0();
                    if (a7Var2.V != null && !a7Var2.K && System.currentTimeMillis() - a7Var2.Y > 120) {
                        l6 l6Var = a7Var2.V;
                        long j3 = a7Var2.G;
                        boolean z12 = j3 > 0;
                        long j10 = a7Var2.H;
                        float f7 = 0.0f;
                        float f10 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (a7Var2.I > 0 && j10 > 0) {
                            f7 = (j10 - r11) / j10;
                        }
                        l6Var.b(f10, f7, z12);
                        break;
                    }
                }
                break;
        }
    }
}
