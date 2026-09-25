package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.ActionBar.d5 {
    public final /* synthetic */ SparseIntArray R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.R = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int g(int i10) {
        return this.R.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int h(int i10) {
        return this.R.get(i10);
    }
}
