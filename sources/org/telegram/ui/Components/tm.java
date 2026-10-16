package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tm extends j9 {
    public final /* synthetic */ um E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(um umVar, Context context) {
        super(context);
        this.E = umVar;
    }

    @Override // org.telegram.ui.Components.j9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        um umVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(umVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(umVar.v.K0, TLObject.FLAG_30));
    }
}
