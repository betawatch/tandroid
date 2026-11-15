package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                org.telegram.ui.Components.tb0 tb0Var = nsVar.C;
                if (tb0Var != null) {
                    tb0Var.a();
                    nsVar.z.removeView(nsVar.C);
                    nsVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
                break;
        }
    }
}
