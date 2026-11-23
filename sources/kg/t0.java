package kg;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements org.telegram.ui.ActionBar.q1, u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ t0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n41 n41Var = (n41) obj;
        u0 u0Var = this.b;
        if (u0Var.c.h(n41Var)) {
            return;
        }
        int i7 = n41Var.d;
        if (i7 == 2 || n41Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", u0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            u0Var.presentFragment(new bn(bundle));
            return;
        }
        if (i7 == 1) {
            u0Var.r = !u0Var.r;
            u0Var.b.g3.O(true);
            u0Var.a0(true);
        } else {
            if (i7 == 3) {
                b0 b0Var = u0Var.c;
                u0Var.s = true;
                b0Var.h = true;
                u0Var.b.g3.O(true);
                u0Var.a0(true);
                return;
            }
            if (i7 == 4) {
                b0 b0Var2 = u0Var.c;
                u0Var.s = false;
                b0Var2.h = false;
                u0Var.b.g3.O(true);
                u0Var.a0(true);
            }
        }
    }
}
