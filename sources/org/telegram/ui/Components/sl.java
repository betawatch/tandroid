package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sl extends v8 {
    public final /* synthetic */ tl E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(tl tlVar, Context context) {
        super(context);
        this.E = tlVar;
    }

    @Override // org.telegram.ui.Components.v8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        tl tlVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tlVar.w.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tlVar.w.K0, TLObject.FLAG_30));
    }
}
