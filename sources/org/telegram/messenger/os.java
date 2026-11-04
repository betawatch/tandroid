package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ int c;

    public /* synthetic */ os(us usVar, int i3, int i10) {
        this.a = i10;
        this.b = usVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.c;
        us usVar = this.b;
        switch (i3) {
            case 0:
                hs.e().k(hs.G4, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(hs.d2, Integer.valueOf(i10));
                break;
            case 1:
                hs.e().k(hs.G4, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(hs.d2, Integer.valueOf(i10));
                break;
            case 2:
                hs.e().k(hs.G4, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(hs.d2, Integer.valueOf(i10));
                break;
            case 3:
                hs.e().k(hs.G4, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(hs.d2, Integer.valueOf(i10));
                break;
            case 4:
                if (usVar.J == 0) {
                    usVar.w.clear();
                    hs.e().k(hs.d4, new Object[0]);
                }
                hs.e().k(hs.G4, Integer.valueOf(usVar.currentAccount));
                usVar.getNotificationCenter().k(hs.d2, Integer.valueOf(i10));
                break;
            case 5:
                a0.h hVar = usVar.c;
                ArrayList arrayList = usVar.a;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < arrayList.size()) {
                    zi ziVar = (zi) arrayList.get(i11);
                    if (ziVar.J && Math.abs(ziVar.f1()) == i10) {
                        arrayList.remove(i11);
                        SparseArray sparseArray = (SparseArray) hVar.f(zi.B0(ziVar.k));
                        if (sparseArray != null) {
                            sparseArray.remove(ziVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(zi.B0(ziVar.k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(ziVar.f1()));
                        usVar.getMessagesStorage().E(arrayList2, zi.B0(ziVar.k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    usVar.Z(false);
                    break;
                }
                break;
            case 6:
                usVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(g9.o.r(Integer.valueOf(i10)), 0L);
                usVar.M(hVar2, false);
                break;
            case 7:
                if (r2.a) {
                    a8.b("set last online from other device = " + i10);
                }
                usVar.M = i10;
                break;
            default:
                usVar.n(i10);
                break;
        }
    }
}
