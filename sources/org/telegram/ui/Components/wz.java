package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                yz yzVar = (yz) this.e;
                if (this.b) {
                    c00 c00Var = yzVar.J;
                    c00Var.a = true;
                    c00Var.b = true;
                }
                if (this.c) {
                    yzVar.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.a0 - currentTimeMillis) > 30) {
                    yzVar.a0 = currentTimeMillis;
                    yzVar.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.ug0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
