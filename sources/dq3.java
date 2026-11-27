// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq3 b;

    public /* synthetic */ dq3(eq3 eq3Var, byte b) {
        this.a = b;
        this.b = eq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        eq3 eq3Var = this.b;
        switch (b) {
            case 0:
                if (eq3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) eq3Var.getParent()).removeView(eq3Var);
                    break;
                }
                break;
            default:
                eq3Var.a();
                break;
        }
    }
}
