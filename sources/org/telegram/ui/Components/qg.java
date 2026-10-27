package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg b;
    public final /* synthetic */ fi.v3 c;

    public /* synthetic */ qg(sg sgVar, fi.v3 v3Var, int i10) {
        this.a = i10;
        this.b = sgVar;
        this.c = v3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sg sgVar = this.b;
                fi.v3 v3Var = this.c;
                sgVar.removeView(v3Var);
                if (sgVar.b == v3Var) {
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
                fi.v3 v3Var2 = this.c;
                sgVar2.removeView(v3Var2);
                if (sgVar2.a == v3Var2) {
                    sgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
