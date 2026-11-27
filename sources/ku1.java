// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ku1 extends cxe {
    public r47 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ zu1 h;

    public ku1(zu1 zu1Var) {
        this.h = zu1Var;
    }

    @Override // cxe
    public final void a() {
        r47 r47Var = this.a;
        zu1 zu1Var = this.h;
        it1 it1Var = zu1Var.D0;
        if (r47Var != null) {
            it1Var.O();
            int indexOf = zu1Var.M6.indexOf(this.a) + zu1Var.D0.K;
            if (indexOf >= 0) {
                zu1Var.C0.h1(indexOf, (int) ((this.e + this.g) - zu1Var.P9), this.f);
            }
        } else {
            it1Var.O();
            zu1Var.C0.h1(this.b, this.d, this.c);
        }
        this.a = null;
        zu1Var.B3 = true;
        zu1Var.Gd(false);
        hl.c3(new go1(this, (byte) 9));
    }

    @Override // cxe
    public final void c() {
        zu1 zu1Var = this.h;
        zu1Var.fa = zu1Var.getNotificationCenter().p(zu1.Gd, zu1Var.fa, true);
        wr1 wr1Var = zu1Var.Ta;
        if (wr1Var.n) {
            wr1Var.d();
        }
    }

    @Override // cxe
    public final void d(View view) {
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.setDelegate(null);
            wb2Var.setResourcesProvider(null);
        }
    }
}
