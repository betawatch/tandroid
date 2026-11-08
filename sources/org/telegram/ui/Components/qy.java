package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qy(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = z9;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.v0 v0Var;
        p71 p71Var;
        switch (this.a) {
            case 0:
                sy syVar = (sy) this.e;
                boolean z9 = this.b;
                boolean z10 = this.c;
                boolean z11 = this.d;
                if (z9) {
                    wy wyVar = syVar.J;
                    wyVar.a = true;
                    wyVar.b = true;
                }
                if (z10) {
                    syVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(syVar.a0 - currentTimeMillis) > 30) {
                    syVar.a0 = currentTimeMillis;
                    syVar.d0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.ce0) this.e).O1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.e;
                boolean z12 = this.b;
                boolean z13 = this.c;
                boolean z14 = this.d;
                if (!i1Var.w && (v0Var = i1Var.L) != null && (p71Var = v0Var.h) != null && p71Var.w && !p71Var.x) {
                    p71Var.k(z12, z13, z14);
                    break;
                }
                break;
        }
    }
}
