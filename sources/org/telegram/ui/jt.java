package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements org.telegram.ui.Components.lj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ mt a;

    public /* synthetic */ jt(mt mtVar) {
        this.a = mtVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        mt mtVar = this.a;
        pt ptVar = mtVar.w3;
        ArrayList arrayList = mtVar.n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            lt[] ltVarArr = mtVar.o3;
            if (i13 >= ltVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i12).l(2);
                mtVar.f3 = true;
                mtVar.C1();
                mtVar.D1(true);
                return;
            }
            lt ltVar = ltVarArr[i13];
            if (ltVar.c > 0) {
                arrayList.add(Integer.valueOf(ltVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public int run() {
        mt mtVar = this.a;
        ArrayList arrayList = mtVar.k3;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((ht) arrayList.get(i7)).a == 5) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            return -1;
        }
        mtVar.h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
