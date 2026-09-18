package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gm extends e9 {
    public final /* synthetic */ hm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.E = hmVar;
    }

    @Override // org.telegram.ui.Components.e9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hm hmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30));
    }
}
