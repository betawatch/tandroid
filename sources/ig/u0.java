package ig;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ u0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.X();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f61 f61Var = (f61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0 v0Var = this.b;
        if (v0Var.d.h(f61Var)) {
            return;
        }
        int i10 = f61Var.d;
        if (i10 == 2 || f61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v0Var.presentFragment(new sn(bundle));
            return;
        }
        if (i10 == 1) {
            v0Var.s = !v0Var.s;
            v0Var.c.W2.N(true);
            v0Var.V(true);
        } else {
            if (i10 == 3) {
                a0 a0Var = v0Var.d;
                v0Var.v = true;
                a0Var.h = true;
                v0Var.c.W2.N(true);
                v0Var.V(true);
                return;
            }
            if (i10 == 4) {
                a0 a0Var2 = v0Var.d;
                v0Var.v = false;
                a0Var2.h = false;
                v0Var.c.W2.N(true);
                v0Var.V(true);
            }
        }
    }
}
