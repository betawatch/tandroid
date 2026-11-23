package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ pj(mp mpVar, a0.h hVar, a0.h hVar2, int i7) {
        this.a = i7;
        this.b = mpVar;
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
                mp mpVar = this.b;
                a0.h hVar = this.c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i7 = 0;
                    for (int m10 = hVar.m(); i7 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i7);
                        mpVar.a0(arrayList2, null, null, hVar.j(i7), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    Object[] objArr = SecretMediaViewer.g() && SecretMediaViewer.f().s;
                    fj fjVar = objArr != false ? SecretMediaViewer.f().g0 : null;
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j3 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (objArr == true && fjVar != null && fjVar.K1 == mpVar.currentAccount && fj.B0(fjVar.k) == j3 && arrayList3.contains(Integer.valueOf(fjVar.e1()))) {
                            int e12 = fjVar.e1();
                            arrayList3.remove(Integer.valueOf(e12));
                            fjVar.I0 = true;
                            long V = mpVar.V(e12, j3);
                            z10 = z11;
                            arrayList = arrayList3;
                            mp mpVar2 = mpVar;
                            mpVar = mpVar2;
                            SecretMediaViewer.f().o1 = new uj(e12, V, j3, mpVar2);
                            ks notificationCenter = mpVar.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z10 ? 1 : 0] = fjVar.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z10 = z11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            tr messagesStorage = mpVar.getMessagesStorage();
                            messagesStorage.a.c(new gr(messagesStorage, arrayList, j3, 2));
                        }
                        i10++;
                        z11 = z10;
                    }
                }
                Utilities.d.c(new pj(mpVar, hVar, hVar3, 3));
                break;
            case 1:
                mp mpVar3 = this.b;
                a0.h hVar4 = this.c;
                a0.h hVar5 = this.d;
                mpVar3.X = hVar4;
                mpVar3.Y = hVar5;
                break;
            case 2:
                mp mpVar4 = this.b;
                a0.h hVar6 = this.c;
                a0.h hVar7 = this.d;
                mpVar4.W1 = true;
                tr messagesStorage2 = mpVar4.getMessagesStorage();
                messagesStorage2.a.c(new kg(messagesStorage2, hVar6, hVar7, 17));
                break;
            default:
                mp mpVar5 = this.b;
                Utilities.d.c(new pj(mpVar5, this.c, this.d, 2));
                mpVar5.X1 = 0;
                mpVar5.Y1 = null;
                mpVar5.Z1 = null;
                break;
        }
    }
}
