package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class om extends c8.ja {
    public org.telegram.messenger.ij a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ cn h;

    public om(cn cnVar) {
        this.h = cnVar;
    }

    @Override // c8.ja
    public final void a() {
        org.telegram.messenger.ij ijVar = this.a;
        cn cnVar = this.h;
        if (ijVar != null) {
            cnVar.C0.T();
            int indexOf = cnVar.K6.indexOf(this.a) + cnVar.C0.J;
            if (indexOf >= 0) {
                cnVar.B0.i1(indexOf, (int) ((this.e + this.g) - cnVar.N9), this.f);
            }
        } else {
            cnVar.C0.T();
            cnVar.B0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        cnVar.A3 = true;
        cnVar.Fd(false);
        org.telegram.messenger.g0.h3(new dh(this, 9));
    }

    @Override // c8.ja
    public final void c() {
        cn cnVar = this.h;
        cnVar.da = cnVar.getNotificationCenter().q(cn.qd, cnVar.da, true);
        ak akVar = cnVar.Ra;
        if (akVar.n) {
            akVar.d();
        }
    }

    @Override // c8.ja
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
