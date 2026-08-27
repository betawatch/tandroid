package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tl extends x8 {
    public final /* synthetic */ ul A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(ul ulVar, Context context) {
        super(context);
        this.A = ulVar;
    }

    @Override // org.telegram.ui.Components.x8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ul ulVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ulVar.v.G0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ulVar.v.G0, TLObject.FLAG_30));
    }
}
