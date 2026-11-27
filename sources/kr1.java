// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kr1 extends sd2 {
    public final /* synthetic */ zu1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(zu1 zu1Var, Context context) {
        super(context);
        this.f = zu1Var;
    }

    @Override // sd2
    public final void a(boolean z) {
        zu1 zu1Var = this.f;
        zu1Var.F5();
        zu1Var.D5();
        zu1Var.G5();
        zu1Var.H5();
        gs1 gs1Var = zu1Var.Mb;
        if (gs1Var != null) {
            gs1Var.setTranslationY(zu1Var.T9 + getCurrentHeight());
        }
        if (!z) {
            zu1Var.O7();
        } else {
            zu1Var.aa = true;
            zu1Var.Rc();
        }
    }
}
