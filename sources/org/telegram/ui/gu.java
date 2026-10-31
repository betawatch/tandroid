package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.dk0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ ju a;

    public /* synthetic */ gu(ju juVar) {
        this.a = juVar;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.a;
        mu muVar = juVar.v3;
        ArrayList arrayList = juVar.m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.n3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i11).l(0);
                i12 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i12).l(1);
                i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i13).l(2);
                juVar.e3 = true;
                juVar.C1();
                juVar.D1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public int run() {
        ju juVar = this.a;
        ArrayList arrayList = juVar.j3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((fu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        juVar.g3.h1(i10, org.telegram.messenger.i0.L(60.0f));
        return i10;
    }
}
