package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ kt a;

    public /* synthetic */ gt(kt ktVar) {
        this.a = ktVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        kt ktVar = this.a;
        nt ntVar = ktVar.v3;
        ArrayList arrayList = ktVar.m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.n3;
            if (i13 >= jtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                ktVar.e3 = true;
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

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        kt ktVar = this.a;
        ArrayList arrayList = ktVar.j3;
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
        ktVar.g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
