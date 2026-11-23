package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zy(Object obj, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.d1 d1Var;
        e81 e81Var;
        switch (this.a) {
            case 0:
                bz bzVar = (bz) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    ez ezVar = bzVar.K;
                    ezVar.a = true;
                    ezVar.b = true;
                }
                if (z11) {
                    bzVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(bzVar.b0 - currentTimeMillis) > 30) {
                    bzVar.b0 = currentTimeMillis;
                    bzVar.e0.run();
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
                if (!p1Var.A && (d1Var = p1Var.R) != null && (e81Var = d1Var.h) != null && e81Var.w && !e81Var.x) {
                    e81Var.l(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
