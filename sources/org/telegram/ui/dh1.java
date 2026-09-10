package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ dh1(mh1 mh1Var, int i10) {
        this.a = i10;
        this.b = mh1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                mh1 mh1Var = this.b;
                mh1Var.B0();
                mh1Var.finishFragment();
                break;
            case 2:
                mh1 mh1Var2 = this.b;
                mh1Var2.R = "";
                mh1Var2.E0(false);
                break;
            case 3:
                mh1.a0(this.b);
                break;
            default:
                mh1.X(this.b);
                break;
        }
    }
}
