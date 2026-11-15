package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uy(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.y0 y0Var;
        q71 q71Var;
        switch (this.a) {
            case 0:
                wy wyVar = (wy) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    zy zyVar = wyVar.K;
                    zyVar.a = true;
                    zyVar.b = true;
                }
                if (z11) {
                    wyVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(wyVar.b0 - currentTimeMillis) > 30) {
                    wyVar.b0 = currentTimeMillis;
                    wyVar.e0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.ce0) this.e).O1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.l1 l1Var = (org.telegram.utils.twidget.l1) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!l1Var.w && (y0Var = l1Var.L) != null && (q71Var = y0Var.h) != null && q71Var.w && !q71Var.x) {
                    q71Var.k(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
