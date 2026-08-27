package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q21 extends f2.l {
    public final /* synthetic */ b31 F;

    public q21(b31 b31Var) {
        this.F = b31Var;
    }

    @Override // f2.l
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override // f2.l
    public final void P(f2.o1 o1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
