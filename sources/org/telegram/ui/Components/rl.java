package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rl extends u8 {
    public final /* synthetic */ sl E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(sl slVar, Context context) {
        super(context);
        this.E = slVar;
    }

    @Override // org.telegram.ui.Components.u8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        sl slVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(slVar.w.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(slVar.w.K0, TLObject.FLAG_30));
    }
}
