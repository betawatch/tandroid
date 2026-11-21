package li;

import android.os.Bundle;
import org.telegram.ui.Components.e10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ v(d0 d0Var, int i7) {
        this.a = i7;
        this.b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                d0Var.v1.d.f3.h1(1, d0Var.P1.b);
                d0Var.m1.a(false, true);
                d0Var.r0 = true;
                e10 e10Var = d0Var.y1;
                org.telegram.messenger.g0.v1(e10Var.r);
                e10Var.r.clearFocus();
                break;
            case 1:
                d0 d0Var2 = this.b;
                d0Var2.x1.d.f3.h1(1, d0Var2.P1.b);
                d0Var2.n1.a(false, true);
                d0Var2.r0 = true;
                e10 e10Var2 = d0Var2.z1;
                org.telegram.messenger.g0.v1(e10Var2.r);
                e10Var2.r.clearFocus();
                break;
            default:
                d0 d0Var3 = this.b;
                d0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", d0Var3.p1);
                d0Var3.u1.presentFragment(new p(bundle));
                d0Var3.dismiss();
                break;
        }
    }
}
