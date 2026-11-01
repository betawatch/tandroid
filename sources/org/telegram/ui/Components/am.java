package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class am extends q8 {
    public final /* synthetic */ bm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(bm bmVar, Context context) {
        super(context);
        this.E = bmVar;
    }

    @Override // org.telegram.ui.Components.q8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        bm bmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bmVar.w.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bmVar.w.K0, TLObject.FLAG_30));
    }
}
