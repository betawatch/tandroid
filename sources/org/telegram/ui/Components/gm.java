package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gm extends h9 {
    public final /* synthetic */ hm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(hm hmVar, Context context) {
        super(context);
        this.E = hmVar;
    }

    @Override // org.telegram.ui.Components.h9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hm hmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hmVar.v.K0, TLObject.FLAG_30));
    }
}
