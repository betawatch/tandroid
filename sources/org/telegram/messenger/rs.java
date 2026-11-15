package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class rs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ rs(at atVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = atVar;
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
        boolean z10;
        int i7;
        boolean z11;
        switch (this.a) {
            case 0:
                at atVar = this.b;
                a0.h hVar = atVar.c;
                ArrayList arrayList = atVar.a;
                a0.h hVar2 = atVar.F;
                long j3 = this.c;
                zs zsVar = (zs) hVar2.f(j3);
                int i10 = this.d;
                if (zsVar != null) {
                    HashMap hashMap = zsVar.c;
                    hashMap.remove(Integer.valueOf(i10));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j3);
                        atVar.E.remove(zsVar);
                        vr messagesStorage = atVar.getMessagesStorage();
                        messagesStorage.a.c(new up(messagesStorage, j3, 4));
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
                            atVar.Z(false);
                            break;
                        }
                    } else {
                        vr messagesStorage2 = atVar.getMessagesStorage();
                        messagesStorage2.a.c(new wq(5, messagesStorage2, zsVar));
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
                at atVar2 = this.b;
                a0.h hVar3 = atVar2.c;
                ArrayList arrayList2 = atVar2.a;
                a0.h hVar4 = atVar2.F;
                long j10 = this.c;
                zs zsVar2 = (zs) hVar4.f(j10);
                if (zsVar2 != null) {
                    hVar4.l(j10);
                    atVar2.E.remove(zsVar2);
                    vr messagesStorage3 = atVar2.getMessagesStorage();
                    messagesStorage3.a.c(new up(messagesStorage3, j10, 4));
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
                    atVar2.Z(false);
                    atVar2.d0();
                    break;
                }
                break;
        }
    }
}
