package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yp extends LinearLayout {
    public final /* synthetic */ bq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(bq bqVar, Context context) {
        super(context);
        this.a = bqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        bq.m(this.a);
    }
}
