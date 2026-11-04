package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ zi d;

    public /* synthetic */ u5(z5 z5Var, TLRPC.Document document, zi ziVar, int i3) {
        this.a = i3;
        this.b = z5Var;
        this.c = document;
        this.d = ziVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zi ziVar;
        TLRPC.Document document;
        boolean z10;
        boolean z11;
        TLRPC.Document F0;
        TLRPC.Document F02;
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                ArrayList arrayList = z5Var.I;
                ArrayList arrayList2 = z5Var.H;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((zi) arrayList2.get(i3)).F0() != null) {
                        long j10 = ((zi) arrayList2.get(i3)).F0().id;
                        TLRPC.Document document2 = this.c;
                        if (j10 == document2.id) {
                            arrayList2.remove(i3);
                            int i10 = 0;
                            while (true) {
                                int size = arrayList.size();
                                ziVar = this.d;
                                if (i10 >= size) {
                                    arrayList.add(0, ziVar);
                                    z5Var.J.put(ziVar.f1(), ziVar);
                                    mi.b0 b0Var = z5Var.T;
                                    g0.r(b0Var);
                                    g0.i3(b0Var, 60000L);
                                } else if (((zi) arrayList.get(i10)).F0() == null || ((zi) arrayList.get(i10)).F0().id != document2.id) {
                                    i10++;
                                }
                            }
                            z5Var.getNotificationCenter().k(hs.b5, new Object[0]);
                            z5Var.getMessagesStorage().a.c(new v5(z5Var, ziVar, 0));
                            break;
                        }
                    }
                }
                break;
            default:
                z5 z5Var2 = this.b;
                ArrayList arrayList3 = z5Var2.I;
                ArrayList arrayList4 = z5Var2.H;
                int i11 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    document = this.c;
                    z10 = true;
                    if (i11 < size2) {
                        zi ziVar2 = (zi) arrayList3.get(i11);
                        if (ziVar2 == null || (F02 = ziVar2.F0()) == null || F02.id != document.id) {
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
                        zi ziVar3 = (zi) arrayList4.get(i12);
                        if (ziVar3 != null && (F0 = ziVar3.F0()) != null && F0.id == document.id) {
                            if (!z10) {
                                zi ziVar4 = this.d;
                                arrayList4.add(0, ziVar4);
                                z5Var2.getMessagesStorage().a.c(new v5(z5Var2, ziVar4, 1));
                            }
                            z5Var2.getNotificationCenter().k(hs.b5, new Object[0]);
                            break;
                        }
                    }
                }
                z10 = z11;
                if (!z10) {
                }
                z5Var2.getNotificationCenter().k(hs.b5, new Object[0]);
                break;
        }
    }
}
