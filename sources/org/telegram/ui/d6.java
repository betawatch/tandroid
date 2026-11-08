package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ci.c f;

    public /* synthetic */ d6(y6 y6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ci.c cVar, int i7) {
        this.a = i7;
        this.b = y6Var;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                ci.c cVar = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        y6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i7 < arrayList3.size()) {
                    if (((s6) arrayList3.get(i7)).c <= 0) {
                        arrayList3.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.jl(27));
                org.telegram.messenger.g0.h3(new d6(y6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                break;
            default:
                y6 y6Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                ci.c cVar2 = this.f;
                boolean z11 = true;
                y6Var2.getMessagesController().Y3(arrayList6, true);
                y6Var2.getMessagesController().S3(arrayList7, true);
                boolean z12 = false;
                s6 s6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    s6 s6Var2 = (s6) arrayList8.get(i10);
                    if (y6Var2.getMessagesController().e2(s6Var2.a) == null) {
                        s6Var2.a = Long.MAX_VALUE;
                        if (s6Var != null) {
                            SparseArray sparseArray = s6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = s6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    t6 t6Var = (t6) sparseArray2.valueAt(i11);
                                    t6 t6Var2 = (t6) sparseArray.get(keyAt, z12);
                                    if (t6Var2 == null) {
                                        t6Var2 = new t6();
                                        sparseArray.put(keyAt, t6Var2);
                                    }
                                    t6Var.getClass();
                                    s6 s6Var3 = s6Var;
                                    t6Var2.a += t6Var.a;
                                    s6Var3.c += t6Var.a;
                                    t6Var2.b.addAll(t6Var.b);
                                    i11++;
                                    s6Var = s6Var3;
                                    z11 = z11;
                                    z12 = false;
                                } else {
                                    z9 = z11;
                                    s6Var.b += s6Var2.b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z10 = z9;
                                }
                            }
                        } else {
                            z9 = z11;
                            s6Var = s6Var2;
                            z10 = false;
                        }
                        if (z10) {
                            Collections.sort(arrayList8, new org.telegram.messenger.jl(27));
                        }
                    } else {
                        z9 = z11;
                    }
                    i10++;
                    z11 = z9;
                    z12 = false;
                }
                boolean z13 = z11;
                cVar2.b = arrayList8;
                LongSparseArray longSparseArray = cVar2.c;
                longSparseArray.clear();
                int size = arrayList8.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList8.get(i12);
                    i12++;
                    s6 s6Var4 = (s6) obj;
                    longSparseArray.put(s6Var4.a, s6Var4);
                }
                if (!y6.h0) {
                    y6Var2.d0 = cVar2;
                    i6 i6Var = y6Var2.M;
                    if (i6Var != null) {
                        i6Var.setCacheModel(cVar2);
                    }
                    y6Var2.A0(z13);
                    y6Var2.y0();
                    if (y6Var2.X != null && !y6Var2.K && System.currentTimeMillis() - y6Var2.a0 > 120) {
                        k6 k6Var = y6Var2.X;
                        long j3 = y6Var2.G;
                        boolean z14 = j3 > 0 ? z13 : false;
                        long j10 = y6Var2.H;
                        float f10 = 0.0f;
                        float f11 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (y6Var2.I > 0 && j10 > 0) {
                            f10 = (j10 - r11) / j10;
                        }
                        k6Var.b(f11, f10, z14);
                        break;
                    }
                }
                break;
        }
    }
}
