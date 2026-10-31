package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ int c;

    public /* synthetic */ gt(ot otVar, int i10, int i11) {
        this.a = i11;
        this.b = otVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        ot otVar = this.b;
        switch (i10) {
            case 0:
                zs.e().k(zs.G4, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(zs.d2, Integer.valueOf(i11));
                break;
            case 1:
                zs.e().k(zs.G4, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(zs.d2, Integer.valueOf(i11));
                break;
            case 2:
                zs.e().k(zs.G4, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(zs.d2, Integer.valueOf(i11));
                break;
            case 3:
                zs.e().k(zs.G4, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(zs.d2, Integer.valueOf(i11));
                break;
            case 4:
                if (otVar.I == 0) {
                    otVar.w.clear();
                    zs.e().k(zs.d4, new Object[0]);
                }
                zs.e().k(zs.G4, Integer.valueOf(otVar.currentAccount));
                otVar.getNotificationCenter().k(zs.d2, Integer.valueOf(i11));
                break;
            case 5:
                a0.h hVar = otVar.c;
                ArrayList arrayList = otVar.a;
                int i12 = 0;
                boolean z10 = false;
                while (i12 < arrayList.size()) {
                    jj jjVar = (jj) arrayList.get(i12);
                    if (jjVar.J && Math.abs(jjVar.f1()) == i11) {
                        arrayList.remove(i12);
                        SparseArray sparseArray = (SparseArray) hVar.f(jj.B0(jjVar.k));
                        if (sparseArray != null) {
                            sparseArray.remove(jjVar.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar.l(jj.B0(jjVar.k));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(jjVar.f1()));
                        otVar.getMessagesStorage().E(arrayList2, jj.B0(jjVar.k));
                        i12--;
                        z10 = true;
                    }
                    i12++;
                }
                if (z10) {
                    otVar.Z(false);
                    break;
                }
                break;
            case 6:
                otVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(e9.s.q(Integer.valueOf(i11)), 0L);
                otVar.M(hVar2, false);
                break;
            case 7:
                if (v2.a) {
                    f8.b("set last online from other device = " + i11);
                }
                otVar.L = i11;
                break;
            default:
                otVar.n(i11);
                break;
        }
    }
}
