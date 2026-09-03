package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cm extends y8 {
    public final /* synthetic */ dm B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(dm dmVar, Context context) {
        super(context);
        this.B = dmVar;
    }

    @Override // org.telegram.ui.Components.y8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        dm dmVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dmVar.v.H0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dmVar.v.H0, TLObject.FLAG_30));
    }
}
