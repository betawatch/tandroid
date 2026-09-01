package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig b;
    public final /* synthetic */ qh.f3 c;

    public /* synthetic */ gg(ig igVar, qh.f3 f3Var, int i10) {
        this.a = i10;
        this.b = igVar;
        this.c = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig igVar = this.b;
                qh.f3 f3Var = this.c;
                igVar.removeView(f3Var);
                if (igVar.b == f3Var) {
                    igVar.b = null;
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
                ig igVar2 = this.b;
                qh.f3 f3Var2 = this.c;
                igVar2.removeView(f3Var2);
                if (igVar2.a == f3Var2) {
                    igVar2.a = null;
                    break;
                }
                break;
        }
    }
}
