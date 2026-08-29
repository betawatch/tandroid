package nh;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
