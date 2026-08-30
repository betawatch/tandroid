package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t11 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ SparseIntArray R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t11(boolean z4, SparseIntArray sparseIntArray) {
        super(2, z4, false, null);
        this.R = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final int g(int i10) {
        return this.R.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final int h(int i10) {
        return this.R.get(i10);
    }
}
