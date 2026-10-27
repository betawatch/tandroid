package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.ActionBar.l5 {
    public final /* synthetic */ SparseIntArray T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.T = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final int g(int i10) {
        return this.T.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final int h(int i10) {
        return this.T.get(i10);
    }
}
