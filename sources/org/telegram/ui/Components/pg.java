package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg b;
    public final /* synthetic */ hi.l3 c;

    public /* synthetic */ pg(rg rgVar, hi.l3 l3Var, int i7) {
        this.a = i7;
        this.b = rgVar;
        this.c = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rg rgVar = this.b;
                hi.l3 l3Var = this.c;
                rgVar.removeView(l3Var);
                if (rgVar.b == l3Var) {
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
                hi.l3 l3Var2 = this.c;
                rgVar2.removeView(l3Var2);
                if (rgVar2.a == l3Var2) {
                    rgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
