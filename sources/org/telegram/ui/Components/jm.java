package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class jm extends g9 {
    public final /* synthetic */ km E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(km kmVar, Context context) {
        super(context);
        this.E = kmVar;
    }

    @Override // org.telegram.ui.Components.g9, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        km kmVar = this.E;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(kmVar.v.K0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(kmVar.v.K0, TLObject.FLAG_30));
    }
}
