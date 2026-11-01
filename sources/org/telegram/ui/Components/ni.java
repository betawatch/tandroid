package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ni extends s4.b0 {
    public final /* synthetic */ oi r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(oi oiVar, Context context) {
        super(context);
        this.r = oiVar;
    }

    @Override // s4.b0
    public final int k(int i10, View view) {
        return org.telegram.messenger.m5.B(7.0f, ((qi) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.b0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
