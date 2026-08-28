package kh;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ t0(u0 u0Var, int i9) {
        this.a = i9;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                if (u0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
