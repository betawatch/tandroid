package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements org.telegram.ui.Components.xk0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ su a;

    public /* synthetic */ ou(su suVar) {
        this.a = suVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        su suVar = this.a;
        wu wuVar = suVar.o3;
        ArrayList arrayList = suVar.f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            ru[] ruVarArr = suVar.g3;
            if (i14 >= ruVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                suVar.X2 = true;
                suVar.z1();
                suVar.A1(true);
                return;
            }
            ru ruVar = ruVarArr[i14];
            if (ruVar.c > 0) {
                arrayList.add(Integer.valueOf(ruVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public int run() {
        su suVar = this.a;
        ArrayList arrayList = suVar.c3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((nu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        suVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
