package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gj extends s4.c0 {
    public final /* synthetic */ di.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(di.k kVar, Context context) {
        super(context);
        this.r = kVar;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(7.0f, ((ij) this.r.R).n.getPaddingTop(), super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
