package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg b;
    public final /* synthetic */ di.d4 c;

    public /* synthetic */ rg(tg tgVar, di.d4 d4Var, int i10) {
        this.a = i10;
        this.b = tgVar;
        this.c = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg tgVar = this.b;
                di.d4 d4Var = this.c;
                tgVar.removeView(d4Var);
                if (tgVar.b == d4Var) {
                    tgVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                tg tgVar2 = this.b;
                di.d4 d4Var2 = this.c;
                tgVar2.removeView(d4Var2);
                if (tgVar2.a == d4Var2) {
                    tgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
