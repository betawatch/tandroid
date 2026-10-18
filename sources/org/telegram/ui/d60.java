package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ d60(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                n60 n60Var = this.b;
                n60Var.i0();
                n60Var.e0();
                break;
            case 2:
                n60 n60Var2 = this.b;
                n60Var2.getClass();
                n60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                n60 n60Var3 = this.b;
                n60Var3.n.postOnAnimation(new d60(n60Var3, 1));
                break;
        }
    }
}
