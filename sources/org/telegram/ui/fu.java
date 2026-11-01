package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fu implements org.telegram.ui.Components.ek0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ iu a;

    public /* synthetic */ fu(iu iuVar) {
        this.a = iuVar;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        iu iuVar = this.a;
        lu luVar = iuVar.v3;
        ArrayList arrayList = iuVar.m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            hu[] huVarArr = iuVar.n3;
            if (i14 >= huVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i11).l(0);
                i12 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i12).l(1);
                i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i13).l(2);
                iuVar.e3 = true;
                iuVar.C1();
                iuVar.D1(true);
                return;
            }
            hu huVar = huVarArr[i14];
            if (huVar.c > 0) {
                arrayList.add(Integer.valueOf(huVar.d));
            }
            i14++;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public int run() {
        iu iuVar = this.a;
        ArrayList arrayList = iuVar.j3;
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
        iuVar.g3.h1(i10, org.telegram.messenger.i0.L(60.0f));
        return i10;
    }
}
