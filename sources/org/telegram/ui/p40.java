package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z40 b;

    public /* synthetic */ p40(z40 z40Var, int i7) {
        this.a = i7;
        this.b = z40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                z40 z40Var = this.b;
                z40Var.n0();
                z40Var.j0();
                break;
            case 2:
                z40 z40Var2 = this.b;
                z40Var2.getClass();
                z40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                z40 z40Var3 = this.b;
                z40Var3.n.postOnAnimation(new p40(z40Var3, 1));
                break;
        }
    }
}
