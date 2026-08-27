package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg b;
    public final /* synthetic */ lh.w3 c;

    public /* synthetic */ cg(eg egVar, lh.w3 w3Var, int i10) {
        this.a = i10;
        this.b = egVar;
        this.c = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eg egVar = this.b;
                lh.w3 w3Var = this.c;
                egVar.removeView(w3Var);
                if (egVar.b == w3Var) {
                    egVar.b = null;
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
                eg egVar2 = this.b;
                lh.w3 w3Var2 = this.c;
                egVar2.removeView(w3Var2);
                if (egVar2.a == w3Var2) {
                    egVar2.a = null;
                    break;
                }
                break;
        }
    }
}
