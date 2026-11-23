package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ fj d;

    public /* synthetic */ v5(a6 a6Var, TLRPC.Document document, fj fjVar, int i7) {
        this.a = i7;
        this.b = a6Var;
        this.c = document;
        this.d = fjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fj fjVar;
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
                    if (((fj) arrayList2.get(i7)).F0() != null) {
                        long j3 = ((fj) arrayList2.get(i7)).F0().id;
                        TLRPC.Document document2 = this.c;
                        if (j3 == document2.id) {
                            arrayList2.remove(i7);
                            int i10 = 0;
                            while (true) {
                                int size = arrayList.size();
                                fjVar = this.d;
                                if (i10 >= size) {
                                    arrayList.add(0, fjVar);
                                    a6Var.J.put(fjVar.e1(), fjVar);
                                    i6.g gVar = a6Var.T;
                                    g0.r(gVar);
                                    g0.h3(gVar, 60000L);
                                } else if (((fj) arrayList.get(i10)).F0() == null || ((fj) arrayList.get(i10)).F0().id != document2.id) {
                                    i10++;
                                }
                            }
                            a6Var.getNotificationCenter().k(ks.e5, new Object[0]);
                            a6Var.getMessagesStorage().a.c(new w5(a6Var, fjVar, 0));
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
                        fj fjVar2 = (fj) arrayList3.get(i11);
                        if (fjVar2 == null || (F02 = fjVar2.F0()) == null || F02.id != document.id) {
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
                        fj fjVar3 = (fj) arrayList4.get(i12);
                        if (fjVar3 != null && (F0 = fjVar3.F0()) != null && F0.id == document.id) {
                            if (!z10) {
                                fj fjVar4 = this.d;
                                arrayList4.add(0, fjVar4);
                                a6Var2.getMessagesStorage().a.c(new w5(a6Var2, fjVar4, 1));
                            }
                            a6Var2.getNotificationCenter().k(ks.e5, new Object[0]);
                            break;
                        }
                    }
                }
                z10 = z11;
                if (!z10) {
                }
                a6Var2.getNotificationCenter().k(ks.e5, new Object[0]);
                break;
        }
    }
}
