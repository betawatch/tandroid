package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ mh.b f;

    public /* synthetic */ i6(d7 d7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, mh.b bVar, int i10) {
        this.a = i10;
        this.b = d7Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                d7 d7Var = this.b;
                ArrayList<Long> arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                mh.b bVar = this.f;
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                if (!arrayList.isEmpty()) {
                    try {
                        d7Var.getMessagesStorage().getUsersInternal(arrayList, arrayList4);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        d7Var.getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                int i10 = 0;
                while (i10 < arrayList3.size()) {
                    if (((w6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new nh.e4(8));
                AndroidUtilities.runOnUIThread(new i6(d7Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                d7 d7Var2 = this.b;
                ArrayList<TLRPC.User> arrayList6 = this.c;
                ArrayList<TLRPC.Chat> arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                mh.b bVar2 = this.f;
                d7Var2.getMessagesController().putUsers(arrayList6, true);
                d7Var2.getMessagesController().putChats(arrayList7, true);
                boolean z10 = false;
                w6 w6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    w6 w6Var2 = (w6) arrayList8.get(i11);
                    if (d7Var2.getMessagesController().getUserOrChat(w6Var2.a) == null) {
                        w6Var2.a = Long.MAX_VALUE;
                        if (w6Var != null) {
                            SparseArray sparseArray = w6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = w6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    x6 x6Var = (x6) sparseArray2.valueAt(i12);
                                    x6 x6Var2 = (x6) sparseArray.get(keyAt, z10);
                                    if (x6Var2 == null) {
                                        x6Var2 = new x6();
                                        sparseArray.put(keyAt, x6Var2);
                                    }
                                    x6Var.getClass();
                                    w6 w6Var3 = w6Var;
                                    x6Var2.a += x6Var.a;
                                    w6Var3.c += x6Var.a;
                                    x6Var2.b.addAll(x6Var.b);
                                    i12++;
                                    w6Var = w6Var3;
                                    z10 = false;
                                } else {
                                    w6Var.b += w6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z4 = true;
                                }
                            }
                        } else {
                            w6Var = w6Var2;
                            z4 = false;
                        }
                        if (z4) {
                            Collections.sort(arrayList8, new nh.e4(8));
                        }
                    }
                    i11++;
                    z10 = false;
                }
                bVar2.b = arrayList8;
                LongSparseArray longSparseArray = bVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList8.get(i13);
                    i13++;
                    w6 w6Var4 = (w6) obj;
                    longSparseArray.put(w6Var4.a, w6Var4);
                }
                if (!d7.h0) {
                    d7Var2.V = bVar2;
                    a7 a7Var = d7Var2.K;
                    if (a7Var != null) {
                        a7Var.setCacheModel(bVar2);
                    }
                    d7Var2.w0(true);
                    d7Var2.v0();
                    if (d7Var2.O != null && !d7Var2.I && System.currentTimeMillis() - d7Var2.R > 120) {
                        p6 p6Var = d7Var2.O;
                        long j10 = d7Var2.E;
                        boolean z11 = j10 > 0;
                        long j11 = d7Var2.F;
                        float f10 = 0.0f;
                        float f11 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (d7Var2.G > 0 && j11 > 0) {
                            f10 = (j11 - r11) / j11;
                        }
                        p6Var.b(f11, f10, z11);
                        break;
                    }
                }
                break;
        }
    }
}
