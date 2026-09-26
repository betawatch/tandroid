package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ m91(sa1 sa1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = sa1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                sa1 sa1Var = this.b;
                ArrayList arrayList = sa1Var.s0;
                ArrayList arrayList2 = sa1Var.r0;
                int i10 = 0;
                sa1Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = sa1Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((pa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((pa1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            pa1 pa1Var = (pa1) arrayList2.get(i10);
                            if (pa1Var.b == null) {
                                sa1Var.o0 = pa1Var.b();
                            } else {
                                arrayList.add(pa1Var);
                                i10++;
                            }
                        }
                    }
                    sa1Var.o0();
                    sa1Var.S.setItemAnimator(null);
                    sa1Var.y0.f();
                    break;
                }
                break;
            default:
                sa1 sa1Var2 = this.b;
                ai.d9 d9Var = sa1Var2.z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    sa1Var2.j0();
                    sa1Var2.o0();
                    break;
                }
                break;
        }
    }
}
