package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ kt a;

    public /* synthetic */ gt(kt ktVar) {
        this.a = ktVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        kt ktVar = this.a;
        nt ntVar = ktVar.w3;
        ArrayList arrayList = ktVar.n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.o3;
            if (i13 >= jtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i12).l(2);
                ktVar.f3 = true;
                ktVar.C1();
                ktVar.D1(true);
                return;
            }
            jt jtVar = jtVarArr[i13];
            if (jtVar.c > 0) {
                arrayList.add(Integer.valueOf(jtVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public int run() {
        kt ktVar = this.a;
        ArrayList arrayList = ktVar.k3;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((ft) arrayList.get(i7)).a == 5) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            return -1;
        }
        ktVar.h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
