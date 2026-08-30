package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ a91(ga1 ga1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ga1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                ga1 ga1Var = this.b;
                ArrayList arrayList = ga1Var.p0;
                ArrayList arrayList2 = ga1Var.o0;
                int i10 = 0;
                ga1Var.t0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ga1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((da1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((da1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            da1 da1Var = (da1) arrayList2.get(i10);
                            if (da1Var.b == null) {
                                ga1Var.l0 = da1Var.b();
                            } else {
                                arrayList.add(da1Var);
                                i10++;
                            }
                        }
                    }
                    ga1Var.o0();
                    ga1Var.P.setItemAnimator(null);
                    ga1Var.v0.f();
                    break;
                }
                break;
            default:
                ga1 ga1Var2 = this.b;
                nh.l6 l6Var = ga1Var2.w0;
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
                    ga1Var2.j0();
                    ga1Var2.o0();
                    break;
                }
                break;
        }
    }
}
