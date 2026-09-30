package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
