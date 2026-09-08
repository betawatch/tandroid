package bi;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ e(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(true, false);
                break;
            case 1:
                v vVar = this.b;
                di.f4 f4Var = vVar.J;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                vVar.e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            default:
                this.b.c();
                break;
        }
    }
}
