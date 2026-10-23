package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ f60(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                p60 p60Var = this.b;
                p60Var.i0();
                p60Var.e0();
                break;
            case 2:
                p60 p60Var2 = this.b;
                p60Var2.getClass();
                p60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                p60 p60Var3 = this.b;
                p60Var3.n.postOnAnimation(new f60(p60Var3, 1));
                break;
        }
    }
}
