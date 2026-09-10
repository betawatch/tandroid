package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mm extends f9 {
    public final /* synthetic */ nm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(nm nmVar, Context context) {
        super(context);
        this.E = nmVar;
    }

    @Override // org.telegram.ui.Components.f9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        nm nmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(nmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(nmVar.v.K0, TLObject.FLAG_30));
    }
}
