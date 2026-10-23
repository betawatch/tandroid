package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ b60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                l60 l60Var = this.b;
                l60Var.i0();
                l60Var.e0();
                break;
            case 2:
                l60 l60Var2 = this.b;
                l60Var2.getClass();
                l60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                l60 l60Var3 = this.b;
                l60Var3.n.postOnAnimation(new b60(l60Var3, 1));
                break;
        }
    }
}
