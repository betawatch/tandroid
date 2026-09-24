package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                org.telegram.ui.Components.v81 v81Var = s11Var.n;
                r11 r11Var = s11Var.s;
                int i10 = this.c;
                v81Var.d(i10, r11Var.i(i10));
                break;
            default:
                s11 s11Var2 = this.b;
                org.telegram.ui.Components.v81 v81Var2 = s11Var2.n;
                r11 r11Var2 = s11Var2.s;
                int i11 = this.c;
                v81Var2.d(i11, r11Var2.i(i11));
                break;
        }
    }
}
