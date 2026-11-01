package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gn extends w7.d6 {
    public org.telegram.messenger.kj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ un h;

    public gn(un unVar) {
        this.h = unVar;
    }

    @Override // w7.d6
    public final void a() {
        org.telegram.messenger.kj kjVar = this.a;
        un unVar = this.h;
        if (kjVar != null) {
            unVar.C0.T();
            int indexOf = unVar.K6.indexOf(this.a) + unVar.C0.J;
            if (indexOf >= 0) {
                unVar.B0.i1(indexOf, (int) ((this.e + this.g) - unVar.L9), this.f);
            }
        } else {
            unVar.C0.T();
            unVar.B0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        unVar.A3 = true;
        unVar.xd(false);
        org.telegram.messenger.i0.g3(new rh(this, 10));
    }

    @Override // w7.d6
    public final void c() {
        un unVar = this.h;
        unVar.ba = unVar.getNotificationCenter().q(un.hd, unVar.ba, true);
        uk ukVar = unVar.Pa;
        if (ukVar.n) {
            ukVar.d();
        }
    }

    @Override // w7.d6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
