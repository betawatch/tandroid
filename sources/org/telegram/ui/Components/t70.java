package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2.n0 b;
    public final /* synthetic */ x70 c;

    public /* synthetic */ t70(n2.n0 n0Var, x70 x70Var, int i7) {
        this.a = i7;
        this.b = n0Var;
        this.c = x70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c, false);
                break;
            default:
                this.b.m(this.c, false);
                break;
        }
    }
}
