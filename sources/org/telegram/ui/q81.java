package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ q81(w81 w81Var, int i7) {
        this.a = i7;
        this.b = w81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w81 w81Var = this.b;
                w81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) w81Var, 11, false).show();
                break;
            default:
                w81 w81Var2 = this.b;
                w81Var2.e.requestFocus();
                org.telegram.messenger.g0.K3(w81Var2.e);
                break;
        }
    }
}
