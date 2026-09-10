package gg;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;

    public /* synthetic */ z0(a1 a1Var, int i10) {
        this.a = i10;
        this.b = a1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
        a1 a1Var = this.b;
        if (a1Var.d.h(v51Var)) {
            return;
        }
        int i10 = v51Var.d;
        if (i10 == 2 || v51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a1Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            a1Var.presentFragment(new eo(bundle));
            return;
        }
        if (i10 == 1) {
            a1Var.s = !a1Var.s;
            a1Var.c.Y2.N(true);
            a1Var.V(true);
        } else {
            if (i10 == 3) {
                e0 e0Var = a1Var.d;
                a1Var.v = true;
                e0Var.h = true;
                a1Var.c.Y2.N(true);
                a1Var.V(true);
                return;
            }
            if (i10 == 4) {
                e0 e0Var2 = a1Var.d;
                a1Var.v = false;
                e0Var2.h = false;
                a1Var.c.Y2.N(true);
                a1Var.V(true);
            }
        }
    }
}
