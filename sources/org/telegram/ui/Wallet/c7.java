package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.je1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ j0 d;

    public /* synthetic */ c7(k7 k7Var, pf.c cVar, j0 j0Var, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = cVar;
        this.d = j0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) obj;
                String str = (String) obj2;
                this.c.c(false);
                k7 k7Var = this.b;
                if (g0Var != null) {
                    o7 o7Var = new o7();
                    o7Var.h = true;
                    ArrayList arrayList = o7Var.a;
                    arrayList.clear();
                    if (!g0Var.e()) {
                        arrayList.addAll(g0Var.g());
                    }
                    o7Var.V();
                    o7Var.f = new je1(28, k7Var, this.d);
                    k7Var.presentFragment(o7Var);
                    break;
                } else {
                    zc a02 = zc.a0(k7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    break;
                }
            default:
                e0 e0Var = (e0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                k7 k7Var2 = this.b;
                if (e0Var != null) {
                    if (!k7Var2.e) {
                        k7Var2.d.add(e0Var);
                        o7 o7Var2 = new o7();
                        g0 g0Var2 = e0Var.b;
                        ArrayList arrayList2 = o7Var2.a;
                        arrayList2.clear();
                        if (!g0Var2.e()) {
                            arrayList2.addAll(g0Var2.g());
                        }
                        o7Var2.V();
                        o7Var2.f = new k(k7Var2, this.d, e0Var);
                        k7Var2.presentFragment(o7Var2);
                        break;
                    } else {
                        e0Var.close();
                        break;
                    }
                } else {
                    zc a03 = zc.a0(k7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
