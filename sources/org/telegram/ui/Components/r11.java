package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r11 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ SparseIntArray R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r11(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
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
