package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ns b;

    public /* synthetic */ as(ns nsVar, int i7) {
        this.a = i7;
        this.b = nsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                ns nsVar = this.b;
                nsVar.A.w0(null);
                org.telegram.ui.Components.sb0 sb0Var = nsVar.C;
                if (sb0Var != null) {
                    sb0Var.a();
                    nsVar.z.removeView(nsVar.C);
                    nsVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.wq.h).start();
                break;
        }
    }
}
