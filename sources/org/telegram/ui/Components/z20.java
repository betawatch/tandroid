package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z20 extends it0 {
    public final /* synthetic */ c30 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(c30 c30Var, Context context, at0 at0Var, c30 c30Var2, y20 y20Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 0L, at0Var, 0, null, null, null, 8, 0, c30Var2, y20Var, 0, i6Var, null);
        this.x2 = c30Var;
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.it0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.it0
    public final String getStoriesHashtag() {
        return this.x2.b;
    }

    @Override // org.telegram.ui.Components.it0
    public final String getStoriesHashtagUsername() {
        return this.x2.c;
    }

    @Override // org.telegram.ui.Components.it0
    public final void P0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.it0
    public final void X0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.it0
    public final void Z0(float f10) {
    }

    @Override // org.telegram.ui.Components.it0
    public final void q1(boolean z10) {
    }
}
