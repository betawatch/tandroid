package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;

    public /* synthetic */ pp(rq rqVar, int i7) {
        this.a = i7;
        this.b = rqVar;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        rq rqVar = this.b;
        if (rqVar.getParentActivity() != null) {
            v4.g0 adapter = rqVar.c.getAdapter();
            nq nqVar = rqVar.a;
            if (adapter == nqVar) {
                return rqVar.m0(nqVar.E(i7), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        rq.a0(this.b, view, i7);
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
        rq.Z(this.b, j3);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
