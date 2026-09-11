package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
