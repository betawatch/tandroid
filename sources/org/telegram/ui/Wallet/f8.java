package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ l0 d;

    public /* synthetic */ f8(m8 m8Var, vf.b bVar, l0 l0Var, int i7) {
        this.a = i7;
        this.b = m8Var;
        this.c = bVar;
        this.d = l0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.c.c(false);
                m8 m8Var = this.b;
                if (i0Var != null) {
                    t8 t8Var = new t8();
                    t8Var.h = true;
                    ArrayList arrayList = t8Var.a;
                    arrayList.clear();
                    if (!i0Var.d()) {
                        arrayList.addAll(i0Var.f());
                    }
                    t8Var.a0();
                    t8Var.f = new wb1(23, m8Var, this.d);
                    m8Var.presentFragment(t8Var);
                    break;
                } else {
                    hc a02 = hc.a0(m8Var);
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
                m8 m8Var2 = this.b;
                if (g0Var != null) {
                    if (!m8Var2.f) {
                        m8Var2.e.add(g0Var);
                        t8 t8Var2 = new t8();
                        i0 i0Var2 = g0Var.b;
                        ArrayList arrayList2 = t8Var2.a;
                        arrayList2.clear();
                        if (!i0Var2.d()) {
                            arrayList2.addAll(i0Var2.f());
                        }
                        t8Var2.a0();
                        t8Var2.f = new g(m8Var2, this.d, g0Var, 21);
                        m8Var2.presentFragment(t8Var2);
                        break;
                    } else {
                        g0Var.close();
                        break;
                    }
                } else {
                    hc a03 = hc.a0(m8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
