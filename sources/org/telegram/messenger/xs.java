package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ int c;

    public /* synthetic */ xs(dt dtVar, int i7, int i10) {
        this.a = i10;
        this.b = dtVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        dt dtVar = this.b;
        switch (i7) {
            case 0:
                qs.e().k(qs.G4, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(qs.d2, Integer.valueOf(i10));
                break;
            case 1:
                qs.e().k(qs.G4, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(qs.d2, Integer.valueOf(i10));
                break;
            case 2:
                qs.e().k(qs.G4, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(qs.d2, Integer.valueOf(i10));
                break;
            case 3:
                qs.e().k(qs.G4, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(qs.d2, Integer.valueOf(i10));
                break;
            case 4:
                if (dtVar.I == 0) {
                    dtVar.w.clear();
                    qs.e().k(qs.d4, new Object[0]);
                }
                qs.e().k(qs.G4, Integer.valueOf(dtVar.currentAccount));
                dtVar.getNotificationCenter().k(qs.d2, Integer.valueOf(i10));
                break;
            case 5:
                a0.h hVar = dtVar.c;
                ArrayList arrayList = dtVar.a;
                int i11 = 0;
                boolean z9 = false;
                while (i11 < arrayList.size()) {
                    ij ijVar = (ij) arrayList.get(i11);
                    if (ijVar.J && Math.abs(ijVar.f1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(ij.B0(ijVar.k));
                        if (sparseArray != null) {
                            sparseArray.remove(ijVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(ij.B0(ijVar.k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(ijVar.f1()));
                        dtVar.getMessagesStorage().E(arrayList2, ij.B0(ijVar.k));
                        i11--;
                        z9 = true;
                    }
                    i11++;
                }
                if (z9) {
                    dtVar.Z(false);
                    break;
                }
                break;
            case 6:
                dtVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                dtVar.M(hVar2, false);
                break;
            case 7:
                if (r2.a) {
                    a8.b("set last online from other device = " + i10);
                }
                dtVar.L = i10;
                break;
            default:
                dtVar.n(i10);
                break;
        }
    }
}
