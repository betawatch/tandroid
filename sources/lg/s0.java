package lg;

import android.os.Bundle;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements org.telegram.ui.ActionBar.p1, s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i3) {
        this.a = i3;
        this.b = t0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        t0 t0Var = this.b;
        if (t0Var.c.h(r31Var)) {
            return;
        }
        int i3 = r31Var.d;
        if (i3 == 2 || r31Var.a == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            t0Var.presentFragment(new wm(bundle));
            return;
        }
        if (i3 == 1) {
            t0Var.r = !t0Var.r;
            t0Var.b.g3.O(true);
            t0Var.a0(true);
        } else {
            if (i3 == 3) {
                b0 b0Var = t0Var.c;
                t0Var.s = true;
                b0Var.h = true;
                t0Var.b.g3.O(true);
                t0Var.a0(true);
                return;
            }
            if (i3 == 4) {
                b0 b0Var2 = t0Var.c;
                t0Var.s = false;
                b0Var2.h = false;
                t0Var.b.g3.O(true);
                t0Var.a0(true);
            }
        }
    }
}
