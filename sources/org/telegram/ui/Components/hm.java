package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hm extends g9 {
    public final /* synthetic */ im E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(im imVar, Context context) {
        super(context);
        this.E = imVar;
    }

    @Override // org.telegram.ui.Components.g9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        im imVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(imVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(imVar.v.K0, TLObject.FLAG_30));
    }
}
