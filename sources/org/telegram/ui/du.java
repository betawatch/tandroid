package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements org.telegram.ui.Components.ul0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ hu a;

    public /* synthetic */ du(hu huVar) {
        this.a = huVar;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        hu huVar = this.a;
        lu luVar = huVar.m3;
        ArrayList arrayList = huVar.d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            gu[] guVarArr = huVar.e3;
            if (i14 >= guVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                huVar.V2 = true;
                huVar.A1();
                huVar.B1(true);
                return;
            }
            gu guVar = guVarArr[i14];
            if (guVar.c > 0) {
                arrayList.add(Integer.valueOf(guVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public int run() {
        hu huVar = this.a;
        ArrayList arrayList = huVar.a3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((cu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        huVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
