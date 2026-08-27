package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ k81(q91 q91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = q91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                q91 q91Var = this.b;
                ArrayList arrayList = q91Var.o0;
                ArrayList arrayList2 = q91Var.n0;
                int i10 = 0;
                q91Var.s0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = q91Var.l0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((n91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((n91) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            n91 n91Var = (n91) arrayList2.get(i10);
                            if (n91Var.b == null) {
                                q91Var.k0 = n91Var.b();
                            } else {
                                arrayList.add(n91Var);
                                i10++;
                            }
                        }
                    }
                    q91Var.o0();
                    q91Var.O.setItemAnimator(null);
                    q91Var.u0.f();
                    break;
                }
                break;
            default:
                q91 q91Var2 = this.b;
                jh.j6 j6Var = q91Var2.v0;
                j6Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!j6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!j6Var.q(0, arrayList4, z10)) {
                    q91Var2.j0();
                    q91Var2.o0();
                    break;
                }
                break;
        }
    }
}
