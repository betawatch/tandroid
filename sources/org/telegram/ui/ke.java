package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ol0 b;

    public /* synthetic */ ke(org.telegram.ui.Components.ol0 ol0Var, int i10) {
        this.a = i10;
        this.b = ol0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ol0 ol0Var = this.b;
                if (!ol0Var.I) {
                    ol0Var.I = true;
                    ol0Var.c(new org.telegram.ui.Components.ml0(ol0Var, 0), false);
                    ol0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
