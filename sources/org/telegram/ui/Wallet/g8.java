package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.fc;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ sf.b c;
    public final /* synthetic */ k0 d;

    public /* synthetic */ g8(n8 n8Var, sf.b bVar, k0 k0Var, int i3) {
        this.a = i3;
        this.b = n8Var;
        this.c = bVar;
        this.d = k0Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.c.c(false);
                n8 n8Var = this.b;
                if (h0Var != null) {
                    u8 u8Var = new u8();
                    u8Var.h = true;
                    ArrayList arrayList = u8Var.a;
                    arrayList.clear();
                    if (!h0Var.d()) {
                        arrayList.addAll(h0Var.f());
                    }
                    u8Var.a0();
                    u8Var.f = new ma1(27, n8Var, this.d);
                    n8Var.presentFragment(u8Var);
                    break;
                } else {
                    fc a02 = fc.a0(n8Var);
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
                n8 n8Var2 = this.b;
                if (f0Var != null) {
                    if (!n8Var2.f) {
                        n8Var2.e.add(f0Var);
                        u8 u8Var2 = new u8();
                        h0 h0Var2 = f0Var.b;
                        ArrayList arrayList2 = u8Var2.a;
                        arrayList2.clear();
                        if (!h0Var2.d()) {
                            arrayList2.addAll(h0Var2.f());
                        }
                        u8Var2.a0();
                        u8Var2.f = new g(n8Var2, this.d, f0Var, 21);
                        n8Var2.presentFragment(u8Var2);
                        break;
                    } else {
                        f0Var.close();
                        break;
                    }
                } else {
                    fc a03 = fc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    break;
                }
        }
    }
}
