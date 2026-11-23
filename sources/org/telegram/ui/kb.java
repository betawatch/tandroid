package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class kb extends c8.oa {
    public org.telegram.messenger.gj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ lb f;

    public kb(lb lbVar) {
        this.f = lbVar;
    }

    @Override // c8.oa
    public final void a() {
        org.telegram.messenger.gj gjVar = this.a;
        lb lbVar = this.f;
        if (gjVar != null) {
            int indexOf = lbVar.p0.indexOf(gjVar) + lbVar.F.f;
            if (indexOf >= 0) {
                lbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            lbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        lbVar.W = true;
        lbVar.i1();
        org.telegram.messenger.g0.g3(new hq0(this, 21));
    }

    @Override // c8.oa
    public final void c() {
        lb lbVar = this.f;
        lbVar.L0 = lbVar.getNotificationCenter().q(lb.S0, lbVar.L0, true);
    }

    @Override // c8.oa
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.r1) {
            this.f.h.add((org.telegram.ui.Cells.r1) view);
        }
    }
}
