package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class em extends y8 {
    public final /* synthetic */ fm B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(fm fmVar, Context context) {
        super(context);
        this.B = fmVar;
    }

    @Override // org.telegram.ui.Components.y8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        fm fmVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(fmVar.v.H0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(fmVar.v.H0, TLObject.FLAG_30));
    }
}
