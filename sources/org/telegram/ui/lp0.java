package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp0 b;

    public /* synthetic */ lp0(vp0 vp0Var, int i10) {
        this.a = i10;
        this.b = vp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        vp0 vp0Var = this.b;
        switch (i10) {
            case 0:
                if (vp0Var.G) {
                    vp0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                vp0Var.h();
                break;
            case 2:
                int i11 = vp0.q0;
                vp0Var.h();
                break;
            default:
                int i12 = vp0.q0;
                vp0Var.h();
                break;
        }
    }
}
