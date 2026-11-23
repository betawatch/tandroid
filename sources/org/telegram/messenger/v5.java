package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ gj d;

    public /* synthetic */ v5(a6 a6Var, TLRPC.Document document, gj gjVar, int i7) {
        this.a = i7;
        this.b = a6Var;
        this.c = document;
        this.d = gjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gj gjVar;
        TLRPC.Document document;
        boolean z10;
        boolean z11;
        TLRPC.Document F0;
        TLRPC.Document F02;
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                ArrayList arrayList = a6Var.I;
                ArrayList arrayList2 = a6Var.H;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (((gj) arrayList2.get(i7)).F0() != null) {
                        long j3 = ((gj) arrayList2.get(i7)).F0().id;
                        TLRPC.Document document2 = this.c;
                        if (j3 == document2.id) {
                            arrayList2.remove(i7);
                            int i10 = 0;
                            while (true) {
                                int size = arrayList.size();
                                gjVar = this.d;
                                if (i10 >= size) {
                                    arrayList.add(0, gjVar);
                                    a6Var.J.put(gjVar.e1(), gjVar);
                                    j6.o oVar = a6Var.T;
                                    g0.r(oVar);
                                    g0.h3(oVar, 60000L);
                                } else if (((gj) arrayList.get(i10)).F0() == null || ((gj) arrayList.get(i10)).F0().id != document2.id) {
                                    i10++;
                                }
                            }
                            a6Var.getNotificationCenter().k(ls.e5, new Object[0]);
                            a6Var.getMessagesStorage().a.c(new w5(a6Var, gjVar, 0));
                            break;
                        }
                    }
                }
                break;
            default:
                a6 a6Var2 = this.b;
                ArrayList arrayList3 = a6Var2.I;
                ArrayList arrayList4 = a6Var2.H;
                int i11 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    document = this.c;
                    z10 = true;
                    if (i11 < size2) {
                        gj gjVar2 = (gj) arrayList3.get(i11);
                        if (gjVar2 == null || (F02 = gjVar2.F0()) == null || F02.id != document.id) {
                            i11++;
                        } else {
                            z11 = true;
                        }
                    } else {
                        z11 = false;
                    }
                }
                if (!z11) {
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        gj gjVar3 = (gj) arrayList4.get(i12);
                        if (gjVar3 != null && (F0 = gjVar3.F0()) != null && F0.id == document.id) {
                            if (!z10) {
                                gj gjVar4 = this.d;
                                arrayList4.add(0, gjVar4);
                                a6Var2.getMessagesStorage().a.c(new w5(a6Var2, gjVar4, 1));
                            }
                            a6Var2.getNotificationCenter().k(ls.e5, new Object[0]);
                            break;
                        }
                    }
                }
                z10 = z11;
                if (!z10) {
                }
                a6Var2.getNotificationCenter().k(ls.e5, new Object[0]);
                break;
        }
    }
}
