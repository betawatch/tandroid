// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef2 implements ff7, fd, s69, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bg2 b;

    public /* synthetic */ ef2(bg2 bg2Var, byte b) {
        this.a = b;
        this.b = bg2Var;
    }

    @Override // s69
    public final boolean C(View view) {
        return false;
    }

    @Override // s69
    public final void d(float f, float f2, int i, View view) {
        this.b.r0(i, view);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        bg2 bg2Var = this.b;
        if (bg2Var.getParentActivity() != null) {
            j79 adapter = bg2Var.c.getAdapter();
            xf2 xf2Var = bg2Var.a;
            if (adapter == xf2Var) {
                return bg2Var.h0(xf2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override // ff7
    public final void run(long j) {
        this.b.s0(j);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        bg2 bg2Var = this.b;
        switch (b) {
            case 1:
                bg2Var.y0();
                break;
            default:
                bg2Var.finishFragment();
                break;
        }
    }

    @Override // s69
    public final void u(View view, float f, float f2) {
    }
}
