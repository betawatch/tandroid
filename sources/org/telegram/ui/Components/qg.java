package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg b;
    public final /* synthetic */ di.f4 c;

    public /* synthetic */ qg(sg sgVar, di.f4 f4Var, int i10) {
        this.a = i10;
        this.b = sgVar;
        this.c = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sg sgVar = this.b;
                di.f4 f4Var = this.c;
                sgVar.removeView(f4Var);
                if (sgVar.b == f4Var) {
                    sgVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                sg sgVar2 = this.b;
                di.f4 f4Var2 = this.c;
                sgVar2.removeView(f4Var2);
                if (sgVar2.a == f4Var2) {
                    sgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
