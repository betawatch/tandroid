package hg;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ w0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
        v51 v51Var = (v51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x0 x0Var = this.b;
        if (x0Var.d.h(v51Var)) {
            return;
        }
        int i10 = v51Var.d;
        if (i10 == 2 || v51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", x0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            x0Var.presentFragment(new wn(bundle));
            return;
        }
        if (i10 == 1) {
            x0Var.s = !x0Var.s;
            x0Var.c.Y2.N(true);
            x0Var.V(true);
        } else {
            if (i10 == 3) {
                c0 c0Var = x0Var.d;
                x0Var.v = true;
                c0Var.h = true;
                x0Var.c.Y2.N(true);
                x0Var.V(true);
                return;
            }
            if (i10 == 4) {
                c0 c0Var2 = x0Var.d;
                x0Var.v = false;
                c0Var2.h = false;
                x0Var.c.Y2.N(true);
                x0Var.V(true);
            }
        }
    }
}
