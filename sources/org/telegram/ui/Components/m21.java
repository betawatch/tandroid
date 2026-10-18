package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class m21 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ SparseIntArray T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.T = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final int g(int i10) {
        return this.T.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.f5
    public final int h(int i10) {
        return this.T.get(i10);
    }
}
