package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                nsVar.A.x0(null);
                org.telegram.ui.Components.cc0 cc0Var = nsVar.C;
                if (cc0Var != null) {
                    cc0Var.a();
                    nsVar.z.removeView(nsVar.C);
                    nsVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.kr.h).start();
                break;
        }
    }
}
