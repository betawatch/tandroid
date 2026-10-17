package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ox extends s4.c0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // s4.c0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.r;
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 16;
    }

    @Override // s4.c0
    public final int p() {
        return -1;
    }
}
