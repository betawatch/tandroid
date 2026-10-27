package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j40 extends bw0 {
    public final /* synthetic */ m40 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(m40 m40Var, Context context, tv0 tv0Var, m40 m40Var2, i40 i40Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, m40Var2, i40Var, 0, u6Var, null);
        this.r2 = m40Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtag() {
        return this.r2.b;
    }

    @Override // org.telegram.ui.Components.bw0
    public final String getStoriesHashtagUsername() {
        return this.r2.c;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void K0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void R0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void T0(float f7) {
    }

    @Override // org.telegram.ui.Components.bw0
    public final void k1(boolean z10) {
    }
}
