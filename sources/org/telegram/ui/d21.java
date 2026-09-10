package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h21 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d21(h21 h21Var, int i10, int i11) {
        this.a = i11;
        this.b = h21Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h21 h21Var = this.b;
                org.telegram.ui.Components.u81 u81Var = h21Var.n;
                g21 g21Var = h21Var.s;
                int i10 = this.c;
                u81Var.d(i10, g21Var.i(i10));
                break;
            default:
                h21 h21Var2 = this.b;
                org.telegram.ui.Components.u81 u81Var2 = h21Var2.n;
                g21 g21Var2 = h21Var2.s;
                int i11 = this.c;
                u81Var2.d(i11, g21Var2.i(i11));
                break;
        }
    }
}
