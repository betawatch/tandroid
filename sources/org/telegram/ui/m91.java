package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class m91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ m91(ta1 ta1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ta1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                ta1 ta1Var = this.b;
                ai.d9 d9Var = ta1Var.C0;
                d9Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!d9Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList, z10)) {
                    ta1Var.h0();
                    ta1Var.m0();
                    break;
                }
                break;
            default:
                ta1 ta1Var2 = this.b;
                ArrayList arrayList2 = ta1Var2.v0;
                ArrayList arrayList3 = ta1Var2.u0;
                int i11 = 0;
                ta1Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = ta1Var2.s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((qa1) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((qa1) arrayList3.get(i13)).b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            qa1 qa1Var = (qa1) arrayList3.get(i11);
                            if (qa1Var.b == null) {
                                ta1Var2.r0 = qa1Var.b();
                            } else {
                                arrayList2.add(qa1Var);
                                i11++;
                            }
                        }
                    }
                    ta1Var2.m0();
                    ta1Var2.S.setItemAnimator(null);
                    ta1Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
