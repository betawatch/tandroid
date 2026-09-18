package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;
    public final /* synthetic */ ci.f4 c;

    public /* synthetic */ pg(rg rgVar, ci.f4 f4Var, int i10) {
        this.a = i10;
        this.b = rgVar;
        this.c = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg rgVar = this.b;
                ci.f4 f4Var = this.c;
                rgVar.removeView(f4Var);
                if (rgVar.b == f4Var) {
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
                ci.f4 f4Var2 = this.c;
                rgVar2.removeView(f4Var2);
                if (rgVar2.a == f4Var2) {
                    rgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
