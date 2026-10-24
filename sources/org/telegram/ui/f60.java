package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
