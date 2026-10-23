package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ pf.c c;
    public final /* synthetic */ m0 d;

    public /* synthetic */ z7(h8 h8Var, pf.c cVar, m0 m0Var, int i10) {
        this.a = i10;
        this.b = h8Var;
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
                h8 h8Var = this.b;
                if (j0Var != null) {
                    p8 p8Var = new p8();
                    p8Var.h = true;
                    ArrayList arrayList = p8Var.a;
                    arrayList.clear();
                    if (!j0Var.e()) {
                        arrayList.addAll(j0Var.g());
                    }
                    p8Var.V();
                    p8Var.f = new z3(14, h8Var, this.d);
                    h8Var.presentFragment(p8Var);
                    break;
                } else {
                    xc a02 = xc.a0(h8Var);
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
                h8 h8Var2 = this.b;
                if (h0Var != null) {
                    if (!h8Var2.e) {
                        h8Var2.d.add(h0Var);
                        p8 p8Var2 = new p8();
                        j0 j0Var2 = h0Var.b;
                        ArrayList arrayList2 = p8Var2.a;
                        arrayList2.clear();
                        if (!j0Var2.e()) {
                            arrayList2.addAll(j0Var2.g());
                        }
                        p8Var2.V();
                        p8Var2.f = new h(h8Var2, this.d, h0Var, 19);
                        h8Var2.presentFragment(p8Var2);
                        break;
                    } else {
                        h0Var.close();
                        break;
                    }
                } else {
                    xc a03 = xc.a0(h8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
