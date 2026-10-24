package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
