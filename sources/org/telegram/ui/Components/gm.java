package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gm extends f9 {
    public final /* synthetic */ hm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.E = hmVar;
    }

    @Override // org.telegram.ui.Components.f9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hm hmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30));
    }
}
