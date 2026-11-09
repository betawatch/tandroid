package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ox0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mx0(ox0 ox0Var, int i7, int i10) {
        this.a = i10;
        this.b = ox0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ox0 ox0Var = this.b;
                org.telegram.ui.Components.v61 v61Var = ox0Var.b;
                nx0 nx0Var = ox0Var.d;
                int i7 = this.c;
                v61Var.d(i7, nx0Var.i(i7));
                break;
            default:
                ox0 ox0Var2 = this.b;
                org.telegram.ui.Components.v61 v61Var2 = ox0Var2.b;
                nx0 nx0Var2 = ox0Var2.d;
                int i10 = this.c;
                v61Var2.d(i10, nx0Var2.i(i10));
                break;
        }
    }
}
