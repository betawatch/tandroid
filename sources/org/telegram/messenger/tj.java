package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ tj(qp qpVar, a0.h hVar, a0.h hVar2, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = hVar;
        this.d = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        ArrayList arrayList;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                qp qpVar = this.b;
                a0.h hVar = this.c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i7 = 0;
                    for (int m10 = hVar.m(); i7 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i7);
                        qpVar.a0(arrayList2, null, null, hVar.j(i7), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    Object[] objArr = SecretMediaViewer.g() && SecretMediaViewer.f().s;
                    ij ijVar = objArr != false ? SecretMediaViewer.f().f0 : null;
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j3 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (objArr == true && ijVar != null && ijVar.I1 == qpVar.currentAccount && ij.B0(ijVar.k) == j3 && arrayList3.contains(Integer.valueOf(ijVar.f1()))) {
                            int f12 = ijVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            ijVar.G0 = true;
                            long V = qpVar.V(f12, j3);
                            z9 = z10;
                            arrayList = arrayList3;
                            qp qpVar2 = qpVar;
                            qpVar = qpVar2;
                            SecretMediaViewer.f().n1 = new wk(f12, V, j3, qpVar2);
                            qs notificationCenter = qpVar.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z9 ? 1 : 0] = ijVar.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z9 = z10;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            yr messagesStorage = qpVar.getMessagesStorage();
                            messagesStorage.a.c(new lr(messagesStorage, arrayList, j3, 1));
                        }
                        i10++;
                        z10 = z9;
                    }
                }
                Utilities.d.c(new tj(qpVar, hVar, hVar3, 3));
                break;
            case 1:
                qp qpVar3 = this.b;
                a0.h hVar4 = this.c;
                a0.h hVar5 = this.d;
                qpVar3.W = hVar4;
                qpVar3.X = hVar5;
                break;
            case 2:
                qp qpVar4 = this.b;
                a0.h hVar6 = this.c;
                a0.h hVar7 = this.d;
                qpVar4.T1 = true;
                yr messagesStorage2 = qpVar4.getMessagesStorage();
                messagesStorage2.a.c(new lg(messagesStorage2, hVar6, hVar7, 17));
                break;
            default:
                qp qpVar5 = this.b;
                Utilities.d.c(new tj(qpVar5, this.c, this.d, 2));
                qpVar5.U1 = 0;
                qpVar5.V1 = null;
                qpVar5.W1 = null;
                break;
        }
    }
}
