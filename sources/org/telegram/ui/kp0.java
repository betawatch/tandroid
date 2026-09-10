package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ kp0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        up0 up0Var = this.b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                up0Var.h();
                break;
            case 2:
                int i11 = up0.q0;
                up0Var.h();
                break;
            default:
                int i12 = up0.q0;
                up0Var.h();
                break;
        }
    }
}
