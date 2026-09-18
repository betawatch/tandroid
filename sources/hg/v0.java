package hg;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ v0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        x51 x51Var = (x51) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.b;
        if (w0Var.d.h(x51Var)) {
            return;
        }
        int i10 = x51Var.d;
        if (i10 == 2 || x51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            w0Var.presentFragment(new zn(bundle));
            return;
        }
        if (i10 == 1) {
            w0Var.s = !w0Var.s;
            w0Var.c.Y2.N(true);
            w0Var.V(true);
        } else {
            if (i10 == 3) {
                a0 a0Var = w0Var.d;
                w0Var.v = true;
                a0Var.h = true;
                w0Var.c.Y2.N(true);
                w0Var.V(true);
                return;
            }
            if (i10 == 4) {
                a0 a0Var2 = w0Var.d;
                w0Var.v = false;
                a0Var2.h = false;
                w0Var.c.Y2.N(true);
                w0Var.V(true);
            }
        }
    }
}
