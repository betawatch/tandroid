package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ of.e c;
    public final /* synthetic */ k0 d;

    public /* synthetic */ d7(l7 l7Var, of.e eVar, k0 k0Var, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = eVar;
        this.d = k0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.c.c(false);
                l7 l7Var = this.b;
                if (h0Var != null) {
                    p7 p7Var = new p7();
                    p7Var.h = true;
                    ArrayList arrayList = p7Var.a;
                    arrayList.clear();
                    if (!h0Var.e()) {
                        arrayList.addAll(h0Var.g());
                    }
                    p7Var.V();
                    p7Var.f = new ii1(17, l7Var, this.d);
                    l7Var.presentFragment(p7Var);
                    break;
                } else {
                    ad a02 = ad.a0(l7Var);
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
                l7 l7Var2 = this.b;
                if (f0Var != null) {
                    if (!l7Var2.e) {
                        l7Var2.d.add(f0Var);
                        p7 p7Var2 = new p7();
                        h0 h0Var2 = f0Var.b;
                        ArrayList arrayList2 = p7Var2.a;
                        arrayList2.clear();
                        if (!h0Var2.e()) {
                            arrayList2.addAll(h0Var2.g());
                        }
                        p7Var2.V();
                        p7Var2.f = new k(l7Var2, this.d, f0Var);
                        l7Var2.presentFragment(p7Var2);
                        break;
                    } else {
                        f0Var.close();
                        break;
                    }
                } else {
                    ad a03 = ad.a0(l7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
