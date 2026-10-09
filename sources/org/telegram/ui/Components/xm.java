package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xm extends i9 {
    public final /* synthetic */ ym E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(ym ymVar, Context context) {
        super(context);
        this.E = ymVar;
    }

    @Override // org.telegram.ui.Components.i9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ym ymVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ymVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ymVar.v.K0, TLObject.FLAG_30));
    }
}
