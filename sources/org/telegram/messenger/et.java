package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class et implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ et(pt ptVar, long j10, int i10, int i11) {
        this.a = i11;
        this.b = ptVar;
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
                pt ptVar = this.b;
                a0.h hVar = ptVar.c;
                ArrayList arrayList = ptVar.a;
                a0.h hVar2 = ptVar.E;
                long j10 = this.c;
                ot otVar = (ot) hVar2.f(j10);
                int i11 = this.d;
                if (otVar != null) {
                    HashMap hashMap = otVar.c;
                    hashMap.remove(Integer.valueOf(i11));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j10);
                        ptVar.D.remove(otVar);
                        is messagesStorage = ptVar.getMessagesStorage();
                        messagesStorage.a.c(new dq(messagesStorage, j10, 4));
                        z10 = true;
                        i10 = 0;
                        while (i10 < arrayList.size()) {
                            kj kjVar = (kj) arrayList.get(i10);
                            if (kjVar != null && kjVar.N && kjVar.f1() == i11) {
                                arrayList.remove(i10);
                                i10--;
                                SparseArray sparseArray = (SparseArray) hVar.f(kj.B0(kjVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(kjVar.f1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(kj.B0(kjVar.k));
                                }
                                z10 = true;
                            }
                            i10++;
                        }
                        if (!z10) {
                            ptVar.Z(false);
                            break;
                        }
                    } else {
                        is messagesStorage2 = ptVar.getMessagesStorage();
                        messagesStorage2.a.c(new ir(4, messagesStorage2, otVar));
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
                pt ptVar2 = this.b;
                a0.h hVar3 = ptVar2.c;
                ArrayList arrayList2 = ptVar2.a;
                a0.h hVar4 = ptVar2.E;
                long j11 = this.c;
                ot otVar2 = (ot) hVar4.f(j11);
                if (otVar2 != null) {
                    hVar4.l(j11);
                    ptVar2.D.remove(otVar2);
                    is messagesStorage3 = ptVar2.getMessagesStorage();
                    messagesStorage3.a.c(new dq(messagesStorage3, j11, 4));
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    kj kjVar2 = (kj) arrayList2.get(i12);
                    if (kjVar2 != null && kjVar2.N && kjVar2.f1() <= this.d) {
                        arrayList2.remove(i12);
                        i12--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(kj.B0(kjVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(kjVar2.f1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(kj.B0(kjVar2.k));
                        }
                        z11 = true;
                    }
                    i12++;
                }
                if (z11) {
                    ptVar2.Z(false);
                    ptVar2.d0();
                    break;
                }
                break;
        }
    }
}
