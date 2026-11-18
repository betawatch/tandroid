package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gm extends a9 {
    public final /* synthetic */ hm F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.F = hmVar;
    }

    @Override // org.telegram.ui.Components.a9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        hm hmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30));
    }
}
