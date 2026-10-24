package ig;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ t0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        m61 m61Var = (m61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0 u0Var = this.b;
        if (u0Var.e.h(m61Var)) {
            return;
        }
        int i10 = m61Var.d;
        if (i10 == 2 || m61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", u0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            u0Var.presentFragment(new sn(bundle));
            return;
        }
        if (i10 == 1) {
            u0Var.v = !u0Var.v;
            u0Var.d.Z2.N(true);
            u0Var.V(true);
        } else {
            if (i10 == 3) {
                a0 a0Var = u0Var.e;
                u0Var.w = true;
                a0Var.h = true;
                u0Var.d.Z2.N(true);
                u0Var.V(true);
                return;
            }
            if (i10 == 4) {
                a0 a0Var2 = u0Var.e;
                u0Var.w = false;
                a0Var2.h = false;
                u0Var.d.Z2.N(true);
                u0Var.V(true);
            }
        }
    }
}
