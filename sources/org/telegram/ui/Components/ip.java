package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ip extends LinearLayout {
    public final /* synthetic */ lp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(lp lpVar, Context context) {
        super(context);
        this.a = lpVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        lp.I0(this.a);
    }
}
