package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k20 extends ws0 {
    public final /* synthetic */ n20 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(n20 n20Var, Context context, os0 os0Var, n20 n20Var2, j20 j20Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, os0Var, 0, null, null, null, 8, 0, n20Var2, j20Var, 0, e6Var, null);
        this.x2 = n20Var;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean F0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.ws0
    public final String getStoriesHashtag() {
        return this.x2.b;
    }

    @Override // org.telegram.ui.Components.ws0
    public final String getStoriesHashtagUsername() {
        return this.x2.c;
    }

    @Override // org.telegram.ui.Components.ws0
    public final void O0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.ws0
    public final void V0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ws0
    public final void X0(float f10) {
    }

    @Override // org.telegram.ui.Components.ws0
    public final void o1(boolean z10) {
    }
}
