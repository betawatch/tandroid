package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class l91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ l91(ra1 ra1Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ra1Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                ra1 ra1Var = this.b;
                ArrayList arrayList = ra1Var.s0;
                ArrayList arrayList2 = ra1Var.r0;
                int i10 = 0;
                ra1Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ra1Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((oa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((oa1) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            oa1 oa1Var = (oa1) arrayList2.get(i10);
                            if (oa1Var.b == null) {
                                ra1Var.o0 = oa1Var.b();
                            } else {
                                arrayList.add(oa1Var);
                                i10++;
                            }
                        }
                    }
                    ra1Var.o0();
                    ra1Var.S.setItemAnimator(null);
                    ra1Var.y0.f();
                    break;
                }
                break;
            default:
                ra1 ra1Var2 = this.b;
                ai.d9 d9Var = ra1Var2.z0;
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
                    ra1Var2.j0();
                    ra1Var2.o0();
                    break;
                }
                break;
        }
    }
}
