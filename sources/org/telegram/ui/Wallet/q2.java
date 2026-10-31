package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q2 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), org.telegram.messenger.i0.L(this.a)), TLObject.FLAG_31));
    }
}
