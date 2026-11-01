package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements org.telegram.messenger.ds, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.ik0, org.telegram.ui.Components.jk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ lq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        pr.a0(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        pr prVar = this.b;
        if (prVar.getParentActivity() != null) {
            s4.g0 adapter = prVar.c.getAdapter();
            lr lrVar = prVar.a;
            if (adapter == lrVar) {
                return prVar.m0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.z0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        pr.Z(this.b, j10);
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
