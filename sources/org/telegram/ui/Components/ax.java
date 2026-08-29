package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ax extends f2.k0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // f2.k0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.r;
    }

    @Override // f2.k0
    public final int m(int i10) {
        return super.m(i10) * 16;
    }

    @Override // f2.k0
    public final int p() {
        return -1;
    }
}
