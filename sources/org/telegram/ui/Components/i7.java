package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ p80 c;

    public /* synthetic */ i7(l8 l8Var, p80 p80Var, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = p80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l8 l8Var = this.b;
                l8Var.getClass();
                this.c.u();
                l8Var.u0(1);
                break;
            case 1:
                l8 l8Var2 = this.b;
                l8Var2.getClass();
                this.c.u();
                l8Var2.u0(2);
                break;
            case 2:
                l8 l8Var3 = this.b;
                l8Var3.getClass();
                this.c.u();
                l8Var3.u0(4);
                break;
            case 3:
                l8 l8Var4 = this.b;
                l8Var4.getClass();
                this.c.u();
                l8Var4.u0(7);
                break;
            default:
                l8.s(this.b, this.c);
                break;
        }
    }
}
