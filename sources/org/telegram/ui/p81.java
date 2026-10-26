package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ p81(w91 w91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = w91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                w91 w91Var = this.b;
                di.z6 z6Var = w91Var.C0;
                z6Var.getClass();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!z6Var.j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList, z10)) {
                    w91Var.i0();
                    w91Var.n0();
                    break;
                }
                break;
            default:
                w91 w91Var2 = this.b;
                ArrayList arrayList2 = w91Var2.v0;
                ArrayList arrayList3 = w91Var2.u0;
                int i11 = 0;
                w91Var2.z0 = false;
                ArrayList arrayList4 = this.c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = w91Var2.s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((t91) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((t91) arrayList3.get(i13)).b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            t91 t91Var = (t91) arrayList3.get(i11);
                            if (t91Var.b == null) {
                                w91Var2.r0 = t91Var.b();
                            } else {
                                arrayList2.add(t91Var);
                                i11++;
                            }
                        }
                    }
                    w91Var2.n0();
                    w91Var2.S.setItemAnimator(null);
                    w91Var2.B0.f();
                    break;
                }
                break;
        }
    }
}
