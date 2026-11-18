package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gm extends a9 {
    public final /* synthetic */ hm F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.F = hmVar;
    }

    @Override // org.telegram.ui.Components.a9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        hm hmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.w.L0, TLObject.FLAG_30));
    }
}
