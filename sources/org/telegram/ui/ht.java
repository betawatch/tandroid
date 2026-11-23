package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ht implements org.telegram.ui.Components.nj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ lt a;

    public /* synthetic */ ht(lt ltVar) {
        this.a = ltVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        lt ltVar = this.a;
        ot otVar = ltVar.w3;
        ArrayList arrayList = ltVar.n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            kt[] ktVarArr = ltVar.o3;
            if (i13 >= ktVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i12).l(2);
                ltVar.f3 = true;
                ltVar.C1();
                ltVar.D1(true);
                return;
            }
            kt ktVar = ktVarArr[i13];
            if (ktVar.c > 0) {
                arrayList.add(Integer.valueOf(ktVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.nj0
    public int run() {
        lt ltVar = this.a;
        ArrayList arrayList = ltVar.k3;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((gt) arrayList.get(i7)).a == 5) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            return -1;
        }
        ltVar.h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
