package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
