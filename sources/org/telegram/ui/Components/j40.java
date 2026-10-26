package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j40 extends aw0 {
    public final /* synthetic */ m40 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(m40 m40Var, Context context, sv0 sv0Var, m40 m40Var2, i40 i40Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, sv0Var, 0, null, null, null, 8, 0, m40Var2, i40Var, 0, u6Var, null);
        this.r2 = m40Var;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.aw0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.aw0
    public final String getStoriesHashtag() {
        return this.r2.b;
    }

    @Override // org.telegram.ui.Components.aw0
    public final String getStoriesHashtagUsername() {
        return this.r2.c;
    }

    @Override // org.telegram.ui.Components.aw0
    public final void K0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void R0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void T0(float f7) {
    }

    @Override // org.telegram.ui.Components.aw0
    public final void k1(boolean z10) {
    }
}
