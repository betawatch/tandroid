package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ h7 c;

    public /* synthetic */ a7(i7 i7Var, h7 h7Var, int i3) {
        this.a = i3;
        this.b = i7Var;
        this.c = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                i7Var.getClass();
                h7 h7Var = this.c;
                h7Var.l = null;
                i7Var.H0.remove(h7Var);
                h7Var.k = true;
                break;
            default:
                i7 i7Var2 = this.b;
                h7 h7Var2 = this.c;
                i7Var2.m(h7Var2, null);
                h7Var2.f.freeResources();
                break;
        }
    }
}
