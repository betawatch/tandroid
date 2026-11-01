package ag;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements org.telegram.ui.ActionBar.u1, p20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ u1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b51 b51Var = (b51) obj;
        v1 v1Var = this.b;
        if (v1Var.c.h(b51Var)) {
            return;
        }
        int i10 = b51Var.d;
        if (i10 == 2 || b51Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", v1Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            v1Var.presentFragment(new un(bundle));
            return;
        }
        if (i10 == 1) {
            v1Var.r = !v1Var.r;
            v1Var.b.f3.O(true);
            v1Var.a0(true);
        } else {
            if (i10 == 3) {
                x0 x0Var = v1Var.c;
                v1Var.s = true;
                x0Var.h = true;
                v1Var.b.f3.O(true);
                v1Var.a0(true);
                return;
            }
            if (i10 == 4) {
                x0 x0Var2 = v1Var.c;
                v1Var.s = false;
                x0Var2.h = false;
                v1Var.b.f3.O(true);
                v1Var.a0(true);
            }
        }
    }
}
