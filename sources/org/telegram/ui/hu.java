package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ lu a;

    public /* synthetic */ hu(lu luVar) {
        this.a = luVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        lu luVar = this.a;
        pu puVar = luVar.k3;
        ArrayList arrayList = luVar.b3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            ku[] kuVarArr = luVar.c3;
            if (i14 >= kuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.o2) puVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                luVar.T2 = true;
                luVar.z1();
                luVar.A1(true);
                return;
            }
            ku kuVar = kuVarArr[i14];
            if (kuVar.c > 0) {
                arrayList.add(Integer.valueOf(kuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public int run() {
        lu luVar = this.a;
        ArrayList arrayList = luVar.Y2;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((gu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        luVar.V2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
