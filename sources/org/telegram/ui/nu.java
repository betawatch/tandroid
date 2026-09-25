package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements org.telegram.ui.Components.hl0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ ru a;

    public /* synthetic */ nu(ru ruVar) {
        this.a = ruVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ru ruVar = this.a;
        vu vuVar = ruVar.o3;
        ArrayList arrayList = ruVar.f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            qu[] quVarArr = ruVar.g3;
            if (i14 >= quVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                ruVar.X2 = true;
                ruVar.z1();
                ruVar.A1(true);
                return;
            }
            qu quVar = quVarArr[i14];
            if (quVar.c > 0) {
                arrayList.add(Integer.valueOf(quVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.hl0
    public int run() {
        ru ruVar = this.a;
        ArrayList arrayList = ruVar.c3;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((mu) arrayList.get(i10)).a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        ruVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
