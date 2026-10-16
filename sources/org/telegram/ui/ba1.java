package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ba1(hb1 hb1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = hb1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                hb1 hb1Var = this.b;
                ArrayList arrayList = hb1Var.s0;
                ArrayList arrayList2 = hb1Var.r0;
                int i10 = 0;
                hb1Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = hb1Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((eb1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((eb1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            eb1 eb1Var = (eb1) arrayList2.get(i10);
                            if (eb1Var.b == null) {
                                hb1Var.o0 = eb1Var.b();
                            } else {
                                arrayList.add(eb1Var);
                                i10++;
                            }
                        }
                    }
                    hb1Var.o0();
                    hb1Var.S.setItemAnimator(null);
                    hb1Var.y0.f();
                    break;
                }
                break;
            default:
                hb1 hb1Var2 = this.b;
                bi.o8 o8Var = hb1Var2.z0;
                o8Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!o8Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!o8Var.q(0, arrayList4, z10)) {
                    hb1Var2.j0();
                    hb1Var2.o0();
                    break;
                }
                break;
        }
    }
}
