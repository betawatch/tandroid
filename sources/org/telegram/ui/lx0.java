package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lx0(nx0 nx0Var, int i7, int i10) {
        this.a = i10;
        this.b = nx0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nx0 nx0Var = this.b;
                org.telegram.ui.Components.f71 f71Var = nx0Var.b;
                mx0 mx0Var = nx0Var.d;
                int i7 = this.c;
                f71Var.e(i7, mx0Var.i(i7));
                break;
            default:
                nx0 nx0Var2 = this.b;
                org.telegram.ui.Components.f71 f71Var2 = nx0Var2.b;
                mx0 mx0Var2 = nx0Var2.d;
                int i10 = this.c;
                f71Var2.e(i10, mx0Var2.i(i10));
                break;
        }
    }
}
