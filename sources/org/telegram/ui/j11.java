package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ j11(l11 l11Var, int i10, int i11) {
        this.a = i11;
        this.b = l11Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l11 l11Var = this.b;
                org.telegram.ui.Components.t91 t91Var = l11Var.b;
                k11 k11Var = l11Var.d;
                int i10 = this.c;
                t91Var.d(i10, k11Var.i(i10));
                break;
            default:
                l11 l11Var2 = this.b;
                org.telegram.ui.Components.t91 t91Var2 = l11Var2.b;
                k11 k11Var2 = l11Var2.d;
                int i11 = this.c;
                t91Var2.d(i11, k11Var2.i(i11));
                break;
        }
    }
}
