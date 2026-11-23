package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ v8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k9 k9Var = this.b.a0;
                org.telegram.ui.Components.fc.h(k9Var.c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                break;
            case 1:
                f9 f9Var = this.b;
                f9Var.w.setLoading(false);
                k9 k9Var2 = f9Var.a0;
                k9Var2.N0();
                k9Var2.m1.C(0);
                break;
            case 2:
                this.b.V = false;
                break;
            case 3:
                k9 k9Var3 = this.b.a0;
                k9Var3.H1 = 6;
                k9Var3.m1.C(1);
                break;
            case 4:
                f9 f9Var2 = this.b;
                f9Var2.n.g(2);
                f9Var2.f.forceLayout();
                f9Var2.k();
                break;
            default:
                f9 f9Var3 = this.b;
                k9 k9Var4 = f9Var3.a0;
                if (f9Var3.a != 0) {
                    k9Var4.onBackPressed();
                    break;
                } else {
                    k9Var4.dismiss();
                    break;
                }
        }
    }
}
