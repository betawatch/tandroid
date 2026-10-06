package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ q11(t11 t11Var, int i10, int i11) {
        this.a = i11;
        this.b = t11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t11 t11Var = this.b;
                org.telegram.ui.Components.g91 g91Var = t11Var.n;
                s11 s11Var = t11Var.s;
                int i10 = this.c;
                g91Var.d(i10, s11Var.i(i10));
                break;
            default:
                t11 t11Var2 = this.b;
                org.telegram.ui.Components.g91 g91Var2 = t11Var2.n;
                s11 s11Var2 = t11Var2.s;
                int i11 = this.c;
                g91Var2.d(i11, s11Var2.i(i11));
                break;
        }
    }
}
