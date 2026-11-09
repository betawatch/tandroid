package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements org.telegram.ui.Components.zi0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ jt a;

    public /* synthetic */ ft(jt jtVar) {
        this.a = jtVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        jt jtVar = this.a;
        mt mtVar = jtVar.v3;
        ArrayList arrayList = jtVar.m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ht[] htVarArr = jtVar.n3;
            if (i13 >= htVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                jtVar.e3 = true;
                jtVar.C1();
                jtVar.D1(true);
                return;
            }
            ht htVar = htVarArr[i13];
            if (htVar.c > 0) {
                arrayList.add(Integer.valueOf(htVar.d));
            }
            i13++;
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public int run() {
        jt jtVar = this.a;
        ArrayList arrayList = jtVar.j3;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            }
            if (((et) arrayList.get(i7)).a == 5) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            return -1;
        }
        jtVar.g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
