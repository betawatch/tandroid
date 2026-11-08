package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ vf.b c;
    public final /* synthetic */ m0 d;

    public /* synthetic */ g8(n8 n8Var, vf.b bVar, m0 m0Var, int i7) {
        this.a = i7;
        this.b = n8Var;
        this.c = bVar;
        this.d = m0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.c.c(false);
                n8 n8Var = this.b;
                if (j0Var != null) {
                    u8 u8Var = new u8();
                    u8Var.h = true;
                    ArrayList arrayList = u8Var.a;
                    arrayList.clear();
                    if (!j0Var.d()) {
                        arrayList.addAll(j0Var.f());
                    }
                    u8Var.a0();
                    u8Var.f = new n(n8Var, this.d);
                    n8Var.presentFragment(u8Var);
                    break;
                } else {
                    hc a02 = hc.a0(n8Var);
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
                    if (!n8Var2.f) {
                        n8Var2.e.add(h0Var);
                        u8 u8Var2 = new u8();
                        j0 j0Var2 = h0Var.b;
                        ArrayList arrayList2 = u8Var2.a;
                        arrayList2.clear();
                        if (!j0Var2.d()) {
                            arrayList2.addAll(j0Var2.f());
                        }
                        u8Var2.a0();
                        u8Var2.f = new g(n8Var2, this.d, h0Var, 21);
                        n8Var2.presentFragment(u8Var2);
                        break;
                    } else {
                        h0Var.close();
                        break;
                    }
                } else {
                    hc a03 = hc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
