package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ m0 d;

    public /* synthetic */ f8(n8 n8Var, pf.c cVar, m0 m0Var, int i10) {
        this.a = i10;
        this.b = n8Var;
        this.c = cVar;
        this.d = m0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.c.c(false);
                n8 n8Var = this.b;
                if (j0Var != null) {
                    v8 v8Var = new v8();
                    v8Var.h = true;
                    ArrayList arrayList = v8Var.a;
                    arrayList.clear();
                    if (!j0Var.e()) {
                        arrayList.addAll(j0Var.g());
                    }
                    v8Var.V();
                    v8Var.f = new u3(14, n8Var, this.d);
                    n8Var.presentFragment(v8Var);
                    break;
                } else {
                    xc a02 = xc.a0(n8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    break;
                }
            default:
                h0 h0Var = (h0) obj;
                String str2 = (String) obj2;
                this.c.c(false);
                n8 n8Var2 = this.b;
                if (h0Var != null) {
                    if (!n8Var2.e) {
                        n8Var2.d.add(h0Var);
                        v8 v8Var2 = new v8();
                        j0 j0Var2 = h0Var.b;
                        ArrayList arrayList2 = v8Var2.a;
                        arrayList2.clear();
                        if (!j0Var2.e()) {
                            arrayList2.addAll(j0Var2.g());
                        }
                        v8Var2.V();
                        v8Var2.f = new h(n8Var2, this.d, h0Var, 18);
                        n8Var2.presentFragment(v8Var2);
                        break;
                    } else {
                        h0Var.close();
                        break;
                    }
                } else {
                    xc a03 = xc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
