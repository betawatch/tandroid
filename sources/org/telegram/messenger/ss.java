package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;
    public final /* synthetic */ int c;

    public /* synthetic */ ss(ys ysVar, int i7, int i10) {
        this.a = i10;
        this.b = ysVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        ys ysVar = this.b;
        switch (i7) {
            case 0:
                ls.e().k(ls.J4, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(ls.d2, Integer.valueOf(i10));
                break;
            case 1:
                ls.e().k(ls.J4, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(ls.d2, Integer.valueOf(i10));
                break;
            case 2:
                ls.e().k(ls.J4, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(ls.d2, Integer.valueOf(i10));
                break;
            case 3:
                ls.e().k(ls.J4, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(ls.d2, Integer.valueOf(i10));
                break;
            case 4:
                if (ysVar.J == 0) {
                    ysVar.w.clear();
                    ls.e().k(ls.g4, new Object[0]);
                }
                ls.e().k(ls.J4, Integer.valueOf(ysVar.currentAccount));
                ysVar.getNotificationCenter().k(ls.d2, Integer.valueOf(i10));
                break;
            case 5:
                a0.h hVar = ysVar.c;
                ArrayList arrayList = ysVar.a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    gj gjVar = (gj) arrayList.get(i11);
                    if (gjVar.J && Math.abs(gjVar.e1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(gj.B0(gjVar.k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(gj.B0(gjVar.k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(gjVar.e1()));
                        ysVar.getMessagesStorage().E(arrayList2, gj.B0(gjVar.k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    ysVar.Z(false);
                    break;
                }
                break;
            case 6:
                ysVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                ysVar.M(hVar2, false);
                break;
            case 7:
                if (s2.a) {
                    a8.b("set last online from other device = " + i10);
                }
                ysVar.M = i10;
                break;
            default:
                ysVar.n(i10);
                break;
        }
    }
}
