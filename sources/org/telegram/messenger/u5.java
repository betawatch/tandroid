package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ ij d;

    public /* synthetic */ u5(z5 z5Var, TLRPC.Document document, ij ijVar, int i7) {
        this.a = i7;
        this.b = z5Var;
        this.c = document;
        this.d = ijVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ij ijVar;
        TLRPC.Document document;
        boolean z9;
        boolean z10;
        TLRPC.Document F0;
        TLRPC.Document F02;
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                ArrayList arrayList = z5Var.H;
                ArrayList arrayList2 = z5Var.G;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (((ij) arrayList2.get(i7)).F0() != null) {
                        long j3 = ((ij) arrayList2.get(i7)).F0().id;
                        TLRPC.Document document2 = this.c;
                        if (j3 == document2.id) {
                            arrayList2.remove(i7);
                            int i10 = 0;
                            while (true) {
                                int size = arrayList.size();
                                ijVar = this.d;
                                if (i10 >= size) {
                                    arrayList.add(0, ijVar);
                                    z5Var.I.put(ijVar.f1(), ijVar);
                                    m.f3 f3Var = z5Var.S;
                                    g0.r(f3Var);
                                    g0.i3(f3Var, 60000L);
                                } else if (((ij) arrayList.get(i10)).F0() == null || ((ij) arrayList.get(i10)).F0().id != document2.id) {
                                    i10++;
                                }
                            }
                            z5Var.getNotificationCenter().k(qs.b5, new Object[0]);
                            z5Var.getMessagesStorage().a.c(new v5(z5Var, ijVar, 0));
                            break;
                        }
                    }
                }
                break;
            default:
                z5 z5Var2 = this.b;
                ArrayList arrayList3 = z5Var2.H;
                ArrayList arrayList4 = z5Var2.G;
                int i11 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    document = this.c;
                    z9 = true;
                    if (i11 < size2) {
                        ij ijVar2 = (ij) arrayList3.get(i11);
                        if (ijVar2 == null || (F02 = ijVar2.F0()) == null || F02.id != document.id) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        ij ijVar3 = (ij) arrayList4.get(i12);
                        if (ijVar3 != null && (F0 = ijVar3.F0()) != null && F0.id == document.id) {
                            if (!z9) {
                                ij ijVar4 = this.d;
                                arrayList4.add(0, ijVar4);
                                z5Var2.getMessagesStorage().a.c(new v5(z5Var2, ijVar4, 1));
                            }
                            z5Var2.getNotificationCenter().k(qs.b5, new Object[0]);
                            break;
                        }
                    }
                }
                z9 = z10;
                if (!z9) {
                }
                z5Var2.getNotificationCenter().k(qs.b5, new Object[0]);
                break;
        }
    }
}
