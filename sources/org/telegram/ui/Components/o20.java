package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class o20 extends xs0 {
    public final /* synthetic */ r20 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(r20 r20Var, Context context, ps0 ps0Var, r20 r20Var2, n20 n20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, ps0Var, 0, null, null, null, 8, 0, r20Var2, n20Var, 0, f6Var, null);
        this.w2 = r20Var;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean F0() {
        return true;
    }

    @Override // org.telegram.ui.Components.xs0
    public final int getInitialTab() {
        return 8;
    }

    @Override // org.telegram.ui.Components.xs0
    public final String getStoriesHashtag() {
        return this.w2.b;
    }

    @Override // org.telegram.ui.Components.xs0
    public final String getStoriesHashtagUsername() {
        return this.w2.c;
    }

    @Override // org.telegram.ui.Components.xs0
    public final void O0(SparseArray sparseArray) {
    }

    @Override // org.telegram.ui.Components.xs0
    public final void V0(boolean z9) {
    }

    @Override // org.telegram.ui.Components.xs0
    public final void X0(float f10) {
    }

    @Override // org.telegram.ui.Components.xs0
    public final void o1(boolean z9) {
    }
}
