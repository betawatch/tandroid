package hg;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ v0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.W();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w0 w0Var = this.b;
        if (w0Var.d.h(h61Var)) {
            return;
        }
        int i10 = h61Var.d;
        if (i10 == 2 || h61Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", w0Var.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            w0Var.presentFragment(new yn(bundle));
            return;
        }
        if (i10 == 1) {
            w0Var.s = !w0Var.s;
            w0Var.c.f3.N(true);
            w0Var.T(true);
        } else {
            if (i10 == 3) {
                b0 b0Var = w0Var.d;
                w0Var.v = true;
                b0Var.h = true;
                w0Var.c.f3.N(true);
                w0Var.T(true);
                return;
            }
            if (i10 == 4) {
                b0 b0Var2 = w0Var.d;
                w0Var.v = false;
                b0Var2.h = false;
                w0Var.c.f3.N(true);
                w0Var.T(true);
            }
        }
    }
}
