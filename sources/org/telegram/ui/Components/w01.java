package org.telegram.ui.Components;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w01 extends org.telegram.ui.ActionBar.d5 {
    public final /* synthetic */ SparseIntArray R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.R = sparseIntArray;
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int g(int i9) {
        return this.R.get(i9);
    }

    @Override // org.telegram.ui.ActionBar.d5
    public final int h(int i9) {
        return this.R.get(i9);
    }
}
