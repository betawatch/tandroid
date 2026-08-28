package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xl extends y8 {
    public final /* synthetic */ yl A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(yl ylVar, Context context) {
        super(context);
        this.A = ylVar;
    }

    @Override // org.telegram.ui.Components.y8, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        yl ylVar = this.A;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ylVar.v.G0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ylVar.v.G0, TLObject.FLAG_30));
    }
}
