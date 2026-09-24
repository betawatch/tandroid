package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                wz wzVar = (wz) this.e;
                if (this.b) {
                    a00 a00Var = wzVar.J;
                    a00Var.a = true;
                    a00Var.b = true;
                }
                if (this.c) {
                    wzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(wzVar.a0 - currentTimeMillis) > 30) {
                    wzVar.a0 = currentTimeMillis;
                    wzVar.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
