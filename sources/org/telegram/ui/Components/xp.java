package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xp extends LinearLayout {
    public final /* synthetic */ aq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(aq aqVar, Context context) {
        super(context);
        this.a = aqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        aq.m(this.a);
    }
}
