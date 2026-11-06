package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class r2 extends ScrollView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(this.a)), TLObject.FLAG_31));
    }
}
