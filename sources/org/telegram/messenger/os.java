package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ os(xs xsVar, long j3, int i7, int i10) {
        this.a = i10;
        this.b = xsVar;
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
                xs xsVar = this.b;
                a0.h hVar = xsVar.c;
                ArrayList arrayList = xsVar.a;
                a0.h hVar2 = xsVar.F;
                long j3 = this.c;
                ws wsVar = (ws) hVar2.f(j3);
                int i10 = this.d;
                if (wsVar != null) {
                    HashMap hashMap = wsVar.c;
                    hashMap.remove(Integer.valueOf(i10));
                    if (hashMap.isEmpty()) {
                        hVar2.l(j3);
                        xsVar.E.remove(wsVar);
                        tr messagesStorage = xsVar.getMessagesStorage();
                        messagesStorage.a.c(new pp(messagesStorage, j3, 4));
                        z10 = true;
                        i7 = 0;
                        while (i7 < arrayList.size()) {
                            fj fjVar = (fj) arrayList.get(i7);
                            if (fjVar != null && fjVar.N && fjVar.e1() == i10) {
                                arrayList.remove(i7);
                                i7--;
                                SparseArray sparseArray = (SparseArray) hVar.f(fj.B0(fjVar.k));
                                if (sparseArray != null) {
                                    sparseArray.remove(fjVar.e1());
                                }
                                if (sparseArray != null && sparseArray.size() <= 0) {
                                    hVar.l(fj.B0(fjVar.k));
                                }
                                z10 = true;
                            }
                            i7++;
                        }
                        if (!z10) {
                            xsVar.Z(false);
                            break;
                        }
                    } else {
                        tr messagesStorage2 = xsVar.getMessagesStorage();
                        messagesStorage2.a.c(new rq(9, messagesStorage2, wsVar));
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
                xs xsVar2 = this.b;
                a0.h hVar3 = xsVar2.c;
                ArrayList arrayList2 = xsVar2.a;
                a0.h hVar4 = xsVar2.F;
                long j10 = this.c;
                ws wsVar2 = (ws) hVar4.f(j10);
                if (wsVar2 != null) {
                    hVar4.l(j10);
                    xsVar2.E.remove(wsVar2);
                    tr messagesStorage3 = xsVar2.getMessagesStorage();
                    messagesStorage3.a.c(new pp(messagesStorage3, j10, 4));
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    fj fjVar2 = (fj) arrayList2.get(i11);
                    if (fjVar2 != null && fjVar2.N && fjVar2.e1() <= this.d) {
                        arrayList2.remove(i11);
                        i11--;
                        SparseArray sparseArray2 = (SparseArray) hVar3.f(fj.B0(fjVar2.k));
                        if (sparseArray2 != null) {
                            sparseArray2.remove(fjVar2.e1());
                        }
                        if (sparseArray2 != null && sparseArray2.size() <= 0) {
                            hVar3.l(fj.B0(fjVar2.k));
                        }
                        z11 = true;
                    }
                    i11++;
                }
                if (z11) {
                    xsVar2.Z(false);
                    xsVar2.d0();
                    break;
                }
                break;
        }
    }
}
