package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sm extends i9 {
    public final /* synthetic */ tm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(tm tmVar, Context context) {
        super(context);
        this.E = tmVar;
    }

    @Override // org.telegram.ui.Components.i9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        tm tmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(tmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tmVar.v.K0, TLObject.FLAG_30));
    }
}
