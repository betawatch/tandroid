package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ls(us usVar, long j10, int i3, int i10) {
        this.a = i10;
        this.b = usVar;
        this.c = j10;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i3;
        boolean z11;
        switch (this.a) {
            case 0:
                us usVar = this.b;
                a0.h hVar = usVar.c;
                ArrayList arrayList = usVar.a;
                a0.h hVar2 = usVar.F;
                long j10 = this.c;
                ts tsVar = (ts) hVar2.f(j10);
                int i10 = this.d;
                if (tsVar != null) {
                    HashMap hashMap = tsVar.c;
                    hashMap.remove(Integer.valueOf(i10));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j10);
                        usVar.E.remove(tsVar);
                        qr messagesStorage = usVar.getMessagesStorage();
                        messagesStorage.a.c(new op(messagesStorage, j10, 4));
                        z10 = true;
                        i3 = 0;
                        while (i3 < arrayList.size()) {
                            zi ziVar = (zi) arrayList.get(i3);
                            if (ziVar != null && ziVar.N && ziVar.f1() == i10) {
                                arrayList.remove(i3);
                                i3--;
                                SparseArray sparseArray = (SparseArray) hVar.f(zi.B0(ziVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(ziVar.f1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(zi.B0(ziVar.k));
                                }
                                z10 = true;
                            }
                            i3++;
                        }
                        if (!z10) {
                            usVar.Z(false);
                            break;
                        }
                    } else {
                        qr messagesStorage2 = usVar.getMessagesStorage();
                        messagesStorage2.a.c(new pq(5, messagesStorage2, tsVar));
                    }
                }
                z10 = false;
                i3 = 0;
                while (i3 < arrayList.size()) {
                }
                if (!z10) {
                }
                break;
            default:
                us usVar2 = this.b;
                a0.h hVar3 = usVar2.c;
                ArrayList arrayList2 = usVar2.a;
                a0.h hVar4 = usVar2.F;
                long j11 = this.c;
                ts tsVar2 = (ts) hVar4.f(j11);
                if (tsVar2 != null) {
                    hVar4.l(j11);
                    usVar2.E.remove(tsVar2);
                    qr messagesStorage3 = usVar2.getMessagesStorage();
                    messagesStorage3.a.c(new op(messagesStorage3, j11, 4));
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    zi ziVar2 = (zi) arrayList2.get(i11);
                    if (ziVar2 != null && ziVar2.N && ziVar2.f1() <= this.d) {
                        arrayList2.remove(i11);
                        i11--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(zi.B0(ziVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(ziVar2.f1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(zi.B0(ziVar2.k));
                        }
                        z11 = true;
                    }
                    i11++;
                }
                if (z11) {
                    usVar2.Z(false);
                    usVar2.d0();
                    break;
                }
                break;
        }
    }
}
