package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oq b;

    public /* synthetic */ np(oq oqVar, int i7) {
        this.a = i7;
        this.b = oqVar;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        oq oqVar = this.b;
        if (oqVar.getParentActivity() != null) {
            v4.g0 adapter = oqVar.c.getAdapter();
            kq kqVar = oqVar.a;
            if (adapter == kqVar) {
                return oqVar.m0(kqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        oq.a0(this.b, view, i7);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        oq.Z(this.b, j3);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
