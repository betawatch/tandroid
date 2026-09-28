package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o11(s11 s11Var, int i10, int i11) {
        this.a = i11;
        this.b = s11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s11 s11Var = this.b;
                org.telegram.ui.Components.x81 x81Var = s11Var.n;
                r11 r11Var = s11Var.s;
                int i10 = this.c;
                x81Var.d(i10, r11Var.i(i10));
                break;
            default:
                s11 s11Var2 = this.b;
                org.telegram.ui.Components.x81 x81Var2 = s11Var2.n;
                r11 r11Var2 = s11Var2.s;
                int i11 = this.c;
                x81Var2.d(i11, r11Var2.i(i11));
                break;
        }
    }
}
