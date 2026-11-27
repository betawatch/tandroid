// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
