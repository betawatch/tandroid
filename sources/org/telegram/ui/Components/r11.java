package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ t11 c;

    public /* synthetic */ r11(u11 u11Var, t11 t11Var, int i10) {
        this.a = i10;
        this.b = u11Var;
        this.c = t11Var;
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
