package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w11 b;
    public final /* synthetic */ v11 c;

    public /* synthetic */ u11(w11 w11Var, v11 v11Var, int i10) {
        this.a = i10;
        this.b = w11Var;
        this.c = v11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
