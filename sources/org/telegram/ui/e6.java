package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ yh.b f;

    public /* synthetic */ e6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, yh.b bVar, int i10) {
        this.a = i10;
        this.b = y6Var;
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
                y6 y6Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                yh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new a4.e(20));
                AndroidUtilities.runOnUIThread(new e6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                y6 y6Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                yh.b bVar2 = this.f;
                y6Var2.getMessagesController().putUsers(arrayList6, true);
                y6Var2.getMessagesController().putChats(arrayList7, true);
                boolean z11 = false;
                r6 r6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i11);
                    if (y6Var2.getMessagesController().getUserOrChat(r6Var2.a) == null) {
                        r6Var2.a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i12);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z11);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.a += s6Var.a;
                                    r6Var3.c += s6Var.a;
                                    s6Var2.b.addAll(s6Var.b);
                                    i12++;
                                    r6Var = r6Var3;
                                    z11 = false;
                                } else {
                                    r6Var.b += r6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z10 = true;
                                }
                            }
                        } else {
                            r6Var = r6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new a4.e(20));
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
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.a, r6Var4);
                }
                if (!y6.k0) {
                    y6Var2.Y = bVar2;
                    v6 v6Var = y6Var2.N;
                    if (v6Var != null) {
                        v6Var.setCacheModel(bVar2);
                    }
                    y6Var2.w0(true);
                    y6Var2.v0();
                    if (y6Var2.R != null && !y6Var2.L && System.currentTimeMillis() - y6Var2.U > 120) {
                        k6 k6Var = y6Var2.R;
                        long j3 = y6Var2.H;
                        boolean z12 = j3 > 0;
                        long j10 = y6Var2.I;
                        float f7 = 0.0f;
                        float f10 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (y6Var2.J > 0 && j10 > 0) {
                            f7 = (j10 - r11) / j10;
                        }
                        k6Var.b(f10, f7, z12);
                        break;
                    }
                }
                break;
        }
    }
}
