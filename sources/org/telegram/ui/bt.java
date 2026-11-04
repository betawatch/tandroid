package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ et a;

    public /* synthetic */ bt(et etVar) {
        this.a = etVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11;
        int i12;
        et etVar = this.a;
        ht htVar = etVar.w3;
        ArrayList arrayList = etVar.n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            dt[] dtVarArr = etVar.o3;
            if (i13 >= dtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i12).l(2);
                etVar.f3 = true;
                etVar.C1();
                etVar.D1(true);
                return;
            }
            dt dtVar = dtVarArr[i13];
            if (dtVar.c > 0) {
                arrayList.add(Integer.valueOf(dtVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public int run() {
        et etVar = this.a;
        ArrayList arrayList = etVar.k3;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                i3 = -1;
                break;
            }
            if (((at) arrayList.get(i3)).a == 5) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            return -1;
        }
        etVar.h3.h1(i3, org.telegram.messenger.g0.L(60.0f));
        return i3;
    }
}
