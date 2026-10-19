package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n21 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ SparseIntArray T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(boolean z10, SparseIntArray sparseIntArray) {
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
