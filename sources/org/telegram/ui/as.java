package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.Components.dc0 dc0Var = nsVar.C;
                if (dc0Var != null) {
                    dc0Var.a();
                    nsVar.z.removeView(nsVar.C);
                    nsVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
                break;
        }
    }
}
