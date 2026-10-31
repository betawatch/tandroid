package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ sh.b f;

    public /* synthetic */ d6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, sh.b bVar, int i10) {
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
        boolean z11;
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                sh.b bVar = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                while (i10 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i10)).c <= 0) {
                        arrayList3.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.bk(29));
                org.telegram.messenger.i0.g3(new d6(y6Var, arrayList4, arrayList5, arrayList3, bVar, 1));
                break;
            default:
                y6 y6Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                sh.b bVar2 = this.f;
                boolean z12 = true;
                y6Var2.getMessagesController().V3(arrayList6, true);
                y6Var2.getMessagesController().P3(arrayList7, true);
                boolean z13 = false;
                s6 s6Var = null;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i11);
                    if (y6Var2.getMessagesController().d2(s6Var2.a) == null) {
                        s6Var2.a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i12 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i12 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i12);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i12);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z13);
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
                                    z12 = z12;
                                    z13 = false;
                                } else {
                                    z10 = z12;
                                    s6Var.b += s6Var2.b;
                                    arrayList8.remove(i11);
                                    i11--;
                                    z11 = z10;
                                }
                            }
                        } else {
                            z10 = z12;
                            s6Var = s6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new org.telegram.messenger.bk(29));
                        }
                    } else {
                        z10 = z12;
                    }
                    i11++;
                    z12 = z10;
                    z13 = false;
                }
                boolean z14 = z12;
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
                if (!y6.h0) {
                    y6Var2.d0 = bVar2;
                    j6 j6Var = y6Var2.M;
                    if (j6Var != null) {
                        j6Var.setCacheModel(bVar2);
                    }
                    y6Var2.z0(z14);
                    y6Var2.x0();
                    if (y6Var2.X != null && !y6Var2.K && System.currentTimeMillis() - y6Var2.a0 > 120) {
                        l6 l6Var = y6Var2.X;
                        long j10 = y6Var2.G;
                        boolean z15 = j10 > 0 ? z14 : false;
                        long j11 = y6Var2.H;
                        float f7 = 0.0f;
                        float f10 = j11 <= 0 ? 0.0f : j10 / j11;
                        if (y6Var2.I > 0 && j11 > 0) {
                            f7 = (j11 - r11) / j11;
                        }
                        l6Var.b(f10, f7, z15);
                        break;
                    }
                }
                break;
        }
    }
}
