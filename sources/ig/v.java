package ig;

import org.telegram.ui.iv;
import org.telegram.ui.x00;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ v(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                x00 x00Var = i0Var.A0;
                if (x00Var != null) {
                    ((iv) x00Var).j(false, null, i0Var.y0, i0Var.z0);
                    break;
                }
                break;
            default:
                i0 i0Var2 = this.b;
                i0Var2.getClass();
                i0Var2.c = f0.d;
                i0Var2.I.clear();
                int i10 = i0Var2.F0;
                if (i10 >= 0 && i10 < i0Var2.h()) {
                    i0Var2.m(i0Var2.F0);
                }
                i0Var2.P();
                break;
        }
    }
}
