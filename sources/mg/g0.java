package mg;

import org.telegram.messenger.q20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;

    public /* synthetic */ g0(q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new g0(this.b, 2));
                break;
            case 1:
                this.b.a(null);
                break;
            case 2:
                this.b.a(null);
                break;
            default:
                this.b.a(LaunchActivity.T());
                break;
        }
    }
}
