package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ v0 d;

    public /* synthetic */ z8(e9 e9Var, vf.b bVar, v0 v0Var, int i7) {
        this.a = i7;
        this.b = e9Var;
        this.c = bVar;
        this.d = v0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) obj;
                String str = (String) obj2;
                this.c.c(false);
                e9 e9Var = this.b;
                if (s0Var != null) {
                    m9 m9Var = new m9();
                    m9Var.h = true;
                    ArrayList arrayList = m9Var.a;
                    arrayList.clear();
                    if (!s0Var.d()) {
                        arrayList.addAll(s0Var.f());
                    }
                    m9Var.a0();
                    m9Var.f = new r(e9Var, this.d);
                    e9Var.presentFragment(m9Var);
                    break;
                } else {
                    kc b02 = kc.b0(e9Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    break;
                }
            default:
                p0 p0Var = (p0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                e9 e9Var2 = this.b;
                if (p0Var != null) {
                    if (!e9Var2.f) {
                        e9Var2.e.add(p0Var);
                        m9 m9Var2 = new m9();
                        s0 s0Var2 = p0Var.b;
                        ArrayList arrayList2 = m9Var2.a;
                        arrayList2.clear();
                        if (!s0Var2.d()) {
                            arrayList2.addAll(s0Var2.f());
                        }
                        m9Var2.a0();
                        m9Var2.f = new p(e9Var2, this.d, p0Var);
                        e9Var2.presentFragment(m9Var2);
                        break;
                    } else {
                        p0Var.close();
                        break;
                    }
                } else {
                    kc b03 = kc.b0(e9Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    break;
                }
        }
    }
}
