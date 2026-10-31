package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u61 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ o51(u61 u61Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = u61Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                u61 u61Var = this.b;
                th.x4 x4Var = u61Var.C0;
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
                    u61Var.l0();
                    u61Var.q0();
                    break;
                }
                break;
            default:
                u61 u61Var2 = this.b;
                ArrayList arrayList2 = u61Var2.v0;
                ArrayList arrayList3 = u61Var2.u0;
                int i11 = 0;
                u61Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(i12);
                        int i13 = u61Var2.s0.get(jjVar.f1(), -1);
                        if (i13 >= 0 && ((r61) arrayList3.get(i13)).b() == jjVar.f1()) {
                            ((r61) arrayList3.get(i13)).b = jjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            r61 r61Var = (r61) arrayList3.get(i11);
                            if (r61Var.b == null) {
                                u61Var2.r0 = r61Var.b();
                            } else {
                                arrayList2.add(r61Var);
                                i11++;
                            }
                        }
                    }
                    u61Var2.q0();
                    u61Var2.S.setItemAnimator(null);
                    u61Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
