package ig;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
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
        t0 t0Var = this.b;
        if (t0Var.d.h(f61Var)) {
            return;
        }
        int i10 = f61Var.d;
        if (i10 == 2 || f61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            t0Var.presentFragment(new sn(bundle));
            return;
        }
        if (i10 == 1) {
            t0Var.s = !t0Var.s;
            t0Var.c.W2.N(true);
            t0Var.V(true);
        } else {
            if (i10 == 3) {
                a0 a0Var = t0Var.d;
                t0Var.v = true;
                a0Var.h = true;
                t0Var.c.W2.N(true);
                t0Var.V(true);
                return;
            }
            if (i10 == 4) {
                a0 a0Var2 = t0Var.d;
                t0Var.v = false;
                a0Var2.h = false;
                t0Var.c.W2.N(true);
                t0Var.V(true);
            }
        }
    }
}
