// default package

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m55 implements ee, oac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n55 b;

    public /* synthetic */ m55(n55 n55Var, byte b) {
        this.a = b;
        this.b = n55Var;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        n55 n55Var = this.b;
        if (n55Var.c.h(c6cVar)) {
            return;
        }
        int i = c6cVar.d;
        if (i == 2 || c6cVar.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", n55Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            n55Var.presentFragment(new yv1(bundle));
            return;
        }
        if (i == 1) {
            n55Var.r = !n55Var.r;
            n55Var.b.g3.O(true);
            n55Var.Z(true);
        } else {
            if (i == 3) {
                t51 t51Var = n55Var.c;
                n55Var.s = true;
                t51Var.h = true;
                n55Var.b.g3.O(true);
                n55Var.Z(true);
                return;
            }
            if (i == 4) {
                t51 t51Var2 = n55Var.c;
                n55Var.s = false;
                t51Var2.h = false;
                n55Var.b.g3.O(true);
                n55Var.Z(true);
            }
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        n55 n55Var = this.b;
        switch (b) {
            case 0:
                n55Var.c0();
                break;
            default:
                n55Var.finishFragment();
                break;
        }
    }
}
