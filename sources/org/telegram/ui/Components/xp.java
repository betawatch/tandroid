package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class xp extends LinearLayout {
    public final /* synthetic */ aq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(aq aqVar, Context context) {
        super(context);
        this.a = aqVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        aq.J0(this.a);
    }
}
