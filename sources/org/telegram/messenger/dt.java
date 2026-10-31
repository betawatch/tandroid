package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ dt(ot otVar, long j10, int i10, int i11) {
        this.a = i11;
        this.b = otVar;
        this.c = j10;
        this.d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        switch (this.a) {
            case 0:
                ot otVar = this.b;
                a0.h hVar = otVar.c;
                ArrayList arrayList = otVar.a;
                a0.h hVar2 = otVar.E;
                long j10 = this.c;
                nt ntVar = (nt) hVar2.f(j10);
                int i11 = this.d;
                if (ntVar != null) {
                    HashMap hashMap = ntVar.c;
                    hashMap.remove(Integer.valueOf(i11));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j10);
                        otVar.D.remove(ntVar);
                        hs messagesStorage = otVar.getMessagesStorage();
                        messagesStorage.a.c(new cq(messagesStorage, j10, 4));
                        z10 = true;
                        i10 = 0;
                        while (i10 < arrayList.size()) {
                            jj jjVar = (jj) arrayList.get(i10);
                            if (jjVar != null && jjVar.N && jjVar.f1() == i11) {
                                arrayList.remove(i10);
                                i10--;
                                SparseArray sparseArray = (SparseArray) hVar.f(jj.B0(jjVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(jjVar.f1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(jj.B0(jjVar.k));
                                }
                                z10 = true;
                            }
                            i10++;
                        }
                        if (!z10) {
                            otVar.Z(false);
                            break;
                        }
                    } else {
                        hs messagesStorage2 = otVar.getMessagesStorage();
                        messagesStorage2.a.c(new hr(4, messagesStorage2, ntVar));
                    }
                }
                z10 = false;
                i10 = 0;
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                break;
            default:
                ot otVar2 = this.b;
                a0.h hVar3 = otVar2.c;
                ArrayList arrayList2 = otVar2.a;
                a0.h hVar4 = otVar2.E;
                long j11 = this.c;
                nt ntVar2 = (nt) hVar4.f(j11);
                if (ntVar2 != null) {
                    hVar4.l(j11);
                    otVar2.D.remove(ntVar2);
                    hs messagesStorage3 = otVar2.getMessagesStorage();
                    messagesStorage3.a.c(new cq(messagesStorage3, j11, 4));
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    jj jjVar2 = (jj) arrayList2.get(i12);
                    if (jjVar2 != null && jjVar2.N && jjVar2.f1() <= this.d) {
                        arrayList2.remove(i12);
                        i12--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(jj.B0(jjVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(jjVar2.f1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(jj.B0(jjVar2.k));
                        }
                        z11 = true;
                    }
                    i12++;
                }
                if (z11) {
                    otVar2.Z(false);
                    otVar2.d0();
                    break;
                }
                break;
        }
    }
}
