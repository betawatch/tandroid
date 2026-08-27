package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements org.telegram.ui.Components.mk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ nu a;

    public /* synthetic */ ju(nu nuVar) {
        this.a = nuVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        nu nuVar = this.a;
        ru ruVar = nuVar.k3;
        ArrayList arrayList = nuVar.b3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            mu[] muVarArr = nuVar.c3;
            if (i14 >= muVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) ruVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) ruVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) ruVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                nuVar.T2 = true;
                nuVar.z1();
                nuVar.A1(true);
                return;
            }
            mu muVar = muVarArr[i14];
            if (muVar.c > 0) {
                arrayList.add(Integer.valueOf(muVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.mk0
    public int run() {
        nu nuVar = this.a;
        ArrayList arrayList = nuVar.Y2;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((iu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        nuVar.V2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
