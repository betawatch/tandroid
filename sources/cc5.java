// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc5 b;

    public /* synthetic */ cc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 0:
                oc5Var.Y = null;
                oc5Var.a0.b();
                oc5Var.h.b();
                oc5Var.m0();
                oc5Var.w0();
                oc5Var.x0();
                break;
            case 1:
                oc5Var.f.r.clearFocus();
                oc5Var.f.r.requestFocus();
                gm.E3(oc5Var.f.r);
                break;
            case 2:
                oc5Var.s0();
                break;
            case 3:
                oc5Var.r0(oc5Var.o0());
                break;
            default:
                oc5Var.r0(oc5Var.o0());
                break;
        }
    }
}
