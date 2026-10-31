package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ jj d;

    public /* synthetic */ w5(b6 b6Var, TLRPC.Document document, jj jjVar, int i10) {
        this.a = i10;
        this.b = b6Var;
        this.c = document;
        this.d = jjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        jj jjVar;
        TLRPC.Document document;
        boolean z10;
        boolean z11;
        TLRPC.Document F0;
        TLRPC.Document F02;
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                ArrayList arrayList = b6Var.H;
                ArrayList arrayList2 = b6Var.G;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((jj) arrayList2.get(i10)).F0() != null) {
                        long j10 = ((jj) arrayList2.get(i10)).F0().id;
                        TLRPC.Document document2 = this.c;
                        if (j10 == document2.id) {
                            arrayList2.remove(i10);
                            int i11 = 0;
                            while (true) {
                                int size = arrayList.size();
                                jjVar = this.d;
                                if (i11 >= size) {
                                    arrayList.add(0, jjVar);
                                    b6Var.I.put(jjVar.f1(), jjVar);
                                    mg.c2 c2Var = b6Var.S;
                                    i0.r(c2Var);
                                    i0.h3(c2Var, 60000L);
                                } else if (((jj) arrayList.get(i11)).F0() == null || ((jj) arrayList.get(i11)).F0().id != document2.id) {
                                    i11++;
                                }
                            }
                            b6Var.getNotificationCenter().k(zs.b5, new Object[0]);
                            b6Var.getMessagesStorage().a.c(new x5(b6Var, jjVar, 0));
                            break;
                        }
                    }
                }
                break;
            default:
                b6 b6Var2 = this.b;
                ArrayList arrayList3 = b6Var2.H;
                ArrayList arrayList4 = b6Var2.G;
                int i12 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    document = this.c;
                    z10 = true;
                    if (i12 < size2) {
                        jj jjVar2 = (jj) arrayList3.get(i12);
                        if (jjVar2 == null || (F02 = jjVar2.F0()) == null || F02.id != document.id) {
                            i12++;
                        } else {
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                        jj jjVar3 = (jj) arrayList4.get(i13);
                        if (jjVar3 != null && (F0 = jjVar3.F0()) != null && F0.id == document.id) {
                            if (!z10) {
                                jj jjVar4 = this.d;
                                arrayList4.add(0, jjVar4);
                                b6Var2.getMessagesStorage().a.c(new x5(b6Var2, jjVar4, 1));
                            }
                            b6Var2.getNotificationCenter().k(zs.b5, new Object[0]);
                            break;
                        }
                    }
                }
                z10 = z11;
                if (!z10) {
                }
                b6Var2.getNotificationCenter().k(zs.b5, new Object[0]);
                break;
        }
    }
}
