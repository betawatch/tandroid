package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ b91(ha1 ha1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ha1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                ha1 ha1Var = this.b;
                ArrayList arrayList = ha1Var.p0;
                ArrayList arrayList2 = ha1Var.o0;
                int i10 = 0;
                ha1Var.t0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ha1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ea1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ea1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ea1 ea1Var = (ea1) arrayList2.get(i10);
                            if (ea1Var.b == null) {
                                ha1Var.l0 = ea1Var.b();
                            } else {
                                arrayList.add(ea1Var);
                                i10++;
                            }
                        }
                    }
                    ha1Var.o0();
                    ha1Var.P.setItemAnimator(null);
                    ha1Var.v0.f();
                    break;
                }
                break;
            default:
                ha1 ha1Var2 = this.b;
                oh.l6 l6Var = ha1Var2.w0;
                l6Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l6Var.j.containsKey((Integer) obj)) {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (!l6Var.q(0, arrayList4, z4)) {
                    ha1Var2.j0();
                    ha1Var2.o0();
                    break;
                }
                break;
        }
    }
}
