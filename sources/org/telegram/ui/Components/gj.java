package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gj extends s4.d0 {
    public final /* synthetic */ ei.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(ei.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return org.telegram.messenger.t.B(7.0f, ((ij) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.d0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
