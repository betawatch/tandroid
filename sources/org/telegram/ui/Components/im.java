package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class im extends a9 {
    public final /* synthetic */ jm F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar, Context context) {
        super(context);
        this.F = jmVar;
    }

    @Override // org.telegram.ui.Components.a9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        jm jmVar = this.F;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jmVar.w.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jmVar.w.L0, TLObject.FLAG_30));
    }
}
