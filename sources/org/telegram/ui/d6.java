package org.telegram.ui;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ei.c f;

    public /* synthetic */ d6(x6 x6Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ei.c cVar, int i7) {
        this.a = i7;
        this.b = x6Var;
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
                x6 x6Var = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = this.e;
                ei.c cVar = this.f;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().n0(arrayList, arrayList4, false);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    try {
                        x6Var.getMessagesStorage().Q(TextUtils.join(",", arrayList2), arrayList5);
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                while (i7 < arrayList3.size()) {
                    if (((r6) arrayList3.get(i7)).c <= 0) {
                        arrayList3.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                Collections.sort(arrayList3, new org.telegram.messenger.dl(26));
                org.telegram.messenger.g0.g3(new d6(x6Var, arrayList4, arrayList5, arrayList3, cVar, 1));
                break;
            default:
                x6 x6Var2 = this.b;
                ArrayList arrayList6 = this.c;
                ArrayList arrayList7 = this.d;
                ArrayList arrayList8 = this.e;
                ei.c cVar2 = this.f;
                boolean z12 = true;
                x6Var2.getMessagesController().f4(arrayList6, true);
                x6Var2.getMessagesController().Z3(arrayList7, true);
                boolean z13 = false;
                r6 r6Var = null;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    r6 r6Var2 = (r6) arrayList8.get(i10);
                    if (x6Var2.getMessagesController().g2(r6Var2.a) == null) {
                        r6Var2.a = Long.MAX_VALUE;
                        if (r6Var != null) {
                            SparseArray sparseArray = r6Var.d;
                            int i11 = 0;
                            while (true) {
                                SparseArray sparseArray2 = r6Var2.d;
                                if (i11 < sparseArray2.size()) {
                                    int keyAt = sparseArray2.keyAt(i11);
                                    s6 s6Var = (s6) sparseArray2.valueAt(i11);
                                    s6 s6Var2 = (s6) sparseArray.get(keyAt, z13);
                                    if (s6Var2 == null) {
                                        s6Var2 = new s6();
                                        sparseArray.put(keyAt, s6Var2);
                                    }
                                    s6Var.getClass();
                                    r6 r6Var3 = r6Var;
                                    s6Var2.a += s6Var.a;
                                    r6Var3.c += s6Var.a;
                                    s6Var2.b.addAll(s6Var.b);
                                    i11++;
                                    r6Var = r6Var3;
                                    z12 = z12;
                                    z13 = false;
                                } else {
                                    z10 = z12;
                                    r6Var.b += r6Var2.b;
                                    arrayList8.remove(i10);
                                    i10--;
                                    z11 = z10;
                                }
                            }
                        } else {
                            z10 = z12;
                            r6Var = r6Var2;
                            z11 = false;
                        }
                        if (z11) {
                            Collections.sort(arrayList8, new org.telegram.messenger.dl(26));
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
                    r6 r6Var4 = (r6) obj;
                    longSparseArray.put(r6Var4.a, r6Var4);
                }
                if (!x6.i0) {
                    x6Var2.e0 = cVar2;
                    i6 i6Var = x6Var2.N;
                    if (i6Var != null) {
                        i6Var.setCacheModel(cVar2);
                    }
                    x6Var2.A0(z14);
                    x6Var2.y0();
                    if (x6Var2.Y != null && !x6Var2.L && System.currentTimeMillis() - x6Var2.b0 > 120) {
                        k6 k6Var = x6Var2.Y;
                        long j3 = x6Var2.H;
                        boolean z15 = j3 > 0 ? z14 : false;
                        long j10 = x6Var2.I;
                        float f10 = 0.0f;
                        float f11 = j10 <= 0 ? 0.0f : j3 / j10;
                        if (x6Var2.J > 0 && j10 > 0) {
                            f10 = (j10 - r11) / j10;
                        }
                        k6Var.b(f11, f10, z15);
                        break;
                    }
                }
                break;
        }
    }
}
