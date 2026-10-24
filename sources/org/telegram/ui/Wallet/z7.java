package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ l0 d;

    public /* synthetic */ z7(i8 i8Var, pf.c cVar, l0 l0Var, int i10) {
        this.a = i10;
        this.b = i8Var;
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
                i8 i8Var = this.b;
                if (i0Var != null) {
                    q8 q8Var = new q8();
                    q8Var.h = true;
                    ArrayList arrayList = q8Var.a;
                    arrayList.clear();
                    if (!i0Var.e()) {
                        arrayList.addAll(i0Var.g());
                    }
                    q8Var.V();
                    q8Var.f = new y3(14, i8Var, this.d);
                    i8Var.presentFragment(q8Var);
                    break;
                } else {
                    xc a02 = xc.a0(i8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    break;
                }
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                i8 i8Var2 = this.b;
                if (g0Var != null) {
                    if (!i8Var2.e) {
                        i8Var2.d.add(g0Var);
                        q8 q8Var2 = new q8();
                        i0 i0Var2 = g0Var.b;
                        ArrayList arrayList2 = q8Var2.a;
                        arrayList2.clear();
                        if (!i0Var2.e()) {
                            arrayList2.addAll(i0Var2.g());
                        }
                        q8Var2.V();
                        q8Var2.f = new h(i8Var2, this.d, g0Var, 19);
                        i8Var2.presentFragment(q8Var2);
                        break;
                    } else {
                        g0Var.close();
                        break;
                    }
                } else {
                    xc a03 = xc.a0(i8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
