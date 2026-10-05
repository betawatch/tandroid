package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class p21 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ SparseIntArray R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.R = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final int g(int i10) {
        return this.R.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final int h(int i10) {
        return this.R.get(i10);
    }
}
