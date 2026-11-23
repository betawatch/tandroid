package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
