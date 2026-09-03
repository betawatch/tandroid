package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ na1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ h91(na1 na1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = na1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                na1 na1Var = this.b;
                ArrayList arrayList = na1Var.p0;
                ArrayList arrayList2 = na1Var.o0;
                int i10 = 0;
                na1Var.t0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = na1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ka1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ka1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ka1 ka1Var = (ka1) arrayList2.get(i10);
                            if (ka1Var.b == null) {
                                na1Var.l0 = ka1Var.b();
                            } else {
                                arrayList.add(ka1Var);
                                i10++;
                            }
                        }
                    }
                    na1Var.o0();
                    na1Var.P.setItemAnimator(null);
                    na1Var.v0.f();
                    break;
                }
                break;
            default:
                na1 na1Var2 = this.b;
                oh.l6 l6Var = na1Var2.w0;
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
                    na1Var2.j0();
                    na1Var2.o0();
                    break;
                }
                break;
        }
    }
}
