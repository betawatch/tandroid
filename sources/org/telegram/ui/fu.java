package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ju a;

    public /* synthetic */ fu(ju juVar) {
        this.a = juVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.a;
        nu nuVar = juVar.w3;
        ArrayList arrayList = juVar.n3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.o3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                juVar.f3 = true;
                juVar.F1();
                juVar.G1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        ju juVar = this.a;
        ArrayList arrayList = juVar.k3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((eu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        juVar.h3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
