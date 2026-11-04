package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ kj(hp hpVar, a0.h hVar, a0.h hVar2, int i3) {
        this.a = i3;
        this.b = hpVar;
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
                hp hpVar = this.b;
                a0.h hVar = this.c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i3 = 0;
                    for (int m10 = hVar.m(); i3 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i3);
                        hpVar.a0(arrayList2, null, null, hVar.j(i3), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i3++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    Object[] objArr = SecretMediaViewer.g() && SecretMediaViewer.f().s;
                    zi ziVar = objArr != false ? SecretMediaViewer.f().g0 : null;
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j10 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (objArr == true && ziVar != null && ziVar.I1 == hpVar.currentAccount && zi.B0(ziVar.k) == j10 && arrayList3.contains(Integer.valueOf(ziVar.f1()))) {
                            int f12 = ziVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            ziVar.G0 = true;
                            long V = hpVar.V(f12, j10);
                            z10 = z11;
                            arrayList = arrayList3;
                            hp hpVar2 = hpVar;
                            hpVar = hpVar2;
                            SecretMediaViewer.f().o1 = new mk(f12, V, j10, hpVar2);
                            hs notificationCenter = hpVar.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z10 ? 1 : 0] = ziVar.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z10 = z11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            qr messagesStorage = hpVar.getMessagesStorage();
                            messagesStorage.a.c(new dr(messagesStorage, arrayList, j10, 1));
                        }
                        i10++;
                        z11 = z10;
                    }
                }
                Utilities.d.c(new kj(hpVar, hVar, hVar3, 3));
                break;
            case 1:
                hp hpVar3 = this.b;
                a0.h hVar4 = this.c;
                a0.h hVar5 = this.d;
                hpVar3.X = hVar4;
                hpVar3.Y = hVar5;
                break;
            case 2:
                hp hpVar4 = this.b;
                a0.h hVar6 = this.c;
                a0.h hVar7 = this.d;
                hpVar4.U1 = true;
                qr messagesStorage2 = hpVar4.getMessagesStorage();
                messagesStorage2.a.c(new dg(messagesStorage2, hVar6, hVar7, 17));
                break;
            default:
                hp hpVar5 = this.b;
                Utilities.d.c(new kj(hpVar5, this.c, this.d, 2));
                hpVar5.V1 = 0;
                hpVar5.W1 = null;
                hpVar5.X1 = null;
                break;
        }
    }
}
