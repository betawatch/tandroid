package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ ku a;

    public /* synthetic */ gu(ku kuVar) {
        this.a = kuVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ku kuVar = this.a;
        ou ouVar = kuVar.p3;
        ArrayList arrayList = kuVar.g3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            ju[] juVarArr = kuVar.h3;
            if (i14 >= juVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                kuVar.Y2 = true;
                kuVar.F1();
                kuVar.G1(true);
                return;
            }
            ju juVar = juVarArr[i14];
            if (juVar.c > 0) {
                arrayList.add(Integer.valueOf(juVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public int run() {
        ku kuVar = this.a;
        ArrayList arrayList = kuVar.d3;
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
        kuVar.a3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
