package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ xj(vp vpVar, a0.h hVar, a0.h hVar2, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = hVar;
        this.d = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                vp vpVar = this.b;
                a0.h hVar = this.c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i10 = 0;
                    for (int m10 = hVar.m(); i10 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i10);
                        vpVar.a0(arrayList2, null, null, hVar.j(i10), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i10++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    Object[] objArr = SecretMediaViewer.g() && SecretMediaViewer.f().s;
                    jj jjVar = objArr != false ? SecretMediaViewer.f().f0 : null;
                    int m11 = hVar3.m();
                    int i11 = 0;
                    while (i11 < m11) {
                        long j10 = hVar3.j(i11);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i11);
                        if (objArr == true && jjVar != null && jjVar.I1 == vpVar.currentAccount && jj.B0(jjVar.k) == j10 && arrayList3.contains(Integer.valueOf(jjVar.f1()))) {
                            int f12 = jjVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            jjVar.G0 = true;
                            long V = vpVar.V(f12, j10);
                            z10 = z11;
                            arrayList = arrayList3;
                            vp vpVar2 = vpVar;
                            vpVar = vpVar2;
                            SecretMediaViewer.f().n1 = new fk(f12, V, j10, vpVar2);
                            zs notificationCenter = vpVar.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z10 ? 1 : 0] = jjVar.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z10 = z11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            hs messagesStorage = vpVar.getMessagesStorage();
                            messagesStorage.a.c(new tr(messagesStorage, arrayList, j10, 1));
                        }
                        i11++;
                        z11 = z10;
                    }
                }
                Utilities.d.c(new xj(vpVar, hVar, hVar3, 3));
                break;
            case 1:
                vp vpVar3 = this.b;
                a0.h hVar4 = this.c;
                a0.h hVar5 = this.d;
                vpVar3.W = hVar4;
                vpVar3.X = hVar5;
                break;
            case 2:
                vp vpVar4 = this.b;
                a0.h hVar6 = this.c;
                a0.h hVar7 = this.d;
                vpVar4.T1 = true;
                hs messagesStorage2 = vpVar4.getMessagesStorage();
                messagesStorage2.a.c(new kg(messagesStorage2, hVar6, hVar7, 17));
                break;
            default:
                vp vpVar5 = this.b;
                Utilities.d.c(new xj(vpVar5, this.c, this.d, 2));
                vpVar5.U1 = 0;
                vpVar5.V1 = null;
                vpVar5.W1 = null;
                break;
        }
    }
}
