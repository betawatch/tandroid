package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ j81(p91 p91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = p91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                p91 p91Var = this.b;
                ArrayList arrayList = p91Var.s0;
                ArrayList arrayList2 = p91Var.r0;
                int i10 = 0;
                p91Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = p91Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((m91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((m91) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            m91 m91Var = (m91) arrayList2.get(i10);
                            if (m91Var.b == null) {
                                p91Var.o0 = m91Var.b();
                            } else {
                                arrayList.add(m91Var);
                                i10++;
                            }
                        }
                    }
                    p91Var.o0();
                    p91Var.S.setItemAnimator(null);
                    p91Var.y0.f();
                    break;
                }
                break;
            default:
                p91 p91Var2 = this.b;
                ci.a7 a7Var = p91Var2.z0;
                a7Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a7Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!a7Var.q(0, arrayList4, z10)) {
                    p91Var2.j0();
                    p91Var2.o0();
                    break;
                }
                break;
        }
    }
}
