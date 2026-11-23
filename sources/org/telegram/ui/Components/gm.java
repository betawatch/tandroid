package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gm extends z8 {
    public final /* synthetic */ hm F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.F = hmVar;
    }

    @Override // org.telegram.ui.Components.z8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        hm hmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30));
    }
}
