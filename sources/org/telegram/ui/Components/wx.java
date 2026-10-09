package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wx extends s4.e0 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(Context context, int i10) {
        super(context);
        this.r = i10;
    }

    @Override // s4.e0
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.r;
    }

    @Override // s4.e0
    public final int m(int i10) {
        return super.m(i10) * 16;
    }

    @Override // s4.e0
    public final int p() {
        return -1;
    }
}
