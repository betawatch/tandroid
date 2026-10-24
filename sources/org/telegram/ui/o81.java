package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ o81(u91 u91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = u91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                u91 u91Var = this.b;
                ArrayList arrayList = u91Var.s0;
                ArrayList arrayList2 = u91Var.r0;
                int i10 = 0;
                u91Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = u91Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((r91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((r91) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            r91 r91Var = (r91) arrayList2.get(i10);
                            if (r91Var.b == null) {
                                u91Var.o0 = r91Var.b();
                            } else {
                                arrayList.add(r91Var);
                                i10++;
                            }
                        }
                    }
                    u91Var.o0();
                    u91Var.S.setItemAnimator(null);
                    u91Var.y0.f();
                    break;
                }
                break;
            default:
                u91 u91Var2 = this.b;
                ci.z6 z6Var = u91Var2.z0;
                z6Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!z6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList4, z10)) {
                    u91Var2.j0();
                    u91Var2.o0();
                    break;
                }
                break;
        }
    }
}
