package of;

import android.view.ViewGroup;
import fh.l2;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 extends vk0 {
    public f1 c;
    public Integer d;
    public l2 e;
    public boolean f;
    public int h;

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.b() == 0) {
            return false;
        }
        return this.c.D(q1Var);
    }

    @Override // f2.r0
    public final int h() {
        f1 f1Var = this.c;
        int K = f1Var.K();
        f1Var.H0 = K;
        return K + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return -983904;
        }
        return this.c.j(i9 - 1);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (i9 > 0) {
            this.c.v(q1Var, i9 - 1);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (i9 != -983904) {
            return this.c.x(viewGroup, i9);
        }
        l2 l2Var = new l2(this, viewGroup.getContext(), 6);
        this.e = l2Var;
        return new ik0(l2Var);
    }
}
