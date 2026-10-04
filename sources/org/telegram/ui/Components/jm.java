package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
