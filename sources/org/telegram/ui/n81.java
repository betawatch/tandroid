package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ n81(t91 t91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = t91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                t91 t91Var = this.b;
                ArrayList arrayList = t91Var.o0;
                ArrayList arrayList2 = t91Var.n0;
                int i10 = 0;
                t91Var.s0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = t91Var.l0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((q91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((q91) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            q91 q91Var = (q91) arrayList2.get(i10);
                            if (q91Var.b == null) {
                                t91Var.k0 = q91Var.b();
                            } else {
                                arrayList.add(q91Var);
                                i10++;
                            }
                        }
                    }
                    t91Var.o0();
                    t91Var.O.setItemAnimator(null);
                    t91Var.u0.f();
                    break;
                }
                break;
            default:
                t91 t91Var2 = this.b;
                lh.k6 k6Var = t91Var2.v0;
                k6Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!k6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!k6Var.q(0, arrayList4, z10)) {
                    t91Var2.j0();
                    t91Var2.o0();
                    break;
                }
                break;
        }
    }
}
