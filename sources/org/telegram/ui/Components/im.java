package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class im extends g9 {
    public final /* synthetic */ jm E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar, Context context) {
        super(context);
        this.E = jmVar;
    }

    @Override // org.telegram.ui.Components.g9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        jm jmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(jmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jmVar.v.K0, TLObject.FLAG_30));
    }
}
