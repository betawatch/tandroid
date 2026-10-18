package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rm extends g9 {
    public final /* synthetic */ sm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(sm smVar, Context context) {
        super(context);
        this.E = smVar;
    }

    @Override // org.telegram.ui.Components.g9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        sm smVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(smVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(smVar.v.K0, TLObject.FLAG_30));
    }
}
