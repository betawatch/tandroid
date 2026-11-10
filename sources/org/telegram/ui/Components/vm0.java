package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vm0 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(Context context, int i7, int i10) {
        super(context);
        this.a = i7;
        this.b = i10;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return org.telegram.messenger.g0.L(260.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.a), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.b), View.MeasureSpec.getMode(i10)));
    }
}
