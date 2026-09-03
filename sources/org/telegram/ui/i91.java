package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oa1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ i91(oa1 oa1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = oa1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                oa1 oa1Var = this.b;
                ArrayList arrayList = oa1Var.p0;
                ArrayList arrayList2 = oa1Var.o0;
                int i10 = 0;
                oa1Var.t0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = oa1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((la1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((la1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            la1 la1Var = (la1) arrayList2.get(i10);
                            if (la1Var.b == null) {
                                oa1Var.l0 = la1Var.b();
                            } else {
                                arrayList.add(la1Var);
                                i10++;
                            }
                        }
                    }
                    oa1Var.o0();
                    oa1Var.P.setItemAnimator(null);
                    oa1Var.v0.f();
                    break;
                }
                break;
            default:
                oa1 oa1Var2 = this.b;
                nh.l6 l6Var = oa1Var2.w0;
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
                    oa1Var2.j0();
                    oa1Var2.o0();
                    break;
                }
                break;
        }
    }
}
