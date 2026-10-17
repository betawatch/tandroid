package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ m0 d;

    public /* synthetic */ c8(k8 k8Var, pf.c cVar, m0 m0Var, int i10) {
        this.a = i10;
        this.b = k8Var;
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
                k8 k8Var = this.b;
                if (j0Var != null) {
                    s8 s8Var = new s8();
                    s8Var.h = true;
                    ArrayList arrayList = s8Var.a;
                    arrayList.clear();
                    if (!j0Var.e()) {
                        arrayList.addAll(j0Var.g());
                    }
                    s8Var.V();
                    s8Var.f = new t3(14, k8Var, this.d);
                    k8Var.presentFragment(s8Var);
                    break;
                } else {
                    xc a02 = xc.a0(k8Var);
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
                k8 k8Var2 = this.b;
                if (h0Var != null) {
                    if (!k8Var2.e) {
                        k8Var2.d.add(h0Var);
                        s8 s8Var2 = new s8();
                        j0 j0Var2 = h0Var.b;
                        ArrayList arrayList2 = s8Var2.a;
                        arrayList2.clear();
                        if (!j0Var2.e()) {
                            arrayList2.addAll(j0Var2.g());
                        }
                        s8Var2.V();
                        s8Var2.f = new h(k8Var2, this.d, h0Var, 18);
                        k8Var2.presentFragment(s8Var2);
                        break;
                    } else {
                        h0Var.close();
                        break;
                    }
                } else {
                    xc a03 = xc.a0(k8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
