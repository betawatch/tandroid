package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
