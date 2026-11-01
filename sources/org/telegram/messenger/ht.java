package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ht implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ int c;

    public /* synthetic */ ht(pt ptVar, int i10, int i11) {
        this.a = i11;
        this.b = ptVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        pt ptVar = this.b;
        switch (i10) {
            case 0:
                at.e().k(at.G4, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(at.d2, Integer.valueOf(i11));
                break;
            case 1:
                at.e().k(at.G4, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(at.d2, Integer.valueOf(i11));
                break;
            case 2:
                at.e().k(at.G4, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(at.d2, Integer.valueOf(i11));
                break;
            case 3:
                at.e().k(at.G4, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(at.d2, Integer.valueOf(i11));
                break;
            case 4:
                if (ptVar.I == 0) {
                    ptVar.w.clear();
                    at.e().k(at.d4, new Object[0]);
                }
                at.e().k(at.G4, Integer.valueOf(ptVar.currentAccount));
                ptVar.getNotificationCenter().k(at.d2, Integer.valueOf(i11));
                break;
            case 5:
                a0.h hVar = ptVar.c;
                ArrayList arrayList = ptVar.a;
                int i12 = 0;
                boolean z10 = false;
                while (i12 < arrayList.size()) {
                    kj kjVar = (kj) arrayList.get(i12);
                    if (kjVar.J && Math.abs(kjVar.f1()) == i11) {
                        arrayList.remove(i12);
                        SparseArray sparseArray = (SparseArray) hVar.f(kj.B0(kjVar.k));
                        if (sparseArray != null) {
                            sparseArray.remove(kjVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(kj.B0(kjVar.k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(kjVar.f1()));
                        ptVar.getMessagesStorage().E(arrayList2, kj.B0(kjVar.k));
                        i12--;
                        z10 = true;
                    }
                    i12++;
                }
                if (z10) {
                    ptVar.Z(false);
                    break;
                }
                break;
            case 6:
                ptVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(e9.s.q(Integer.valueOf(i11)), 0L);
                ptVar.M(hVar2, false);
                break;
            case 7:
                if (v2.a) {
                    f8.b("set last online from other device = " + i11);
                }
                ptVar.L = i11;
                break;
            default:
                ptVar.n(i11);
                break;
        }
    }
}
