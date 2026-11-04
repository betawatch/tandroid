package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ l31(r41 r41Var, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = r41Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                r41 r41Var = this.b;
                ei.r6 r6Var = r41Var.D0;
                r6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        if (!r6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!r6Var.q(0, arrayList, z10)) {
                    r41Var.m0();
                    r41Var.r0();
                    break;
                }
                break;
            default:
                r41 r41Var2 = this.b;
                ArrayList arrayList2 = r41Var2.w0;
                ArrayList arrayList3 = r41Var2.v0;
                int i10 = 0;
                r41Var2.A0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(i11);
                        int i12 = r41Var2.t0.get(ziVar.f1(), -1);
                        if (i12 >= 0 && ((o41) arrayList3.get(i12)).b() == ziVar.f1()) {
                            ((o41) arrayList3.get(i12)).b = ziVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            o41 o41Var = (o41) arrayList3.get(i10);
                            if (o41Var.b == null) {
                                r41Var2.s0 = o41Var.b();
                            } else {
                                arrayList2.add(o41Var);
                                i10++;
                            }
                        }
                    }
                    r41Var2.r0();
                    r41Var2.T.setItemAnimator(null);
                    r41Var2.C0.f();
                    break;
                }
                break;
        }
    }
}
