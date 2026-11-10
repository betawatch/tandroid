package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.gc;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ l0 d;

    public /* synthetic */ i8(p8 p8Var, vf.b bVar, l0 l0Var, int i7) {
        this.a = i7;
        this.b = p8Var;
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
                p8 p8Var = this.b;
                if (i0Var != null) {
                    w8 w8Var = new w8();
                    w8Var.h = true;
                    ArrayList arrayList = w8Var.a;
                    arrayList.clear();
                    if (!i0Var.d()) {
                        arrayList.addAll(i0Var.f());
                    }
                    w8Var.a0();
                    w8Var.f = new sb1(23, p8Var, this.d);
                    p8Var.presentFragment(w8Var);
                    break;
                } else {
                    gc a02 = gc.a0(p8Var);
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
                p8 p8Var2 = this.b;
                if (g0Var != null) {
                    if (!p8Var2.f) {
                        p8Var2.e.add(g0Var);
                        w8 w8Var2 = new w8();
                        i0 i0Var2 = g0Var.b;
                        ArrayList arrayList2 = w8Var2.a;
                        arrayList2.clear();
                        if (!i0Var2.d()) {
                            arrayList2.addAll(i0Var2.f());
                        }
                        w8Var2.a0();
                        w8Var2.f = new g(p8Var2, this.d, g0Var, 22);
                        p8Var2.presentFragment(w8Var2);
                        break;
                    } else {
                        g0Var.close();
                        break;
                    }
                } else {
                    gc a03 = gc.a0(p8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
