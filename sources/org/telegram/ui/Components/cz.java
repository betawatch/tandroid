package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cz(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        d81 d81Var;
        switch (this.a) {
            case 0:
                ez ezVar = (ez) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    hz hzVar = ezVar.K;
                    hzVar.a = true;
                    hzVar.b = true;
                }
                if (z11) {
                    ezVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(ezVar.b0 - currentTimeMillis) > 30) {
                    ezVar.b0 = currentTimeMillis;
                    ezVar.e0.run();
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
                if (!p1Var.A && (d1Var = p1Var.R) != null && (d81Var = d1Var.h) != null && d81Var.w && !d81Var.x) {
                    d81Var.l(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
