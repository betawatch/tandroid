package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cw extends u4.c0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(Context context, int i3) {
        super(context);
        this.r = i3;
    }

    @Override // u4.c0
    public final int i(int i3, int i10, int i11, int i12, int i13) {
        return super.i(i3, i10, i11, i12, i13) + this.r;
    }

    @Override // u4.c0
    public final int m(int i3) {
        return super.m(i3) * 16;
    }

    @Override // u4.c0
    public final int p() {
        return -1;
    }
}
