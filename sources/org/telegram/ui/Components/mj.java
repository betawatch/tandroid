package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mj extends s4.c0 {
    public final /* synthetic */ ig.e0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(ig.e0 e0Var, Context context) {
        super(context);
        this.r = e0Var;
    }

    @Override // s4.c0
    public final int k(int i10, View view) {
        return org.telegram.messenger.g0.A(8.0f, ((xj) this.r.V).s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override // s4.c0
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
