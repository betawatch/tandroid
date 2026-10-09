package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                l00 l00Var = (l00) this.e;
                if (this.b) {
                    p00 p00Var = l00Var.J;
                    p00Var.a = true;
                    p00Var.b = true;
                }
                if (this.c) {
                    l00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(l00Var.a0 - currentTimeMillis) > 30) {
                    l00Var.a0 = currentTimeMillis;
                    l00Var.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.wg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
