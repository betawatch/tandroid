package ci;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                if (t0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
