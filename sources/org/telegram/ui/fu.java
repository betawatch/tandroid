package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.ui.Components.tl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ju a;

    public /* synthetic */ fu(ju juVar) {
        this.a = juVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.a;
        nu nuVar = juVar.m3;
        ArrayList arrayList = juVar.d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.e3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                juVar.V2 = true;
                juVar.A1();
                juVar.B1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public int run() {
        ju juVar = this.a;
        ArrayList arrayList = juVar.a3;
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
        juVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
