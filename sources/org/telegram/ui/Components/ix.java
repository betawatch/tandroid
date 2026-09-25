package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ix extends s4.d0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // s4.d0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.r;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 16;
    }

    @Override // s4.d0
    public final int p() {
        return -1;
    }
}
