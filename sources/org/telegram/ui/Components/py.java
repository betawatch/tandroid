package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        org.telegram.utils.twidget.u uVar;
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
                ((org.telegram.ui.ce0) this.e).O1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.e;
                boolean z12 = this.b;
                boolean z13 = this.c;
                boolean z14 = this.d;
                if (!h0Var.u && (uVar = h0Var.J) != null && (p71Var = uVar.h) != null && p71Var.w && !p71Var.x) {
                    p71Var.k(z12, z13, z14);
                    break;
                }
                break;
        }
    }
}
