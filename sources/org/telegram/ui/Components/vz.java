package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.b) {
                    b00 b00Var = xzVar.J;
                    b00Var.a = true;
                    b00Var.b = true;
                }
                if (this.c) {
                    xzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.a0 - currentTimeMillis) > 30) {
                    xzVar.a0 = currentTimeMillis;
                    xzVar.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
