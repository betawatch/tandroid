package kg;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.x31;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements org.telegram.ui.ActionBar.r1, a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i7) {
        this.a = i7;
        this.b = s0Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        s0 s0Var = this.b;
        if (s0Var.c.h(x31Var)) {
            return;
        }
        int i7 = x31Var.d;
        if (i7 == 2 || x31Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", s0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            s0Var.presentFragment(new an(bundle));
            return;
        }
        if (i7 == 1) {
            s0Var.r = !s0Var.r;
            s0Var.b.f3.O(true);
            s0Var.a0(true);
        } else {
            if (i7 == 3) {
                a0 a0Var = s0Var.c;
                s0Var.s = true;
                a0Var.h = true;
                s0Var.b.f3.O(true);
                s0Var.a0(true);
                return;
            }
            if (i7 == 4) {
                a0 a0Var2 = s0Var.c;
                s0Var.s = false;
                a0Var2.h = false;
                s0Var.b.f3.O(true);
                s0Var.a0(true);
            }
        }
    }
}
