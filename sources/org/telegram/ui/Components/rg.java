package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg b;
    public final /* synthetic */ ci.e4 c;

    public /* synthetic */ rg(tg tgVar, ci.e4 e4Var, int i10) {
        this.a = i10;
        this.b = tgVar;
        this.c = e4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tg tgVar = this.b;
                ci.e4 e4Var = this.c;
                tgVar.removeView(e4Var);
                if (tgVar.b == e4Var) {
                    tgVar.b = null;
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
                tg tgVar2 = this.b;
                ci.e4 e4Var2 = this.c;
                tgVar2.removeView(e4Var2);
                if (tgVar2.a == e4Var2) {
                    tgVar2.a = null;
                    break;
                }
                break;
        }
    }
}
