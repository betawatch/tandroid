package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 d;

    public /* synthetic */ z0(r4 r4Var, org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.a = i10;
        this.b = r4Var;
        this.c = x1Var;
        this.d = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new z0(this.b, this.c, this.d, 1));
                break;
            default:
                s4.d0(this.b, this.c, this.d);
                break;
        }
    }
}
