package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
