package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;
    public final /* synthetic */ int c;

    public /* synthetic */ us(at atVar, int i7, int i10) {
        this.a = i10;
        this.b = atVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        at atVar = this.b;
        switch (i7) {
            case 0:
                ns.e().k(ns.G4, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(ns.d2, Integer.valueOf(i10));
                break;
            case 1:
                ns.e().k(ns.G4, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(ns.d2, Integer.valueOf(i10));
                break;
            case 2:
                ns.e().k(ns.G4, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(ns.d2, Integer.valueOf(i10));
                break;
            case 3:
                ns.e().k(ns.G4, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(ns.d2, Integer.valueOf(i10));
                break;
            case 4:
                if (atVar.J == 0) {
                    atVar.w.clear();
                    ns.e().k(ns.d4, new Object[0]);
                }
                ns.e().k(ns.G4, Integer.valueOf(atVar.currentAccount));
                atVar.getNotificationCenter().k(ns.d2, Integer.valueOf(i10));
                break;
            case 5:
                a0.h hVar = atVar.c;
                ArrayList arrayList = atVar.a;
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
                        atVar.getMessagesStorage().E(arrayList2, gj.B0(gjVar.k));
                        i11--;
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    atVar.Z(false);
                    break;
                }
                break;
            case 6:
                atVar.getClass();
                a0.h hVar2 = new a0.h();
                hVar2.k(h9.o.r(Integer.valueOf(i10)), 0L);
                atVar.M(hVar2, false);
                break;
            case 7:
                if (r2.a) {
                    a8.b("set last online from other device = " + i10);
                }
                atVar.M = i10;
                break;
            default:
                atVar.n(i10);
                break;
        }
    }
}
