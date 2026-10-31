package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g30 extends zt0 {
    public final /* synthetic */ j30 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(j30 j30Var, Context context, rt0 rt0Var, j30 j30Var2, f30 f30Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, rt0Var, 0, null, null, null, 8, 0, j30Var2, f30Var, 0, p6Var, null);
        this.w2 = j30Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.zt0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.zt0
    public final String getStoriesHashtag() {
        return this.w2.b;
    }

    @Override // org.telegram.ui.Components.zt0
    public final String getStoriesHashtagUsername() {
        return this.w2.c;
    }

    @Override // org.telegram.ui.Components.zt0
    public final void L0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.zt0
    public final void S0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.zt0
    public final void U0(float f7) {
    }

    @Override // org.telegram.ui.Components.zt0
    public final void l1(boolean z10) {
    }
}
