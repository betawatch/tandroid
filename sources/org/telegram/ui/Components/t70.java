package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
