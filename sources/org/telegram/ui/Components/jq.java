package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
