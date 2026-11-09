package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p30 b;

    public /* synthetic */ o30(p30 p30Var, int i7) {
        this.a = i7;
        this.b = p30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p30 p30Var = this.b;
                n00 n00Var = p30Var.b;
                if (n00Var != null) {
                    n00Var.setVisibility(0);
                }
                org.telegram.messenger.g0.i3(new o30(p30Var, 2), 16L);
                break;
            case 1:
                n00 n00Var2 = this.b.b;
                if (n00Var2 != null) {
                    n00Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
