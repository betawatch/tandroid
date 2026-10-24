package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r21 extends org.telegram.ui.ActionBar.j5 {
    public final /* synthetic */ SparseIntArray T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.T = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final int g(int i10) {
        return this.T.get(i10);
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final int h(int i10) {
        return this.T.get(i10);
    }
}
