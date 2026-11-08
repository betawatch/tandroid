package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ us(dt dtVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = dtVar;
        this.c = j3;
        this.d = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        int i7;
        boolean z10;
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                a0.h hVar = dtVar.c;
                ArrayList arrayList = dtVar.a;
                a0.h hVar2 = dtVar.E;
                long j3 = this.c;
                ct ctVar = (ct) hVar2.f(j3);
                int i10 = this.d;
                if (ctVar != null) {
                    HashMap hashMap = ctVar.c;
                    hashMap.remove(Integer.valueOf(i10));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j3);
                        dtVar.D.remove(ctVar);
                        yr messagesStorage = dtVar.getMessagesStorage();
                        messagesStorage.a.c(new xp(messagesStorage, j3, 4));
                        z9 = true;
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            ij ijVar = (ij) arrayList.get(i7);
                            if (ijVar != null && ijVar.N && ijVar.f1() == i10) {
                                arrayList.remove(i7);
                                i7--;
                                SparseArray sparseArray = (SparseArray) hVar.f(ij.B0(ijVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(ijVar.f1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(ij.B0(ijVar.k));
                                }
                                z9 = true;
                            }
                            i7++;
                        }
                        if (!z9) {
                            dtVar.Z(false);
                            break;
                        }
                    } else {
                        yr messagesStorage2 = dtVar.getMessagesStorage();
                        messagesStorage2.a.c(new zq(5, messagesStorage2, ctVar));
                    }
                }
                z9 = false;
                i7 = 0;
                while (i7 < arrayList.size()) {
                }
                if (!z9) {
                }
                break;
            default:
                dt dtVar2 = this.b;
                a0.h hVar3 = dtVar2.c;
                ArrayList arrayList2 = dtVar2.a;
                a0.h hVar4 = dtVar2.E;
                long j10 = this.c;
                ct ctVar2 = (ct) hVar4.f(j10);
                if (ctVar2 != null) {
                    hVar4.l(j10);
                    dtVar2.D.remove(ctVar2);
                    yr messagesStorage3 = dtVar2.getMessagesStorage();
                    messagesStorage3.a.c(new xp(messagesStorage3, j10, 4));
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    ij ijVar2 = (ij) arrayList2.get(i11);
                    if (ijVar2 != null && ijVar2.N && ijVar2.f1() <= this.d) {
                        arrayList2.remove(i11);
                        i11--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(ij.B0(ijVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(ijVar2.f1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(ij.B0(ijVar2.k));
                        }
                        z10 = true;
                    }
                    i11++;
                }
                if (z10) {
                    dtVar2.Z(false);
                    dtVar2.d0();
                    break;
                }
                break;
        }
    }
}
