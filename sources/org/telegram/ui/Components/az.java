package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ az(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        a81 a81Var;
        switch (this.a) {
            case 0:
                cz czVar = (cz) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    fz fzVar = czVar.K;
                    fzVar.a = true;
                    fzVar.b = true;
                }
                if (z11) {
                    czVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(czVar.b0 - currentTimeMillis) > 30) {
                    czVar.b0 = currentTimeMillis;
                    czVar.e0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.de0) this.e).O1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!p1Var.A && (d1Var = p1Var.R) != null && (a81Var = d1Var.h) != null && a81Var.w && !a81Var.x) {
                    a81Var.l(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
