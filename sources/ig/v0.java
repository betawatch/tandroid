package ig;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ v0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
        w0 w0Var = this.b;
        if (w0Var.d.h(m61Var)) {
            return;
        }
        int i10 = m61Var.d;
        if (i10 == 2 || m61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            w0Var.presentFragment(new fo(bundle));
            return;
        }
        if (i10 == 1) {
            w0Var.s = !w0Var.s;
            w0Var.c.W2.N(true);
            w0Var.V(true);
        } else {
            if (i10 == 3) {
                a0 a0Var = w0Var.d;
                w0Var.v = true;
                a0Var.h = true;
                w0Var.c.W2.N(true);
                w0Var.V(true);
                return;
            }
            if (i10 == 4) {
                a0 a0Var2 = w0Var.d;
                w0Var.v = false;
                a0Var2.h = false;
                w0Var.c.W2.N(true);
                w0Var.V(true);
            }
        }
    }
}
