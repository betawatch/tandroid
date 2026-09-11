package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
