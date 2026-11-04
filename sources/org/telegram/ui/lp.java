package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements org.telegram.messenger.lr, org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.gj0, org.telegram.ui.Components.hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;

    public /* synthetic */ lp(nq nqVar, int i3) {
        this.a = i3;
        this.b = nqVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        nq.a0(this.b, view, i3);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        nq nqVar = this.b;
        if (nqVar.getParentActivity() != null) {
            u4.h0 adapter = nqVar.c.getAdapter();
            iq iqVar = nqVar.a;
            if (adapter == iqVar) {
                return nqVar.m0(iqVar.E(i3), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        nq.Z(this.b, j10);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
