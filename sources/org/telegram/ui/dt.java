package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ gt a;

    public /* synthetic */ dt(gt gtVar) {
        this.a = gtVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        gt gtVar = this.a;
        kt ktVar = gtVar.v3;
        ArrayList arrayList = gtVar.m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ft[] ftVarArr = gtVar.n3;
            if (i13 >= ftVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                gtVar.e3 = true;
                gtVar.C1();
                gtVar.D1(true);
                return;
            }
            ft ftVar = ftVarArr[i13];
            if (ftVar.c > 0) {
                arrayList.add(Integer.valueOf(ftVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        gt gtVar = this.a;
        ArrayList arrayList = gtVar.j3;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((ct) arrayList.get(i7)).a == 5) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            return -1;
        }
        gtVar.g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
