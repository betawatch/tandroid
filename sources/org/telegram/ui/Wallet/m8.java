package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;
    public final /* synthetic */ gf.e c;
    public final /* synthetic */ k0 d;

    public /* synthetic */ m8(t8 t8Var, gf.e eVar, k0 k0Var, int i10) {
        this.a = i10;
        this.b = t8Var;
        this.c = eVar;
        this.d = k0Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.c.c(false);
                t8 t8Var = this.b;
                if (h0Var != null) {
                    a9 a9Var = new a9();
                    a9Var.h = true;
                    ArrayList arrayList = a9Var.a;
                    arrayList.clear();
                    if (!h0Var.d()) {
                        arrayList.addAll(h0Var.f());
                    }
                    a9Var.Z();
                    a9Var.f = new k3(15, t8Var, this.d);
                    t8Var.presentFragment(a9Var);
                    break;
                } else {
                    cc a02 = cc.a0(t8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    break;
                }
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                t8 t8Var2 = this.b;
                if (f0Var != null) {
                    if (!t8Var2.f) {
                        t8Var2.e.add(f0Var);
                        a9 a9Var2 = new a9();
                        h0 h0Var2 = f0Var.b;
                        ArrayList arrayList2 = a9Var2.a;
                        arrayList2.clear();
                        if (!h0Var2.d()) {
                            arrayList2.addAll(h0Var2.f());
                        }
                        a9Var2.Z();
                        a9Var2.f = new g(t8Var2, this.d, f0Var, 21);
                        t8Var2.presentFragment(a9Var2);
                        break;
                    } else {
                        f0Var.close();
                        break;
                    }
                } else {
                    cc a03 = cc.a0(t8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
