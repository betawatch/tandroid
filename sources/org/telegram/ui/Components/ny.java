package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ny(Object obj, boolean z10, boolean z11, boolean z12, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.utils.twidget.u uVar;
        h71 h71Var;
        switch (this.a) {
            case 0:
                py pyVar = (py) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                boolean z12 = this.d;
                if (z10) {
                    sy syVar = pyVar.K;
                    syVar.a = true;
                    syVar.b = true;
                }
                if (z11) {
                    pyVar.y = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (z12 || Math.abs(pyVar.b0 - currentTimeMillis) > 30) {
                    pyVar.b0 = currentTimeMillis;
                    pyVar.e0.run();
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.xd0) this.e).F1(this.b, this.c, this.d);
                break;
            default:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.e;
                boolean z13 = this.b;
                boolean z14 = this.c;
                boolean z15 = this.d;
                if (!h0Var.u && (uVar = h0Var.J) != null && (h71Var = uVar.h) != null && h71Var.w && !h71Var.x) {
                    h71Var.k(z13, z14, z15);
                    break;
                }
                break;
        }
    }
}
