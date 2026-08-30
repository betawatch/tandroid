package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dm extends y8 {
    public final /* synthetic */ em B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(em emVar, Context context) {
        super(context);
        this.B = emVar;
    }

    @Override // org.telegram.ui.Components.y8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        em emVar = this.B;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(emVar.v.H0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(emVar.v.H0, TLObject.FLAG_30));
    }
}
