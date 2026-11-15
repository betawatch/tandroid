package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg b;
    public final /* synthetic */ hi.l3 c;

    public /* synthetic */ eg(gg ggVar, hi.l3 l3Var, int i7) {
        this.a = i7;
        this.b = ggVar;
        this.c = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gg ggVar = this.b;
                hi.l3 l3Var = this.c;
                ggVar.removeView(l3Var);
                if (ggVar.b == l3Var) {
                    ggVar.b = null;
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
                gg ggVar2 = this.b;
                hi.l3 l3Var2 = this.c;
                ggVar2.removeView(l3Var2);
                if (ggVar2.a == l3Var2) {
                    ggVar2.a = null;
                    break;
                }
                break;
        }
    }
}
