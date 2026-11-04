package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf b;
    public final /* synthetic */ gi.l3 c;

    public /* synthetic */ wf(yf yfVar, gi.l3 l3Var, int i3) {
        this.a = i3;
        this.b = yfVar;
        this.c = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yf yfVar = this.b;
                gi.l3 l3Var = this.c;
                yfVar.removeView(l3Var);
                if (yfVar.b == l3Var) {
                    yfVar.b = null;
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
                yf yfVar2 = this.b;
                gi.l3 l3Var2 = this.c;
                yfVar2.removeView(l3Var2);
                if (yfVar2.a == l3Var2) {
                    yfVar2.a = null;
                    break;
                }
                break;
        }
    }
}
