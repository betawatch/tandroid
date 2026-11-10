package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ py(Object obj, boolean z9, boolean z10, boolean z11, int i7) {
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
                ry ryVar = (ry) this.e;
                boolean z9 = this.b;
                boolean z10 = this.c;
                boolean z11 = this.d;
                if (z9) {
                    vy vyVar = ryVar.J;
                    vyVar.a = true;
                    vyVar.b = true;
                }
                if (z10) {
                    ryVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z11 || Math.abs(ryVar.a0 - currentTimeMillis) > 30) {
                    ryVar.a0 = currentTimeMillis;
                    ryVar.d0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.fe0) this.e).O1(this.b, this.c, this.d);
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
