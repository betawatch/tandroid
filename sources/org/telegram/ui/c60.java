package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ c60(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                m60 m60Var = this.b;
                m60Var.i0();
                m60Var.e0();
                break;
            case 2:
                m60 m60Var2 = this.b;
                m60Var2.getClass();
                m60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                m60 m60Var3 = this.b;
                m60Var3.n.postOnAnimation(new c60(m60Var3, 1));
                break;
        }
    }
}
