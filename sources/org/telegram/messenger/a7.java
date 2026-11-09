package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ h7 c;

    public /* synthetic */ a7(i7 i7Var, h7 h7Var, int i7) {
        this.a = i7;
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
