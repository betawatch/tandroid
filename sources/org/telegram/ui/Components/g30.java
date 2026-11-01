package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g30 extends au0 {
    public final /* synthetic */ j30 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(j30 j30Var, Context context, st0 st0Var, j30 j30Var2, f30 f30Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, st0Var, 0, null, null, null, 8, 0, j30Var2, f30Var, 0, p6Var, null);
        this.w2 = j30Var;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.au0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.au0
    public final String getStoriesHashtag() {
        return this.w2.b;
    }

    @Override // org.telegram.ui.Components.au0
    public final String getStoriesHashtagUsername() {
        return this.w2.c;
    }

    @Override // org.telegram.ui.Components.au0
    public final void M0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.au0
    public final void T0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.au0
    public final void V0(float f7) {
    }

    @Override // org.telegram.ui.Components.au0
    public final void m1(boolean z10) {
    }
}
