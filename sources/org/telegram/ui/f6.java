package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ di.c f;

    public /* synthetic */ f6(z6 z6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, di.c cVar, int i3) {
        this.a = i3;
        this.b = z6Var;
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
                z6 z6Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                di.c cVar = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        z6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i3 < arrayList3.size()) {
                    if (((t6) arrayList3.get(i3)).c <= 0) {
                        arrayList3.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.tq(17));
                org.telegram.messenger.g0.h3(new f6(z6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                break;
            default:
                z6 z6Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                di.c cVar2 = this.f;
                boolean z12 = true;
                z6Var2.getMessagesController().Y3(arrayList6, true);
                z6Var2.getMessagesController().S3(arrayList7, true);
                boolean z13 = false;
                t6 t6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    t6 t6Var2 = (t6) arrayList8.get(i10);
                    if (z6Var2.getMessagesController().e2(t6Var2.a) == null) {
                        t6Var2.a = Long.MAX_VALUE;
                        if (t6Var != null) {
                            SparseArray sparseArray = t6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = t6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    u6 u6Var = (u6) sparseArray2.valueAt(i11);
                                    u6 u6Var2 = (u6) sparseArray.get(keyAt, z13);
                                    if (u6Var2 == null) {
                                        u6Var2 = new u6();
                                        sparseArray.put(keyAt, u6Var2);
                                    }
                                    u6Var.getClass();
                                    t6 t6Var3 = t6Var;
                                    u6Var2.a += u6Var.a;
                                    t6Var3.c += u6Var.a;
                                    u6Var2.b.addAll(u6Var.b);
                                    i11++;
                                    t6Var = t6Var3;
                                    z12 = z12;
                                    z13 = false;
                                } else {
                                    z10 = z12;
                                    t6Var.b += t6Var2.b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z11 = z10;
                                }
                            }
                        } else {
                            z10 = z12;
                            t6Var = t6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new org.telegram.messenger.tq(17));
                        }
                    } else {
                        z10 = z12;
                    }
                    i10++;
                    z12 = z10;
                    z13 = false;
                }
                boolean z14 = z12;
                cVar2.b = arrayList8;
                LongSparseArray longSparseArray = cVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    t6 t6Var4 = (t6) obj;
                    longSparseArray.put(t6Var4.a, t6Var4);
                }
                if (!z6.i0) {
                    z6Var2.e0 = cVar2;
                    k6 k6Var = z6Var2.N;
                    if (k6Var != null) {
                        k6Var.setCacheModel(cVar2);
                    }
                    z6Var2.A0(z14);
                    z6Var2.y0();
                    if (z6Var2.Y != null && !z6Var2.L && System.currentTimeMillis() - z6Var2.b0 > 120) {
                        m6 m6Var = z6Var2.Y;
                        long j10 = z6Var2.H;
                        boolean z15 = j10 > 0 ? z14 : false;
                        long j11 = z6Var2.I;
                        float f10 = 0.0f;
                        float f11 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (z6Var2.J > 0 && j11 > 0) {
                            f10 = (j11 - r11) / j11;
                        }
                        m6Var.b(f11, f10, z15);
                        break;
                    }
                }
                break;
        }
    }
}
