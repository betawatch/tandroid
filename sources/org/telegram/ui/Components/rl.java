package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rl extends t8 {
    public final /* synthetic */ sl F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(sl slVar, Context context) {
        super(context);
        this.F = slVar;
    }

    @Override // org.telegram.ui.Components.t8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        sl slVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(slVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(slVar.w.L0, TLObject.FLAG_30));
    }
}
