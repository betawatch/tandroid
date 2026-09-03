package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wp extends LinearLayout {
    public final /* synthetic */ zp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(zp zpVar, Context context) {
        super(context);
        this.a = zpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        zp.m(this.a);
    }
}
