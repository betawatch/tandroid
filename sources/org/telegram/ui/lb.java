package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lb extends c8.ja {
    public org.telegram.messenger.ij a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ mb f;

    public lb(mb mbVar) {
        this.f = mbVar;
    }

    @Override // c8.ja
    public final void a() {
        org.telegram.messenger.ij ijVar = this.a;
        mb mbVar = this.f;
        if (ijVar != null) {
            int indexOf = mbVar.o0.indexOf(ijVar) + mbVar.E.f;
            if (indexOf >= 0) {
                mbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            mbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        mbVar.V = true;
        mbVar.i1();
        org.telegram.messenger.g0.h3(new gq0(this, 21));
    }

    @Override // c8.ja
    public final void c() {
        mb mbVar = this.f;
        mbVar.K0 = mbVar.getNotificationCenter().q(mb.R0, mbVar.K0, true);
    }

    @Override // c8.ja
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
