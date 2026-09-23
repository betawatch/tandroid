package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;
    public final /* synthetic */ ci.e4 c;

    public /* synthetic */ pg(rg rgVar, ci.e4 e4Var, int i10) {
        this.a = i10;
        this.b = rgVar;
        this.c = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg rgVar = this.b;
                ci.e4 e4Var = this.c;
                rgVar.removeView(e4Var);
                if (rgVar.b == e4Var) {
                    rgVar.b = null;
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
                rg rgVar2 = this.b;
                ci.e4 e4Var2 = this.c;
                rgVar2.removeView(e4Var2);
                if (rgVar2.a == e4Var2) {
                    rgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
