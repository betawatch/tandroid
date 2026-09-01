package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vz(Object obj, boolean z4, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = z4;
        this.c = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xz xzVar = (xz) this.e;
                if (this.b) {
                    b00 b00Var = xzVar.G;
                    b00Var.a = true;
                    b00Var.b = true;
                }
                if (this.c) {
                    xzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(xzVar.X - currentTimeMillis) > 30) {
                    xzVar.X = currentTimeMillis;
                    xzVar.a0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.og0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
