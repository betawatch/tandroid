package mg;

import ag.f3;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ l1(z2 z2Var, int i10) {
        this.a = i10;
        this.b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                zs.f(d20.s0).k(zs.T2, new Object[0]);
                org.telegram.messenger.i0.h3(new f3(8), 220L);
                break;
            case 1:
                z2 z2Var = this.b;
                p2 p2Var = z2Var.c;
                org.telegram.messenger.i0.E2(p2Var);
                z2Var.f1.getLayoutContainer().addView(p2Var);
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                try {
                    this.b.L();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                }
        }
    }
}
