package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ l81(r91 r91Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = r91Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                r91 r91Var = this.b;
                ArrayList arrayList = r91Var.s0;
                ArrayList arrayList2 = r91Var.r0;
                int i10 = 0;
                r91Var.w0 = false;
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = r91Var.p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((o91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((o91) arrayList2.get(i12)).b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            o91 o91Var = (o91) arrayList2.get(i10);
                            if (o91Var.b == null) {
                                r91Var.o0 = o91Var.b();
                            } else {
                                arrayList.add(o91Var);
                                i10++;
                            }
                        }
                    }
                    r91Var.o0();
                    r91Var.S.setItemAnimator(null);
                    r91Var.y0.f();
                    break;
                }
                break;
            default:
                r91 r91Var2 = this.b;
                ci.z6 z6Var = r91Var2.z0;
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
                    r91Var2.j0();
                    r91Var2.o0();
                    break;
                }
                break;
        }
    }
}
