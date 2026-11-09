package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ jn0(no0 no0Var, int i7) {
        this.a = i7;
        this.b = no0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                no0 no0Var = this.b;
                no0Var.s2 = true;
                s00 s00Var = no0Var.q2;
                s00Var.r.setText("");
                org.telegram.messenger.g0.K3(s00Var.r);
                break;
            default:
                vs vsVar = new vs(5);
                no0 no0Var2 = this.b;
                if (!no0Var2.d) {
                    vsVar.run();
                    break;
                } else {
                    s00 s00Var2 = no0Var2.q2;
                    if (s00Var2 != null) {
                        org.telegram.messenger.g0.v1(s00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(vsVar, 300L);
                    break;
                }
        }
    }
}
