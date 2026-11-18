package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ u0 d;

    public /* synthetic */ y8(d9 d9Var, vf.b bVar, u0 u0Var, int i7) {
        this.a = i7;
        this.b = d9Var;
        this.c = bVar;
        this.d = u0Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) obj;
                String str = (String) obj2;
                this.c.c(false);
                d9 d9Var = this.b;
                if (r0Var != null) {
                    l9 l9Var = new l9();
                    l9Var.h = true;
                    ArrayList arrayList = l9Var.a;
                    arrayList.clear();
                    if (!r0Var.d()) {
                        arrayList.addAll(r0Var.f());
                    }
                    l9Var.a0();
                    l9Var.f = new c5(10, d9Var, this.d);
                    d9Var.presentFragment(l9Var);
                    break;
                } else {
                    lc b02 = lc.b0(d9Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    break;
                }
            default:
                o0 o0Var = (o0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                d9 d9Var2 = this.b;
                if (o0Var != null) {
                    if (!d9Var2.f) {
                        d9Var2.e.add(o0Var);
                        l9 l9Var2 = new l9();
                        r0 r0Var2 = o0Var.b;
                        ArrayList arrayList2 = l9Var2.a;
                        arrayList2.clear();
                        if (!r0Var2.d()) {
                            arrayList2.addAll(r0Var2.f());
                        }
                        l9Var2.a0();
                        l9Var2.f = new p(d9Var2, this.d, o0Var);
                        d9Var2.presentFragment(l9Var2);
                        break;
                    } else {
                        o0Var.close();
                        break;
                    }
                } else {
                    lc b03 = lc.b0(d9Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    break;
                }
        }
    }
}
