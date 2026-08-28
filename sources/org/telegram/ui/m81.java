package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ m81(s91 s91Var, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = s91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                s91 s91Var = this.b;
                ArrayList arrayList = s91Var.o0;
                ArrayList arrayList2 = s91Var.n0;
                int i9 = 0;
                s91Var.s0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i10);
                        int i11 = s91Var.l0.get(messageObject.getId(), -1);
                        if (i11 >= 0 && ((p91) arrayList2.get(i11)).b() == messageObject.getId()) {
                            ((p91) arrayList2.get(i11)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i9 < size2) {
                            p91 p91Var = (p91) arrayList2.get(i9);
                            if (p91Var.b == null) {
                                s91Var.k0 = p91Var.b();
                            } else {
                                arrayList.add(p91Var);
                                i9++;
                            }
                        }
                    }
                    s91Var.n0();
                    s91Var.O.setItemAnimator(null);
                    s91Var.u0.f();
                    break;
                }
                break;
            default:
                s91 s91Var2 = this.b;
                ih.n6 n6Var = s91Var2.v0;
                n6Var.getClass();
                ArrayList arrayList4 = this.c;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        Object obj = arrayList4.get(i12);
                        i12++;
                        if (!n6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!n6Var.q(0, arrayList4, z10)) {
                    s91Var2.i0();
                    s91Var2.n0();
                    break;
                }
                break;
        }
    }
}
