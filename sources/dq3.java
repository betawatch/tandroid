// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
