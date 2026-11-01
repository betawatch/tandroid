package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ m51(s61 s61Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = s61Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                s61 s61Var = this.b;
                th.x4 x4Var = s61Var.C0;
                x4Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!x4Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!x4Var.q(0, arrayList, z10)) {
                    s61Var.m0();
                    s61Var.r0();
                    break;
                }
                break;
            default:
                s61 s61Var2 = this.b;
                ArrayList arrayList2 = s61Var2.v0;
                ArrayList arrayList3 = s61Var2.u0;
                int i11 = 0;
                s61Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList4.get(i12);
                        int i13 = s61Var2.s0.get(kjVar.f1(), -1);
                        if (i13 >= 0 && ((p61) arrayList3.get(i13)).b() == kjVar.f1()) {
                            ((p61) arrayList3.get(i13)).b = kjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            p61 p61Var = (p61) arrayList3.get(i11);
                            if (p61Var.b == null) {
                                s61Var2.r0 = p61Var.b();
                            } else {
                                arrayList2.add(p61Var);
                                i11++;
                            }
                        }
                    }
                    s61Var2.r0();
                    s61Var2.S.setItemAnimator(null);
                    s61Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
