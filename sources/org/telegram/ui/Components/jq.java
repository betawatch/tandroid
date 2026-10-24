package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        mq.m(this.a);
    }
}
