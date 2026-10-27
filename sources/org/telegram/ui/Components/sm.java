package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
