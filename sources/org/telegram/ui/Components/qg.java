package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg b;
    public final /* synthetic */ ei.x3 c;

    public /* synthetic */ qg(sg sgVar, ei.x3 x3Var, int i10) {
        this.a = i10;
        this.b = sgVar;
        this.c = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sg sgVar = this.b;
                ei.x3 x3Var = this.c;
                sgVar.removeView(x3Var);
                if (sgVar.b == x3Var) {
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
                ei.x3 x3Var2 = this.c;
                sgVar2.removeView(x3Var2);
                if (sgVar2.a == x3Var2) {
                    sgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
