package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug b;
    public final /* synthetic */ ci.d4 c;

    public /* synthetic */ sg(ug ugVar, ci.d4 d4Var, int i10) {
        this.a = i10;
        this.b = ugVar;
        this.c = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ug ugVar = this.b;
                ci.d4 d4Var = this.c;
                ugVar.removeView(d4Var);
                if (ugVar.b == d4Var) {
                    ugVar.b = null;
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
                ug ugVar2 = this.b;
                ci.d4 d4Var2 = this.c;
                ugVar2.removeView(d4Var2);
                if (ugVar2.a == d4Var2) {
                    ugVar2.a = null;
                    break;
                }
                break;
        }
    }
}
