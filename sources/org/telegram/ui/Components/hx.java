package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hx extends s4.d0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(Context context, int i10) {
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
