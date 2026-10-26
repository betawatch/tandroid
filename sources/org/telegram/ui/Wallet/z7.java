package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ qf.c c;
    public final /* synthetic */ l0 d;

    public /* synthetic */ z7(h8 h8Var, qf.c cVar, l0 l0Var, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = cVar;
        this.d = l0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.c.c(false);
                h8 h8Var = this.b;
                if (i0Var != null) {
                    p8 p8Var = new p8();
                    p8Var.h = true;
                    ArrayList arrayList = p8Var.a;
                    arrayList.clear();
                    if (!i0Var.e()) {
                        arrayList.addAll(i0Var.g());
                    }
                    p8Var.W();
                    p8Var.f = new q6(4, h8Var, this.d);
                    h8Var.presentFragment(p8Var);
                    break;
                } else {
                    wc b02 = wc.b0(h8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    break;
                }
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                h8 h8Var2 = this.b;
                if (g0Var != null) {
                    if (!h8Var2.f) {
                        h8Var2.e.add(g0Var);
                        p8 p8Var2 = new p8();
                        i0 i0Var2 = g0Var.b;
                        ArrayList arrayList2 = p8Var2.a;
                        arrayList2.clear();
                        if (!i0Var2.e()) {
                            arrayList2.addAll(i0Var2.g());
                        }
                        p8Var2.W();
                        p8Var2.f = new h(h8Var2, this.d, g0Var, 19);
                        h8Var2.presentFragment(p8Var2);
                        break;
                    } else {
                        g0Var.close();
                        break;
                    }
                } else {
                    wc b03 = wc.b0(h8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    break;
                }
        }
    }
}
