package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ku a;

    public /* synthetic */ gu(ku kuVar) {
        this.a = kuVar;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11;
        int i12;
        ku kuVar = this.a;
        ou ouVar = kuVar.k3;
        ArrayList arrayList = kuVar.b3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ju[] juVarArr = kuVar.c3;
            if (i13 >= juVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i10).resetStats(0);
                i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i11).resetStats(1);
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i12).resetStats(2);
                kuVar.T2 = true;
                kuVar.z1();
                kuVar.A1(true);
                return;
            }
            ju juVar = juVarArr[i13];
            if (juVar.c > 0) {
                arrayList.add(Integer.valueOf(juVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public int run() {
        ku kuVar = this.a;
        ArrayList arrayList = kuVar.Y2;
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                i9 = -1;
                break;
            }
            if (((fu) arrayList.get(i9)).a == 5) {
                break;
            }
            i9++;
        }
        if (i9 < 0) {
            return -1;
        }
        kuVar.V2.h1(i9, AndroidUtilities.dp(60.0f));
        return i9;
    }
}
