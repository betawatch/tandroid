package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class tc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ yc0 b;

    public tc0(yc0 yc0Var) {
        this.b = yc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.a;
        yc0 yc0Var = this.b;
        yc0Var.a(z4);
        yc0Var.postDelayed(this, yc0Var.I);
    }
}
