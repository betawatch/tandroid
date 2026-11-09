package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j90 b;

    public /* synthetic */ c90(j90 j90Var, int i7) {
        this.a = i7;
        this.b = j90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        j90 j90Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(j90Var.getParentActivity(), org.telegram.messenger.id.M0(2131746156, null));
                break;
            case 1:
                j90Var.r.d.requestFocus();
                org.telegram.messenger.g0.K3(j90Var.r.d);
                break;
            default:
                j90Var.r.d.clearFocus();
                org.telegram.messenger.g0.v1(j90Var.r.d);
                break;
        }
    }
}
