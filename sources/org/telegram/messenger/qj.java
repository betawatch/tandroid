package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ a0.h c;
    public final /* synthetic */ a0.h d;

    public /* synthetic */ qj(np npVar, a0.h hVar, a0.h hVar2, int i7) {
        this.a = i7;
        this.b = npVar;
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
                np npVar = this.b;
                a0.h hVar = this.c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i7 = 0;
                    for (int m10 = hVar.m(); i7 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i7);
                        npVar.a0(arrayList2, null, null, hVar.j(i7), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    Object[] objArr = SecretMediaViewer.g() && SecretMediaViewer.f().s;
                    gj gjVar = objArr != false ? SecretMediaViewer.f().g0 : null;
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j3 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (objArr == true && gjVar != null && gjVar.K1 == npVar.currentAccount && gj.B0(gjVar.k) == j3 && arrayList3.contains(Integer.valueOf(gjVar.e1()))) {
                            int e12 = gjVar.e1();
                            arrayList3.remove(Integer.valueOf(e12));
                            gjVar.I0 = true;
                            long V = npVar.V(e12, j3);
                            z10 = z11;
                            arrayList = arrayList3;
                            np npVar2 = npVar;
                            npVar = npVar2;
                            SecretMediaViewer.f().o1 = new vj(e12, V, j3, npVar2);
                            ls notificationCenter = npVar.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z10 ? 1 : 0] = gjVar.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z10 = z11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            ur messagesStorage = npVar.getMessagesStorage();
                            messagesStorage.a.c(new hr(messagesStorage, arrayList, j3, 2));
                        }
                        i10++;
                        z11 = z10;
                    }
                }
                Utilities.d.c(new qj(npVar, hVar, hVar3, 3));
                break;
            case 1:
                np npVar3 = this.b;
                a0.h hVar4 = this.c;
                a0.h hVar5 = this.d;
                npVar3.X = hVar4;
                npVar3.Y = hVar5;
                break;
            case 2:
                np npVar4 = this.b;
                a0.h hVar6 = this.c;
                a0.h hVar7 = this.d;
                npVar4.W1 = true;
                ur messagesStorage2 = npVar4.getMessagesStorage();
                messagesStorage2.a.c(new lg(messagesStorage2, hVar6, hVar7, 17));
                break;
            default:
                np npVar5 = this.b;
                Utilities.d.c(new qj(npVar5, this.c, this.d, 2));
                npVar5.X1 = 0;
                npVar5.Y1 = null;
                npVar5.Z1 = null;
                break;
        }
    }
}
