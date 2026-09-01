package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.jm0 b;

    public /* synthetic */ pe(org.telegram.ui.Components.jm0 jm0Var, int i10) {
        this.a = i10;
        this.b = jm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.jm0 jm0Var = this.b;
                if (!jm0Var.J) {
                    jm0Var.J = true;
                    jm0Var.c(new org.telegram.ui.Components.hm0(jm0Var, 0), false);
                    jm0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
