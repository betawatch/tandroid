package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
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
                c00 c00Var = (c00) this.e;
                if (this.b) {
                    g00 g00Var = c00Var.J;
                    g00Var.a = true;
                    g00Var.b = true;
                }
                if (this.c) {
                    c00Var.x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(c00Var.a0 - currentTimeMillis) > 30) {
                    c00Var.a0 = currentTimeMillis;
                    c00Var.d0.run();
                    break;
                }
                break;
            default:
                ((org.telegram.ui.xg0) this.e).w1(this.b, this.c, this.d);
                break;
        }
    }
}
