package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ps implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ps(ys ysVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = ysVar;
        this.c = j3;
        this.d = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        boolean z11;
        switch (this.a) {
            case 0:
                ys ysVar = this.b;
                a0.h hVar = ysVar.c;
                ArrayList arrayList = ysVar.a;
                a0.h hVar2 = ysVar.F;
                long j3 = this.c;
                xs xsVar = (xs) hVar2.f(j3);
                int i10 = this.d;
                if (xsVar != null) {
                    HashMap hashMap = xsVar.c;
                    hashMap.remove(Integer.valueOf(i10));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j3);
                        ysVar.E.remove(xsVar);
                        ur messagesStorage = ysVar.getMessagesStorage();
                        messagesStorage.a.c(new qp(messagesStorage, j3, 4));
                        z10 = true;
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            gj gjVar = (gj) arrayList.get(i7);
                            if (gjVar != null && gjVar.N && gjVar.e1() == i10) {
                                arrayList.remove(i7);
                                i7--;
                                SparseArray sparseArray = (SparseArray) hVar.f(gj.B0(gjVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(gjVar.e1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(gj.B0(gjVar.k));
                                }
                                z10 = true;
                            }
                            i7++;
                        }
                        if (!z10) {
                            ysVar.Z(false);
                            break;
                        }
                    } else {
                        ur messagesStorage2 = ysVar.getMessagesStorage();
                        messagesStorage2.a.c(new sq(9, messagesStorage2, xsVar));
                    }
                }
                z10 = false;
                i7 = 0;
                while (i7 < arrayList.size()) {
                }
                if (!z10) {
                }
                break;
            default:
                ys ysVar2 = this.b;
                a0.h hVar3 = ysVar2.c;
                ArrayList arrayList2 = ysVar2.a;
                a0.h hVar4 = ysVar2.F;
                long j10 = this.c;
                xs xsVar2 = (xs) hVar4.f(j10);
                if (xsVar2 != null) {
                    hVar4.l(j10);
                    ysVar2.E.remove(xsVar2);
                    ur messagesStorage3 = ysVar2.getMessagesStorage();
                    messagesStorage3.a.c(new qp(messagesStorage3, j10, 4));
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    gj gjVar2 = (gj) arrayList2.get(i11);
                    if (gjVar2 != null && gjVar2.N && gjVar2.e1() <= this.d) {
                        arrayList2.remove(i11);
                        i11--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(gj.B0(gjVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(gjVar2.e1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(gj.B0(gjVar2.k));
                        }
                        z11 = true;
                    }
                    i11++;
                }
                if (z11) {
                    ysVar2.Z(false);
                    ysVar2.d0();
                    break;
                }
                break;
        }
    }
}
