package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mm extends c8.ma {
    public org.telegram.messenger.gj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ an h;

    public mm(an anVar) {
        this.h = anVar;
    }

    @Override // c8.ma
    public final void a() {
        org.telegram.messenger.gj gjVar = this.a;
        an anVar = this.h;
        if (gjVar != null) {
            anVar.D0.T();
            int indexOf = anVar.L6.indexOf(this.a) + anVar.D0.K;
            if (indexOf >= 0) {
                anVar.C0.i1(indexOf, (int) ((this.e + this.g) - anVar.O9), this.f);
            }
        } else {
            anVar.D0.T();
            anVar.C0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        anVar.B3 = true;
        anVar.Gd(false);
        org.telegram.messenger.g0.h3(new bh(this, 9));
    }

    @Override // c8.ma
    public final void c() {
        an anVar = this.h;
        anVar.ea = anVar.getNotificationCenter().q(an.rd, anVar.ea, true);
        yj yjVar = anVar.Sa;
        if (yjVar.n) {
            yjVar.d();
        }
    }

    @Override // c8.ma
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
