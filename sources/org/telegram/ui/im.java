package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class im extends b8.of {
    public org.telegram.messenger.zi a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public boolean f;
    public int g;
    public final /* synthetic */ wm h;

    public im(wm wmVar) {
        this.h = wmVar;
    }

    @Override // b8.of
    public final void a() {
        org.telegram.messenger.zi ziVar = this.a;
        wm wmVar = this.h;
        if (ziVar != null) {
            wmVar.D0.T();
            int indexOf = wmVar.L6.indexOf(this.a) + wmVar.D0.K;
            if (indexOf >= 0) {
                wmVar.C0.i1(indexOf, (int) ((this.e + this.g) - wmVar.M9), this.f);
            }
        } else {
            wmVar.D0.T();
            wmVar.C0.i1(this.b, this.d, this.c);
        }
        this.a = null;
        wmVar.B3 = true;
        wmVar.Cd(false);
        org.telegram.messenger.g0.h3(new xg(this, 9));
    }

    @Override // b8.of
    public final void c() {
        wm wmVar = this.h;
        wmVar.ca = wmVar.getNotificationCenter().q(wm.pd, wmVar.ca, true);
        uj ujVar = wmVar.Qa;
        if (ujVar.n) {
            ujVar.d();
        }
    }

    @Override // b8.of
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            q1Var.setDelegate(null);
            q1Var.setResourcesProvider(null);
        }
    }
}
