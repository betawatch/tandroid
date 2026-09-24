package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg b;
    public final /* synthetic */ ci.e4 c;

    public /* synthetic */ qg(sg sgVar, ci.e4 e4Var, int i10) {
        this.a = i10;
        this.b = sgVar;
        this.c = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sg sgVar = this.b;
                ci.e4 e4Var = this.c;
                sgVar.removeView(e4Var);
                if (sgVar.b == e4Var) {
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
                ci.e4 e4Var2 = this.c;
                sgVar2.removeView(e4Var2);
                if (sgVar2.a == e4Var2) {
                    sgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
