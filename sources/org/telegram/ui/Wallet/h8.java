package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ n0 d;

    public /* synthetic */ h8(o8 o8Var, vf.b bVar, n0 n0Var, int i7) {
        this.a = i7;
        this.b = o8Var;
        this.c = bVar;
        this.d = n0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) obj;
                String str = (String) obj2;
                this.c.c(false);
                o8 o8Var = this.b;
                if (k0Var != null) {
                    v8 v8Var = new v8();
                    v8Var.h = true;
                    ArrayList arrayList = v8Var.a;
                    arrayList.clear();
                    if (!k0Var.d()) {
                        arrayList.addAll(k0Var.f());
                    }
                    v8Var.a0();
                    v8Var.f = new n(o8Var, this.d);
                    o8Var.presentFragment(v8Var);
                    break;
                } else {
                    hc a02 = hc.a0(o8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    break;
                }
            default:
                i0 i0Var = (i0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                o8 o8Var2 = this.b;
                if (i0Var != null) {
                    if (!o8Var2.f) {
                        o8Var2.e.add(i0Var);
                        v8 v8Var2 = new v8();
                        k0 k0Var2 = i0Var.b;
                        ArrayList arrayList2 = v8Var2.a;
                        arrayList2.clear();
                        if (!k0Var2.d()) {
                            arrayList2.addAll(k0Var2.f());
                        }
                        v8Var2.a0();
                        v8Var2.f = new g(o8Var2, this.d, i0Var, 21);
                        o8Var2.presentFragment(v8Var2);
                        break;
                    } else {
                        i0Var.close();
                        break;
                    }
                } else {
                    hc a03 = hc.a0(o8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
