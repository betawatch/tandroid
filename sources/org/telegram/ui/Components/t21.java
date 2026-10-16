package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class t21 extends org.telegram.ui.ActionBar.d5 {
    public final /* synthetic */ SparseIntArray T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.T = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int g(int i10) {
        return this.T.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int h(int i10) {
        return this.T.get(i10);
    }
}
