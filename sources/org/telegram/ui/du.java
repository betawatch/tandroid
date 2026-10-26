package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements org.telegram.ui.Components.wl0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ hu a;

    public /* synthetic */ du(hu huVar) {
        this.a = huVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        hu huVar = this.a;
        lu luVar = huVar.w3;
        ArrayList arrayList = huVar.n3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            gu[] guVarArr = huVar.o3;
            if (i14 >= guVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                huVar.f3 = true;
                huVar.F1();
                huVar.G1(true);
                return;
            }
            gu guVar = guVarArr[i14];
            if (guVar.c > 0) {
                arrayList.add(Integer.valueOf(guVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.wl0
    public int run() {
        hu huVar = this.a;
        ArrayList arrayList = huVar.k3;
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
        huVar.h3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
