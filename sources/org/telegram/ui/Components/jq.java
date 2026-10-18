package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jq extends LinearLayout {
    public final /* synthetic */ mq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(mq mqVar, Context context) {
        super(context);
        this.a = mqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        mq.n(this.a);
    }
}
