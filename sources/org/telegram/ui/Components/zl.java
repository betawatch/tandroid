package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zl extends s8 {
    public final /* synthetic */ am F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(am amVar, Context context) {
        super(context);
        this.F = amVar;
    }

    @Override // org.telegram.ui.Components.s8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        am amVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(amVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(amVar.w.L0, TLObject.FLAG_30));
    }
}
