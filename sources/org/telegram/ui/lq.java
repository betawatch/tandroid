package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ lq(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        pr.Z(this.b, view, i10);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        pr prVar = this.b;
        if (prVar.getParentActivity() != null) {
            s4.g0 adapter = prVar.c.getAdapter();
            lr lrVar = prVar.a;
            if (adapter == lrVar) {
                return prVar.l0(lrVar.E(i10), false, view);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                this.b.y0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        pr.Y(this.b, j10);
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
